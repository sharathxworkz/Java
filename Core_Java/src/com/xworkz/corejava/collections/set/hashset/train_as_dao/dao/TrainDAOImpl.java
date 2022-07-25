package com.xworkz.corejava.collections.set.hashset.train_as_dao.dao;

import java.util.ArrayList;
import java.util.HashSet;

import com.xworkz.corejava.collections.set.hashset.train_as_dao.dto.TrainDTO;

public class TrainDAOImpl implements TrainDAO{
	
	HashSet<TrainDTO> hSet = new HashSet<TrainDTO>();
	//converting hashset to arraylist.
	TrainDTO[] trains = hSet.toArray(new TrainDTO[hSet.size()]);

	@Override
	public void addTrainDetails(TrainDTO traindto) {
		hSet.add(traindto);
		System.out.println("The Train Details are as Mentioned Below : " + traindto);
		
	}

	@Override
	public TrainDTO getTrainDetails(Integer trainNumber) {
		Integer count = 0;
		int i;
		for (i = 0; i < hSet.size(); i++) {
			  if( trains[i].getTrainNumber() == trainNumber){
				  count++;
			  }
		   } 
			  if(count > 1) {
				  return trains[i];
			  }
		
			  else {
				  System.out.println("Hello");
				  return null;
			  }
	   }

	@Override
	public void updateTrainDetails(TrainDTO traindto) {
		int count=0;
		for(int i = 0; i < hSet.size(); i++) {
			if(trains[i] != null && trains[i].getTrainName() == traindto.getTrainName()) {
				trains[i].setTrainName(traindto.getTrainName());
				count++;
				System.out.println("The Updated Train Details Are: " + trains[i]);
			}			
		}
		if (count == 0) {
			System.out.println("Unable To Update Train Details");
		}
	}	

	@Override
	public void cancelTrain(TrainDTO traindto) {
		hSet.remove(traindto);
		System.out.println("The Canceled Train Details are " + traindto);
		
	}

	@Override
	public void bookTrain(TrainDTO traindto) {
		// TODO Auto-generated method stub
		
	}

}
