import java.util.Scanner; //Import scanner to enable user answer questions in real time

public class Survey {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);// to open the scanner

        int counter = 0; //To count the number of questions we are asking the user

        System.out.println("\nWelcome, thank you for taking the survey!");

        System.out.println("\nWhat is your name?");
        String name = scan.nextLine(); // waits for user to enter a String value
        counter ++; //adds one for every question asked

        System.out.println("\nHow much money do you spend on coffee?");
        double coffeePrice = scan.nextDouble(); // waits for user to enter a double value
        counter ++;

        System.out.println("\nHow much money do you spend on fast food?");
        double foodPrice = scan.nextDouble(); 
        counter ++;

        System.out.println("\nHow many times a week do you buy coffee?");
        int coffeeAmount = scan.nextInt(); // waits for user to enter an integer value
        counter ++;

        System.out.println("\nHow many times a week do you buy fast food?");
        int foodAmount = scan.nextInt();
        counter ++;

        scan.close(); //To close the scanner
        
        double totalCoffee = coffeeAmount * coffeePrice;
        double totalFood = foodAmount * foodPrice;

        System.out.println("\n\nHi " + name + ",thank you for taking the time to filling out our survey and answering all " + counter +" questions. \n\nFrom your response, since you spend $" + coffeePrice + " on coffee " + coffeeAmount + " times a week, and $" + foodPrice + " on food " + foodAmount + " times a week. \n\nThis means that you spend a total of $" + totalCoffee + " on coffee, and a total of $" + totalFood + " on food.");

        // '\n' starts a new line in terminal
    }
}
