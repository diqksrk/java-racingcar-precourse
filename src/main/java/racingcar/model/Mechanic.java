package racingcar.model;

import racingcar.message.ExceptionMessage;
import racingcar.exception.InvalidRacingCarNameLengthException;
import racingcar.exception.SpecialCharacterContainException;

import java.util.ArrayList;
import java.util.List;

public class Mechanic {
    List<RacingCar> racingCars = new ArrayList<>();

    public void initializingCars(String carNames, GameErrors gameErrors) {
        try {
            giveNameToRacingCars(carNames);
        } catch (Exception e) {
            gameErrors.setDefaultMessage(e.getMessage());
            return;
        }
    }

    public List<RacingCar> getRacingCars() {
        return racingCars;
    }

    private void giveNameToRacingCars(String carNames) throws SpecialCharacterContainException, InvalidRacingCarNameLengthException {
        String[] carNameList = carNames.split(",");
        if (carNameList.length == 0) throw new SpecialCharacterContainException(ExceptionMessage.CONTAIN_SPECIAL_CHARACTER_EXCEPTION_MESSAGE);

        for (String carName : carNameList) {
            racingCars.add(new RacingCar(carName));
        }
    }
}
