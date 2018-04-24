package com.example.n.rockpaperscissors;

public enum HandType {

    ROCK("Rock", 1),
    PAPER("Paper", 2),
    SCISSORS("Scissors", 3);

    private String hand;
    private int index;

    HandType(String hand, int index) {
        this.hand = hand;
        this.index = index;

    }

    public String getHand() {
        return hand;
    }

    public int getIndex() {
        return index;
    }

    public static HandType typeByName(String name) {
        for (HandType type : HandType.values()) {

            if (name.equals(type.getHand())) {
                return type;
            }
        }

        return null;
    }
}
