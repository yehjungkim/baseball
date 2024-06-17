package refactor.domain;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class Computer {
    public static final int OUT = 3;

    private Balls balls;
    private int strike;
    private int ball;

    public Computer() {
        this.balls = createBalls();
        System.out.println(this.balls);
    }

    public Result calculate(Balls balls) {
        strike = this.balls.countStrike(balls);
        ball = this.balls.countBall(balls);

        return new Result(strike, ball);
    }

    public boolean result() {
        return strike == OUT;
    }

    public void reset() {
        this.balls = createBalls();
        System.out.println(balls);
    }

    private Balls createBalls() {
        final HashSet<Integer> ball = new LinkedHashSet<>();
        while (ball.size() != Balls.SIZE) {
            int num = createNumber();
            ball.add(num);
        }
        return new Balls(ball);
    }

    public static int createNumber() {
        return (int) (9 * Math.random()) + 1;
    }

    @Override
    public String toString() {
        return "ComputerBalls{" +
               "balls=" + balls +
               '}';
    }
}
