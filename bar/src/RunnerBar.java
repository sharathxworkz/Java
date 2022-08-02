import com.xworkz.bar.constant.BarType;
import com.xworkz.bar.dao.BarDAO;
import com.xworkz.bar.dao.BarDAOImpl;
import com.xworkz.bar.dto.BarDTO;

public class RunnerBar {

	public static void main(String[] args) {
		
		Double avrCollectionPerDay = 27000.00;
		Double avrCollectionPerMonth = avrCollectionPerDay*3;
		
		BarDTO dto6 = new BarDTO();
		
//		BarDTO dto6 = new BarDTO(5,"PumpHouse","Jp-Nagar","",avrCollectionPerDay,avrCollectionPerMonth);
		
		BarDTO dto = new BarDTO();
		dto.setId(1);
		dto.setBarName("Shilpa");
		dto.setLocation("BTM");
		dto.getType().getBar();
		dto.setAvrCollectionPerDay(avrCollectionPerDay);
		dto.setAvrCollectionPerMonth(avrCollectionPerMonth);

		BarDTO dto1 = new BarDTO();
		dto1.setId(4);
		dto1.setBarName("JQubes");
		dto1.setLocation("BSK");
		dto1.getType().getBar();
		dto1.setAvrCollectionPerDay(avrCollectionPerDay);
		dto1.setAvrCollectionPerMonth(avrCollectionPerMonth);
		
		BarDTO dto2 = new BarDTO();
		dto2.setId(5);
		dto2.setBarName("1522");
		dto2.setLocation("Jp-Nager");
		dto2.getType().getBar();
		dto2.setAvrCollectionPerDay(avrCollectionPerDay);
		dto2.setAvrCollectionPerMonth(avrCollectionPerMonth);
		

		BarDTO dto3 = new BarDTO();
		dto3.setId(2);
		dto3.setBarName("Drink & Dive");
		dto3.setLocation("RR-Nager");
		dto3.getType().getBar();
		dto3.setAvrCollectionPerDay(avrCollectionPerDay);
		dto3.setAvrCollectionPerMonth(avrCollectionPerMonth);

		BarDTO dto4 = new BarDTO();
		dto4.setId(3);
		dto4.setBarName("Stories");
		dto4.setLocation("Jp-Nager");
		dto4.getType().getBar();
		dto4.setAvrCollectionPerDay(avrCollectionPerDay);
		dto4.setAvrCollectionPerMonth(avrCollectionPerMonth);
		


		
		BarDAO barDAO = new BarDAOImpl();
		barDAO.save(dto);
		barDAO.save(dto1);
		barDAO.save(dto2);
		barDAO.save(dto3);
		barDAO.save(dto4);
	}

}
