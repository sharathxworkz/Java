import java.time.LocalDate;

import com.xworkz.trimmer.dao.TrimmerDAO;
import com.xworkz.trimmer.dao.TrimmerDAOImpl;
import com.xworkz.trimmer.entity.TrimmerEntity;

public class TrimmerRunner {

	public static void main(String[] args) {
		
		TrimmerEntity entity = new TrimmerEntity(1,"Philips","WaterProof","Black",LocalDate.of(1997, 10, 17),"Phillips","Holland",2,LocalDate.now());
		TrimmerEntity entity1 = new TrimmerEntity(2,"Syska","WaterProof","Blue",LocalDate.of(2022, 10, 17),"SyskaLabs","NetherLand",1,LocalDate.now());
		TrimmerEntity entity2 = new TrimmerEntity(3,"Panasonic","spilProff","Grey",LocalDate.of(1985, 10, 17),"Panaso","England",3,LocalDate.now());

		TrimmerDAO dao = new TrimmerDAOImpl();
//		Boolean save = dao.save(entity);
//		Boolean save1 = dao.save(entity1);
//		Boolean save2 = dao.save(entity2);
//		
//		System.out.println(save2);
		
//		TrimmerEntity get = dao.finfById(1);
//		System.out.println(get);
		
		dao.updateNameAndLocationById("LG", "MattBlue", 1);
		
		dao.deleteById(3);
	}

}
