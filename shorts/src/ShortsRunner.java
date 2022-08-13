import java.time.LocalDate;

import com.xworkz.shorts.dao.ShortsDAO;
import com.xworkz.shorts.dao.ShortsDAOImpl;
import com.xworkz.shorts.entity.ShortsEntity;

public class ShortsRunner {

	public static void main(String[] args) {
		
		ShortsEntity entity = new ShortsEntity(1,"Puma","Cheetha",LocalDate.now(),"Puma",LocalDate.now(),"owner","Bombay",2000);
		
		ShortsDAO dao = new ShortsDAOImpl();
		Boolean entity1 = dao.save(entity);
		System.out.println(entity1);
		ShortsEntity entit = 	dao.finfById(1);
		System.out.println(entit);
		dao.updateNameAndLocationById("Reebook", "Chennai", 1);
		dao.deleteById(1);
	}

}
