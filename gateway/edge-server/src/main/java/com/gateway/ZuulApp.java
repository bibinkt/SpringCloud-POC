package com.gateway;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.stereotype.Controller;

@SpringBootApplication
@Controller
@EnableZuulProxy
public class ZuulApp {
	
    public static void main(String[] args) {
        new SpringApplicationBuilder(ZuulApp.class).web(true).run(args);
    }
}
