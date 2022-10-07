package racingcar.model;

import racingcar.exception.CarNameException;

import java.util.ArrayList;
import java.util.List;

public class Mechanic {
    List<RacingCar> racingCars = new ArrayList<>();

    public void initializingCars(String carNames) throws CarNameException {
        giveNameToRacingCars(carNames);
    }

    private void giveNameToRacingCars(String carNames) {
        for (String carName : carNames.split(",")) {
            racingCars.add(new RacingCar(carName));
        }
    }
}
