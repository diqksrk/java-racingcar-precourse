package racingcar.model;

import org.junit.platform.commons.util.StringUtils;
import racingcar.common.message.ExceptionMessage;
import racingcar.exception.InvalidRacingCarNameLengthException;
import racingcar.exception.InvalidRoundNumberException;
import racingcar.exception.NotContatinNumberException;
import racingcar.utils.PatternUtils;

public class Rounds {
    private int number;

    public Rounds(String roundNumber) throws NotContatinNumberException, InvalidRacingCarNameLengthException, NumberFormatException {
        containIfOnlyDigtCheck(roundNumber);
        containIfExceedMaxRoundNumber(roundNumber);

        this.number = Integer.parseInt(roundNumber);
    }

    public int getNumber() {
        return this.number;
    }

    private void containIfOnlyDigtCheck(String roundNumber) {
        if ( StringUtils.isBlank(roundNumber) || !PatternUtils.containOnlyDigit(roundNumber) ) {
            throw new NotContatinNumberException(ExceptionMessage.NOT_CONTAIN_ONLY_NUMBER_EXCEPTION_MESSAGE);
        }
    }

    private void containIfExceedMaxRoundNumber(String roundNumber) {
        if ( !isExceedMaxRoundNumber(roundNumber) ) {
            throw new InvalidRoundNumberException(ExceptionMessage.MAX_ROUND_NUMBER_EXCEPTION_MESSAGE);
        }
    }

    private boolean isExceedMaxRoundNumber(String roundNumber) throws NumberFormatException {
        return Integer.parseInt(roundNumber) > 1000 ? false : true;
    }
}
