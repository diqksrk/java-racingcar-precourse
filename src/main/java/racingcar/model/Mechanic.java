package racingcar.model;

import java.util.ArrayList;
import java.util.List;

public class Mechanic {
    List<RacingCar> racingCars = new ArrayList<>();

    public void initializingCars(String carNames, GameErrors gameErrors) {
        giveNameToRacingCars(carNames, gameErrors);
    }

    private void giveNameToRacingCars(String carNames, GameErrors gameErrors) {
        for (String carName : carNames.split(",")) {
            racingCars.add(new RacingCar(carName, gameErrors));
        }
    }
}
