import java.util.Scanner; //Import scanner to enable user answer questions in real time

public class Survey {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);// to open the scanner

        System.out.println("Welcome. thank you for taking the survey!");

        System.out.println("What is your name?");
        String name = scan.nextLine(); // waits for user to enter a String value

        System.out.println("How much money do you spend on coffee?");
        double coffeePrice = scan.nextDouble(); // waits for user to enter a double value

        System.out.println("How much money do you spend on fast food?");
        double foodPrice = scan.nextDouble(); 

        System.out.println("How many times a week do you buy coffee?");
        int coffeeAmount = scan.nextInt(); // waits for user to enter an integer value

        System.out.println("How many times a week do you buy fast food?");
        int foodAmount = scan.nextInt();

        scan.close(); //To close the scanner
        
        double totalCoffee = coffeeAmount * coffeePrice;
        double totalFood = foodAmount * foodPrice;

        System.out.println("Hi " + name + ", since you spend $" + coffeePrice + " on coffee " + coffeeAmount + " times a week, and $" + foodPrice + " on food " + foodAmount + " times a week. This means that you spend a total of $" + totalCoffee + " on coffee, and a total of $" + totalFood + " on food.");

    }
}
