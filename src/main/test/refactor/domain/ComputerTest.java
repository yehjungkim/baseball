package refactor.domain;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class ComputerTest {
    static Balls answer = new Balls(List.of(1,2,3));
    @Test
    void calculate() {
        Balls balls = new Balls(List.of(1,2,3));
        int strike = this.answer.countStrike(balls);
        int ball = this.answer.countBall(balls);

        assertEquals(new Result(3,0), new Result(strike, ball));


//이런식으로 하면 되는거에요?? 어서 만들어 나머지 game은 못하네 .. ㅎ보니깐
    }

    @Test
    void result() {
        Balls balls = new Balls(List.of(1,2,3));
        int strike = this.answer.countStrike(balls);
        int ball = this.answer.countBall(balls);

        assertEquals(true, strike == 3);
    }

    @Test
    void reset() {
        Balls balls = this.answer;
        this.answer = new Computer().createBalls();
        assertNotEquals(balls, answer);
    }
}
