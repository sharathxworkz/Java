package com.xworkz.corejava.collections.set.hashset.train_as_dao;

//import com.xworkz.corejava.collections.set.hashset.train_as_dao.dao.TrainDAO;
import com.xworkz.corejava.collections.set.hashset.train_as_dao.dto.TrainDTO;
import com.xworkz.corejava.collections.set.hashset.train_as_dao.service.TrainServices;
import com.xworkz.corejava.collections.set.hashset.train_as_dao.service.TrainServicesImpl;

public class HashSetDemo {
	
	public static void main(String[] args) {
		
	TrainDTO shatabdi = new TrainDTO();
		
		shatabdi.setTrainNumber(15255);
		shatabdi.setTrainName("Shatabdi");
		shatabdi.setNoOfVaggen(24);
		shatabdi.setSource("Manglore");
		shatabdi.setDestination("Shivamogga");
		shatabdi.setPrice(700.00);
		
	TrainDTO rani = new TrainDTO();
		
		rani.setTrainNumber(152510);
		rani.setTrainName("Raja-Rani");
		rani.setNoOfVaggen(20);
		rani.setSource("Mysore");
		rani.setDestination("Delhi");
		rani.setPrice(2000.00);
		
	TrainDTO vande = new TrainDTO();
		
		vande.setTrainNumber(152550);
		vande.setTrainName("Vande Bharath Express");
		vande.setNoOfVaggen(13);
		vande.setSource("New Delhi");
		vande.setDestination("Varanasi");
		vande.setPrice(2500.00);
	
	TrainDTO chamundi = new TrainDTO();
		
		chamundi.setTrainNumber(1525575);
		chamundi.setTrainName("Chamundi Express");
		chamundi.setNoOfVaggen(24);
		chamundi.setSource("Mysore");
		chamundi.setDestination("Banglore");
		chamundi.setPrice(110.00);
	
	TrainDTO rajdhani = new TrainDTO();
	
		rajdhani.setTrainNumber(1525225);
		rajdhani.setTrainName("Rajdhani");
		rajdhani.setNoOfVaggen(24);
		rajdhani.setSource("Banglore");
		rajdhani.setDestination("Jaipur");
		rajdhani.setPrice(3500.00);
	
	TrainServices service = new TrainServicesImpl();
	
	service.addTrainDetails(shatabdi);
	service.addTrainDetails(rani);
	service.addTrainDetails(vande);
	service.addTrainDetails(chamundi);
    service.addTrainDetails(rajdhani);
	
	System.out.println("");
	
//	TrainDTO td = service.getTrainDetails(15255);
//	System.out.println("Below are The Train Details That you Requested :" + td);
	
	System.out.println("");
	
	shatabdi.setTrainName("Shatabdi-Express");
	service.updateTrainDetails(shatabdi);
//	
//	service.deleteTrainDetails(vande);

		
	}

}
