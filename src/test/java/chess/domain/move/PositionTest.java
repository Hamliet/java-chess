package chess.domain.move;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class PositionTest {
    @Test
    @DisplayName("Position 생성")
    void create() {
        assertThat(Position.of(Coordinate.of(1), Coordinate.of(1))).isInstanceOf(Position.class);
    }
}
