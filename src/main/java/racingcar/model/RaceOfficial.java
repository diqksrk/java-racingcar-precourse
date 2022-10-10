package racingcar.model;

import racingcar.utils.RandomNumberGenerator;

import java.util.Collections;
import java.util.List;

public class RaceOfficial {
    Rounds rounds;

    public RaceWinners decideRaceWinnders(List<RacingCar> racingCars) {
        RaceWinners raceWinners = new RaceWinners();
        lineUpRacingCars(racingCars, raceWinners);
        for (RacingCar racingCar : racingCars) {
            addIfRaceWinner(racingCar, raceWinners, raceWinners.getRaceWinnderPosition());
        }

        return raceWinners;
    }

    public void setRounds(String roundNumber) throws IllegalArgumentException {
        this.rounds = new Rounds(roundNumber);
    }

    public Rounds getRounds() {
        return this.rounds;
    }

    public void raceStart(List<RacingCar> racingCars) {
        for (int i = 0; i < rounds.getNumber(); i++) {
            roundStart(racingCars);
        }
    }

    private void lineUpRacingCars(List<RacingCar> racingCars, RaceWinners raceWinners) {
        Collections.sort(racingCars, (a, b) -> b.getPosition() - a.getPosition());
        raceWinners.setRaceWinnderPosition(racingCars.get(0).getPosition());
    }

    private void addIfRaceWinner(RacingCar racingCar, RaceWinners raceWinners, int winnerPosition) {
        if ( isRaceWinner(racingCar, winnerPosition) ) {
            raceWinners.addRaceWinner(racingCar);
        }
    }

    private boolean isRaceWinner(RacingCar racingCar, int winnerPosition) {
        return racingCar.getPosition() >= winnerPosition;
    }

    public void roundStart(List<RacingCar> racingCars) {
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
