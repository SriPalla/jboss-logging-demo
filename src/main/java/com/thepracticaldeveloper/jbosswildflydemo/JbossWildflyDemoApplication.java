package com.thepracticaldeveloper.jbosswildflydemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class JbossWildflyDemoApplication extends SpringBootServletInitializer implements WebMvcConfigurer {

	@Autowired
	TransactionIdInterceptor interceptor;
	
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(JbossWildflyDemoApplication.class);
    }
    
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
    	registry.addInterceptor(interceptor);
    }

    public static void main(String[] args) {
        SpringApplication.run(JbossWildflyDemoApplication.class, args);
    }
}
