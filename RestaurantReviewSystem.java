/*
 * Restaurant Review System
 *
 * Group Members:
 * Brandon Diaz-Perez
 * Brendan Hulse
 * Pranav Vadibel
 *
 * CPSC 39
 * 7/15/26
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class RestaurantReviewSystem
{
    public static void main(String[] args)
    {
        ArrayList<Restaurant> restaurants = new ArrayList<>();

        try
        {
            Scanner file = new Scanner(new File("restaurant-data.csv"));

            // Skip header row
            file.nextLine();

            while (file.hasNextLine())
            {
                String line = file.nextLine();

                // TODO:
                // Split the CSV line into fields.
                // Hint: There are 8 columns.

                // Restaurant
                String restaurantName = "";
                String cuisine = "";
                double rating = 0;

                // Menu Item
                String menuItemName = "";
                String category = "";
                double price = 0;
                int calories = 0;

                //Brendan Hulse
                String[] data = line.split(",");

                // Ingredient String
                String ingredientData = "";

                //---------------------------------------------------
                // TODO:
                // Parse the line and assign values to the variables.
                //---------------------------------------------------

                //---------------------------------------------------
                // TODO:
                // Search the ArrayList to determine whether this
                // restaurant already exists.
                //---------------------------------------------------

                Restaurant restaurant = null;

                //---------------------------------------------------
                // TODO:
                // If the restaurant does not exist,
                // create it and add it to the ArrayList.
                //---------------------------------------------------

                //---------------------------------------------------
                // TODO:
                // Create the MenuItem object.
                //---------------------------------------------------

                MenuItem menuItem = null;

                //---------------------------------------------------
                // TODO:
                // Split the ingredient string using ';'
                //---------------------------------------------------

                // Example:
                // String[] ingredients = ingredientData.split(";");

                //---------------------------------------------------
                // TODO:
                // For each ingredient:
                //
                // Split using "|"
                //
                // Example:
                // String[] data = ingredient.split("\\|");
                //
                // data[0] = ingredient name
                // data[1] = allergen (true/false)
                // data[2] = allergen type
                //
                // Create an Ingredient object.
                // Add it to the MenuItem.
                //---------------------------------------------------


                //---------------------------------------------------
                // TODO:
                // Add the MenuItem to the Restaurant.
                //---------------------------------------------------

            }

            file.close();

        }
        catch (FileNotFoundException e)
        {
            System.out.println("Could not open file.");
        }

        //-------------------------------------------------------
        // Display all restaurants
        //-------------------------------------------------------

        for (Restaurant restaurant : restaurants)
        {
            System.out.println(restaurant);
            System.out.println();
        }

        //-------------------------------------------------------
        // Group Algorithms
        //-------------------------------------------------------

        averageMenuPrice(restaurants);

        highestPricedMenuItem(restaurants);

        lowestPricedMenuItem(restaurants);

        // Choose ONE challenge algorithm

        // averageCalories(restaurants);
        // searchAllergens(restaurants);
        // highestRatedRestaurant(restaurants);
        // menuItemWithMostIngredients(restaurants);
        // menuItemsUnderPrice(restaurants, 10.00);

    }


    //=========================================================
    // Group Algorithms
    //=========================================================

    public static void averageMenuPrice(ArrayList<Restaurant> restaurants)
    {
        // TODO
    }

    public static void highestPricedMenuItem(ArrayList<Restaurant> restaurants)
    {
        // TODO
    }

    public static void lowestPricedMenuItem(ArrayList<Restaurant> restaurants)
    {
        // TODO
    }

    //---------------------------------------------------------
    // Challenge Algorithms (Choose ONE)
    //---------------------------------------------------------

    public static void averageCalories(ArrayList<Restaurant> restaurants)
    {

    }

    public static void searchAllergens(ArrayList<Restaurant> restaurants)
    {

    }

    public static void highestRatedRestaurant(ArrayList<Restaurant> restaurants)
    {

    }

    public static void menuItemWithMostIngredients(ArrayList<Restaurant> restaurants)
    {

    }

    public static void menuItemsUnderPrice(ArrayList<Restaurant> restaurants,
                                           double price)
    {

    }

}
```
