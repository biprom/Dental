package com.dental;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component("sharedData")
@Scope("singleton")
public class Data {
	
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
	boolean zoneKronen = false;		//uitgang 21
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
	
	boolean statusuitbereiding2GietMetZand = false;	//uitgang 23
	boolean statusuitbereiding2StaalOpslTechn = false; //uitgang 24
	boolean statusgarageStockage = false;				 //uitgang 15
	
	//initialisatie uitgangen Verlichting
	
	boolean statusuitbereiding1 = false;				//uitgang 14
	boolean statusgebouw1 = false;					//uitgang 13	
	
	boolean statuszoneStaal1a = false;	
	boolean statuszoneStaal1b = false;		
	boolean statuszoneMetaal1 = false;	
	boolean statuszoneMetaal2 = false;	
	boolean statuszoneGieten = false;		
	boolean statuszoneKronen = false;		
	boolean statuszoneGarage = false;		
	
	boolean statusbureauAlain = false;	
	boolean statuszoneLandscape1a = false;
	boolean statuszoneLandscape1b = false;
	boolean statuszonePorcelein1 = false;
	boolean statuszonePorcelein2 = false;
	boolean statuszoneZirkonium = false;	
	boolean statuszoneSpray = false;		
	boolean statuszoneMeten = false;		
	boolean statussecretZone = false;		
	boolean statuszoneInkom = false;		
	boolean statuskitchenette = false;	
	boolean statusoutdoor = false;	
	
	
	
	
	
