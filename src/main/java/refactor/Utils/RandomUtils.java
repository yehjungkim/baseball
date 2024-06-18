package refactor.Utils;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;

public class RandomUtils {

    public static List<Integer> createList(final int size) {
        final HashSet<Integer> ball = new LinkedHashSet<>();
        while (ball.size() != size) {
            int num = createNumber();
            ball.add(num);
        }
        return new ArrayList<>(ball);
    }

    public static int createNumber() {
        return (int) (9 * Math.random()) + 1;
    }
}
