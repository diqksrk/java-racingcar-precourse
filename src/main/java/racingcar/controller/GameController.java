package racingcar.controller;

import racingcar.view.GameReader;
import racingcar.view.GameWriter;

public class GameController {

    public void gameStart() {
        GameWriter.inquireCarNames();
        GameReader.getCarNames();
    }
}
