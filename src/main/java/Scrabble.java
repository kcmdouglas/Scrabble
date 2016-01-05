import java.util.HashMap;

public class Scrabble {
  public static void main(String[] args) {}

  public Integer scrabbleScore(String userWord) {
    HashMap<String, Integer> scrabbleKey = new HashMap<String, Integer>();
    scrabbleKey.put("a", 1);

    return scrabbleKey.get(userWord);
  }
}
