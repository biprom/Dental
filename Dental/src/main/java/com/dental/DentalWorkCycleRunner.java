package com.dental;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.dental.SharedData;
import com.dental.DentalWorkCycle;


public class DentalWorkCycleRunner {
	
	Data sd;
	
	@Autowired
	public DentalWorkCycleRunner(Data sharedData) {
		this.sd = sharedData;
	}

	DentalWorkCycle wc = new DentalWorkCycle(sd );
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
