import com.xworkz.superBikes.constants.BikeCC;
import com.xworkz.superBikes.constants.CompanyName;
import com.xworkz.superBikes.dao.SuperBikeDAO;
import com.xworkz.superBikes.dao.SuperBikeDAOImpl;
import com.xworkz.superBikes.dto.SuperBikeDTO;

public class SuperBikeRunner {

	public static void main(String[] args) {
		
//		SuperBikeDTO bikeDTO = new SuperBikeDTO(1,CompanyName.NINJA,"Sport",BikeCC.THOUSANDSIXHUNDRED,6,15000,10000,"Green","Manual",2,"LED",1600000.00D);
		SuperBikeDTO bikeDTO1 = new SuperBikeDTO(2,CompanyName.BENELLI,"Sport",BikeCC.THOUSANDTEN,6,15000,10000,"Green","Auto",2,"LED",1600000.00D);
		SuperBikeDTO bikeDTO2 = new SuperBikeDTO(3,CompanyName.BMW,"Sport",BikeCC.TWOTHOUSAND,5,15000,10000,"Neon","Manual",2,"LED",1600000.00D);
		SuperBikeDTO bikeDTO3 = new SuperBikeDTO(4,CompanyName.DUCATI,"Sport",BikeCC.THOUSANDSIXHUNDRED,6,15000,10000,"Red","Manual",2,"LED",1600000.00D);
		SuperBikeDTO bikeDTO4 = new SuperBikeDTO(5,CompanyName.GSX,"Sport",BikeCC.THOUSANDTWOHUNDRED,7,15000,10000,"Blue","Manual",2,"LED",1600000.00D);
		SuperBikeDTO bikeDTO5 = new SuperBikeDTO(6,CompanyName.HAYABUZA,"Sport",BikeCC.THOUSANDSIXHUNDRED,6,15000,10000,"Orange","Manual",2,"Halogean",1600000.00D);
		SuperBikeDTO bikeDTO6 = new SuperBikeDTO(7,CompanyName.R1,"Sport",BikeCC.THOUSANDSIXHUNDRED,6,15000,10000,"Blue","Manual",2,"LED",1600000.00D);
		SuperBikeDTO bikeDTO7 = new SuperBikeDTO(8,CompanyName.BMW,"Sport",BikeCC.THOUSANDSIXHUNDRED,6,15000,10000,"White","Manual",2,"LED",1600000.00D);
		SuperBikeDTO bikeDTO8 = new SuperBikeDTO(9,CompanyName.DUCATI,"Sport",BikeCC.THOUSANDSIXHUNDRED,6,15000,10000,"Lavender","Manual",2,"LED",1600000.00D);
		SuperBikeDTO bikeDTO9 = new SuperBikeDTO(10,CompanyName.GSX,"Sport",BikeCC.THOUSANDSIXHUNDRED,8,15000,10000,"Crimpson-Red","Auto",2,"Hlogean",1600000.00D);
		SuperBikeDTO bikeDTO10 = new SuperBikeDTO(11,CompanyName.R1,"Sport",BikeCC.THOUSANDSIXHUNDRED,5,15000,10000,"Neon-Orange","Manual",2,"LED",1600000.00D);
		SuperBikeDTO bikeDTO11 = new SuperBikeDTO(12,CompanyName.NINJA,"Sport",BikeCC.THOUSANDSIXHUNDRED,7,15000,10000,"SkyBlue","Manual",2,"LED",1600000.00D);
		SuperBikeDTO bikeDTO12 = new SuperBikeDTO(13,CompanyName.DUCATI,"Sport",BikeCC.THOUSANDSIXHUNDRED,5,15000,10000,"Black","Auto",2,"LED",1600000.00D);
		
		
		SuperBikeDAO bikeDAO = new SuperBikeDAOImpl();
//		bikeDAO.saveDeatils(bikeDTO1);
//		bikeDAO.saveDeatils(bikeDTO2);
//		bikeDAO.saveDeatils(bikeDTO3);
//		bikeDAO.saveDeatils(bikeDTO4);
//		bikeDAO.saveDeatils(bikeDTO5);
//		bikeDAO.saveDeatils(bikeDTO6);
//		bikeDAO.saveDeatils(bikeDTO7);
//		bikeDAO.saveDeatils(bikeDTO8);
//		bikeDAO.saveDeatils(bikeDTO9);
//		bikeDAO.saveDeatils(bikeDTO10);
//		bikeDAO.saveDeatils(bikeDTO11);
//		bikeDAO.saveDeatils(bikeDTO12);
		
//		SuperBikeDTO dto =bikeDAO.finfById(4);
//		System.out.println(dto);
		
//		SuperBikeDTO dto = bikeDAO.findByIdAndName(4,"Ducati");
//		System.out.println(dto);
		
//		SuperBikeDTO dto = bikeDAO.findByIdAndCapacityAndName(7, "1600cc", "Yamha-R1");
//		System.out.println(dto);
		
//		String dto = bikeDAO.bikeNameByIdAndcubicCapacity(1,"1600cc");
//		System.out.println(dto);
		
//		SuperBikeDTO dto = bikeDAO.updatedetails(7);
//		System.out.println(dto);
		
		Boolean dto = bikeDAO.deleteBike("Ducati",5);
		System.out.println(dto);

	}

}
