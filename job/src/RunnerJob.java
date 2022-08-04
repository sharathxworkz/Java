import com.xworkz.job.constant.Designation;
import com.xworkz.job.constant.Qualification;
import com.xworkz.job.dao.JobDAO;
import com.xworkz.job.dao.JobDAOImpl;
import com.xworkz.job.dto.JobDTO;

public class RunnerJob {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		JobDTO jobDTO = new JobDTO(1,Designation.SYSTEMENGINEER,300000.00D,Qualification.BE,57.65D,"NO");
		JobDAO jobDAO = new JobDAOImpl();
//		jobDAO.saveDetails(jobDTO);
//		JobDTO gon =jobDAO.findByID(2);
//		System.out.println(gon);
//	JobDTO details=jobDAO.findByIdAndDesignation(4, "NetworkEngineer");
//	System.out.println(details);
//		JobDTO de = jobDAO.findByIdAndDesignationAndQualification(6, "Developer", "BE");
//		System.out.println(de);
//		jobDAO.getTotal();
//		boolean f = jobDAO.isFesherById(3);
//		System.out.println(f);
		Double perc = jobDAO.getMaxPercentage();
		System.out.println(perc);
	}

}
