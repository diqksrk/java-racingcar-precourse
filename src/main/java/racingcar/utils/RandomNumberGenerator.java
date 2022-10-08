package racingcar.utils;

import camp.nextstep.edu.missionutils.Randoms;

public class RandomNumberGenerator {
    private final int MAX_NUMBER = 9;
    private final int MIN_NUMBER = 0;

    public int generate() {
        return Randoms.pickNumberInRange(MIN_NUMBER, MAX_NUMBER);
    }
}
