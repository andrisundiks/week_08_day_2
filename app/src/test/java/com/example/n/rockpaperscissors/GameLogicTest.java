package com.example.n.rockpaperscissors;

import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class GameLogicTest {
    List<String> arrL;


    @Before
    public void before(){
        arrL = new ArrayList<>(Arrays.asList("Rock", "Paper", "Scissors"));
    }

    @Test
    public void computerHasMove(){
        String result = GameLogic.computerMove();
        assertEquals(true, arrL.contains(result));
    }
}
