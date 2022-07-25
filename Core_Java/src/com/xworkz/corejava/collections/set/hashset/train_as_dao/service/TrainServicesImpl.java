package com.xworkz.corejava.collections.set.hashset.train_as_dao.service;

import com.xworkz.corejava.collections.set.hashset.train_as_dao.dao.TrainDAO;
import com.xworkz.corejava.collections.set.hashset.train_as_dao.dao.TrainDAOImpl;
import com.xworkz.corejava.collections.set.hashset.train_as_dao.dto.TrainDTO;

public class TrainServicesImpl implements TrainServices {
	
	TrainDAO train = new TrainDAOImpl();
	
	@Override
	public void addTrainDetails(TrainDTO traindto) {
		
		Integer tNumber = traindto.getTrainNumber();
		int count = 0;
		if(tNumber != 0) {
			count++;
		}
		if(count > 0) {
			train.addTrainDetails(traindto);
		}
		
		else {
			System.out.println("Train Details Provided are Not Matching Required Standard..!!");
		}
		
	}

	@Override
	public TrainDTO getTrainDetails(Integer trainNumber) {
		int count =0;
		Integer tName = trainNumber;
		if(tName % 5 == 0) {
			count++;
		}
		if(count > 0) {
			return train.getTrainDetails(trainNumber);
		}
		else {
			System.out.println("Train Details Entered are Incorrect..!!");
			return null;
		}
		
	
	}

	@Override
	public void updateTrainDetails(TrainDTO traindto) {
		Integer tNumber = traindto.getTrainNumber();
		int count = 0;
		if(tNumber % 5 == 0) {
			count++;
		}
		if(count > 0) {
			train.updateTrainDetails(traindto);
		}
		
		else {
			System.out.println("Train Details Entered are Not Found..!!");
		}
		
	}

	@Override
	public void deleteTrainDetails(TrainDTO traindto) {
		
		Integer tNumber = traindto.getTrainNumber();
		int count = 0;
		if(tNumber != 0) {
			count++;
		}
		if(count > 0) {
			train.cancelTrain(traindto);
		}
		
		else {
			System.out.println("Train Details Provided are Not Matching Required Standard..!!");
		}

		
		
	}

}
