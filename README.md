# ArtistSales Application

## Overview
The ArtistSales application is a simple Java program designed to display sales data for popular music artists. Users can choose an artist to view their sales figures for CDs, DVDs, and Blu-rays for the year 2017. The application includes input validation and formatted output for a better user experience.

## Features
- Display sales data for five popular artists.
- View sales figures for CDs, DVDs, and Blu-rays.
- Input validation to ensure user selects a valid artist.
- Exception handling for non-integer inputs.
- Formatted output for improved readability.

## Artists Included
- Ed Sheeran
- Pink
- Bruno Mars
- Foo Fighters
- Taylor Swift

## Sales Data Structure
Sales data is stored in a 2D array, where each row corresponds to an artist and contains the sales figures for CDs, DVDs, and Blu-rays.

## Usage
1. Clone the repository:
   ```bash
   git clone https://github.com/HChristopherNaoyuki/artist-sales-app-java.git
   ```
2. Navigate to the project directory:
   ```bash
   cd ArtistSales
   ```
3. Compile and run the application:
   ```bash
   javac Solution/*.java
   java Solution.ArtistSalesApp
   ```

4. Follow the prompts to select an artist and view their sales data.

## Exception Handling
The application handles input mismatches gracefully, prompting the user to enter valid integer input if they enter anything else.
