package org.cdp.telegraph.presentation.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.context.ContextLoader;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

/**
 * Created by Mykhaylo_Hrytsiv on 4/9/2016.
 */
@WebListener
public class AppWebServletContextListener extends ContextLoader implements ServletContextListener {
    private static final Logger LOG = LoggerFactory.getLogger(AppWebServletContextListener.class);

    @Override
    public void contextInitialized(final ServletContextEvent servletContextEvent) {
        LOG.info("Inside AppWebServletContextListener.contextInitialized");
        final ServletContext servletContext = servletContextEvent.getServletContext();
        servletContext.setInitParameter("contextClass",
                "org.springframework.web.context.support.AnnotationConfigWebApplicationContext");
        servletContext.setInitParameter("contextConfigLocation",
                "org.cdp.telegraph.presentation.config.AppRootConfiguration");
        this.initWebApplicationContext(servletContextEvent.getServletContext());
    }

    @Override
    public void contextDestroyed(final ServletContextEvent servletContextEvent) {
        LOG.info("Inside AppWebServletContextListener.contextDestroyed");
        this.closeWebApplicationContext(servletContextEvent.getServletContext());
    }
}
