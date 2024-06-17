package refactor.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class BallTest {

    @Test
    void 허용범위_Exception() {
        assertThrows(IllegalArgumentException.class, () -> new Ball(10));
    }

    @Test
    void 허용범위_허용() {
        final Ball ball = new Ball(9);
        assertEquals(9, ball.getValue());
    }
}
