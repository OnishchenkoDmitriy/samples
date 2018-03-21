package org.training.controller;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.training.domain.Speaker;
import org.training.service.TalkService;

import java.util.Arrays;

public class App {

    public static void main( String[] args ) {

        ConfigurableApplicationContext repoContext = new ClassPathXmlApplicationContext("repoContext.xml");
        ConfigurableApplicationContext serviceContext = new ClassPathXmlApplicationContext(new String[]{"serviceContext.xml"}, repoContext);

        TalkService talkService = (TalkService) serviceContext.getBean("talkService");

        Speaker speaker1 = new Speaker("Oleksii", "Donchak");
        Speaker speaker2 = new Speaker("Maksym", "Hornostai");
        Speaker speaker3 = new Speaker("Mykhailo", "Glushko");
        Speaker speaker4 = new Speaker("Ruslan", "Omelchenko");

        talkService.createTalk("Introdution to spring", speaker1, speaker2);
        talkService.getTalks().forEach(System.out::println);

        System.out.println(Arrays.toString(serviceContext.getBeanDefinitionNames()));
        BeanDefinition talkServiceBD = serviceContext.getBeanFactory().getBeanDefinition("talkService");
        System.out.println(talkServiceBD);
        System.out.println(serviceContext.getBean("speaker") == serviceContext.getBean("speaker"));
        System.out.println(serviceContext.getBean("speaker"));

        serviceContext.close();
        repoContext.close();
    }



}
