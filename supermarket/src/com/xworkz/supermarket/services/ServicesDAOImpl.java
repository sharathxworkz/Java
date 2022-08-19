package com.xworkz.supermarket.services;


import javax.validation.ConstraintViolation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import com.xworkz.supermarket.dao.SuperMarketDAO;
import com.xworkz.supermarket.dao.SuperMarketDAOImpl;
import com.xworkz.supermarket.entity.MarketEntity;
import static com.xworkz.supermarket.util.Validation.*;

import java.util.Set;

public class ServicesDAOImpl implements ServicesDAO{
	
	SuperMarketDAO dao = new SuperMarketDAOImpl();
	

	ValidatorFactory factory = getFactory();
	@Override
	public Boolean save(MarketEntity entity) {
		Validator validator = factory.getValidator();
		Set<ConstraintViolation<MarketEntity>> violation = validator.validate(entity);
		if(violation.size() > 0) {
			
			System.out.println("Invalid Detais");
//            for (ConstraintViolation<MarketEntity> violation2 : violation) {
//                System.out.println(violation2.getMessage());
        } else {
            System.out.println("Valid Object");
            dao.save(entity);
        }
		return null;
	}

	
}