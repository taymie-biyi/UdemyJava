import java.util.Arrays;

public class Prices {
    public static void main(String[] args) {
        //Task 1 - Create a 2D array that can store 3 rows and 5 columns of double values.
        // Task 2 - Populate your 2D array with values from the table (see article)
        double[][] prices = {
            {12.99,8.99, 9.99, 10.49, 11.99},
            {0.99, 1.99, 2.49, 1.49, 2.99},
            {8.99, 7.99, 9.49, 9.99, 10.99}
        };
        // Task 3 - Print the prices for each department. See the article for the expected output.  
        System.out.print("Baking: " );
        for (int i = 0; i < prices[0].length; i++){
            System.out.print(prices[0][i] + " ");
        }
        System.out.print("\n");

        System.out.print("Beverage: " );
        for (int i = 0; i < prices[1].length; i++){
            System.out.print(prices[1][i] + " ");
        }
        System.out.print("\n");

        System.out.print("Cereals: " );
        for (int i = 0; i < prices[2].length; i++){
            System.out.print(prices[2][i] + " ");
        }
        System.out.print("\n");

    }

}