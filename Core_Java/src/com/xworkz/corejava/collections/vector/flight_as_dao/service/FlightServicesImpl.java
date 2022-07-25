package com.xworkz.corejava.collections.vector.flight_as_dao.service;

import com.xworkz.corejava.collections.vector.flight_as_dao.dao.FlightDAO;
import com.xworkz.corejava.collections.vector.flight_as_dao.dao.FlightDAOImpl;
import com.xworkz.corejava.collections.vector.flight_as_dao.dto.FlightDTO;

public class FlightServicesImpl implements FlightServices {
	
	FlightDAO flightDAO = new FlightDAOImpl();

	@Override
	public void addFlightDetails(FlightDTO dto) {
		int flightNo = dto.getFlightNumber();
		int count = 0;
		while(flightNo != 0) {
		count++;
		}
		if(count > 0){
		flightDAO.addFlightDetails(dto);
		}
		else {
			System.out.println("Flight Details Not Meet Standards");
		}
	}

	@Override
	public FlightDTO getFlightDetail(Integer dto) {
		return flightDAO.getFlightDetails(dto);
	}

	@Override
	public void updateFlightDetails(FlightDTO dto) {
		int count = 0;
		Integer getFlightNumber = dto.getFlightNumber();
		if(getFlightNumber%5 == 0){
			count++;
		}
		if(count == 0) {
		flightDAO.updateFlightDetails(dto);
		}
		else {
			System.out.println("Flight Details Entered are Incorrect");
		}
	}
		


	@Override
	public void deleteFlight(FlightDTO dto) {
		int count = 0;
		Integer getFlightNumber = dto.getFlightNumber();
		if(getFlightNumber%5 == 0){
			count++;
		}
		if(count == 0) {
		flightDAO.cancelFlight(dto);;
		}
		else {
			System.out.println("Flight Details Entered are Incorrect");
		}
	}

}
