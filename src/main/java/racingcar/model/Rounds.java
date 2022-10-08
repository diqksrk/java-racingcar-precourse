package racingcar.model;

import racingcar.common.message.ExceptionMessage;
import racingcar.exception.InvalidRoundNumberException;
import racingcar.exception.NotContatinNumberException;
import racingcar.utils.PatternUtils;

public class Rounds {

    private int number;

    public Rounds(String rounds) {
        if ( !PatternUtils.containOnlyDigit(rounds) ) {
            throw new NotContatinNumberException(ExceptionMessage.NOT_CONTAIN_ONLY_NUMBER_EXCEPTION_MESSAGE);
        }
        if ( !isValid(rounds) ) {
            throw new InvalidRoundNumberException(ExceptionMessage.MAX_ROUND_NUMBER_EXCEPTION_MESSAGE);
        }

        this.number = Integer.parseInt(rounds);
    }

    public int getNumber() {
        return this.number;
    }

    private boolean isValid(String rounds) {
        return Integer.parseInt(rounds) > 1000 ? false : true;
    }
}
