import refactor.domain.Game;
import refactor.web.Input;

import java.nio.channels.ScatteringByteChannel;

public class Test2 {

    public static void main(String[] args) {
        final Game game = new Game();
        do {
            play(game);
        } while (game.restart(Input.restartGame()));
    }

    private static void play(final Game game) {
        boolean result = false;
        do {
            try {
                result = game.play(Input.inputNumber());
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        } while (!result);
    }
}
