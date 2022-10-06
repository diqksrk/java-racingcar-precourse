package racingcar.model;

import camp.nextstep.edu.missionutils.Console;
import racingcar.exception.CarNameException;

import java.util.ArrayList;
import java.util.List;

public class Mechanic {
    List<RacingCar> racingCars = new ArrayList<>();

    public void initializingCars(String carNames) {
        try {
            setRacingCarNames(carNames);
        } catch (CarNameException carNameException) {
            System.out.println(carNameException.getMessage());
            Console.readLine();
        }
    }

    private void setRacingCarNames(String carNames) {
        for (String carName : carNames.split(",")) {
            racingCars.add(new RacingCar(carName));
        }
    }
}
