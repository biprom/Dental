package com.dental.view;

import org.springframework.beans.factory.annotation.Autowired;

import com.dental.Data;
import com.dental.design.BuildingOneDesign;
import com.dental.view.MenuView;
import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.spring.annotation.SpringView;
import com.vaadin.spring.navigator.SpringViewProvider;
import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;

@SpringView(name = MenuView.VIEW_NAME)
public class MenuView extends BuildingOneDesign implements View {
	
	public static final String VIEW_NAME = "";
	private Data sd;

	@Autowired
	public MenuView(Data sharedData) {
		
		this.sd = sharedData;
		
		bUitbereding1.addClickListener(new Button.ClickListener() {

			@Override
			public void buttonClick(ClickEvent event) {
				
				if( sd.isLight()== true){
					sd.setLight(false);
					bUitbereding1.setCaption("AAN");
				}
				else{
					sd.setLight(true);
					bUitbereding1.setCaption("UIT");
				}
				

			}
		});
	}
	

	@Override
	public void enter(ViewChangeEvent event) {
		
		
	}

	

}
