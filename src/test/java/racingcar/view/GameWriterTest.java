package racingcar.view;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import racingcar.common.GameMessage;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("view ( GameWriterTest )")
class GameWriterTest {
    private final ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
    private final PrintStream originOut = System.out;

    @BeforeEach
    void setUp() {
        System.setOut(new PrintStream(outputStream));
    }

    @AfterEach
    void after() {
        System.setOut(originOut);
    }

    @Test
    @DisplayName("자동차 이름 질의문 출력")
    void number_inquire_write_test() {
        // When
        GameWriter.inquireCarNames();

        // Then
        assertThat(GameMessage.NAME_REQUIRE_MESSAGE.getMessage()).isEqualTo(outputStream.toString().trim());
    }
}