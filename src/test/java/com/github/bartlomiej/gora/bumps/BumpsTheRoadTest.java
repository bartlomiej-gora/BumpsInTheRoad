package com.github.bartlomiej.gora.bumps;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BumpsTheRoadTest {

    private static final String WOOHOO = "Woohoo!";
    private static final String CAR_DEAD = "Car Dead";

    @Test
    public void shouldReturnWoohooForOne() {
        String result = BumpsTheRoad.bumps("_");

        assertEquals(WOOHOO, result);
    }

    @Test
    public void shouldReturnWoohooForOneN() {
        String result = BumpsTheRoad.bumps("n");

        assertEquals(WOOHOO, result);
    }


    @Test
    public void shouldReturnWoohooForCouple() {
        String result = BumpsTheRoad.bumps("______");

        assertEquals(WOOHOO, result);
    }


    @Test
    public void shouldReturnWoohooForCoupleAndN() {
        String result = BumpsTheRoad.bumps("__nnn____");

        assertEquals(WOOHOO, result);
    }

    @Test
    public void shouldReturnWoohooForCoupleAndN15() {
        String result = BumpsTheRoad.bumps("__nnn___nn_nnn_nnnnnnn");

        assertEquals(WOOHOO, result);
    }

    @Test
    public void shouldReturnWoohooForCoupleAndN14() {
        String result = BumpsTheRoad.bumps("__nnn___nn_nnn_nnnnnn");

        assertEquals(WOOHOO, result);
    }

    @Test
    public void shouldReturnWoohooForCoupleAndN20() {
        String result = BumpsTheRoad.bumps("nnn_nnnnnnn_nnnnnnn__nnn___nn_nnn_nnnnnn");

        assertEquals(CAR_DEAD, result);
    }

    @Test
    public void shouldReturnWoohooForCoupleAndMixed() {
        String result = BumpsTheRoad.bumps("n_n_n_n_n_n_n_n_n_n_n_n_n_n_n_n_n__n_n_n___n_n_n_n_n_n_n_n_n_n");

        assertEquals(CAR_DEAD, result);
    }

    @Test
    public void shouldReturnCarDead() {
        String result = BumpsTheRoad.bumps("nnnnnnnnnnnnnnnn");

        assertEquals(CAR_DEAD, result);
    }
}
