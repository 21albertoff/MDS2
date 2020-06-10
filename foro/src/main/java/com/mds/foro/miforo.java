package com.mds.foro;

import javax.servlet.annotation.WebServlet;

import com.vaadin.annotations.Theme;
import com.vaadin.annotations.VaadinServletConfiguration;
import com.vaadin.server.VaadinRequest;
import com.vaadin.server.VaadinServlet;
import com.vaadin.ui.UI;

/**
 * This UI is the application entry point. A UI may either represent a browser window 
 * (or tab) or some part of an HTML page where a Vaadin application is embedded.
 * <p>
 * The UI is initialized using {@link #init(VaadinRequest)}. This method is intended to be 
 * overridden to add component to the user interface and initialize non-component functionality.
 */
@SuppressWarnings("serial")
@Theme("temaforo")
public class miforo extends UI {

    @Override
    protected void init(VaadinRequest vaadinRequest) {
    	setContent(new Usuario_no_identificado());
    }


	@WebServlet(urlPatterns = "/*", name = "miforoServlet", asyncSupported = true)
    @VaadinServletConfiguration(ui = miforo.class, productionMode = true)
    public static class miforoServlet extends VaadinServlet {
    }
}
