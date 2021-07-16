package com.spring.dependencyinjection;

import com.spring.dependencyinjection.controllers.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringDiApplication {

    public static void main(String[] args) {
        ApplicationContext ctx= SpringApplication.run(SpringDiApplication.class, args);

        I18nController i18nController=(I18nController) ctx.getBean("i18nController");
        System.out.println(i18nController.sayHello());

        MyController myController=(MyController) ctx.getBean("myController");

        System.out.println("\n------Primary Bean-------");
        System.out.println(myController.getGreeting()+"\n");


        System.out.println("------Property------");
        PropertyInjectedController propertyInjectedController=
                (PropertyInjectedController) ctx.getBean("propertyInjectedController");
        System.out.println(propertyInjectedController.getGreeting()+"\n");

        System.out.println("------Setter------");
        SetterInjectedController setterInjectedController=
                (SetterInjectedController) ctx.getBean("setterInjectedController");
        System.out.println(setterInjectedController.getGreeting()+"\n");

        System.out.println("------Constructor------");
        ConstructorInjectedController constructorInjectedController=
                (ConstructorInjectedController) ctx.getBean("constructorInjectedController");
        System.out.println(constructorInjectedController.getGreeting()+"\n");

    }

}
