package com.xworkz.corejava.collections.vector.flight_as_dao.dao;

import com.xworkz.corejava.collections.vector.flight_as_dao.dto.FlightDTO;
import java.util.Vector;
public class FlightDAOImpl implements FlightDAO {
	
	Vector<FlightDTO> flights = new Vector<FlightDTO>();

	@Override
	public void addFlightDetails(FlightDTO dto) {
		flights.add(dto);
		System.out.println("Below are the Details of Flights Available: " + flights);
	}

	@Override
	public FlightDTO getFlightDetails(Integer flightNumber) {
		int count = 0;
		for(int i = 0; i<flights.size();i++) {
		if(flights.get(i).getFlightNumber() == flightNumber) {
			count++;
			return flights.get(i);
		}
	}
		if(count == 0) {
			System.out.println("Invalid Flight Search Details Entered");
		}
		return null;
	}

	@Override
	public void updateFlightDetails(FlightDTO dto) {
		int count = 0;
		for(int i = 0; i<flights.size();i++) {
		if(flights.get(i).getFlightName() == dto.getFlightName()) {
			count++;
			flights.get(i).setFlightName(dto.getFlightName());
			System.out.println("Updated CompanyName is:" + flights.get(i));
		}
	}
		if(count == 0) {
			System.out.println("Unable To update The Details Of the Flight..!");
		}
		
	}

	@Override
	public void cancelFlight(FlightDTO dto) {
		int count = 0;
		for (int i=0; i< flights.size(); i++) {
			if( flights.get(i) != null && flights.get(i).getFlightName() == dto.getFlightName()) {
				flights.remove(i);
					count++;
				}
			}	
		if(count > 0) {
			System.out.println("The Mentioned Flight Name and Flight Number Flight has been canceled" +dto.getFlightName() +" " + dto.getFlightNumber() + " being deleted from the ArrayList" );
		}
		
		else {
			System.out.println("MissMatch Of FlightDetails Entered");
	   }
		
	}
	

}