	//initialisatie status uitgangen
	
	
	public boolean isStatusuitbereiding1() {
		return statusuitbereiding1;
	}
	public void setStatusuitbereiding1(boolean statusuitbereiding1) {
		this.statusuitbereiding1 = statusuitbereiding1;
	}
	public boolean isStatusgebouw1() {
		return statusgebouw1;
	}
	public void setStatusgebouw1(boolean statusgebouw1) {
		this.statusgebouw1 = statusgebouw1;
	}
	public boolean isStatusuitbereiding2GietMetZand() {
		return statusuitbereiding2GietMetZand;
	}
	public void setStatusuitbereiding2GietMetZand(boolean statusuitbereiding2GietMetZand) {
		this.statusuitbereiding2GietMetZand = statusuitbereiding2GietMetZand;
	}
	public boolean isStatusuitbereiding2StaalOpslTechn() {
		return statusuitbereiding2StaalOpslTechn;
	}
	public void setStatusuitbereiding2StaalOpslTechn(boolean statusuitbereiding2StaalOpslTechn) {
		this.statusuitbereiding2StaalOpslTechn = statusuitbereiding2StaalOpslTechn;
	}
	public boolean isStatusgarageStockage() {
		return statusgarageStockage;
	}
	public void setStatusgarageStockage(boolean statusgarageStockage) {
		this.statusgarageStockage = statusgarageStockage;
	}
	public boolean isStatuszoneStaal1a() {
		return statuszoneStaal1a;
	}
	public void setStatuszoneStaal1a(boolean statuszoneStaal1a) {
		this.statuszoneStaal1a = statuszoneStaal1a;
	}
	public boolean isStatuszoneStaal1b() {
		return statuszoneStaal1b;
	}
	public void setStatuszoneStaal1b(boolean statuszoneStaal1b) {
		this.statuszoneStaal1b = statuszoneStaal1b;
	}
	public boolean isStatuszoneMetaal1() {
		return statuszoneMetaal1;
	}
	public void setStatuszoneMetaal1(boolean statuszoneMetaal1) {
		this.statuszoneMetaal1 = statuszoneMetaal1;
	}
	public boolean isStatuszoneMetaal2() {
		return statuszoneMetaal2;
	}
	public void setStatuszoneMetaal2(boolean statuszoneMetaal2) {
		this.statuszoneMetaal2 = statuszoneMetaal2;
	}
	public boolean isStatuszoneGieten() {
		return statuszoneGieten;
	}
	public void setStatuszoneGieten(boolean statuszoneGieten) {
		this.statuszoneGieten = statuszoneGieten;
	}
	public boolean isStatuszoneKronen() {
		return statuszoneKronen;
	}
	public void setStatuszoneKronen(boolean statuszoneKronen) {
		this.statuszoneKronen = statuszoneKronen;
	}
	public boolean isStatuszoneGarage() {
		return statuszoneGarage;
	}
	public void setStatuszoneGarage(boolean statuszoneGarage) {
		this.statuszoneGarage = statuszoneGarage;
	}
	public boolean isStatusbureauAlain() {
		return statusbureauAlain;
	}
	public void setStatusbureauAlain(boolean statusbureauAlain) {
		this.statusbureauAlain = statusbureauAlain;
	}
	public boolean isStatuszoneLandscape1a() {
		return statuszoneLandscape1a;
	}
	public void setStatuszoneLandscape1a(boolean statuszoneLandscape1a) {
		this.statuszoneLandscape1a = statuszoneLandscape1a;
	}
	public boolean isStatuszoneLandscape1b() {
		return statuszoneLandscape1b;
	}
	public void setStatuszoneLandscape1b(boolean statuszoneLandscape1b) {
		this.statuszoneLandscape1b = statuszoneLandscape1b;
	}
	public boolean isStatuszonePorcelein1() {
		return statuszonePorcelein1;
	}
	public void setStatuszonePorcelein1(boolean statuszonePorcelein1) {
		this.statuszonePorcelein1 = statuszonePorcelein1;
	}
	public boolean isStatuszonePorcelein2() {
		return statuszonePorcelein2;
	}
	public void setStatuszonePorcelein2(boolean statuszonePorcelein2) {
		this.statuszonePorcelein2 = statuszonePorcelein2;
	}
	public boolean isStatuszoneZirkonium() {
		return statuszoneZirkonium;
	}
	public void setStatuszoneZirkonium(boolean statuszoneZirkonium) {
		this.statuszoneZirkonium = statuszoneZirkonium;
	}
	public boolean isStatuszoneSpray() {
		return statuszoneSpray;
	}
	public void setStatuszoneSpray(boolean statuszoneSpray) {
		this.statuszoneSpray = statuszoneSpray;
	}
	public boolean isStatuszoneMeten() {
		return statuszoneMeten;
	}
	public void setStatuszoneMeten(boolean statuszoneMeten) {
		this.statuszoneMeten = statuszoneMeten;
	}
	public boolean isStatussecretZone() {
		return statussecretZone;
	}
	public void setStatussecretZone(boolean statussecretZone) {
		this.statussecretZone = statussecretZone;
	}
	public boolean isStatuszoneInkom() {
		return statuszoneInkom;
	}
	public void setStatuszoneInkom(boolean statuszoneInkom) {
		this.statuszoneInkom = statuszoneInkom;
	}
	public boolean isStatuskitchenette() {
		return statuskitchenette;
	}
	public void setStatuskitchenette(boolean statuskitchenette) {
		this.statuskitchenette = statuskitchenette;
	}
	public boolean isStatusoutdoor() {
		return statusoutdoor;
	}
	public void setStatusoutdoor(boolean statusoutdoor) {
		this.statusoutdoor = statusoutdoor;
	}
	
