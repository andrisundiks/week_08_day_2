package com.example.n.rockpaperscissors;

import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class GameLogicTest {
    List<HandType> arrL;


    @Before
    public void before(){
        arrL = new ArrayList<>(Arrays.asList(HandType.ROCK, HandType.PAPER, HandType.SCISSORS));
    }

    @Test
    public void computerHasMove(){
        HandType result = GameLogic.computerMove();
        assertEquals(true, arrL.contains(result));
    }

    @Test
    public void gameCanCompareHands(){
        assertEquals(String.class, GameLogic.compareHands("Rock").getClass());
    }
}
