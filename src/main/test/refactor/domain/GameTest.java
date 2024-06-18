package refactor.domain;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import refactor.Utils.RandomUtils;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mockStatic;
import static org.mockito.Mockito.when;

class GameTest {

    @BeforeAll
    static void setup() {
        mockStatic(RandomUtils.class);
    }

    @Test
    void play() {
        when(RandomUtils.createList(3)).thenReturn(List.of(9, 2, 3));

        final Game game = new Game();
        final boolean play = game.play(List.of(9, 2, 3));

        assertTrue(play);
    }

    @Test
    void restart() {
        when(RandomUtils.createList(3)).thenReturn(List.of(9, 2, 3));
        final Game game = new Game();
        // when
        when(RandomUtils.createList(3)).thenReturn(List.of(1, 2, 3));
        // then
        game.restart(true);
        assertFalse(game.play(List.of(9, 2, 3)));
    }
}
