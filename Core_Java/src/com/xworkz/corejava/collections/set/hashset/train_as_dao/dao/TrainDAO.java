package com.xworkz.corejava.collections.set.hashset.train_as_dao.dao;

import com.xworkz.corejava.collections.set.hashset.train_as_dao.dto.TrainDTO;

public interface TrainDAO {

	public void addTrainDetails(TrainDTO traindto);
	public TrainDTO getTrainDetails(Integer trainNumber);
	public void updateTrainDetails(TrainDTO traindto);
	public void cancelTrain(TrainDTO traindto);
	public void bookTrain(TrainDTO traindto);
}	