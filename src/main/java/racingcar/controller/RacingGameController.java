package racingcar.controller;

import racingcar.domain.RacingGame;
import racingcar.dto.RacingGameRequest;
import racingcar.view.InputView;
import racingcar.view.OutputView;

public class RacingGameController {

    public void run() {
        String names = InputView.readCarNames();
        String count = InputView.readCount();

        RacingGameRequest request=new RacingGameRequest(names,count);

        RacingGame racingGame = new RacingGame(request);
        OutputView.printPlayResultMessage();
         while (!racingGame.isEnd()){
             racingGame.doRace();
         }
    }
}
