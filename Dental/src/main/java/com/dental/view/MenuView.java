package com.dental.view;

import java.util.concurrent.TimeUnit;

import org.springframework.beans.factory.annotation.Autowired;

import com.dental.Data;
import com.dental.design.BuildingDentalDesign;
import com.dental.design.BuildingOneDesign;
import com.dental.view.MenuView;
import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.server.ThemeResource;
import com.vaadin.spring.annotation.SpringView;
import com.vaadin.spring.navigator.SpringViewProvider;
import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Image;

@SpringView(name = MenuView.VIEW_NAME)
public class MenuView extends BuildingDentalDesign implements View {
	
	public static final String VIEW_NAME = "";
	private Data sd;
	ThemeResource resource = new ThemeResource("img/grondplanDental.png");
	Image backGround = new Image("My Theme Image", resource);
	
	@Autowired
	public MenuView(Data sharedData) {
		
		this.sd = sharedData;
		
		//sturing UI Uitbreiding 200
		
		bUitbreding1.addClickListener(new Button.ClickListener() {

			@Override
			public void buttonClick(ClickEvent event) {
				
				if( sd.isStatusuitbereiding1()== true){
					sd.setUitbereiding1(true);
					try {
						TimeUnit.MILLISECONDS.sleep(200);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					sd.setUitbereiding1(false);
					try {
						TimeUnit.MILLISECONDS.sleep(200);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					sd.setStatusuitbereiding1(false);
					bUitbreding1.setStyleName("danger");
					
					
				}
				else{
					
					sd.setUitbereiding1(true);
					try {
						TimeUnit.MILLISECONDS.sleep(200);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					sd.setUitbereiding1(false);
					try {
						TimeUnit.MILLISECONDS.sleep(200);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					sd.setStatusuitbereiding1(true);
					bUitbreding1.setStyleName("friendly");
			
					
				}
				

			}
		});
		
		
		bGebouw1.addClickListener(new Button.ClickListener() {

			@Override
			public void buttonClick(ClickEvent event) {
				
				if( sd.isStatusgebouw1()== true){
					sd.setGebouw1(true);
					try {
						TimeUnit.MILLISECONDS.sleep(200);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					sd.setGebouw1(false);
					try {
						TimeUnit.MILLISECONDS.sleep(200);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					sd.setStatusgebouw1(false);
					bGebouw1.setStyleName("danger");
					
				}
				else{
					
					sd.setGebouw1(true);
					try {
						TimeUnit.MILLISECONDS.sleep(200);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					sd.setGebouw1(false);
					try {
						TimeUnit.MILLISECONDS.sleep(200);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					sd.setStatusgebouw1(true);
					bGebouw1.setStyleName("friendly");
					
				}
				

			}
		});
		
		bGietZand.addClickListener(new Button.ClickListener() {

			@Override
			public void buttonClick(ClickEvent event) {
				
				if( sd.isStatusuitbereiding2GietMetZand()== true){
					sd.setUitbereiding2GietMetZand(true);
					try {
						TimeUnit.MILLISECONDS.sleep(200);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					sd.setUitbereiding2GietMetZand(false);
					try {
						TimeUnit.MILLISECONDS.sleep(200);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					sd.setStatusuitbereiding2GietMetZand(false);
					bGietZand.setStyleName("danger");
					
				}
				else{
					
					sd.setUitbereiding2GietMetZand(true);
					try {
						TimeUnit.MILLISECONDS.sleep(200);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					sd.setUitbereiding2GietMetZand(false);
					try {
						TimeUnit.MILLISECONDS.sleep(200);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					sd.setStatusuitbereiding2GietMetZand(true);
					bGietZand.setStyleName("friendly");
					
				}
				

			}
		});
		
		bStaalOpslTechn.addClickListener(new Button.ClickListener() {

			@Override
			public void buttonClick(ClickEvent event) {
				
				if( sd.isStatusuitbereiding2StaalOpslTechn()== true){
					sd.setUitbereiding2StaalOpslTechn(true);
					try {
						TimeUnit.MILLISECONDS.sleep(200);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					sd.setUitbereiding2StaalOpslTechn(false);
					try {
						TimeUnit.MILLISECONDS.sleep(200);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					sd.setStatusuitbereiding2StaalOpslTechn(false);
					bStaalOpslTechn.setStyleName("danger");
					
				}
				else{
					
					sd.setUitbereiding2StaalOpslTechn(true);
					try {
						TimeUnit.MILLISECONDS.sleep(200);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					sd.setUitbereiding2StaalOpslTechn(false);
					try {
						TimeUnit.MILLISECONDS.sleep(200);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					sd.setStatusuitbereiding2StaalOpslTechn(true);
					bStaalOpslTechn.setStyleName("friendly");
					
				}
				

			}
		});
		
		bGarage.addClickListener(new Button.ClickListener() {

			@Override
			public void buttonClick(ClickEvent event) {
				
				if( sd.isStatuszoneGarage()== true){
					sd.setZoneGarage(true);
					try {
						TimeUnit.MILLISECONDS.sleep(200);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					sd.setZoneGarage(false);
					try {
						TimeUnit.MILLISECONDS.sleep(200);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					sd.setStatuszoneGarage(false);
					bGarage.setStyleName("danger");
					
				}
				else{
					
					sd.setZoneGarage(true);
					try {
						TimeUnit.MILLISECONDS.sleep(200);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					sd.setZoneGarage(false);
					try {
						TimeUnit.MILLISECONDS.sleep(200);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					sd.setStatuszoneGarage(true);
					bGarage.setStyleName("friendly");
					
				}
				

			}
		});
		
		bGieten.addClickListener(new Button.ClickListener() {

			@Override
			public void buttonClick(ClickEvent event) {
				
				if( sd.isStatuszoneGieten()== true){
					sd.setZoneGieten(true);
					try {
						TimeUnit.MILLISECONDS.sleep(200);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					sd.setZoneGieten(false);
					try {
						TimeUnit.MILLISECONDS.sleep(200);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					sd.setStatuszoneGieten(false);
					bGieten.setStyleName("danger");
					
				}
				else{
					
					sd.setZoneGieten(true);
					try {
						TimeUnit.MILLISECONDS.sleep(200);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					sd.setZoneGieten(false);
					try {
						TimeUnit.MILLISECONDS.sleep(200);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					sd.setStatuszoneGieten(true);
					bGieten.setStyleName("friendly");
					
				}
				

			}
		});
		
		bMetaal1.addClickListener(new Button.ClickListener() {

			@Override
			public void buttonClick(ClickEvent event) {
				
				if( sd.isStatuszoneMetaal1()== true){
					sd.setZoneMetaal1(true);
					try {
						TimeUnit.MILLISECONDS.sleep(200);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					sd.setZoneMetaal1(false);
					try {
						TimeUnit.MILLISECONDS.sleep(200);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					sd.setStatuszoneMetaal1(false);
					bMetaal1.setStyleName("danger");
					
				}
				else{
					
					sd.setZoneMetaal1(true);
					try {
						TimeUnit.MILLISECONDS.sleep(200);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					sd.setZoneMetaal1(false);
					try {
						TimeUnit.MILLISECONDS.sleep(200);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					sd.setStatuszoneMetaal1(true);
					bMetaal1.setStyleName("friendly");
					
				}
				

			}
		});
		
		bStaal1.addClickListener(new Button.ClickListener() {

			@Override
			public void buttonClick(ClickEvent event) {
				
				if( sd.isStatuszoneStaal1a()== true){
					sd.setZoneStaal1a(true);
					try {
						TimeUnit.MILLISECONDS.sleep(200);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					sd.setZoneStaal1a(false);
					try {
						TimeUnit.MILLISECONDS.sleep(200);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					sd.setStatuszoneStaal1a(false);
					bStaal1.setStyleName("danger");
					
				}
				else{
					
					sd.setZoneStaal1a(true);
					try {
						TimeUnit.MILLISECONDS.sleep(200);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					sd.setZoneStaal1a(false);
					try {
						TimeUnit.MILLISECONDS.sleep(200);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					sd.setStatuszoneStaal1a(true);
					bStaal1.setStyleName("friendly");
					
				}
				

			}
		});
		
		bKronen.addClickListener(new Button.ClickListener() {

			@Override
			public void buttonClick(ClickEvent event) {
				
				if( sd.isStatuszoneKronen()== true){
					sd.setZoneKronen(true);
					try {
						TimeUnit.MILLISECONDS.sleep(200);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					sd.setZoneKronen(false);
					try {
						TimeUnit.MILLISECONDS.sleep(200);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					sd.setStatuszoneKronen(false);
					bKronen.setStyleName("danger");
					
				}
				else{
					
					sd.setZoneKronen(true);
					try {
						TimeUnit.MILLISECONDS.sleep(200);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					sd.setZoneKronen(false);
					try {
						TimeUnit.MILLISECONDS.sleep(200);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					sd.setStatuszoneKronen(true);
					bKronen.setStyleName("friendly");
					
				}
				

			}
		});
		
		bMetaal2.addClickListener(new Button.ClickListener() {

			@Override
			public void buttonClick(ClickEvent event) {
				
				if( sd.isStatuszoneMetaal2()== true){
					sd.setZoneMetaal2(true);
					try {
						TimeUnit.MILLISECONDS.sleep(200);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					sd.setZoneMetaal2(false);
					try {
						TimeUnit.MILLISECONDS.sleep(200);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					sd.setStatuszoneMetaal2(false);
					bMetaal2.setStyleName("danger");
					
				}
				else{
					
					sd.setZoneMetaal2(true);
					try {
						TimeUnit.MILLISECONDS.sleep(200);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					sd.setZoneMetaal2(false);
					try {
						TimeUnit.MILLISECONDS.sleep(200);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					sd.setStatuszoneMetaal2(true);
					bMetaal2.setStyleName("friendly");
					
				}
				

			}
		});
		
		bStaal2.addClickListener(new Button.ClickListener() {

			@Override
			public void buttonClick(ClickEvent event) {
				
				if( sd.isStatuszoneStaal1b()== true){
					sd.setZoneStaal1b(true);
					try {
						TimeUnit.MILLISECONDS.sleep(200);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					sd.setZoneStaal1b(false);
					try {
						TimeUnit.MILLISECONDS.sleep(200);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					sd.setStatuszoneStaal1b(false);
					bStaal2.setStyleName("danger");
					
				}
				else{
					
					sd.setZoneStaal1b(true);
					try {
						TimeUnit.MILLISECONDS.sleep(200);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					sd.setZoneStaal1b(false);
					try {
						TimeUnit.MILLISECONDS.sleep(200);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					sd.setStatuszoneStaal1b(true);
					bStaal2.setStyleName("friendly");
					
				}
				

			}
		});
		
		bStock.addClickListener(new Button.ClickListener() {

			@Override
			public void buttonClick(ClickEvent event) {
				
				if( sd.isStatusgarageStockage()== true){
					sd.setGarageStockage(true);
					try {
						TimeUnit.MILLISECONDS.sleep(200);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					sd.setGarageStockage(false);
					try {
						TimeUnit.MILLISECONDS.sleep(200);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					sd.setStatusgarageStockage(false);
					bStock.setStyleName("danger");
					
				}
				else{
					
					sd.setGarageStockage(true);
					try {
						TimeUnit.MILLISECONDS.sleep(200);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					sd.setGarageStockage(false);
					try {
						TimeUnit.MILLISECONDS.sleep(200);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					sd.setStatusgarageStockage(true);
					bStock.setStyleName("friendly");
					
				}
				

			}
		});
		
		bBureauAlain.addClickListener(new Button.ClickListener() {

			@Override
			public void buttonClick(ClickEvent event) {
				
				if( sd.isStatusbureauAlain()== true){
					sd.setBureauAlain(true);
					try {
						TimeUnit.MILLISECONDS.sleep(200);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					sd.setBureauAlain(false);
					try {
						TimeUnit.MILLISECONDS.sleep(200);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					sd.setStatusbureauAlain(false);
					bBureauAlain.setStyleName("danger");
					
				}
				else{
					
					sd.setBureauAlain(true);
					try {
						TimeUnit.MILLISECONDS.sleep(200);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					sd.setBureauAlain(false);
					try {
						TimeUnit.MILLISECONDS.sleep(200);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					sd.setStatusbureauAlain(true);
					bBureauAlain.setStyleName("friendly");
					
				}
				

			}
		});
		
		bLandscape1.addClickListener(new Button.ClickListener() {

			@Override
			public void buttonClick(ClickEvent event) {
				
				if( sd.isStatuszoneLandscape1a()== true){
					sd.setZoneLandscape1a(true);
					try {
						TimeUnit.MILLISECONDS.sleep(200);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					sd.setZoneLandscape1a(false);
					try {
						TimeUnit.MILLISECONDS.sleep(200);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					sd.setStatuszoneLandscape1a(false);
					bLandscape1.setStyleName("danger");
					
				}
				else{
					
					sd.setZoneLandscape1a(true);
					try {
						TimeUnit.MILLISECONDS.sleep(200);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					sd.setZoneLandscape1a(false);
					try {
						TimeUnit.MILLISECONDS.sleep(200);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					sd.setStatuszoneLandscape1a(true);
					bLandscape1.setStyleName("friendly");
					
				}
				

			}
		});
		
		bLandscape2.addClickListener(new Button.ClickListener() {

			@Override
			public void buttonClick(ClickEvent event) {
				
				if( sd.isStatuszoneLandscape1b()== true){
					sd.setZoneLandscape1b(true);
					try {
						TimeUnit.MILLISECONDS.sleep(200);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					sd.setZoneLandscape1b(false);
					try {
						TimeUnit.MILLISECONDS.sleep(200);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					sd.setStatuszoneLandscape1b(false);
					bLandscape2.setStyleName("danger");
					
				}
				else{
					
					sd.setZoneLandscape1b(true);
					try {
						TimeUnit.MILLISECONDS.sleep(200);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					sd.setZoneLandscape1b(false);
					try {
						TimeUnit.MILLISECONDS.sleep(200);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					sd.setStatuszoneLandscape1b(true);
					bLandscape2.setStyleName("friendly");
					
				}
				

			}
		});
		
		bInkom.addClickListener(new Button.ClickListener() {

			@Override
			public void buttonClick(ClickEvent event) {
				
				if( sd.isStatuszoneInkom()== true){
					sd.setZoneInkom(true);
					try {
						TimeUnit.MILLISECONDS.sleep(200);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					sd.setZoneInkom(false);
					try {
						TimeUnit.MILLISECONDS.sleep(200);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					sd.setStatuszoneInkom(false);
					bInkom.setStyleName("danger");
					
				}
				else{
					
					sd.setZoneInkom(true);
					try {
						TimeUnit.MILLISECONDS.sleep(200);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					sd.setZoneInkom(false);
					try {
						TimeUnit.MILLISECONDS.sleep(200);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					sd.setStatuszoneInkom(true);
					bInkom.setStyleName("friendly");
					
					}
				

				}
			});
				
				bSpray.addClickListener(new Button.ClickListener() {

					@Override
					public void buttonClick(ClickEvent event) {
						
						if( sd.isStatuszoneSpray()== true){
							sd.setZoneSpray(true);
							try {
								TimeUnit.MILLISECONDS.sleep(200);
							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
							sd.setZoneSpray(false);
							try {
								TimeUnit.MILLISECONDS.sleep(200);
							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
							sd.setStatuszoneSpray(false);
							bSpray.setStyleName("danger");
							
						}
						else{
							
							sd.setZoneSpray(true);
							try {
								TimeUnit.MILLISECONDS.sleep(200);
							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
							sd.setZoneSpray(false);
							try {
								TimeUnit.MILLISECONDS.sleep(200);
							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
							sd.setStatuszoneSpray(true);
							bSpray.setStyleName("friendly");
							
						}
				

			}
		});
		
				bMeten.addClickListener(new Button.ClickListener() {

					@Override
					public void buttonClick(ClickEvent event) {
						
						if( sd.isStatuszoneMeten()== true){
							sd.setZoneMeten(true);
							try {
								TimeUnit.MILLISECONDS.sleep(200);
							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
							sd.setZoneMeten(false);
							try {
								TimeUnit.MILLISECONDS.sleep(200);
							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
							sd.setStatuszoneMeten(false);
							bMeten.setStyleName("danger");
							
						}
						else{
							
							sd.setZoneMeten(true);
							try {
								TimeUnit.MILLISECONDS.sleep(200);
							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
							sd.setZoneMeten(false);
							try {
								TimeUnit.MILLISECONDS.sleep(200);
							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
							sd.setStatuszoneMeten(true);
							bMeten.setStyleName("friendly");
							
						}
				

			}
		});
				
				bSecret.addClickListener(new Button.ClickListener() {

					@Override
					public void buttonClick(ClickEvent event) {
						
						if( sd.isStatussecretZone()== true){
							sd.setSecretZone(true);
							try {
								TimeUnit.MILLISECONDS.sleep(200);
							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
							sd.setSecretZone(false);
							try {
								TimeUnit.MILLISECONDS.sleep(200);
							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
							sd.setStatussecretZone(false);
							bSecret.setStyleName("danger");
							
						}
						else{
							
							sd.setSecretZone(true);
							try {
								TimeUnit.MILLISECONDS.sleep(200);
							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
							sd.setSecretZone(false);
							try {
								TimeUnit.MILLISECONDS.sleep(200);
							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
							sd.setStatussecretZone(true);
							bSecret.setStyleName("friendly");
							
						}
				

			}
		});
				
				bZirconium.addClickListener(new Button.ClickListener() {

					@Override
					public void buttonClick(ClickEvent event) {
						
						if( sd.isStatuszoneZirkonium()== true){
							sd.setZoneZirkonium(true);
							try {
								TimeUnit.MILLISECONDS.sleep(200);
							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
							sd.setZoneZirkonium(false);
							try {
								TimeUnit.MILLISECONDS.sleep(200);
							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
							sd.setStatuszoneZirkonium(false);
							bZirconium.setStyleName("danger");
							
						}
						else{
							
							sd.setZoneZirkonium(true);
							try {
								TimeUnit.MILLISECONDS.sleep(200);
							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
							sd.setZoneZirkonium(false);
							try {
								TimeUnit.MILLISECONDS.sleep(200);
							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
							sd.setStatuszoneZirkonium(true);
							bZirconium.setStyleName("friendly");
							
						}
				

			}
		});
				
				bPorcelein1.addClickListener(new Button.ClickListener() {

					@Override
					public void buttonClick(ClickEvent event) {
						
						if( sd.isStatuszonePorcelein1()== true){
							sd.setZonePorcelein1(true);
							try {
								TimeUnit.MILLISECONDS.sleep(200);
							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
							sd.setZonePorcelein1(false);
							try {
								TimeUnit.MILLISECONDS.sleep(200);
							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
							sd.setStatuszonePorcelein1(false);
							bPorcelein1.setStyleName("danger");
							
						}
						else{
							
							sd.setZonePorcelein1(true);
							try {
								TimeUnit.MILLISECONDS.sleep(200);
							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
							sd.setZonePorcelein1(false);
							try {
								TimeUnit.MILLISECONDS.sleep(200);
							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
							sd.setStatuszonePorcelein1(true);
							bPorcelein1.setStyleName("friendly");
							
						}
				

			}
		});
				
				bPorcelein2.addClickListener(new Button.ClickListener() {

					@Override
					public void buttonClick(ClickEvent event) {
						
						if( sd.isStatuszonePorcelein2()== true){
							sd.setZonePorcelein2(true);
							try {
								TimeUnit.MILLISECONDS.sleep(200);
							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
							sd.setZonePorcelein2(false);
							try {
								TimeUnit.MILLISECONDS.sleep(200);
							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
							sd.setStatuszonePorcelein2(false);
							bPorcelein2.setStyleName("danger");
							
						}
						else{
							
							sd.setZonePorcelein2(true);
							try {
								TimeUnit.MILLISECONDS.sleep(200);
							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
							sd.setZonePorcelein2(false);
							try {
								TimeUnit.MILLISECONDS.sleep(200);
							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
							sd.setStatuszonePorcelein2(true);
							bPorcelein2.setStyleName("friendly");
							
						}
				

			}
		});
				
				bKitchenette.addClickListener(new Button.ClickListener() {

					@Override
					public void buttonClick(ClickEvent event) {
						
						if( sd.isStatuskitchenette()== true){
							sd.setKitchenette(true);
							try {
								TimeUnit.MILLISECONDS.sleep(200);
							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
							sd.setKitchenette(false);
							try {
								TimeUnit.MILLISECONDS.sleep(200);
							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
							sd.setStatuskitchenette(false);
							bKitchenette.setStyleName("danger");
							
						}
						else{
							
							sd.setKitchenette(true);
							try {
								TimeUnit.MILLISECONDS.sleep(200);
							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
							sd.setKitchenette(false);
							try {
								TimeUnit.MILLISECONDS.sleep(200);
							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
							sd.setStatuskitchenette(true);
							bKitchenette.setStyleName("friendly");
							
						}
				

			}
		});
				
	}
		

	@Override
	public void enter(ViewChangeEvent event) {
		
		
	}

		

}
