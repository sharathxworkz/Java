import java.time.LocalDate;
import java.time.LocalTime;

import com.xworkz.honeyBee.resort.dao.ResortDAO;
import com.xworkz.honeyBee.resort.dao.ResortDAOImpl;
import com.xworkz.honeyBee.resort.entity.ResortEntity;

public class ResortRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ResortEntity resort = new ResortEntity();
		resort.setId(1);
		resort.setName("Mango Mist");
		resort.setLocation("Kanakapura");
		resort.setCheckInTime(LocalTime.of(12, 0));
		resort.setCheckOutTime(LocalTime.of(11, 0));
		resort.setCreateBy("Yashwanth");
		resort.setCreateDate(LocalDate.now());
		resort.setUpdateDate(LocalDate.now());
		resort.setOwner("Mango");
		resort.setPricePerDay(3000D);
		
		ResortDAO dao = new ResortDAOImpl();
//		Boolean save = dao.saveDetails(resort);
//		System.out.println("Saved Details are: " + save);
		
		ResortEntity entity = dao.findByName("Mango Mist");
		System.out.println(entity);
	}

}
