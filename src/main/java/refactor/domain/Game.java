package refactor.domain;

import refactor.web.Output;

import java.util.List;

public class Game {
    private final Computer computer;

    public Game() {
        this.computer = new Computer();
    }

    public boolean play(List<Integer> input) {
        final Result calculate = computer.calculate(new Balls(input));
        Output.resultMessage(calculate.strike(), calculate.ball());

        return computer.result();
    }

    public boolean restart(final boolean restart) {
        computer.reset();
        return restart;
    }
}
