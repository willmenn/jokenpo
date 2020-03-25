package com.jokenpo;

import org.junit.Test;

import static com.jokenpo.Item.*;
import static com.jokenpo.Result.*;
import static org.junit.Assert.*;

public class ItemTest {

    @Test
    public void shouldWinGivenRockScissor() {
        Result result = ROCK.getRule().apply(SCISSOR);
        assertEquals(WIN, result);
    }

    @Test
    public void shouldTieGivenRockRock() {
        Result result = ROCK.getRule().apply(ROCK);
        assertEquals(TIE, result);
    }

    @Test
    public void shouldLoseGivenRockPaper() {
        Result result = ROCK.getRule().apply(PAPER);
        assertEquals(LOSE, result);
    }

    @Test
    public void shouldWinGivenPaperRock() {
        Result result = PAPER.getRule().apply(ROCK);
        assertEquals(WIN, result);
    }

    @Test
    public void shouldTieGivenPaperPaper() {
        Result result = PAPER.getRule().apply(PAPER);
        assertEquals(TIE, result);
    }

    @Test
    public void shouldLoseGivenPaperScissor() {
        Result result = PAPER.getRule().apply(SCISSOR);
        assertEquals(LOSE, result);
    }

    @Test
    public void shouldWinGivenScissorPaper() {
        Result result = SCISSOR.getRule().apply(PAPER);
        assertEquals(WIN, result);
    }

    @Test
    public void shouldTieGivenScissorScissor() {
        Result result = SCISSOR.getRule().apply(SCISSOR);
        assertEquals(TIE, result);
    }

    @Test
    public void shouldLoseGivenScissorRock() {
        Result result = SCISSOR.getRule().apply(ROCK);
        assertEquals(LOSE, result);
    }
}