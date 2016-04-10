package org.cdp.telegraph.presentation.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.DispatcherServlet;

import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;

/**
 * Created by Mykhaylo_Hrytsiv on 4/9/2016.
 */
@WebServlet(name = "TelegraphDispatcherServlet", urlPatterns = "/*", loadOnStartup = 1, asyncSupported = true,
        initParams = {@WebInitParam(name = "contextClass",
                value = "org.springframework.web.context.support.AnnotationConfigWebApplicationContext"),
                @WebInitParam(name = "contextConfigLocation",
                        value = "org.cdp.telegraph.presentation.config.AppWebMvcConfigurerAdapter")})
public class TelegraphDispatcherServlet extends DispatcherServlet {
    private static final Logger LOG = LoggerFactory.getLogger(AppWebServletContextListener.class);

    public TelegraphDispatcherServlet() {
        LOG.info("Inside TelegraphDispatcherServlet constructor");
    }

}
