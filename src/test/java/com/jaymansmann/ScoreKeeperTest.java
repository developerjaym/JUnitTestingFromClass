package com.jaymansmann;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.function.Supplier;

public class ScoreKeeperTest {

    private ScoreKeeper scoreKeeper;
    @BeforeEach
    public void setUp() {
        this.scoreKeeper = new ScoreKeeper();
    }

    @Test
    public void addPointTest() {
        // addPoint method
        // the result is equal to 1
        int responseFromAddPoint = scoreKeeper.addPoint();
        assertEquals(1, responseFromAddPoint, "response from addPoint is 1");
    }

    @Test
    public void addPointsTest() {
        scoreKeeper.addPoints(1_000_000_000);
        int response = scoreKeeper.addPoints(2_000_000_000);
        assertEquals(0, response, "I don't know");
    }

    @Test
    public void removePointTest() {
        int responseFromRemovePoint = scoreKeeper.removePoint();
        assertEquals(-1, responseFromRemovePoint, "response from removePoint is -1");
    }














    @Test
    public void testMaxNegativeNumber() {

        assertThrows(IllegalStateException.class, () ->{
            for(int i = 0; i <= Integer.MAX_VALUE; i++) {
                scoreKeeper.removePoint();
            }
        });

    }





//    @Test
//    public void addPoint() {
//
//        ScoreKeeper scoreKeeper = new ScoreKeeper(Integer.MAX_VALUE);
//        assertThrows(IllegalStateException.class, () -> scoreKeeper.addPoint(), "threw illegalstateexception when score is maxed out");
//    }
}
