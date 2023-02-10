package hw4;

import java.util.Scanner;
import java.util.ArrayList;

public class StatDriver {

   public static void main(String[] args) {
      
      ArrayList<Double> data = new ArrayList<Double>();
     
      Scanner scnr = new Scanner(System.in); 
     
      while (scnr.hasNextDouble()) {
         data.add(scnr.nextDouble());
      }
      
      
     System.out.format("Mean: %.2f\n", Stats.mean(data));
     System.out.format("StdDev: %.2f\n", Stats.stdDev(data));
      
   }
}