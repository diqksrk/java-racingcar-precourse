package racingcar.common.message;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("common - message ( GameMessageTest )")
class GameMessageTest {
    @Test
    @DisplayName("자동차 이름 질의문 메시지")
    void car_name_inquire_message_test() {
        // Given
        String testingString = "경주 할 자동차 이름(이름은 쉼표(,) 기준으로 구분)";

        // When && Then
        assertThat(testingString).isEqualTo(GameMessage.NAME_REQUIRE_MESSAGE);
    }
}