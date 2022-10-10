package racingcar.view;

import racingcar.common.message.GameMessage;

public class GameWriter {

    public static void inquireCarNames() {
        System.out.println(GameMessage.NAMES_REQUIRE_MESSAGE);
    }

    public static void inquireRounds() {
        System.out.println(GameMessage.ROUNDS_REQUIRE_MESSAGE);
    }

    public static void writeError(String errorMessage) {
        System.out.println(errorMessage);
    }

    public static void writeInfoBeforeRoundStart() {
        System.out.println(GameMessage.INFO_MESSAGE_BEFORE_RODUN_START);
    }

}
