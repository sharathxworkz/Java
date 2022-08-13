import java.time.LocalDate;
import java.time.LocalTime;

import com.xworkz.club.dao.ClubDAO;
import com.xworkz.club.dao.ClubDAOImpl;
import com.xworkz.club.entity.ClubEntity;

public class ClubRunner {

	public static void main(String[] args) {
		
		ClubEntity entity = new ClubEntity();
		entity.setCid(1);
		entity.setName("Indigo");
		entity.setLocation("Indiranagar");
		entity.setCheckInTime(LocalTime.of(5, 0));
		entity.setCheckOutTime(LocalTime.of(4, 0));
		entity.setCreatedBy("Indiana");
		entity.setCreatedDate(LocalDate.now());
		entity.setUpdatedBy("Manager");
		entity.setHappyHours("6-o-clock");
		
//		ClubEntity entity1 = new ClubEntity(2,"GTA-Club","ViceCity",LocalTime.of(5, 0),LocalTime.of(4, 0),"GTA",LocalDate.now(),"RockStar","7-o-clock");
//		ClubEntity entity2 = new ClubEntity(3,"GTA","SanAndRace",LocalTime.of(5, 0),LocalTime.of(4, 0),"RockStar",LocalDate.now(),"ViceCity","7-o-clock");
		ClubDAO dao = new ClubDAOImpl();
//		Boolean save = dao.save(entity1);
//		Boolean save1 = dao.save(entity2);
//		System.out.println(save);
//		System.out.println(save1);
		ClubEntity get = dao.finfById(2);
		System.out.println(get);
		dao.updateNameAndhappyHoursById("Indigo-Plata", "5-0-clock", 1);
		dao.deleteById(1);
	}

}
