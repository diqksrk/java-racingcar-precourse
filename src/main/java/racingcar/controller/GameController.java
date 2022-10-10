package racingcar.controller;

import racingcar.model.GameErrors;
import racingcar.model.Mechanic;
import racingcar.model.RaceOfficial;
import racingcar.view.GameReader;
import racingcar.view.GameWriter;

public class GameController {
    Mechanic mechanic = new Mechanic();
    RaceOfficial raceOfficial = new RaceOfficial();
    GameErrors gameErrors = new GameErrors();

    public void gameStart() {
        GameWriter.inquireCarNames();
        setGameCar();
        GameWriter.inquireRounds();
        setGameRounds();
        raceStart();
    }

    private void raceStart() {
        GameWriter.writeInfoBeforeRoundStart();
        for (int i = 0; i < raceOfficial.getRounds().getNumber(); i++) {
            raceOfficial.roundStart(mechanic.getRacingCars());
//            GameWriter.writeRoundResult(mechanic.getRacingCars());
        }
    }

    private void setGameCar() {
        do {
            gameErrors.clear();
            mechanic.initializingCars(GameReader.readGameCarGames(), gameErrors);
            if (gameErrors.hasError()) {
                GameWriter.writeError(gameErrors.getDefaultMessage());
            }
        } while (gameErrors.hasError());
    }

    private void setGameRounds() {
        do {
            gameErrors.clear();
            raceOfficial.setRounds(GameReader.readGameRounds());
            if (gameErrors.hasError()) {
                GameWriter.writeError(gameErrors.getDefaultMessage());
            }
        } while (gameErrors.hasError());
    }
}
