import java.util.HashMap;

public class Scrabble {
  public static void main(String[] args) {}

  public String scrabbleScore(String userWord) {

    String[] scrabbleLetters = {"a"};
    Integer[] scrabbleValues = {1};

    char[] userCharacters = userWord.toCharArray();
    char result = userCharacters[0];
    String charString = Character.toString(result);

    return charString;
    // String[] userLetter = {};
    // for (String characterLetter : Character.toString(userCharacters)){
    //   userLetter.add(characterLetter);
    // }
    // String[] stringUserChars = String.valueOf(userCharacters);


    // Integer total = 0;
    //   for (Integer value : scrabbleKey.get(stringUserChars)) {
    //     total = total + value;
    //   }
    // return total;
  }
}
