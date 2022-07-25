package com.xworkz.corejava.collections.vector.flight_as_dao.service;

import com.xworkz.corejava.collections.vector.flight_as_dao.dto.FlightDTO;

public interface FlightServices {

  public void addFlightDetails(FlightDTO dto);
  public FlightDTO getFlightDetail(Integer flightNumber);
  public void updateFlightDetails(FlightDTO dto);
  public void deleteFlight(FlightDTO dto);
}
