import java.time.LocalDate;

import com.xworkz.pub.dao.PubDAO;
import com.xworkz.pub.dao.PubDAOImpl;
import com.xworkz.pub.entity.PubEntity;

public class PubRunner {

	public static void main(String[] args) {
		
		PubEntity entity = new PubEntity();
		entity.setPid(3);
		entity.setPubName("DrinkAndDive");
		entity.setLocation("RR-Nagar");
		entity.setCreatedDate(LocalDate.now());
		entity.setUpdatedDate(LocalDate.now());
		entity.setUpdatedBy("Dev");
		entity.setCreatedBy("Drunker");
		entity.setOffers("30% Off");
		entity.setPricePerHour(4000.00D);
		
		PubDAO dao = new PubDAOImpl();
//		Boolean save = dao.save(entity);
//		System.out.println(save);
//		PubEntity detail = dao.finfById(1);
//		System.out.println(detail);
//		dao.updateNameAndLocationById("1522","RajaJiNagar",2);
		dao.deleteById(1);
	}

}
