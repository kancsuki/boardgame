package com.example.boardgame;

import com.example.common.service.RandomProvider;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.example.boardgame", "com.example.common.service"})
public class BoardGame implements CommandLineRunner {

    private static final Logger logger = LoggerFactory.getLogger(BoardGame.class);

    @Autowired
    private RandomProvider randomProvider;

    @Override
    public void run(String... args) {
        logger.info("Throwing dice: {}", randomProvider.throwDice());
    }

    public static void main(String[] args) {
        SpringApplication.run(BoardGame.class, args);
    }

}
