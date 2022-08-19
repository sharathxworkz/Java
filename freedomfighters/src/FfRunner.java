import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import com.xworkz.freedomfighters.dao.FreedomFightersDAO;
import com.xworkz.freedomfighters.dao.FreedomFightersDAOImpl;
import com.xworkz.freedomfighters.entity.FreedomFightersEntity;

public class FfRunner {

	public static void main(String[] args) {
		
		FreedomFightersEntity entity = new FreedomFightersEntity("BhagatSingh",LocalDateTime.now(),"Mumbai","Attal Ji",LocalDateTime.now(),"Modi Ji",LocalDateTime.now());
		FreedomFightersEntity entity1 = new FreedomFightersEntity("Lal Bhadhur Shastri",LocalDateTime.now(),"Bihar","Attal Ji",LocalDateTime.now(),"Modi Ji",LocalDateTime.now());
		FreedomFightersEntity entity2 = new FreedomFightersEntity("Rani-Chanamma",LocalDateTime.now(),"Kittur","Attal Ji",LocalDateTime.now(),"Modi Ji",LocalDateTime.now());
		
		FreedomFightersDAO dao = new FreedomFightersDAOImpl();
		
		List<FreedomFightersEntity> list = new ArrayList<FreedomFightersEntity>();
		for(int i = 50; i>0; i--) {
		list.add(entity);
		list.add(entity1);
		list.add(entity2);
		}
		Boolean save = dao.insert(list);
		System.out.println(save);

	}

}
