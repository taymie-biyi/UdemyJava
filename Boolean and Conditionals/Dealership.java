import java.util.Scanner;
public class Dealership {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome to the Java Dealership");
        System.out.println(" . Select option 'a' to buy a car");
        System.out.println(" . Select option 'b' to sell a car");
        String option = scan.nextLine();

        switch (option) {
            case "a": 
                System.out.println("What is your budget?");
                int budget = scan.nextInt();
                    if (budget >= 10000) {
                        System.out.println("\nGreat! A Nissan Altima is available");
                        System.out.println("\nDo you have insurance? Write 'yes' or 'no'");
                        scan.nextLine();
                        String insurance = scan.nextLine();
                        System.out.println("\nDo you have a driver's license? write 'yes' or 'no'");
                        String license = scan.nextLine();
                        System.out.print("\nWhat is your credit score?\n");
                        int creditScore = scan.nextInt();

                            if (insurance.equals("yes") && license.equals("yes") && creditScore >= 660) {
                                System.out.println("\nSold! Pleasure doing business with you");
                            } else {
                                System.out.println("\nWe're sorry. You're not eligible");
                            }
                    } else {
                        System.out.println("\nWe don't sell cars under $10,000. Sorry!");
                    }
            break;
            case "b": 
                System.out.println("\nWhat is your car value at?");
                int value = scan.nextInt();
                System.out.println("\nWhat is your selling price?");
                int price = scan.nextInt();

                    if (value > price && price < 30000) {
                        System.out.println("\nWe will buy your car. Pleasure doing business with you");
                    } else {
                        System.out.println("\nSorry, we're not interested!");
                    }
            break;
            default: System.out.println("invalid option");
        }

        scan.close();
    }
}
