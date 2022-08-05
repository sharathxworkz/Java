import com.xworkx.politician.dto.PoliticianDTO;
import com.xworkz.politician.constant.PartyName;
import com.xworkz.politician.constant.PartySymbol;
import com.xworkz.politician.dao.PoliticianDAO;
import com.xworkz.politician.dao.PoliticianDAOImpl;

public class RunnerP {

	public static void main(String[] args) {

		PoliticianDTO politicianDTO = new PoliticianDTO(1,"Yuvraj",PartyName.BJP,"Prathiba",3000,1000000.00D,PartySymbol.LOTUS,"Banglore","Delhi");
		PoliticianDTO politicianDTO1 = new PoliticianDTO(2,"Prajwal",PartyName.PRKY,"Suhas",308,2000000.00D,PartySymbol.FAN,"Banglore","Delhi");
		PoliticianDTO politicianDTO2= new PoliticianDTO(3,"Dev",PartyName.RSS,"AmirShah",2000,3000000.00D,PartySymbol.CYCLE,"Banglore","Delhi");
		PoliticianDTO politicianDTO3 = new PoliticianDTO(4,"Yoga",PartyName.SS,"Yogi",457,4000000.00D,PartySymbol.MOP,"Banglore","Delhi");
		PoliticianDTO politicianDTO4 = new PoliticianDTO(5,"Nandish",PartyName.SP,"DK",200,5000000.00D,PartySymbol.FOX,"Banglore","Delhi");
		PoliticianDTO politicianDTO5 = new PoliticianDTO(6,"Hanumanth",PartyName.SIV,"Sidu",400,500000.00D,PartySymbol.COCONUT,"Banglore","Delhi");
		PoliticianDTO politicianDTO6 = new PoliticianDTO(7,"Kalyan",PartyName.KYLP,"Pabu",325,8000000.00D,PartySymbol.CLOCK,"Banglore","Delhi");
		PoliticianDTO politicianDTO7 = new PoliticianDTO(8,"Nandhan",PartyName.KJP,"Raby",30,200000.00D,PartySymbol.ELEPHANT,"Banglore","Delhi");
		PoliticianDTO politicianDTO8 = new PoliticianDTO(9,"Chandru",PartyName.CONG,"Apaji",353,200000.00D,PartySymbol.PAM,"Banglore","Delhi");
		PoliticianDTO politicianDTO9 = new PoliticianDTO(10,"Manohar",PartyName.AAP,"Kumar",210,9000000.00D,PartySymbol.BAG,"Banglore","Delhi");
		
		PoliticianDAO politicianDAO = new PoliticianDAOImpl();
//		politicianDAO.saveDetails(politicianDTO1);
//		PoliticianDTO get= politicianDAO.finfById(3);
//		System.out.println(get);
//		PoliticianDTO d = politicianDAO.findByIdAndPresident(4,"Yogi");
//		System.out.println(d);
//		PoliticianDTO m = politicianDAO.findByIdAndPresidentAndName(10, "Kumar", "Manohar");
//		System.out.println(m);
//		PoliticianDTO d = politicianDAO.findByIdAndName(6, "Hanumanth");
//		System.out.println(d);
//		String n = politicianDAO.findNameById(7);
//		System.out.println(n);
//		String p = politicianDAO.findPresidentByIdAndName(7,"Kalyan");
//		System.out.println(p);
		politicianDAO.getTotal();
	

	}

}
