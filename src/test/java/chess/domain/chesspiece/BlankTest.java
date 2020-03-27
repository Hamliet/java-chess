package chess.domain.chesspiece;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static chess.domain.game.Team.BLANK;
import static org.assertj.core.api.Assertions.assertThat;

public class BlankTest {
    @Test
    @DisplayName("Blank 생성")
    void create() {
        assertThat(new Blank(BLANK)).isInstanceOf(Blank.class);
    }
}
