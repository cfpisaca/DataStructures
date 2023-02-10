package hw5;

import java.util.Date;

public class Patron {
   public String name;
   public String email;
   public int idNumber;
   public double balance;
   
   public Patron(String name, String email, int idNumber, double balance) {
      this.name = name;
      this.email = email;
      this.idNumber = idNumber;
      this.balance = balance;
   }
   
   public double adjustBalance(double amount) { 
      return this.balance = this.balance + amount;
   }
   
    public boolean equals (Patron nPatron)
    {
        return this.idNumber == nPatron.idNumber;
    }
    public boolean equals (double inputIdNum)
    {
        return this.idNumber == inputIdNum;
    }

   
   public String toString() {
      return String.format("Name: %s, Email: %s, ID: %d, Balance: $%.2f.", name, email, idNumber, balance);
   } 
}