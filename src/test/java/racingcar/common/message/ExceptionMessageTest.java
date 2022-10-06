package racingcar.common.message;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("commom - message ( ExceptionMessage )")
class ExceptionMessageTest {
    private final String requireWord = "[ERROR]";

    @Test
    @DisplayName("자동차 이름 길이 초과 에러 메시지")
    void racing_car_name_length_exception_message_test() {
        // Given
        String str = "[ERROR] 자동차 이름의 길이는 5자리를 초과해서는 안됩니다.";

        // When && Then
        testRequireMethod(str);
        assertThat(str).isEqualTo(ExceptionMessage.RACING_CAR_NAME_LENGTH_EXCEPTION_MESSAGE);
    }

    @Test
    @DisplayName("자동차 이름 특수문자 포함 에러 메시지")
    void racing_car_name_contain_speicial_character_exception_message_test() {
        // Given
        String str = "[ERROR] 레이싱카 이름에 특수문자가 포함되서는 안됩니다.";

        // When && Then
        testRequireMethod(str);
        assertThat(str).isEqualTo(ExceptionMessage.CONTAIN_SPECIAL_CHARACTER_EXCEPTION_MESSAGE);
    }

    private void testRequireMethod(String errorMessage) {
        assertThat( errorMessage.contains(this.requireWord) );
    }
}