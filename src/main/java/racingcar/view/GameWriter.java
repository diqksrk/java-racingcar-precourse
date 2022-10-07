package racingcar.view;

import racingcar.common.message.GameMessage;

public class GameWriter {

    public static void inquireCarNames() {
        System.out.println(GameMessage.NAMES_REQUIRE_MESSAGE);
    }

    public static void writeErrorMessage(String errorMessage) {
        System.out.println(errorMessage);
    }
}
