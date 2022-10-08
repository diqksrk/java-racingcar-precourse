package racingcar.model;

public class RaceOfficial {

    Rounds rounds;

    public void setRounds(String rounds) throws IllegalArgumentException {
        this.rounds = new Rounds(rounds);
    }
}
