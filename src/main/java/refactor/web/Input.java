package refactor.web;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Input {
    public static final String INPUT_NUMBER = "숫자를 입력해 주세요 : ";
    public static final String RESTART_GAME = "게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.";
    public static final String RESTART = "1";
    public static final Scanner scan = new Scanner(System.in);

    public static List<Integer> inputNumber() {
        System.out.print(INPUT_NUMBER);
        String inputLine = scan.nextLine();

        String[] ballNum = inputLine.split("");
        return Arrays.stream(ballNum).map(Integer::parseInt)
                .collect(Collectors.toList());
    }

    public static boolean restartGame() {
        System.out.println(RESTART_GAME);
        final String num = scan.nextLine();

        return RESTART.equals(num);
    }
}
