import ch.hearc.ig.bowling.Game;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class GameTest {
    Game game;
    @BeforeEach
    public void setUp() {
        game = new Game();
    }
    @Test
    public void score_Given20At0_ShouldBe0() {
        for (int i = 0; i < 20; i++) {
            game.roll(0);
        }

        Assertions.assertEquals(0, game.score());
    }
    @Test
    public void score_Given20At1_ShouldBe20() {
        for (int i = 0; i < 20; i++) {
            game.roll(1);
        }
        Assertions.assertEquals(20, game.score());
    }
    @Test
    public void score_Given3WithSpareAndlast3_ShouldBe16() {
        for (int i = 0; i < 2; i++) {
            game.roll(5);
        }
        game.roll(3);
        Assertions.assertEquals(16, game.score());
    }
    @Test
    public void score_Given3WithStrikeAndTwoRollAt3and4_ShouldBe24() {
        game.roll(10);
        game.roll(3);
        game.roll(4);
        Assertions.assertEquals(24, game.score());
    }
    @Test
    public void score_Given3WithPerfectGame_ShouldBe300() {
        for (int i = 0; i < 12; i++) {
            game.roll(10);
        }
        Assertions.assertEquals(300, game.score());
    }
}
