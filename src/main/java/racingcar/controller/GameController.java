package racingcar.controller;

import racingcar.model.Mechanic;
import racingcar.view.GameReader;
import racingcar.view.GameWriter;

public class GameController {
    Mechanic mechanic = new Mechanic();

    public void gameStart() {
        GameWriter.inquireCarNames();
        try {
            mechanic.initializingCars(GameReader.getCarNames());
        } catch (Exception e) {
            GameWriter.writeErrorMessage(e.getMessage());
            GameReader.getCarNames();
        }
    }
}
