package racingcar.controller;

import racingcar.model.Mechanic;
import racingcar.view.GameReader;
import racingcar.view.GameWriter;

public class GameController {
    Mechanic mechanic = new Mechanic();

    public void gameStart() {
        GameWriter.inquireCarNames();
        mechanic.initializingCars(GameReader.getCarNames());
    }
}
