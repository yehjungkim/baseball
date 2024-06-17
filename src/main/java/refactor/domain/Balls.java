package refactor.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Set;

public class Balls {

    public static final int SIZE = 3;

    private final List<Ball> collections;

    public Balls(final Set<Integer> set) {
        this(new ArrayList<>(set));
    }

    public Balls(final List<Integer> list) {
        validate(list);

        this.collections = list.stream()
                .map(Ball::new)
                .toList();
    }

    public int countStrike(final Balls balls) {
        int count = 0;
        for (int i = 0; i < balls.collections.size(); i++) {
            final Ball ball = balls.collections.get(i);
            if (isStrike(ball, i)) {
                count++;
            }
        }
        return count;
    }

    public boolean isStrike(final Ball ball, int i) {
        return this.collections.contains(ball) && this.collections.get(i).equals(ball);
    }

    public int countBall(final Balls balls) {
        int count = 0;
        for (int i = 0; i < balls.collections.size(); i++) {
            final Ball ball = balls.collections.get(i);
            if (isBall(ball, i)) {
                count++;
            }
        }
        return count;
    }

    public boolean isBall(final Ball ball, int i) {
        return this.collections.contains(ball) && !this.collections.get(i).equals(ball);
    }

    private void validate(final List<Integer> list) {
        validateSize(list);
        validateDuplicate(list);
    }

    private void validateSize(final List<Integer> list) {
        if (list == null || list.size() != SIZE) {
            throw new IllegalArgumentException("balls size");
        }
    }

    private void validateDuplicate(final List<Integer> list) {
        final long count = list.stream()
                .distinct()
                .count();

        if (count != SIZE) {
            throw new IllegalArgumentException("balls duplicate");
        }
    }

    @Override
    public String toString() {
        return "Balls{" +
               "list=" + collections +
               '}';
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        final Balls balls = (Balls) o;
        return Objects.equals(this.collections, balls.collections);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(collections);
    }
}
