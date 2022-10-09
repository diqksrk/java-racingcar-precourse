package racingcar.controller;

import racingcar.model.Mechanic;
import racingcar.model.RaceOfficial;
import racingcar.view.GameReader;
import racingcar.view.GameWriter;

public class GameController {
    Mechanic mechanic = new Mechanic();
    RaceOfficial raceOfficial = new RaceOfficial();

    public void gameStart() {
        GameWriter.inquireCarNames();
        setGameCar();
        GameWriter.inquireRounds();
        setGameRounds();
        raceOfficial.raceStart(mechanic.getRacingCars());
    }

    private void setGameCar() {
        try {
            mechanic.initializingCars(GameReader.readGameCarGames());
        } catch (Exception e) {
            GameWriter.writeErrorMessage(e.getMessage());
            mechanic.initializingCars(GameReader.readGameCarGames());
        }
    }

    private void setGameRounds() {
        try {
            raceOfficial.setRounds(GameReader.readGameRounds());
        } catch (Exception e) {
            GameWriter.writeErrorMessage(e.getMessage());
            raceOfficial.setRounds(GameReader.readGameRounds());
        }
    }
}
