package com.xworkz.corejava.collections.vector.flight_as_dao;

import java.util.ArrayList;

import com.xworkz.corejava.collections.vector.flight_as_dao.dto.FlightDTO;
import com.xworkz.corejava.collections.vector.flight_as_dao.service.FlightServices;
import com.xworkz.corejava.collections.vector.flight_as_dao.service.FlightServicesImpl;

public class VectorListDemo {

	public static void main(String[] args) {
		
		ArrayList<String> offers = new ArrayList<String>();
		ArrayList<String> offers1 = new ArrayList<String>();
		
		offers.add("30% OFF");
		offers1.add("20% OFF");

		
		FlightDTO airIndia = new FlightDTO();
		airIndia.setFlightNumber(145215);
		airIndia.setFlightName("AirIndia");
		airIndia.setType("Domestic");
		airIndia.setSourceLocation("Banglore");
		airIndia.setDestinationLocation("Mysore");
		airIndia.setPrice(30000.00);
		airIndia.setOffers(offers);
		
		FlightDTO indigo = new FlightDTO();
		indigo.setFlightNumber(155775);
		indigo.setFlightName("Indigo");
		indigo.setType("International");
		indigo.setSourceLocation("Banglore");
		indigo.setDestinationLocation("Spain");
		indigo.setPrice(50000.00);
		indigo.setOffers(offers1);
		
		FlightDTO goAir = new FlightDTO();
		goAir.setFlightNumber(145785);
		goAir.setFlightName("GoAir");
		goAir.setType("International");
		goAir.setSourceLocation("Banglore");
		goAir.setDestinationLocation("Dubai");
		goAir.setPrice(45000.00);
		goAir.setOffers(offers1);
		
		FlightDTO airAsia = new FlightDTO();
		airAsia.setFlightNumber(577525);
		airAsia.setFlightName("AirAsia");
		airAsia.setType("International");
		airAsia.setSourceLocation("Banglore");
		airAsia.setDestinationLocation("Abu-Dhabi");
		airAsia.setPrice(60000.00);
		goAir.setOffers(offers1);
		
		FlightDTO kingfisher = new FlightDTO();
		kingfisher.setFlightNumber(1522775);
		kingfisher.setFlightName("KingFisher");
		kingfisher.setType("Domestic");
		kingfisher.setSourceLocation("Banglore");
		kingfisher.setDestinationLocation("Goa");
		kingfisher.setPrice(10000.00);
		goAir.setOffers(offers);
		
		FlightServices service = new FlightServicesImpl();
			service.addFlightDetails(airIndia);
			service.addFlightDetails(indigo);
			service.addFlightDetails(goAir);
			service.addFlightDetails(airAsia);
			service.addFlightDetails(kingfisher);
			
			System.out.println(" ");
			
			FlightDTO fd = service.getFlightDetail(577525);
			System.out.println(fd);
			
			System.out.println(" ");
			
			airIndia.setFlightName("AirIndia-Airlines");
			service.updateFlightDetails(airIndia);
			
			System.out.println(" ");
			
			service.deleteFlight(kingfisher);
	}
	

}
