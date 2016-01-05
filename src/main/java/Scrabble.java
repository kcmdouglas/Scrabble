import java.util.HashMap;

public class Scrabble {
  public static void main(String[] args) {}

  public String scrabbleScore(String userWord) {

    String[] scrabbleLetters = {"a"};
    Integer[] scrabbleValues = {1};


    // char result = userCharacters[0];
    // String charString = Character.toString(result);
    // String[] userLetters = {};
    String stringOfChar = "";
    for (Integer i = 0 ; i < userWord.length(); i++){
      char[] userCharacters = userWord.toCharArray();
      char result = userCharacters[i];
      stringOfChar = Character.toString(result);
      // return stringOfChar;
    }

    // for (Integer i = 0; i < userWord.length ; i++)
    // String[] stringUserChars = String.valueOf(userCharacters);



    return stringOfChar;




    // Integer total = 0;
    //   for (Integer value : scrabbleKey.get(stringUserChars)) {
    //     total = total + value;
    //   }
    // return total;
  }
}
