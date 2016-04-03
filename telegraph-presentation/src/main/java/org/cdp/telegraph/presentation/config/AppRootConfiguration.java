package org.cdp.telegraph.presentation.config;

import org.cdp.telegraph.facade.config.FacadeConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

/**
 * Created by Mykhaylo_Hrytsiv on 4/3/2016.
 */
@Configuration
@Import({FacadeConfiguration.class})
@ImportResource({"classpath:persistence-context.xml", "classpath:service-context.xml"})
@PropertySources(value = {@PropertySource("${application.config:classpath:application.properties}")})
public class AppRootConfiguration {

    @Bean
    public PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer() {
        return new PropertySourcesPlaceholderConfigurer();
    }
}
