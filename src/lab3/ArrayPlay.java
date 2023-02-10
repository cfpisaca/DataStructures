package lab3;

import java.util.Arrays;

public class ArrayPlay
{
    public static void main(String[] args)
    {
        // create an array
        int[] array;
        // or int array[]
        int size = 6;
        array = new int[size];

        System.out.println();
        // give values to elements in the created array
        for (int i = 0; i < array.length; i++)
        {
            array[i] = -1;
        }

        // print out elements in the created array
        for (int i = 0; i < array.length; i++)
        {
            System.out.println(array[i]);
        }

        System.out.println();
        // give values to elements in the created array
        for (int i = 0; i < array.length; i++)
        {
            array[i] = i;
        }

        // print out elements in the created array
        for (int i = 0; i < array.length; i++)
        {
            System.out.println(array[i]);
        }

        System.out.println();
        // give values to elements in the created array
        for (int i = 0; i < array.length; i++)
        {
            array[i] = 0;
        }

        // print out elements in the created array
        for (int i = 0; i < array.length; i++)
        {
            System.out.println(array[i]);
        }

        // Part 3
        System.out.println();
        Die dice = new Die();

        for (int i = 0; i < 100; i++)
        {
            int face = dice.roll();
            array[face-1]++;
        }

        for (int i = 0; i < 6; i++)
        {
            System.out.println((i+1) + " was rolled " + array[i] + " times.");
        }


        // Part 4
        System.out.println();
        double[] array1;
        double[] array2 = {10, 35, 43, 32, 1, 34, 34, 89, 91, 39};

        array1 = new double[10];

        System.out.println("Before");

        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));

        System.out.println();
        System.out.println("After");

        for (int i = 0; i < 10; i++)
        {
            array1[i] = array2[i];
        }

        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));

        System.out.println();
        System.out.println("After Change");

        array1[0] = 94.0;
        array2[3] = 83.1;

        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));
    }
}
   
   