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
			
					
					
					//initialisatie uitgangen Vermogen
					
					boolean uitbereiding1 = false;				//uitgang 14
					boolean gebouw1 = false;					//uitgang 13	
					boolean uitbereiding2GietMetZand = false;	//uitgang 23
					boolean uitbereiding2StaalOpslTechn = false; //uitgang 24
					boolean garageStockage = false;				 //uitgang 15
					
					//initialisatie uitgangen Verlichting
					
					boolean zoneStaal1a = false;	//uitgang 16
					boolean zoneStaal1b = false;	//uitgang 17	
					boolean zoneMetaal1 = false;	//uitgang 18
					boolean zoneMetaal2 = false;	//uitgang 19
					boolean zoneGieten = false;		//uitgang 20
					boolean zoneKronen = true;		//uitgang 21
					boolean zoneGarage = false;		//uitgang 22
					
					boolean bureauAlain = false;	//uitgang 1
					boolean zoneLandscape1a = false;//uitgang 2
					boolean zoneLandscape1b = false;//uitgang 3
					boolean zonePorcelein1 = false;//uitgang 8
					boolean zonePorcelein2 = false;//uitgang 9
					boolean zoneZirkonium = false;	//uitgang 7
					boolean zoneSpray = false;		//uitgang 6
					boolean zoneMeten = false;		//uitgang 5
					boolean secretZone = false;		//uitgang 4
					boolean zoneInkom = false;		//uitgang 11
					boolean kitchenette = false;	//uitgang 10
					boolean outdoor = false;		//uitgang 12
	
		//Initialisatie digitale outputs	
//		DigOutput_PCF digital_output_card_1 = new DigOutput_PCF(1, 0X20);
//		DigOutput_PCF digital_output_card_2 = new DigOutput_PCF(1, 0X21);
//		DigOutput_PCF digital_output_card_3 = new DigOutput_PCF(1, 0X22);
//		
//		
//		private void setOutputsToVariables() {
//			
//			digital_output_card_1.d1.setState(bureauAlain);
//			digital_output_card_1.d2.setState(zoneLandscape1a);
//			digital_output_card_1.d3.setState(zoneLandscape1b);
//			digital_output_card_1.d4.setState(secretZone);
//			digital_output_card_1.d5.setState(zoneStaal1a);
//			digital_output_card_1.d6.setState(garageStockage);
//			digital_output_card_1.d7.setState(uitbereiding1);
//			digital_output_card_1.d8.setState(gebouw1);
//			
//			digital_output_card_2.d1.setState(zoneMeten);
//			digital_output_card_2.d2.setState(zoneSpray);
//			digital_output_card_2.d3.setState(zoneZirkonium);
//			digital_output_card_2.d4.setState(zonePorcelein1);
//			digital_output_card_2.d5.setState(zoneGieten);
//			digital_output_card_2.d6.setState(zoneMetaal2);
//			digital_output_card_2.d7.setState(zoneMetaal1);
//			digital_output_card_2.d8.setState(zoneStaal1b);
//			
//			digital_output_card_3.d1.setState(zonePorcelein2);
//			digital_output_card_3.d2.setState(kitchenette);
//			digital_output_card_3.d3.setState(zoneInkom);
//			digital_output_card_3.d4.setState(outdoor);
//			digital_output_card_3.d5.setState(uitbereiding2StaalOpslTechn);
//			digital_output_card_3.d6.setState(uitbereiding2GietMetZand);
//			digital_output_card_3.d7.setState(zoneGarage);
//			digital_output_card_3.d8.setState(zoneKronen);
//		}
//		
		
		

	public void run(){
		while(true){
			
			
			
//			System.out.println("DentalWorkCycle started!!! ");
//			System.out.println("parameter = " + sharedData1.isLight());
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
