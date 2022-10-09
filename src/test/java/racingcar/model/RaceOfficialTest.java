package racingcar.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static camp.nextstep.edu.missionutils.test.Assertions.assertRandomNumberInRangeTest;

@DisplayName("model - RaceOfficial")
class RaceOfficialTest {
    private RaceOfficial raceOfficial;
    private GameErrors gameErrors;
    private static final int MOVING_FORWARD = 4;
    private static final int STOP = 3;

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

    @Test
    @DisplayName("특정 조건에 레이싱카를 이동시킬지 말지 결정하는 경우")
    void race_start_test() {
        // Given
        Rounds rounds = new Rounds("2");
        List<RacingCar> racingCars = new ArrayList<>();

        // When
        racingCars.add(new RacingCar("phobi", gameErrors));

        // Then
        assertRandomNumberInRangeTest(
                () -> {
                    for (int i = 0; i < rounds.getNumber(); i++) {
                        raceOfficial.raceStart(racingCars);
                    }
                    assertThat( racingCars.get(0).getPosition() ).isEqualTo(1);
                },
                MOVING_FORWARD, STOP
        );
    }
}