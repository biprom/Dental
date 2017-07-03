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
		
		//sturing UI Uitbreiding 1
		
		bUitbreding1.addClickListener(new Button.ClickListener() {

			@Override
			public void buttonClick(ClickEvent event) {
				
				if( sd.isStatusgebouw1()== true){
					sd.setStatusgebouw1(true);
					try {
						TimeUnit.MILLISECONDS.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					sd.setBureauAlain(false);
					//bUitbereding1.setCaption("UIT");
				}
				else{
					sd.setBureauAlain(false);
					try {
						TimeUnit.MILLISECONDS.sleep(3000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					sd.setBureauAlain(false);
					//bUitbereding1.setCaption("AAN");
				}
				

			}
		});
	}
	

	@Override
	public void enter(ViewChangeEvent event) {
		
		
	}

	

}
