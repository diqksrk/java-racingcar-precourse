package racingcar.common;

public enum  GameMessage {

    NAME_REQUIRE_MESSAGE("경주 할 자동차 이름(이름은 쉼표(,) 기준으로 구분)");

    private final String message;

    GameMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return this.message;
    }
}
