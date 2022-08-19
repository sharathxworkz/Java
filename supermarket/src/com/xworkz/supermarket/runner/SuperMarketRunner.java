package com.xworkz.supermarket.runner;

import java.time.LocalDateTime;

import com.xworkz.supermarket.entity.MarketEntity;
import com.xworkz.supermarket.services.ServicesDAO;
import com.xworkz.supermarket.services.ServicesDAOImpl;

public class SuperMarketRunner {

	public static void main(String[] args) {
		
		MarketEntity market = new MarketEntity();
		market.setMid(1);
		market.setMarketName("DMart");
		market.setLoaction("Jayanager");
		market.setNoOfStalls(20);
		market.setMaxCapacity(19000);
		market.setCreatedDate(LocalDateTime.now());
		market.setCreatedBy("Boss");
		market.setUpdatedDate(LocalDateTime.now());
		market.setUpdatedBy("sharth");
		
		ServicesDAO dao = new ServicesDAOImpl();
		dao.save(market);
	}

}
