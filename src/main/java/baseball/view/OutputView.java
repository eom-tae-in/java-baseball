package baseball.view;

import baseball.constant.Constant;

public class OutputView {

    public static void printRestartOrEndGame() {

        System.out.println(Constant.SELECT_RESTART_OR_END_MESSAGE);
    }

    public static void printStartBaseballGame() {

        System.out.println(Constant.START_BASEBALL_NUMBER_GAME_MESSAGE);
    }
}
