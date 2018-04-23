package com.myself;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.myself.guice.springboot.server.controller.SpringAwareServletModule;
import com.myself.guice.springboot.server.greeting.GreetingHandler;
import com.myself.guice.springboot.server.greeting.HelloWorldWebModule;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.annotation.RequestScope;

@RestController
@EnableAutoConfiguration
@ServletComponentScan
public class App {

    @Bean Injector injector(ApplicationContext context){
        return Guice.createInjector(new HelloWorldWebModule(),
                new SpringAwareServletModule(context));
    }

    @Bean @RequestScope
    GreetingHandler greetingHandler(Injector injector){
        return injector.getInstance(GreetingHandler.class);
    }

    @Autowired
    GreetingHandler greetingHandler;

    @GetMapping("/greeting")
    @ResponseBody
    String greeting(@RequestParam("name") String name) {
        return greetingHandler.getByName(name);
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(App.class, args);
    }
}
