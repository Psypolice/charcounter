package com.sharov.charcounter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * REST API calculates the frequency of the occurrence of characters on a given string
 * @author Alexey Sharov
 * @version 1.0.0
 */
@SpringBootApplication
public class CharcounterApplication {

    public static void main(String[] args) {
        SpringApplication.run(CharcounterApplication.class, args);
    }

}
