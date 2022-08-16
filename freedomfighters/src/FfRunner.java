import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import com.xworkz.freedomfighters.dao.FreedomFightersDAO;
import com.xworkz.freedomfighters.dao.FreedomFightersDAOImpl;
import com.xworkz.freedomfighters.entity.FreedomFightersEntity;

public class FfRunner {

	public static void main(String[] args) {
		
		FreedomFightersEntity entity = new FreedomFightersEntity(1,"BhagatSingh",LocalDateTime.now(),"Mumbai","Attal Ji",LocalDateTime.now(),"Modi Ji",LocalDateTime.now());
		FreedomFightersEntity entity1 = new FreedomFightersEntity(2,"Lal Bhadhur Shastri",LocalDateTime.now(),"Bihar","Attal Ji",LocalDateTime.now(),"Modi Ji",LocalDateTime.now());
		FreedomFightersEntity entity2 = new FreedomFightersEntity(3,"Rani-Chanamma",LocalDateTime.now(),"Kittur","Attal Ji",LocalDateTime.now(),"Modi Ji",LocalDateTime.now());
		
		List<FreedomFightersEntity> list = new ArrayList<FreedomFightersEntity>();
		
		FreedomFightersDAO dao = new FreedomFightersDAOImpl();
		
		List lists = dao.insert(entity);
		
		


	}

}
