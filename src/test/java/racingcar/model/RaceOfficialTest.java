package racingcar.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("model - RaceOfficial")
class RaceOfficialTest {
    private RaceOfficial raceOfficial;

    @BeforeEach
    void setUp() {
        raceOfficial = new RaceOfficial();
    }

    @DisplayName("라운드오피셔에 올바른 라운드가 선언되는 경우")
    @ParameterizedTest(name = "{index} {displayName} message={0}")
    @ValueSource(ints = {1, 50, 999})
    void set_rounds_test(int roundNumber) {
        // when
        raceOfficial.setRounds(String.valueOf(roundNumber));

        // Then
        assertThat(raceOfficial.rounds.getNumber()).isEqualTo(roundNumber);
    }
}