package racingcar.view;

import racingcar.common.GameMessage;

public class GameWriter {

    public static void inquireCarNames() {
        System.out.println(GameMessage.NAME_REQUIRE_MESSAGE.getMessage());
    }
}
