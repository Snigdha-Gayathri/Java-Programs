import java.util.*;
public class TwoDArr {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // Define the dimensions of the 2D array
        int numRows = 3;
        int numCols = 4;

        // Create a 2D array
        int[][] myArray = new int[numRows][numCols];

        // Initialize the array elements with values
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numCols; j++) {
                // Assign values to elements based on your requirements
                myArray[i][j] = sc.nextInt();
            }
        }

        // Print the 2D array
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numCols; j++) {
                System.out.print(myArray[i][j] + " ");
            }
            System.out.println(); // Move to the next row
        }
    }
}

    

