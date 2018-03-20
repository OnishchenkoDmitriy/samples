package ru.javabegin.training.spring.dao.impls;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import ru.javabegin.training.spring.dao.interfaces.MP3Dao;
import ru.javabegin.training.spring.dao.objects.MP3;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

@Component("sqliteDao")
public class SQLiteDAO implements MP3Dao {

    private JdbcTemplate jdbcTemplate;

    @Autowired
    public void setDataSource(DataSource dataSource){
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    @Override
    public void insert(MP3 mp3) {
        String sql = "insert into mp3 (name, author) VALUES (?, ?)";
        jdbcTemplate.update(sql, mp3.getName(), mp3.getAuthor());
    }

    @Override
    public void insert(List<MP3> mp3List) {
        for (MP3 mp3: mp3List) {
            insert(mp3);
        }
    }

    public void insertWithJDBC(MP3 mp3){
        Connection connection = null;

        try{
            Class.forName("org.sqlite.JDBC");
            String url = "jdbc:sqlite:C:/Users/Dmytro_Onyshchenko/Desktop/Lab projects/gitRepos/samples/springSamples/SpringDB_31/db/SpringDB.db";
            connection = DriverManager.getConnection(url, "", "");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        String sql = "insert into mp3 (name, author) VALUES (?, ?)";

        try{
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, mp3.getName());
            preparedStatement.setString(2, mp3.getAuthor());
            preparedStatement.executeUpdate();
            preparedStatement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            if(connection != null){
                try{
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    @Override
    public void delete(int id) {
        String sql = "delete from mp3 where id=?";
        int result = jdbcTemplate.update(sql, id);
    }

    @Override
    public MP3 getMP3ByID(int id) {
        //TODO
        return null;
    }

    @Override
    public List<MP3> getMP3ListByName(String name) {
        //TODO
        return null;
    }

    @Override
    public List<MP3> getMP3ListByAuthor(String author) {
        //TODO
        return null;
    }
}
