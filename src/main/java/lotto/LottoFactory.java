package lotto;

import lotto.controller.LottoController;
import lotto.view.InputView;
import lotto.view.OutputView;
import lotto.service.LottoService;

public class LottoFactory {
    public LottoController createLottoController() {
        InputView inputView = new InputView();
        OutputView outputView = new OutputView();
        LottoService lottoService = new LottoService();

        return new LottoController(inputView, outputView,lottoService);
    }
}
