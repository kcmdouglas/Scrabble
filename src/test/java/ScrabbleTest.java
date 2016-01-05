import org.junit.*;
import static org.junit.Assert.*;

public class ScrabbleTest {

  // @Test
  // public void scrabbleScore_returnsAScrabbleScoreForALetter_1() {
  //   Scrabble app = new Scrabble();
  //   Integer score = 1;
  //   assertEquals(score, app.scrabbleScore("a"));
  // }

  @Test
  public void scrabbleScore_returnsAString_a() {
    Scrabble app = new Scrabble();
    String letter = "a";
    assertEquals(letter, app.scrabbleScore("a"));
  }
}
