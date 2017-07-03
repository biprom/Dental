package com.dental;

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
			
					
					
				
	
		//Initialisatie digitale outputs	
		DigOutput_PCF digital_output_card_1 = new DigOutput_PCF(1, 0X27);
		DigOutput_PCF digital_output_card_2 = new DigOutput_PCF(1, 0X26);
		DigOutput_PCF digital_output_card_3 = new DigOutput_PCF(1, 0X25);
		
		
		private void setOutputsToVariables() {
			
			digital_output_card_1.d1.setState(sharedData1.bureauAlain);
			digital_output_card_1.d2.setState(sharedData1.zoneLandscape1a);
			digital_output_card_1.d3.setState(sharedData1.zoneLandscape1b);
			digital_output_card_1.d4.setState(sharedData1.secretZone);
			digital_output_card_1.d5.setState(sharedData1.zoneStaal1a);
			digital_output_card_1.d6.setState(sharedData1.garageStockage);
			digital_output_card_1.d7.setState(sharedData1.uitbereiding1);
			digital_output_card_1.d8.setState(sharedData1.gebouw1);
			
			digital_output_card_2.d1.setState(sharedData1.zoneMeten);
			digital_output_card_2.d2.setState(sharedData1.zoneSpray);
			digital_output_card_2.d3.setState(sharedData1.zoneZirkonium);
			digital_output_card_2.d4.setState(sharedData1.zonePorcelein1);
			digital_output_card_2.d5.setState(sharedData1.zoneGieten);
			digital_output_card_2.d6.setState(sharedData1.zoneMetaal2);
			digital_output_card_2.d7.setState(sharedData1.zoneMetaal1);
			digital_output_card_2.d8.setState(sharedData1.zoneStaal1b);
			
			digital_output_card_3.d1.setState(sharedData1.zonePorcelein2);
			digital_output_card_3.d2.setState(sharedData1.kitchenette);
			digital_output_card_3.d3.setState(sharedData1.zoneInkom);
			digital_output_card_3.d4.setState(sharedData1.outdoor);
			digital_output_card_3.d5.setState(sharedData1.uitbereiding2StaalOpslTechn);
			digital_output_card_3.d6.setState(sharedData1.uitbereiding2GietMetZand);
			digital_output_card_3.d7.setState(sharedData1.zoneGarage);
			digital_output_card_3.d8.setState(sharedData1.zoneKronen);
		}
		
		
		

	public void run(){
		while(true){
			
			
			setOutputsToVariables();
//			System.out.println("workcycle is gestart");
//			System.out.println("DentalWorkCycle started!!! ");
			System.out.println("parameter = " + sharedData1.gebouw1);
//			sharedData.setGasAANUIT(true);
//			System.out.println("parameter = " + sharedData.toString());
			
			
//			
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			
		}
		
		
	}
	

}
