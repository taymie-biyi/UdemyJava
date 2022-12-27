import java.util.Scanner;

public class WhileLoops {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Pick a number");
        int yourNum = scan.nextInt();
        int compNum = (int) (Math.random() * 6);

        while (compNum > yourNum) {
            System.out.println("You lose. My number was " + compNum + ", but you chose " + yourNum);
            System.out.println("You lost. Let's play again! \n Pick a number");
            yourNum = scan.nextInt();
        } 
        System.out.println("Your Number: " + yourNum + " My number : " + compNum);
    }
}
