package racingcar.model;

import racingcar.common.message.ExceptionMessage;
import racingcar.exception.InvalidRacingCarNameLengthException;
import racingcar.exception.InvalidRoundNumberException;
import racingcar.exception.SpecialCharacterContainException;
import racingcar.utils.PatternUtils;

public class RacingCar {
    private final int MAX_NAME_LENGTH = 5;

    private String name;

    public RacingCar(String carName) {
        if (PatternUtils.containSpecialCharacter(carName)) {
            throw new SpecialCharacterContainException(ExceptionMessage.CONTAIN_SPECIAL_CHARACTER_EXCEPTION_MESSAGE);
        }
        if (!isValidNameLength(carName)) {
            throw new InvalidRacingCarNameLengthException(ExceptionMessage.RACING_CAR_NAME_LENGTH_EXCEPTION_MESSAGE);
        }

        this.name = carName;
    }

    public String getName() {
        return this.name;
    }

    private boolean isValidNameLength(String carName) {
        return carName.length() <= MAX_NAME_LENGTH;
    }
}
