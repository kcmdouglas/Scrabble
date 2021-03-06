import java.util.HashMap;
import java.util.ArrayList;

public class Scrabble {
  public static void main(String[] args) {}

  public Integer scrabbleScore(String userWord) {
    userWord = userWord.replaceAll("\\s+", "");
    userWord = userWord.toLowerCase();

    HashMap<String, Integer> scrabbleKey = new HashMap<String, Integer>();
    scrabbleKey.put("a", 1);
    scrabbleKey.put("b", 3);
    scrabbleKey.put("c", 3);
    scrabbleKey.put("d", 2);
    scrabbleKey.put("e", 1);
    scrabbleKey.put("f", 4);
    scrabbleKey.put("g", 2);
    scrabbleKey.put("h", 4);
    scrabbleKey.put("i", 1);
    scrabbleKey.put("j", 8);
    scrabbleKey.put("k", 5);
    scrabbleKey.put("l", 1);
    scrabbleKey.put("m", 3);
    scrabbleKey.put("n", 1);
    scrabbleKey.put("o", 1);
    scrabbleKey.put("p", 3);
    scrabbleKey.put("q", 10);
    scrabbleKey.put("r", 1);
    scrabbleKey.put("s", 1);
    scrabbleKey.put("t", 1);
    scrabbleKey.put("u", 1);
    scrabbleKey.put("v", 4);
    scrabbleKey.put("w", 4);
    scrabbleKey.put("x", 8);
    scrabbleKey.put("y", 4);
    scrabbleKey.put("z", 10);

    String stringOfChar = "";
    Integer scrabbleScore = 0;
    for (Integer i = 0 ; i < userWord.length(); i++){
      char[] userCharacters = userWord.toCharArray();
      char result = userCharacters[i];
      stringOfChar = Character.toString(result);
      Integer letterValue = scrabbleKey.get(stringOfChar);
      scrabbleScore += letterValue;
    }
    return scrabbleScore;

  }
}
