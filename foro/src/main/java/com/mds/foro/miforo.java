package com.mds.foro;

import javax.servlet.annotation.WebServlet;

import com.vaadin.annotations.Theme;
import com.vaadin.annotations.VaadinServletConfiguration;
import com.vaadin.server.VaadinRequest;
import com.vaadin.server.VaadinServlet;
import com.vaadin.ui.Button;
import com.vaadin.ui.UI;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Link;
import com.mds.foro.*;

/**
 * This UI is the application entry point. A UI may either represent a browser window 
 * (or tab) or some part of an HTML page where a Vaadin application is embedded.
 * <p>
 * The UI is initialized using {@link #init(VaadinRequest)}. This method is intended to be 
 * overridden to add component to the user interface and initialize non-component functionality.
 */
@Theme("temaforo")
public class miforo extends UI {

    @Override
    protected void init(VaadinRequest vaadinRequest) {
    	Registrarse registro = new Registrarse();
    	setContent(registro);
    }

    @WebServlet(urlPatterns = "/*", name = "miforoServlet", asyncSupported = true)
    @VaadinServletConfiguration(ui = miforo.class, productionMode = false)
    public static class miforoServlet extends VaadinServlet {
    }
}
