package com.example.n.rockpaperscissors;

import java.util.HashMap;
import java.util.Random;

public class GameLogic {

    public static HandType computerMove() {
        Random rand = new Random();
        int randomNumber = rand.nextInt(2) + 1;

        for (HandType type : HandType.values()) {

            if (randomNumber == type.getIndex()) {
                return type;
            }
        }
        return null;

    }


    public static String compareHands(String hand) {

        HashMap<Integer, Integer> winningMoves = new HashMap<Integer, Integer>();
        winningMoves.put(1, 3);
        winningMoves.put(3, 2);
        winningMoves.put(2, 1);

        HandType playerHand = HandType.typeByName(hand);
        HandType computerHand = computerMove();


        if (winningMoves.get(playerHand.getIndex()) == computerHand.getIndex()) {
            return "You win!";
        } else if (playerHand.getIndex() == computerHand.getIndex()) {
            return "It's a draw!";

        } else {
            return "You suck!";}
    }

}
