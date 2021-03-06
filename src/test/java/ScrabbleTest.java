import org.junit.*;
import static org.junit.Assert.*;
import java.util.ArrayList;

public class ScrabbleTest {

  @Test
  public void scrabbleScore_returnsAScrabbleScoreForALetter_1() {
    Scrabble app = new Scrabble();
    Integer score = 1;
    assertEquals(score, app.scrabbleScore("a"));
  }

  @Test
  public void scrabbleScore_returnsTotalScore_2() {
    Scrabble app = new Scrabble();
    Integer total = 2;
    assertEquals(total, app.scrabbleScore("aa"));
  }

  @Test
    public void scrabbleScore_returnsDifferentTotalScore_5() {
      Scrabble app = new Scrabble();
      Integer total = 5;
      assertEquals(total, app.scrabbleScore("cat"));
    }

    @Test
      public void scrabbleScore_returnsTotalForTwoWords_10() {
        Scrabble app = new Scrabble();
        Integer total = 10;
        assertEquals(total, app.scrabbleScore("Cat dog"));
      }

  }
