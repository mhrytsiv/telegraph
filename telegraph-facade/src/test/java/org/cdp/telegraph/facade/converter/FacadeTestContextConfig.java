package org.cdp.telegraph.facade.converter;

import org.cdp.telegraph.facade.config.FacadeConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;

/**
 * Created by Mykhaylo_Hrytsiv on 4/5/2016.
 */
@Configuration
@ImportResource({"classpath:persistence-context.xml", "classpath:service-context.xml"})
@Import({FacadeConfiguration.class})
public class FacadeTestContextConfig {
}
