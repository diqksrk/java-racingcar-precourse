package racingcar.controller;

import racingcar.model.Mechanic;
import racingcar.view.GameReader;
import racingcar.view.GameWriter;

public class GameController {
    Mechanic mechanic = new Mechanic();

    public void gameStart() {
        try {
            GameWriter.inquireCarNames();
            mechanic.initializingCars(GameReader.readGameInput());
            GameWriter.inquireRounds();
            GameReader.readGameInput();
        } catch (Exception e) {
            GameWriter.writeErrorMessage(e.getMessage());
            GameReader.readGameInput();
        }
    }
}
