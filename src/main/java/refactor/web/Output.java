package refactor.web;

public class Output {
    public static final String FOUR_BALL = "포볼";
    public static final String STRIKE_BALL = "%d 볼 %d 스트라이크";
    public static final String STRIKE = "%d 스트라이크";
    public static final String BALL = "%d 볼";
    public static final String SUCCESS = "3개의 숫자를 모두 맞히셨습니다! 게임종료";

    public static void resultMessage(final int strike, final int ball) {
        if (ball == 0 && strike == 0) {
            System.out.println(FOUR_BALL);
            return;
        }

        if (ball == 0) {
            System.out.println(String.format(STRIKE, strike));
            success(strike);
            return;
        }

        if (strike == 0) {
            System.out.println(String.format(BALL, ball));
            return;
        }

        System.out.println(String.format(STRIKE_BALL, ball, strike));
    }

    private static void success(final int strike) {
        if (strike == 3) {
            System.out.println(SUCCESS);
        }
    }
}
