package lab8;

/*
* this class demos recursive methods.
* @ Author: Farzana Rahman
* @ Version: May 06, 2020
*/
public class RecursionTest
{  
   /*
   * This function calcuates bunny years.
   * We have a number of bunnies and each bunny has two big floppy ears. 
   * We want to compute the total number of ears across all the bunnies recursively 
   * (without loops or multiplication).
   *
   *Example input/output:
   *bunnyEars(0) → 0
   *bunnyEars(1) → 2
   *bunnyEars(2) → 4
   *
   */
   public static int bunnyEars(int bunnies) 
   {
      //COMPLETE THIS
      // Base case: if bunnies==0, just return 0.
      if (bunnies == 0) return 0;
      return 2 + bunnyEars(bunnies - 1);
      
     // Recursive case: otherwise, make a recursive call with bunnies-1
     // (towards the base case), and fix up what it returns.
    
   }
 
 
   
   /*
   * This method is a recursive method counting letter A or a in the given word
   * Note: You should make your method so it is case insensitive. It should treat
   * uppercase A and lowercase a as the same
   *
   *Example input/output:
   *countA("anastasia") → 4
   *countA("ANASTASIA") → 4
   *countA("bob") → 0
   *countA("") → 0
   *
   */
   public static int countA(String str) 
   {
      //COMPLETE THIS
      // Base case -- return simple answer
      
      if (str.length() == 0) {
         return 0;
      } else if (str.charAt(0) == 'a') {
         return 1 + countA(str.substring(1));
      } else {
         return countA(str.substring(1));
      }
      
      
      // Deal with the very front of the string (index 0) -- count "A" there.
      
      
      
      // Make a recursive call to deal with the rest of string (the part beyond the front).
      // Add count to whatever the recursive call returns to make the final answer.
      // Note that str.substring(1) starts with char 1 and goes to the
      // end of the string.
        
     
   }
   
   
   
   
   /* 
   * The fibonacci sequence is a famous bit of mathematics, and it happens to have 
   * a recursive definition. The first two values in the sequence are 0 and 1 
   * (essentially 2 base cases). Each subsequent value is the sum of the previous two 
   * values, so the whole sequence is: 0, 1, 1, 2, 3, 5, 8, 13, 21 and so on. 
   * Define a recursive fibonacci(n) method that returns the nth fibonacci number, 
   * with n=0 representing the start of the sequence.
   *
   * fibonacci(0) → 0
   * fibonacci(1) → 1
   * fibonacci(2) → 1
   *
   */
   public static int fibonacci(int n) 
   {
      //COMPLETE THIS
      // No direction provided. Think and come up with a solution.
      if (n == 0) return 0;
      if (n == 1 || n == 2) return 1;
      return fibonacci(n - 1) + fibonacci(n - 2);
      
  
   }

   
   
   public static void main(String[] args)
   {
      //uncomment the following to test bunnyEars() method
      System.out.println("bunnyEars(10) = " + bunnyEars(10)); // output should be 20
      
      
      //uncomment the following to test countA() method
      System.out.println("countA(anastasia)" + " = " + countA("anastasia")); // output should be 4
      System.out.println("countA()" + " = " + countA("")); // output should be 0
      
      
      //uncomment the following to test fibonacci() method
      System.out.println("fibonacci(2) = " + fibonacci(2)); // output should be 1
      System.out.println("fibonacci(9) = " + fibonacci(9)); // output should be 34


   }

   

}