package com.training.amdocs.DAO;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import com.training.amdocs.entity.CovidCenters;
import com.training.amdocs.services.CovidCenterServices;


@Component
public class CentersDAO implements CovidCenterServices {

	public List<CovidCenters> al=new ArrayList<CovidCenters>();
	
	public CentersDAO()
	{
		al.add(new CovidCenters("Jumbo Covid","Pune", 411044));
		al.add(new CovidCenters("Small Covid","Nashik", 411044));
		al.add(new CovidCenters("max Covid","Mumbai", 418908));
	}

	@Override
	public List<?> getListOfAllCenters() {
		

		return al;
	}

	@Override
	public List<?> getCentersByPinCode(int pin) {
		List<CovidCenters> all=(List<CovidCenters>) getListOfAllCenters();
		
		List<CovidCenters> finded=all.stream().filter(a->a.getPinCode()==pin).collect(Collectors.toList());
		return finded;
	}

	@Override
	public String addCenters(CovidCenters cc) {
		//List<CovidCenters> all=(List<CovidCenters>) getListOfAllCenters();
		CovidCenters cc1=new CovidCenters(cc.getName(),cc.getAddress(),cc.getPinCode());
		al.add(cc1);
		return "Center added successfully";
		

	}

}
