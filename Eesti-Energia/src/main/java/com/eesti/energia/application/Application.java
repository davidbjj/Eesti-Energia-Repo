package com.eesti.energia.application;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.stream.Stream;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.eesti.energia.application.entities.User;
import com.eesti.energia.application.repositories.UserRepository;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Bean
    CommandLineRunner init(UserRepository userRepository) {
        return args -> {
        	User user = new User();
        	
        	user.setId(100);
        	user.setName("Ain");
        	user.setLastname("Kala");
        	user.setDob(new SimpleDateFormat("yyyyMMdd").parse("20100520"));
        	user.setEmail(user.getName().toLowerCase().concat(".").concat(user.getLastname().concat("@domain.com")));
        	user.setAddress("Viralti 13 Tallinn"); 
            userRepository.save(user);
            
            user.setId(200);
        	user.setName("Siiru");
        	user.setLastname("Viiru");
        	user.setDob(new SimpleDateFormat("yyyyMMdd").parse("19801101"));
        	user.setEmail(user.getName().toLowerCase().concat(".").concat(user.getLastname().concat("@domain.com")));
        	user.setAddress("Soo 10 Tallinn"); 
            userRepository.save(user);
            
            user.setId(300);
            user.setName("Heli");
        	user.setLastname("Kopter");
        	user.setDob(new SimpleDateFormat("yyyyMMdd").parse("19070824"));
        	user.setEmail(user.getName().toLowerCase().concat(".").concat(user.getLastname().concat("@domain.com")));
        	user.setAddress("Prantsusmas 10 Tallinn"); 
            userRepository.save(user);
            

            userRepository.findAll().forEach(System.out::println);
        };
    }
}
