package com.dental;

import org.springframework.beans.factory.annotation.Autowired;

import com.dental.IO.DigInput_PCF;
import com.dental.IO.DigOutput_PCF;

public class DentalWorkCycle extends Thread {
	
	Data sd;
	
	//get shared data from Bean
		
		
		public DentalWorkCycle(Data sharedData){
			this.sd = sharedData;
		}
	
		//Initialisatie digitale outputs	
		//DigOutput_PCF digital_output_card_1 = new DigOutput_PCF(1, 0X20);
		//DigOutput_PCF digital_output_card_2 = new DigOutput_PCF(1, 0X21);
		
		//initialisatie digitale input		
		//DigInput_PCF digital_input_card_1 = new DigInput_PCF(1, 0X22, "cardnr1");
		
		
		

	public void run(){
		while(true){
			
			
			
			System.out.println("Bram is sexy!!! ");
			System.out.println("parameter = " + sd.isLight());
//			sharedData.setGasAANUIT(true);
//			System.out.println("parameter = " + sharedData.toString());
//			
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
	

}
