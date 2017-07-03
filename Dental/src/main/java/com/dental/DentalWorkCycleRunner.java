package com.dental;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

import com.dental.SharedData;
import com.dental.DentalWorkCycle;

@Component
public class DentalWorkCycleRunner {
	
	DentalWorkCycle dwc;
	
	@Autowired
	public DentalWorkCycleRunner(DentalWorkCycle dentalWorkCycle) {
		this.dwc = dentalWorkCycle;
		
	}

	//DentalWorkCycle wc = new DentalWorkCycle(null);
	
	
	
	
	
	@PostConstruct
	public void init() {
		Thread thread= new Thread(dwc);
		thread.start();
	}
	
	@SuppressWarnings("deprecation")
	@PreDestroy
	public void destroy() {
		if (dwc != null) {
			dwc.stop();
		}
	}

}