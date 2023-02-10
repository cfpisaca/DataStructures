package lab2;

import java.util.Scanner;

public class NameConverter
{
    public static void main (String[] args)
    {
        Scanner scnr = new Scanner(System.in);
        String userInput = scnr.nextLine();

        int spaceOne;
        int spaceTwo;
        String fName;
        String mName;
        String lName;

        spaceOne = userInput.indexOf(" ");
        fName = userInput.substring(0,spaceOne);
        spaceTwo = userInput.indexOf(" ",spaceOne+1);

        if (spaceTwo < 0) {
            lName = userInput.substring(spaceOne+1,userInput.length());

            System.out.print(lName + ", " + fName.charAt(0) + ".");
        } else {
            mName = userInput.substring(spaceOne+1,spaceTwo);
            lName = userInput.substring(spaceTwo+1,userInput.length());

            System.out.print(lName + ", " + fName.charAt(0) + "." + mName.charAt(0) + ".");
        }
    }
}