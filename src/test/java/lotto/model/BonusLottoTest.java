package lotto.model;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static lotto.Message.ErrorMessage.LOTTO_RANGE_ERROR_MESSAGE;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class BonusLottoTest {
    @DisplayName("model_BonusLotto_0이_입력_했을_때_예외_처리")
    @Test
    public void model_BonusLotto_0_input() {
        int inputBonus = 0;

        assertThatThrownBy(() -> new BonusLotto(inputBonus))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining(LOTTO_RANGE_ERROR_MESSAGE.getMessage());
    }

    @DisplayName("model_BonusLotto_45_초과가_입력_했을_때_예외_처리")
    @Test
    public void model_BonusLotto_45_over_input() {
        int inputBonus = 46;

        assertThatThrownBy(() -> new BonusLotto(inputBonus))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining(LOTTO_RANGE_ERROR_MESSAGE.getMessage());
    }

    @DisplayName("model_BonusLotto_범위가_올바를_때")
    @Test
    public void model_BonusLotto_correct_range() {
        int inputBonus = 2;
        BonusLotto bonusLotto = new BonusLotto(inputBonus);

        assertThat(bonusLotto.getBonusNumber()).isEqualTo(2);
    }
}
