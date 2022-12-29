import java.util.Scanner;

public class BlackJack {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to Java Casino");
        System.out.println("Do you have a knack for Black Jack?");
        System.out.println("We shall see...\n..Ready? Press anything to begin!");
        scan.nextLine();
        int draw1 = randomCard();
        int draw2 = randomCard();
        System.out.println("You get a\n" + drawRandomCard(draw1));
        System.out.println("and a \n" + drawRandomCard(draw2));
        int handValue = Math.min(draw1,10) + Math.min(draw2,10);
        System.out.println("Your hand value is : " + handValue);
        int dealerCard1 = randomCard();
        int dealerCard2 = randomCard();
        int dealerHandValue = Math.min(dealerCard1,10) + Math.min(dealerCard2,10);
        System.out.println("\nThe dealer shows \n" + drawRandomCard(dealerCard1) + "\n and has a card facing down \n" + faceDown());
        System.out.println("The dealer's total is hidden");
        System.out.println("Do you want to hit or stay?");
        String choice = scan.nextLine();    
        while (choice.equals("hit") || choice.equals("stay")) {
            while (choice.equals("hit")){
                draw1 = randomCard();
                System.out.println("You get a\n" + drawRandomCard(draw1));
                handValue += (Math.min(draw1,10));
                System.out.println("Your hand value is : " + handValue);
                if (handValue >= 21){
                    break;
                } 
                System.out.println("Do you want to hit or stay?");
                choice = scan.nextLine();
            } 
            while (choice.equals("stay")) {
                System.out.println("\nThe dealer shows \n" + drawRandomCard(dealerCard1) + "\n and has a \n" + drawRandomCard(dealerCard2));
                System.out.println("The dealer's hand value is : " + dealerHandValue);
                for (int i = dealerHandValue; i < 17; i += Math.min(dealerCard1,10)){
                    dealerCard1 = randomCard();
                    System.out.println("Dealer's turn!");
                    System.out.println("\nThe dealer shows \n" + drawRandomCard(dealerCard1));
                    System.out.println("The dealer's hand value is : " + dealerHandValue);
                }
                System.out.println("Dealer stays");
                    break;
            }
            if (((handValue > dealerHandValue) || (dealerHandValue >= 21)) && (handValue < 21)){
                System.out.println("You win, dealer lost");
                System.out.println("Your hand value: " + handValue + "\n Dealer's hand value: " + dealerHandValue);
                break;
            } else if ((dealerHandValue > handValue) || (handValue >= 21) && (dealerHandValue < 21)){
                System.out.println("You lost, dealer wins");
                System.out.println("Your hand value: " + handValue + "\nDealer's hand value: " + dealerHandValue);
                break;
            }
            System.out.println("Your turn!");  
            System.out.println("Do you want to hit or stay or done?");
            choice = scan.nextLine(); 
            if (choice.equals("done")) {
                System.out.println("Thank you for playing!!");
                break;
            }
        }
    }
    public static int randomCard() {
        int randomCard =(int) (Math.random()*13 +1);
        return (randomCard);
    }
    public static String faceDown() {
        return (
            " _____ \n" +
            "|     |\n" +
            "|  J  |\n" +
            "| JJJ |\n" +
            "|  J  |\n" +
            "|_____|\n" 
        );
        
    }
    public static String drawRandomCard(int numCard) {
            switch (numCard) {
                case 1:
                    return (
                    "   _____\n"+
                    "  |A _  |\n"+ 
                    "  | ( ) |\n"+
                    "  |(_'_)|\n"+
                    "  |  |  |\n"+
                    "  |____V|\n"
                    );
                case 2:
                    return (
                     "   _____\n"+
                     "  |2    |\n"+
                     "  |  o  |\n"+
                     "  |     |\n"+
                     "  |  o  |\n"+
                     "  |____Z|\n"
                    );
                case 3:
                    return (
                    "   _____\n" +
                    "  |3    |\n"+
                        "  | o o |\n"+
                    "  |     |\n"+
                    "  |  o  |\n"+
                    "  |____E|\n"
                    );
                case 4:
                    return (
                    "   _____\n" +
                    "  |4    |\n"+
                    "  | o o |\n"+
                    "  |     |\n"+
                    "  | o o |\n"+
                    "  |____h|\n"
                    );
                case 5:
                    return (
                     "   _____ \n" +
                     "  |5    |\n" +
                     "  | o o |\n" +
                     "  |  o  |\n" +
                     "  | o o |\n" +
                     "  |____S|\n"
                     );
                case 6:
                    return (
                    "   _____ \n" +
                    "  |6    |\n" +
                    "  | o o |\n" +
                    "  | o o |\n" +
                    "  | o o |\n" +
                    "  |____6|\n"
                    );
                case 7:
                    return (
                    "   _____ \n" +
                    "  |7    |\n" +
                    "  | o o |\n" +
                    "  |o o o|\n" +
                    "  | o o |\n" +
                    "  |____7|\n"
                    );
                case 8:
                    return (
                    "   _____ \n" +
                    "  |8    |\n" +
                    "  |o o o|\n" +
                    "  | o o |\n" +
                    "  |o o o|\n" +
                    "  |____8|\n"
                    );
                case 9:
                    return (
                    "   _____ \n" +
                    "  |9    |\n" +
                    "  |o o o|\n" +
                    "  |o o o|\n" +
                    "  |o o o|\n" +
                    "  |____9|\n"
                    );
                case 10:
                    return (
                    "   _____ \n" +
                    "  |10  o|\n" +
                    "  |o o o|\n" +
                    "  |o o o|\n" +
                    "  |o o o|\n" +
                    "  |___10|\n"
                    );
                case 11:
                    return (
                    "   _____\n" +
                    "  |J  ww|\n"+ 
                    "  | o {)|\n"+ 
                    "  |o o% |\n"+ 
                    "  | | % |\n"+ 
                    "  |__%%[|\n"
                    );
                case 12:
                    return (
                    "   _____\n" +
                    "  |Q  ww|\n"+ 
                    "  | o {(|\n"+ 
                    "  |o o%%|\n"+ 
                    "  | |%%%|\n"+ 
                    "  |_%%%O|\n"
                    );
                case 13: 
                    return (
                     "  _____\n"+
                    "  |K  WW|\n"+ 
                    "  | o {)|\n"+ 
                    "  |o o%%|\n"+ 
                    "  | |%%%|\n"+ 
                    "  |_%%%>|\n"
                    );
                default:
                return ("Invalid entry");
            }
    
    }
}
