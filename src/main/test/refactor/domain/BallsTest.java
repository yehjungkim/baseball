package refactor.domain;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BallsTest {
    private static Balls balls;

    @BeforeAll
    static void setUp() {
        balls = new Balls(List.of(1, 2, 3));
    }

    @Test
    void balls_size() {
        assertThrows(IllegalArgumentException.class, () -> new Balls(List.of(1, 2)));
    }

    @Test
    void balls_duplicate() {
        assertThrows(IllegalArgumentException.class, () -> new Balls(List.of(1, 1, 1)));
    }

    @Test
    void strike_테스트() {
        assertTrue(balls.isStrike(new Ball(3), 2));
    }

    @Test
    void countStrike_3strike() {
        final Balls balls_3strike = new Balls(List.of(1, 2, 3));

        assertEquals(3, balls.countStrike(balls_3strike));
    }

    @Test
    void countStrike_2strike() {
        final Balls balls_2strike = new Balls(List.of(1, 4, 3));

        assertEquals(2, balls.countStrike(balls_2strike));
    }

    @Test
    void countBall() {
        assertTrue(balls.isBall(new Ball(3), 1));
    }

    @Test
    void isBall__3ball() {
        final Balls balls_3ball = new Balls(List.of(3, 1, 2));

        assertEquals(3, balls.countBall(balls_3ball));
    }
}
