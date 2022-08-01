import com.xworkz.bar.constant.BarType;
import com.xworkz.bar.dao.BarDAO;
import com.xworkz.bar.dao.BarDAOImpl;
import com.xworkz.bar.dto.BarDTO;

public class RunnerBar {

	public static void main(String[] args) {
		
		Double avrCollectionPerDay = 27000.00;
		Double avrCollectionPerMonth = avrCollectionPerDay*3;
		
		BarDTO dto = new BarDTO();
		dto.setId(1);
		dto.setBarName("Shilpa");
		dto.setLocation("BTM");
		dto.setAvrCollectionPerDay(avrCollectionPerDay);
		dto.setAvrCollectionPerMonth(avrCollectionPerMonth);
		
		BarDTO dto1 = new BarDTO();
		dto.setId(2);
		dto.setBarName("Stories");
		dto.setLocation("Jp-Nager");
		dto.setAvrCollectionPerDay(avrCollectionPerDay);
		dto.setAvrCollectionPerMonth(avrCollectionPerMonth);
//		BarDTO barDTO1 = new BarDTO(2,"Stories","JP-Nagar","BarType.PUB",avrCollectionPerDay,avrCollectionPerMonth);
		
		BarDAO barDAO = new BarDAOImpl();
//			barDAO.save(dto);
		barDAO.save(dto1);
	}

}
