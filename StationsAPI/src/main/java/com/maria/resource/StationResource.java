package com.maria.resource;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.maria.entity.Station;
import com.maria.service.StationService;

@RestController
public class StationResource {

	@Autowired
	private StationService service;
	

	
	@GetMapping(path= "stations", produces = MediaType.APPLICATION_JSON_VALUE)
	
	public Collection<Station> displayAllStations() {
		
		return service.getAllStations();
	}
	
	
}
