package Solution;

import java.util.Scanner;
import java.text.DecimalFormat;
import java.util.InputMismatchException;

public class ArtistSales
{
    // Array to store artist names
    private final String[] artistNames = {"Ed Sheeran", "Pink", "Bruno Mars", "Foo Fighters", "Taylor Swift"};

    // 2D Array to store CD, DVD, and Blu-ray sales for each artist
    private final int[][] salesData = {
        {900000, 800000, 500000},
        {700000, 500000, 500000},
        {800000, 100000, 50000},
        {100000, 200000, 200000},
        {300000, 100000, 50000}
    };

    // Method: displayArtistSales
    // Purpose: Allows the user to select an artist and displays their sales data
    public void displayArtistSales()
    {
        Scanner scanner = new Scanner(System.in);

        try
        {
            // Display formatted prompt message with border
            System.out.println("Enter a position (between 1 and 5) to view the artist’s CD, DVD and Blu Ray Sales for 2017:");
            System.out.println("*******************************************************************************************");

            int artistChoice = scanner.nextInt() - 1;  // Adjust for 0-based index

            // Validate input
            if (artistChoice >= 0 && artistChoice < artistNames.length)
            {
                printArtistSales(artistChoice);
            }
            else
            {
                System.out.println("Invalid input. Please enter a number between 1 and 5.");
            }
        }
        catch (InputMismatchException e)
        {
            // Handle non-integer input
            System.out.println("Invalid input. Please enter an integer number between 1 and 5.");
        }
        finally
        {
            scanner.close();
        }
    }

    // Method: printArtistSales
    // Purpose: Prints the selected artist's name, sales for each format, and total sales
    private void printArtistSales(int artistIndex)
    {
        String artistName = artistNames[artistIndex];
        int[] sales = salesData[artistIndex];
        
        // Calculate total sales
        int totalSales = sales[0] + sales[1] + sales[2];

        // Format for displaying sales with two decimal places
        DecimalFormat df = new DecimalFormat("#,###.00");

        // Display formatted artist sales information
        System.out.println("\n" + artistName.toUpperCase() + " was in position " + (artistIndex + 1) + " for 2017 sales.");
        System.out.println("CD SALES: " + df.format(sales[0]));
        System.out.println("DVD SALES: " + df.format(sales[1]));
        System.out.println("BLU RAY SALES: " + df.format(sales[2]));
        System.out.println("TOTAL: " + df.format(totalSales));
        System.out.println("*******************************************************************************************");
    }
}
