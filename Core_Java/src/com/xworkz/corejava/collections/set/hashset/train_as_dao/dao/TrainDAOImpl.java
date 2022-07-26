package com.xworkz.corejava.collections.set.hashset.train_as_dao.dao;

import java.util.ArrayList;
import java.util.HashSet;

import com.xworkz.corejava.collections.set.hashset.train_as_dao.dto.TrainDTO;

public class TrainDAOImpl implements TrainDAO{
	
	HashSet<TrainDTO> hSet = new HashSet<TrainDTO>();
	//converting hashset to arraylist.

	@Override
	public void addTrainDetails(TrainDTO traindto) {
		hSet.add(traindto);
		System.out.println("The Train Details are as Mentioned Below : " + traindto);
		
	}

	@Override
	public TrainDTO getTrainDetails(Integer trainNumber) {
		Object[] trains = hSet.toArray();

		Integer count = 0;
		for (int i = 0; i < trains.length; i++) {
		TrainDTO train	= (TrainDTO)trains[i];
			  if(trains[i] != null &&  train.getTrainNumber().equals(trainNumber)){
				  count++;
			  }
		   } 
			  if(count != 0) {
				  return (TrainDTO)trains[count];
			  }
		
			  else {
				  System.out.println("Hello");
				  return null;
			  }
	   }

	@Override
	public void updateTrainDetails(TrainDTO traindto) {
		Object[] trains = hSet.toArray();
		int count = 0;
		for(int i = 0; i<trains.length;i++) {
			TrainDTO train = (TrainDTO)trains[i];
			if(trains[i] != null && train.getTrainName().equals(traindto.getTrainName())){
				count++;
				train.setTrainName(traindto.getTrainName());
				System.out.println(trains[i]);
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
