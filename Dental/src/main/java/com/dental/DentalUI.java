package com.dental;

import org.springframework.beans.factory.annotation.Autowired;

import com.dental.DentalUI;
import com.vaadin.annotations.Theme;
import com.vaadin.navigator.Navigator;
import com.vaadin.server.VaadinRequest;
import com.vaadin.spring.annotation.SpringUI;
import com.vaadin.spring.navigator.SpringViewProvider;
import com.vaadin.ui.Panel;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;

@SpringUI
@Theme("mytheme")


public class DentalUI extends UI {
	
	Data sd;
	
	@Autowired
	public DentalUI(Data sharedData) {
		this.sd = sharedData;
	}

	@Autowired
	private SpringViewProvider viewProvider;
	
	@Override
	protected void init(VaadinRequest request) {
		final VerticalLayout root = new VerticalLayout();
        root.setSizeFull();
        //root.setMargin(true);
        //root.setSpacing(true);
        setContent(root);

        final Panel viewContainer = new Panel();
        viewContainer.setSizeFull();
        root.addComponent(viewContainer);
        root.setExpandRatio(viewContainer, 1.0f);

        Navigator navigator = new Navigator(this, viewContainer);
        navigator.addProvider(viewProvider);
	}

}
