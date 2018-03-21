package ru.javabegin.training.spring.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.javabegin.training.spring.dao.interfaces.MP3Dao;
import ru.javabegin.training.spring.dao.objects.MP3;

public class Start {

    public static void main(String[] args) {
        MP3 mp3 = new MP3();
        mp3.setName("Song name");
        mp3.setAuthor("Song author");

        ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
        MP3Dao mp3Dao = (MP3Dao) context.getBean("sqliteDao");
        System.out.println(mp3Dao.getMP3ListByAuthor("Black"));
        System.out.println(mp3Dao.insert(mp3));
    }
}
