import java.time.LocalDate;

import com.xworkz.crusor.dao.CrusorDAO;
import com.xworkz.crusor.dao.CrusorDAOImpl;
import com.xworkz.crusor.entity.CrusorEntity;

public class CrusorRunner {

	public static void main(String[] args) {
		
		CrusorEntity crusor = new CrusorEntity(1,"Allure","Manglore",LocalDate.of(1857, 7, 17),"Jorge",LocalDate.now(),"manager",200000D,25000.00D);
		CrusorEntity crusor1 = new CrusorEntity(2,"Norwegian","USA",LocalDate.of(1857, 7, 17),"Norman",LocalDate.now(),"mango",3000000.00D,55000.00D);
		CrusorEntity crusor2 = new CrusorEntity(3,"Mariner","Britan",LocalDate.of(1857, 7, 17),"Mayer",LocalDate.now(),"Major",250000D,38000.00D);
		
		CrusorDAO dao = new CrusorDAOImpl();
//		Boolean save = dao.save(crusor);
//		Boolean save1 = dao.save(crusor1);
//		Boolean save2 = dao.save(crusor2);
//		System.out.println(save +" "+save1 +" "+ save2);

		CrusorEntity entity = dao.finfById(1);
		System.out.println(entity);
		
		dao.updateNameAndLocationById("Titanic", "RedSea", 1);
		
		dao.deleteById(1);
		
		
	}

}
