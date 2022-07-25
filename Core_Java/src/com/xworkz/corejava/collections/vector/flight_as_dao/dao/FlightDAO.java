package com.xworkz.corejava.collections.vector.flight_as_dao.dao;

import com.xworkz.corejava.collections.vector.flight_as_dao.dto.FlightDTO;

public interface FlightDAO {

	public void addFlightDetails(FlightDTO dto);
	public FlightDTO getFlightDetails(Integer flightNumber);
	public void updateFlightDetails(FlightDTO dto);
	public void cancelFlight(FlightDTO dto);
}
