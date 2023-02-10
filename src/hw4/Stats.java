package hw4;

import java.util.ArrayList;
import java.lang.Math;

public class Stats {
   
   public static Double mean(ArrayList<Double> meanInput) {
      Double total = 0.0;
      
      if (meanInput == null || meanInput.size() < 0) {
         return Double.NaN; 
      } else {
         for (Double i : meanInput) {
            total += i;
         }
      }
      
      return total / (meanInput.size());
   }
   
   public static Double stdDev(ArrayList<Double> stdInput) {
      Double total = 0.0;
      Double mean = mean(stdInput);
      
      if (stdInput == null || stdInput.size() < 0) {
         return Double.NaN; 
      } else { 
         for (Double i : stdInput) {
            total += (Math.pow((i - mean), 2));
         }
      }
      
      return Math.sqrt(total / stdInput.size());
   }

}