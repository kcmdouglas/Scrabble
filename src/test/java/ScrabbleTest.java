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

  // @Test
  // public void scrabbleScore_returnsAString_a() {
  //   Scrabble app = new Scrabble();
  //   String letter = "a";
  //   assertEquals(letter, app.scrabbleScore("a"));
  // }

  // @Test
  // public void scrabbleScore_returnsAnArrayList_aa() {
  //   Scrabble app = new Scrabble();
  //   ArrayList<String> expectedArray = new ArrayList<String>();
  //   expectedArray.add("a");
  //   expectedArray.add("a");
  //   assertEquals(expectedArray, app.scrabbleScore("aa"));
  // }

  @Test
  public void scrabbleScore_returnsTotalScore_2() {
    Scrabble app = new Scrabble();
    Integer total = 2;
    assertEquals(total, app.scrabbleScore("aa"));
  }

  @Test
    public void scrabbleScore_returnsDifferentTotalScore_4() {
      Scrabble app = new Scrabble();
      Integer total = 4;
      assertEquals(total, app.scrabbleScore("cat"));
    }


  }
