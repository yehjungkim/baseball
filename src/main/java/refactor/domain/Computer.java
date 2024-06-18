package refactor.domain;

import refactor.Utils.RandomUtils;

public class Computer {
    public static final int SIZE = 3;
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

    public Balls createBalls() {
        return new Balls(RandomUtils.createList(SIZE));
    }

    @Override
    public String toString() {
        return "ComputerBalls{" +
               "balls=" + balls +
               '}';
    }
}
