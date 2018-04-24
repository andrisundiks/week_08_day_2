package com.example.n.rockpaperscissors;

import java.util.Random;

public class GameLogic {

    public static String computerMove() {
        Random rand = new Random();
        int randomNumber = rand.nextInt(2) + 1;

        for (HandType type : HandType.values()) {

            if (randomNumber == type.getIndex()) {
                return type.getHand();
            }
        }
        return "Test";

    }

}
