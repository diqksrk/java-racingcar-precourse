package racingcar.utils;

import java.util.regex.Pattern;

public final class PatternUtils {
    private static final Pattern pattern = Pattern.compile("[ !@#$%^&*(),.?\":{}|<>~]");

    public static boolean containSpecialCharacter(String paragraph) {
        return pattern.matcher(paragraph).find();
    }
}
