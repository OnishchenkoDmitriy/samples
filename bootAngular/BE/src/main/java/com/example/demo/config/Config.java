package com.example.demo.config;

import com.example.demo.entity.Car;
import com.example.demo.repository.CarReposirory;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.stream.Stream;

@Configuration
public class Config {

    @Bean
    ApplicationRunner init(CarReposirory reposirory){
        return args -> {
            Stream.of("Ferrari", "Jaguar", "Porsche", "Lamborghini", "Bugatti",
                    "AMC Gremlin", "Triumph Stag", "Ford Pinto", "Yugo GV").forEach(name -> {
                Car car = new Car();
                car.setName(name);
                reposirory.save(car);
            });
            reposirory.findAll().forEach(System.out::println);
        };
    }
}
