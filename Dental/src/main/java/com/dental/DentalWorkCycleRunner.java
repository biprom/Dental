package com.dental;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

import com.dental.SharedData;
import com.dental.DentalWorkCycle;


public class DentalWorkCycleRunner {
	
	
	
	public DentalWorkCycleRunner() {
		
	}

	DentalWorkCycle wc = new DentalWorkCycle();
	Thread thread= new Thread(wc);
	
	
	
	
	@PostConstruct
	public void init() {
		thread.start();
	}
	
	@SuppressWarnings("deprecation")
	@PreDestroy
	public void destroy() {
		if (wc != null) {
			wc.stop();
		}
	}

}
