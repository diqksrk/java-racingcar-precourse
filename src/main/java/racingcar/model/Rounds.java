package racingcar.model;

import racingcar.common.message.ExceptionMessage;
import racingcar.exception.InvalidRoundNumberException;
import racingcar.exception.NotContatinNumberException;
import racingcar.utils.PatternUtils;

public class Rounds {

    private int number;

    public Rounds(String roundNumber) {
        containIfOnlyDigtCheck(roundNumber);
        containIfExceedMaxRoundNumber(roundNumber);

        this.number = Integer.parseInt(roundNumber);
    }

    public int getNumber() {
        return this.number;
    }

    private boolean isValid(String roundNumber) {
        return Integer.parseInt(roundNumber) > 1000 ? false : true;
    }

    private void containIfOnlyDigtCheck(String roundNumber) {
        if ( !PatternUtils.containOnlyDigit(roundNumber) ) {
            throw new NotContatinNumberException(ExceptionMessage.NOT_CONTAIN_ONLY_NUMBER_EXCEPTION_MESSAGE);
        }
    }

    private void containIfExceedMaxRoundNumber(String roundNumber) {
        if ( !isValid(roundNumber) ) {
            throw new InvalidRoundNumberException(ExceptionMessage.MAX_ROUND_NUMBER_EXCEPTION_MESSAGE);
        }
    }
}
