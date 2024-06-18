package refactor.domain;

import java.util.List;

public class Computer {
    public static final int OUT = 3;
    private Balls balls;
    private int strike;
    private int ball;

    public Computer(final List<Integer> numbers) {
        this.balls = createBalls(numbers);
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

    public void reset(final List<Integer> numbers) {
        this.balls = createBalls(numbers);
        System.out.println(balls);
    }

    public Balls createBalls(final List<Integer> numbers) {
        return new Balls(numbers);
    }

    @Override
    public String toString() {
        return "ComputerBalls{" +
               "balls=" + balls +
               '}';
    }
}
