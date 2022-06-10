package com.training.amdocs.controllers;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.training.amdocs.DAO.CentersDAO;
import com.training.amdocs.entity.CovidCenters;

@RestController
public class CentersController 
{
	//daoclass
	
	@Autowired
	CentersDAO cdao;

	
	@GetMapping(value="/allcenters")
	public List<CovidCenters> getAllCovidCenters()
	{
		List<CovidCenters> al=(List<CovidCenters>) cdao.getListOfAllCenters();
		return al;
		
	}
	
	@GetMapping(value="/allcentersByPin/{pin}")
	public List<CovidCenters> getAllCovidCenters(@PathVariable ("pin") String pin)
	{
		System.out.println("Inside pincodes");
		int pinCode=Integer.parseInt(pin);
		List<CovidCenters> foundCenter=(List<CovidCenters>) cdao.getCentersByPinCode(pinCode);
		//System.out.println(foundCenter.get(0).getName());
		return foundCenter;
	}
	
	@PostMapping(value="/addCenter")
	public String addCenter(@RequestBody CovidCenters cc)
	{
		
		int it=cc.getPinCode();
		System.out.println("At add method"+it);
		if(cc!=null)
		return cdao.addCenters(cc);
		return "Error occured";
		
	}
	
	
	
}
