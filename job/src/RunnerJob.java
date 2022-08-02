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
		jobDAO.findByID(2);
	}

}
