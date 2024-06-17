package refactor.domain;

import java.util.Objects;

public class Ball {
    public static final int MIN = 0;
    public static final int MAX = 10;
    private final int value;

    public Ball(final int value) {
        validate(value);
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    private void validate(final int value) {
        if (!(value > MIN && value < MAX)) {
            throw new IllegalArgumentException("invalid number");
        }
    }

    @Override
    public String toString() {
        return "Ball{" +
               "value=" + value +
               '}';
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        final Ball ball = (Ball) o;
        return value == ball.value;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(value);
    }
}
