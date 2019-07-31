package com.stackroute.config;

import org.springframework.web.servlet.support.*;
public class UserInitialization extends AbstractAnnotationConfigDispatcherServletInitializer {
    @Override
    protected Class<?>[] getRootConfigClasses() {

        return new Class[]{UserConfig.class};
    }
    @Override
    protected Class<?>[] getServletConfigClasses() {
        return null;
    }
    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }
}
