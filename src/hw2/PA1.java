package hw2;

import java.util.Scanner;

public class PA1 
{

   public static void main(String[] args) 
   {
      Scanner scnr = new Scanner(System.in);
      
      String comName; 
      String sciName;
      int circum;
      int cirFeet;
      int height;
      int larSpread;
      int smaSpread;
      int avgCrown;
      int total;
      
      System.out.print("Enter common name: ");
      comName = scnr.nextLine();
      
      System.out.print("Enter scientific name: ");
      sciName = scnr.nextLine();
      
      System.out.print("Enter the circumference in inches: ");
      circum = scnr.nextInt();
      
      System.out.print("Enter the height in feet: ");
      height = scnr.nextInt();
      
      System.out.print("Enter the largest crown spread in feet: ");
      larSpread = scnr.nextInt();
      
      System.out.print("Enter the smallest crown spread in feet: ");
      smaSpread = scnr.nextInt();
      
      avgCrown = (larSpread + smaSpread) / 2;
      cirFeet = circum / 12;
      
      total = circum + height + (avgCrown / 4);
    
      System.out.println(" ");
      System.out.println("Big Tree Report:\n");
      System.out.println("    Common Name: " + comName);
      System.out.println("Scientific Name: " + sciName + "\n");
      System.out.println("  Circumference: " + circum);
      System.out.println("         Height: " + height);
      System.out.println("  Average Crown: " + avgCrown + "\n");
      System.out.println("   Total Points: " + total);
   }
}
   
     
     
     
     
     
     