	public boolean isUitbereiding1() {
		return uitbereiding1;
	}
	public void setUitbereiding1(boolean uitbereiding1) {
		this.uitbereiding1 = uitbereiding1;
	}
	public boolean isGebouw1() {
		return gebouw1;
	}
	public void setGebouw1(boolean gebouw1) {
		this.gebouw1 = gebouw1;
	}
	public boolean isUitbereiding2GietMetZand() {
		return uitbereiding2GietMetZand;
	}
	public void setUitbereiding2GietMetZand(boolean uitbereiding2GietMetZand) {
		this.uitbereiding2GietMetZand = uitbereiding2GietMetZand;
	}
	public boolean isUitbereiding2StaalOpslTechn() {
		return uitbereiding2StaalOpslTechn;
	}
	public void setUitbereiding2StaalOpslTechn(boolean uitbereiding2StaalOpslTechn) {
		this.uitbereiding2StaalOpslTechn = uitbereiding2StaalOpslTechn;
	}
	public boolean isGarageStockage() {
		return garageStockage;
	}
	public void setGarageStockage(boolean garageStockage) {
		this.garageStockage = garageStockage;
	}
	public boolean isZoneStaal1a() {
		return zoneStaal1a;
	}
	public void setZoneStaal1a(boolean zoneStaal1a) {
		this.zoneStaal1a = zoneStaal1a;
	}
	public boolean isZoneStaal1b() {
		return zoneStaal1b;
	}
	public void setZoneStaal1b(boolean zoneStaal1b) {
		this.zoneStaal1b = zoneStaal1b;
	}
	public boolean isZoneMetaal1() {
		return zoneMetaal1;
	}
	public void setZoneMetaal1(boolean zoneMetaal1) {
		this.zoneMetaal1 = zoneMetaal1;
	}
	public boolean isZoneMetaal2() {
		return zoneMetaal2;
	}
	public void setZoneMetaal2(boolean zoneMetaal2) {
		this.zoneMetaal2 = zoneMetaal2;
	}
	public boolean isZoneGieten() {
		return zoneGieten;
	}
	public void setZoneGieten(boolean zoneGieten) {
		this.zoneGieten = zoneGieten;
	}
	public boolean isZoneKronen() {
		return zoneKronen;
	}
	public void setZoneKronen(boolean zoneKronen) {
		this.zoneKronen = zoneKronen;
	}
	public boolean isZoneGarage() {
		return zoneGarage;
	}
	public void setZoneGarage(boolean zoneGarage) {
		this.zoneGarage = zoneGarage;
	}
	public boolean isBureauAlain() {
		return bureauAlain;
	}
	public void setBureauAlain(boolean bureauAlain) {
		this.bureauAlain = bureauAlain;
	}
	public boolean isZoneLandscape1a() {
		return zoneLandscape1a;
	}
	public void setZoneLandscape1a(boolean zoneLandscape1a) {
		this.zoneLandscape1a = zoneLandscape1a;
	}
	public boolean isZoneLandscape1b() {
		return zoneLandscape1b;
	}
	public void setZoneLandscape1b(boolean zoneLandscape1b) {
		this.zoneLandscape1b = zoneLandscape1b;
	}
	public boolean isZonePorcelein1() {
		return zonePorcelein1;
	}
	public void setZonePorcelein1(boolean zonePorcelein1) {
		this.zonePorcelein1 = zonePorcelein1;
	}
	public boolean isZonePorcelein2() {
		return zonePorcelein2;
	}
	public void setZonePorcelein2(boolean zonePorcelein2) {
		this.zonePorcelein2 = zonePorcelein2;
	}
	public boolean isZoneZirkonium() {
		return zoneZirkonium;
	}
	public void setZoneZirkonium(boolean zoneZirkonium) {
		this.zoneZirkonium = zoneZirkonium;
	}
	public boolean isZoneSpray() {
		return zoneSpray;
	}
	public void setZoneSpray(boolean zoneSpray) {
		this.zoneSpray = zoneSpray;
	}
	public boolean isZoneMeten() {
		return zoneMeten;
	}
	public void setZoneMeten(boolean zoneMeten) {
		this.zoneMeten = zoneMeten;
	}
	public boolean isSecretZone() {
		return secretZone;
	}
	public void setSecretZone(boolean secretZone) {
		this.secretZone = secretZone;
	}
	public boolean isZoneInkom() {
		return zoneInkom;
	}
	public void setZoneInkom(boolean zoneInkom) {
		this.zoneInkom = zoneInkom;
	}
	public boolean isKitchenette() {
		return kitchenette;
	}
	public void setKitchenette(boolean kitchenette) {
		this.kitchenette = kitchenette;
	}
	public boolean isOutdoor() {
		return outdoor;
	}
	public void setOutdoor(boolean outdoor) {
		this.outdoor = outdoor;
	}

	

}
