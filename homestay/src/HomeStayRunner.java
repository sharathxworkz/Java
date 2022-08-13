import java.time.LocalDate;
import java.time.LocalTime;

import com.xworkz.homestay.dao.HomeStayDAO;
import com.xworkz.homestay.dao.HomeStayDAOImpl;
import com.xworkz.homestay.entity.HomeStayEntity;

public class HomeStayRunner {

	public static void main(String[] args) {
		
		HomeStayEntity homeStay = new HomeStayEntity();
		homeStay.setId(2);
		homeStay.setName("Nemadhi-HomeStay");
		homeStay.setLocation("Saklleshpura");
		homeStay.setCheckInTime(LocalTime.of(12, 00));
		homeStay.setCheckOutTime(LocalTime.of(11, 0));
		homeStay.setCreatedBy("Supreeth");
		homeStay.setCreateDate(LocalDate.now());
		homeStay.setUpdateDate(LocalDate.now());
		homeStay.setOwner("Naveen");
		homeStay.setPricePerDay(1200D);
		
		HomeStayDAO dao = new HomeStayDAOImpl();
		Boolean save = dao.save(homeStay);
		System.out.println("Saved Details are: " + save);
		
		
		
	}

}
