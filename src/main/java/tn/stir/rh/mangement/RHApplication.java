package tn.stir.rh.mangement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
public class RHApplication {

    public static void main(String[] args) {
        SpringApplication.run(RHApplication.class, args);
    }

}
