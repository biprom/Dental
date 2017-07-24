package com.dental;

import java.util.concurrent.TimeUnit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

import com.dental.IO.DigInput_PCF;
import com.dental.IO.DigOutput_PCF;

@Component("dentalWorkCycle")
@Scope("prototype")
public class DentalWorkCycle extends Thread {
	
	Data sharedData1;
	
	//get shared data from Bean
		
		
		@Autowired
		public DentalWorkCycle(Data dt){
			this.sharedData1 = dt;
		}
		
		//initialisatie outputs
			
					
					
				
	
//		Initialisatie digitale outputs	
		DigOutput_PCF digital_output_card_1 = new DigOutput_PCF(1, 0X27);
		DigOutput_PCF digital_output_card_2 = new DigOutput_PCF(1, 0X26);
		DigOutput_PCF digital_output_card_3 = new DigOutput_PCF(1, 0X25);
		
		
		private void setOutputsToVariables() {
			
			digital_output_card_1.d1.setState(!sharedData1.bureauAlain);
			try {
				TimeUnit.MILLISECONDS.sleep(2);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			digital_output_card_1.d2.setState(!sharedData1.zoneLandscape1a);
			try {
				TimeUnit.MILLISECONDS.sleep(2);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			digital_output_card_1.d3.setState(!sharedData1.zoneLandscape1b);
			try {
				TimeUnit.MILLISECONDS.sleep(2);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			digital_output_card_1.d4.setState(!sharedData1.secretZone);
			try {
				TimeUnit.MILLISECONDS.sleep(2);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			digital_output_card_1.d5.setState(!sharedData1.zoneStaal1a);
			try {
				TimeUnit.MILLISECONDS.sleep(2);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			digital_output_card_1.d6.setState(!sharedData1.garageStockage);
			try {
				TimeUnit.MILLISECONDS.sleep(2);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			digital_output_card_1.d7.setState(!sharedData1.uitbereiding1);
			try {
				TimeUnit.MILLISECONDS.sleep(2);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			digital_output_card_1.d8.setState(!sharedData1.gebouw1);
			try {
				TimeUnit.MILLISECONDS.sleep(2);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			digital_output_card_2.d1.setState(!sharedData1.zoneMeten);
			try {
				TimeUnit.MILLISECONDS.sleep(2);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			digital_output_card_2.d2.setState(!sharedData1.zoneSpray);
			try {
				TimeUnit.MILLISECONDS.sleep(2);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			digital_output_card_2.d3.setState(!sharedData1.zoneZirkonium);
			try {
				TimeUnit.MILLISECONDS.sleep(2);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			digital_output_card_2.d4.setState(!sharedData1.zonePorcelein1);
			try {
				TimeUnit.MILLISECONDS.sleep(2);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			digital_output_card_2.d5.setState(!sharedData1.zoneGieten);
			try {
				TimeUnit.MILLISECONDS.sleep(2);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			digital_output_card_2.d6.setState(!sharedData1.zoneMetaal2);
			try {
				TimeUnit.MILLISECONDS.sleep(2);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			digital_output_card_2.d7.setState(!sharedData1.zoneMetaal1);
			try {
				TimeUnit.MILLISECONDS.sleep(2);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			digital_output_card_2.d8.setState(!sharedData1.zoneStaal1b);
			try {
				TimeUnit.MILLISECONDS.sleep(2);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			digital_output_card_3.d1.setState(!sharedData1.zonePorcelein2);
			try {
				TimeUnit.MILLISECONDS.sleep(2);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			digital_output_card_3.d2.setState(!sharedData1.kitchenette);
			try {
				TimeUnit.MILLISECONDS.sleep(2);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			digital_output_card_3.d3.setState(!sharedData1.zoneInkom);
			try {
				TimeUnit.MILLISECONDS.sleep(2);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			digital_output_card_3.d4.setState(!sharedData1.outdoor);
			try {
				TimeUnit.MILLISECONDS.sleep(2);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			digital_output_card_3.d5.setState(!sharedData1.uitbereiding2StaalOpslTechn);
			try {
				TimeUnit.MILLISECONDS.sleep(2);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			digital_output_card_3.d6.setState(!sharedData1.uitbereiding2GietMetZand);
			try {
				TimeUnit.MILLISECONDS.sleep(2);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			digital_output_card_3.d7.setState(!sharedData1.zoneGarage);
			try {
				TimeUnit.MILLISECONDS.sleep(2);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			digital_output_card_3.d8.setState(!sharedData1.zoneKronen);
			try {
				TimeUnit.MILLISECONDS.sleep(2);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		

	public void run(){
		while(true){
			
			
			setOutputsToVariables();
						
			try {
				Thread.sleep(0);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			
		}
		
		
	}
	

}
