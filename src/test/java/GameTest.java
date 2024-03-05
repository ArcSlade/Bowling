import ch.hearc.ig.bowling.Bowling;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BowlingTest {
    Bowling bowling;
    @BeforeEach
    public void setUp() {
        bowling = new Bowling();
    }
    @Test
    public void score_Given20At0_ShouldBe0() {
        for (int i = 0; i < 20; i++) {
            bowling.roll(0);
        }

        Assertions.assertEquals(0, bowling.score());
    }
    @Test
    public void score_Given20At1_ShouldBe20() {
        for (int i = 0; i < 20; i++) {
            bowling.roll(1);
        }
        Assertions.assertEquals(20, bowling.score());
    }
    @Test
    public void score_Given3WithSpareAndlast3_ShouldBe16() {
        for (int i = 0; i < 2; i++) {
            bowling.roll(5);
            bowling.roll(5);
        }
        bowling.roll(3);
        Assertions.assertEquals(16, bowling.score());
    }
    @Test
    public void score_Given3WithStrikeAndTwoRollAt3and4_ShouldBe24() {
        bowling.roll(10);
        bowling.roll(3);
        bowling.roll(4);
        Assertions.assertEquals(24, bowling.score());
    }
    @Test
    public void score_Given3WithPerfectGame_ShouldBe300() {
        for (int i = 0; i < 12; i++) {
            bowling.roll(10);
        }
        Assertions.assertEquals(300, bowling.score());
    }
}
