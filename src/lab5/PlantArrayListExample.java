package lab5;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class PlantArrayListExample
{
    // Method prints an ArrayList of objects
    public static void printArrayList(ArrayList<Plant> myGarden) {
        int i;

        for (i = 0; i < myGarden.size(); ++i) {
            myGarden.get(i).printInfo();
            System.out.println();
        }
    }


    public static void main(String[] args)
    {
        Scanner scnr = new Scanner(System.in);


        // TODO
        // Declare an ArrayList called myGarden to store Plant objects.
        // Note: Since Plant is the base class and Flower is the derived class,
        // the Arraylist declared to store Plant will be able to refer to  either Plant object or Flower object.
        // See the slide deck for Inheritance and polymorphism if you need to revise these concepts.

        ArrayList<Plant> myGarden = new ArrayList<Plant>(); //*

        String plantName, plantCost;
        String flowerName, flowerCost, colorOfFlowers;
        boolean isAnnual;
        String input = "";

        while(!input.equals("-1"))
        {

            if (input.equals("plant")) {
                //TO DO
                //instantiate a Plant object
                //take name input from user and set the name of the plant obect
                //take cost input from user and set the cost of the plant object
                //Add the plant object to the ArrayList myGarden
                Plant plants = new Plant();
                plantName = scnr.next();
                plantCost = scnr.next();

                plants.setPlantName(plantName);
                plants.setPlantCost(plantCost);

                myGarden.add(plants);

            }
            else if (input.equals("flower")) {
                //TO DO
                //instantiate a Flower object
                //take name input from user and set the name of the flower obect
                //take cost input from user and set the cost of the flower object
                //take input from the usr if flower is annual and set the isAnnual field of flower object
                //take color input from user and set the color field of the flower object
                //Add the flower object to the ArrayList myGarden
                Flower flowers = new Flower();
                flowerName = scnr.next();
                flowerCost = scnr.next();
                isAnnual = scnr.nextBoolean();
                colorOfFlowers = scnr.next();

                flowers.setPlantName(flowerName);
                flowers.setPlantCost(flowerCost);
                flowers.setPlantType(isAnnual);
                flowers.setColorOfFlowers(colorOfFlowers);

                myGarden.add(flowers);

            }
            input = scnr.next();
        }

        // TO DO: Call the method PrintArrayList to print myGarden

        printArrayList(myGarden);

    }
}
