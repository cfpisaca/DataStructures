package lab2;

import java.util.Scanner;
/**********************************************************************
 * Class purpose: Produce Star patterns demonstrating nested loops
 *
 * @author  Farzana Rahman
 * @version V2 06/02/2020
 *********************************************************************/

public class Stars
{
    /******************************************************************
     * Function purpose:  Prints star pattern
     *
     * @param args Command line arguments, ignored
     *****************************************************************/

    public static void main (String[] args)
    {
        char     hiPattern;  // pattern count
        int      maxRows;    // maximum number of rows to print
        int      starCnt;    // Stars per row
        int      blnkCnt;    // Blanks preceding the stars
        Scanner  stdIn;      // standard input

        stdIn = new Scanner(System.in);
        System.out.print("Enter positive number for the number of rows: ");

        maxRows = stdIn.nextInt();

        //**************************************************
        // First Example, stars per row goes from 1 to maxRow
        //**************************************************
        System.out.println();
        System.out.println("GIVEN example\n");
        for (int row = 1; row <= maxRows; row++)
        {
            starCnt = row;
            for (int star = 1; star <= starCnt; star++)
            {
                System.out.print ("*");
            }
            System.out.println();
        }

        //*******************************************************
        // Insert code for patterns (A), (B), (C) below.
        //*******************************************************

        System.out.println();
        System.out.println("Pattern A\n");
        for (int row = maxRows; row >= 1; row--)
        {
            starCnt = row;
            for (int star = starCnt; star >= 1; star--)
            {
                System.out.print ("*");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("Pattern B\n");
        int countb = 0;
        for (int row = maxRows; row >= 1; row--)
        {
            countb += 1;
            starCnt = row;
            for (int star = starCnt; star >= 1; star--)
            {
                System.out.print(" ");
            }
            for (int i = countb; i > 0; i--) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("Pattern C\n");
        int countc = maxRows+1;
        for (int row = 1; row <= maxRows; row++)
        {
            countc -= 1;
            starCnt = row;
            for (int star = 1; star <= starCnt; star++)
            {
                System.out.print (" ");
            }
            for (int i = countc; i > 0; i--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
