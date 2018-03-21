package ru.javabegin.training.spring.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.javabegin.training.spring.dao.impls.SQLiteDAO;
import ru.javabegin.training.spring.dao.objects.MP3;

import java.util.ArrayList;
import java.util.List;

public class Start {

    public static void main(String[] args) {
        MP3 firstMp3 = new MP3();
        firstMp3.setName("Song name 1");
        firstMp3.setAuthor("Song author 1");

        MP3 secondMp3 = new MP3();
        secondMp3.setName("Song name 2");
        secondMp3.setAuthor("Song author 2");

        List<MP3> mp3List = new ArrayList<MP3>();
        mp3List.add(firstMp3);
        mp3List.add(secondMp3);

        ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
        SQLiteDAO sqLiteDAO = (SQLiteDAO) context.getBean("sqliteDao");

        System.out.println(sqLiteDAO.insertList(mp3List));

    }
}
