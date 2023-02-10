package hw3;

public class WordGuess {

   public static String makeUserWord(String theWord) {
      
      String starWord = "";
      
      for (int i = 0; i < theWord.length(); i++) {
         starWord = starWord + '*';   
      }
      
      return starWord;
   }
   
   public static boolean isInWord(char guess, String theWord) {
      
      for (int i = 0; i < theWord.length(); i++) {
         if (theWord.charAt(i) == guess) {
            return true;     
         } 
      }
      
      return false;
   }
   
   public static String updateUserWord(char guess, String userWord, String theWord) {
      
      for (int i = 0; i < theWord.length(); i++) {
         if (theWord.charAt(i) == guess) {
            userWord = userWord.substring(0, i) + guess + userWord.substring(i + 1);
         }
      }
     
      return userWord; 
   }
   
   public static String updateGuesses(String guesses, char guess) { 
      int count;   
         
      count = 0;
      for (int i = 0; i < guesses.length(); i++) {
         if (guesses.charAt(i) == guess) {
            count++;
         }
      }
      
      if (count == 0) {
         guesses = guesses + guess;
      }
      
      return guesses;
   }
   
   public static String displayUserWord(String userWord) {
   
      userWord = userWord.replace("*","_");
      userWord = userWord.replace("", " ").trim();
      
      return userWord;
   }
   
   public static String displayGuesses(int strikes, String guesses) {
      
      guesses = guesses.replace("", " ").trim();
      
      String s = String.format("Strikes: %d\tGuesses: %s", strikes, guesses);
    
      return s;
   }
}
