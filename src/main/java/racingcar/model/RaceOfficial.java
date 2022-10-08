package racingcar.model;

import racingcar.utils.RandomNumberGenerator;

import java.util.List;

public class RaceOfficial {
    Rounds rounds;

    public void setRounds(String rounds) throws IllegalArgumentException {
        this.rounds = new Rounds(rounds);
    }

    public void raceStart(List<RacingCar> racingCars) {
        for (RacingCar racingCar : racingCars) {
            decideCarMoving(racingCar);
        }
    }

    private void decideCarMoving(RacingCar racingCar) {
        if (isCarMoveForward()) {
            racingCar.moveForward();
        }
    }

    private boolean isCarMoveForward() {
        return RandomNumberGenerator.generate() > 3 ? true : false;
    }
}
