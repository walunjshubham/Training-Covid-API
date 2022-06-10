package com.training.amdocs.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.training.amdocs.entity.CovidCenters;
@Service
public interface CovidCenterServices 
{
	public List<?> getListOfAllCenters();
	
	public List<?> getCentersByPinCode(int pin);
	public String addCenters(CovidCenters cc);
	

}
