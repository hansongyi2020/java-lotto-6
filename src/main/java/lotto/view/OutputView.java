package lotto.view;

import lotto.Message.ViewMessage;
import lotto.config.WinningResultConfig;

import java.util.List;

public class OutputView {
    public void printPurchaseAmountMessage() {
        System.out.println(ViewMessage.PURCHASE_AMOUNT_INPUT_MESSAGE.getMessage());
    }

    public void printNumberOfPurchase(int lottoQuantity) {
        System.out.println(String.format(ViewMessage.PRINT_NUMBER_OF_PURCHASE.getMessage(),lottoQuantity));
    }

    public void printUserNumberOfLotto(List<List<Integer>> userNumbers) {
        System.out.println(userNumbers);
    }

    public void printWinningNumbersMessage() {
        System.out.println(ViewMessage.WINNING_NUMBERS_INPUT_MESSAGE.getMessage());
    }

    public void printBonusNumberMessage() {
        System.out.println(ViewMessage.BONUS_NUMBER_INPUT_MESSAGE.getMessage());
    }

    public void printWinningResultMessage() {
        System.out.println(ViewMessage.PRINT_WINNING_RESULT_MESSAGE.getMessage());
    }

    public void printLineSymbol() {
        System.out.println(ViewMessage.PRINT_LINE_SYMBOL.getMessage());
    }

    public void printWinningResult(WinningResultConfig winningResultConfig, Integer count) {
        System.out.println(
                String.format(ViewMessage.PRINT_EQUAL_NUMBER_WINNING_STATUS_FORM.getMessage(),
                        winningResultConfig.getResultStatus(), winningResultConfig.getRevenueStatus()) +
                String.format(ViewMessage.PRINT_EQUAL_LOTTO_COUNT_FORM.getMessage(), count)
        );
    }

    public void printTotalRevenue(double revenue) {
        System.out.println(String.format(ViewMessage.PRINT_TOTAL_REVENUE_RATE.getMessage(), revenue));
    }
}
