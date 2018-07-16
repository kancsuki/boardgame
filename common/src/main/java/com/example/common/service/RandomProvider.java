package com.example.common.service;

import java.util.Random;
import org.springframework.stereotype.Component;

@Component
public class RandomProvider {

    private final Random random = new Random(1492);

    public int throwDice() {
        return random.nextInt(6) + 1;
    }

}
