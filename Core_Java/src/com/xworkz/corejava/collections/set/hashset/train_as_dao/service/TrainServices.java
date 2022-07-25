package com.xworkz.corejava.collections.set.hashset.train_as_dao.service;

import com.xworkz.corejava.collections.set.hashset.train_as_dao.dto.TrainDTO;

public interface TrainServices {


	public void addTrainDetails(TrainDTO traindto);
	public TrainDTO getTrainDetails(Integer trainNumber);
	public void updateTrainDetails(TrainDTO traindto);
	public void deleteTrainDetails(TrainDTO traindto);
	
}
