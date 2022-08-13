import java.time.LocalDate;

import com.xworkz.saloon.dao.SaloonDAO;
import com.xworkz.saloon.dao.SaloonDAOImpl;
import com.xworkz.saloon.entity.SaloonEntity;

public class SaloonRunner {

	public static void main(String[] args) {
	
		SaloonEntity entity = new SaloonEntity(1,"Beards","Girinagar",LocalDate.of(2008, 7, 17),"Beard",LocalDate.of(2000, 10, 11),"Owner","MenSaloon",200.00D);
		SaloonEntity entity1 = new SaloonEntity(2,"B&W","SitaC-Circle",LocalDate.of(2020, 7, 17),"Bland",LocalDate.of(2000, 10, 11),"B&W","MenSaloon",250.00D);
		SaloonEntity entity2 = new SaloonEntity(3,"Naturals","Girinagar",LocalDate.of(2010, 7, 17),"Nature",LocalDate.of(2013, 10, 11),"Naturals","SPA",1000.00D);
	
		SaloonDAO dao = new SaloonDAOImpl();
//		Boolean save = dao.save(entity);
//		Boolean save1 = dao.save(entity1);
//		Boolean save2 = dao.save(entity2);
//		
//		System.out.println(save+" "+save1+" "+save2);
		
		SaloonEntity get = dao.finfById(1);
		System.out.println(get);
		
//		dao.updateNameAndLocationById("Trends", "Srinagar", 2);
		
		dao.deleteById(2);
	}

}
