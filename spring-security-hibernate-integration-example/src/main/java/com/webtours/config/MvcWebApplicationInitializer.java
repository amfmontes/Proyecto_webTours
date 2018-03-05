package com.webtours.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;
import java.lang.Class;
import java.lang.String;

public class MvcWebApplicationInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

  
  //Database
@Override
protected Class<?>[] getRootConfigClasses() {
	return new Class[] { AppConfig.class, WebSecurityConfig.class };
}
//Load spring web configuration
@Override
protected Class<?>[] getServletConfigClasses() {
	 return new Class[] { WebConfig.class };
}

@Override
protected String[] getServletMappings() {
	return new String[] { "/" };
}


}
