import java.util.Arrays;
import java.util.Scanner;


public class Hangman {

    public static String[] words = {"ant", "baboon", "badger", "bat", "bear", "beaver", "camel",
    "cat", "clam", "cobra", "cougar", "coyote", "crow", "deer",
    "dog", "donkey", "duck", "eagle", "ferret", "fox", "frog", "goat",
    "goose", "hawk", "lion", "lizard", "llama", "mole", "monkey", "moose",
    "mouse", "mule", "newt", "otter", "owl", "panda", "parrot", "pigeon", 
    "python", "rabbit", "ram", "rat", "raven","rhino", "salmon", "seal",
    "shark", "sheep", "skunk", "sloth", "snake", "spider", "stork", "swan",
    "tiger", "toad", "trout", "turkey", "turtle", "weasel", "whale", "wolf",
    "wombat", "zebra"};

    public static String randomWord(String[] words) {
        int rand = (int) (words.length * Math.random());
        String randomWord = words[rand];
        return randomWord;
    }

    public static void printPlaceHolders(char[] placeholders) {
        for (int i = 0; i < placeholders.length; i++) {
            System.out.print(placeholders[i] + " ");
        }
        System.out.println("\n");
    }

    public static boolean checkGuess(String word, char guess) {
        for (int i = 0; i < word.length(); i++){
            if (word.charAt(i) == guess){
                return  true;
            }
        }
        return false;
    }

    public static void PrintMissedGuess(char[] missedGuess) {
        for (int i = 0; i < missedGuess.length; i++) {
            System.out.print(missedGuess[i]);
        }
    }

    public static void UpdateplaceHolders(String word, char guess, char[] placeholders) {
        for (int i = 0; i < placeholders.length; i++){
            if (word.charAt(i) == guess){
                placeholders[i] = guess;
            }
        }
    }

    public static String[] gallows = {
    "+---+\n" +
    "|   |\n" +
    "    |\n" +
    "    |\n" +
    "    |\n" +
    "    |\n" +
    "=========\n",

    "+---+\n" +
    "|   |\n" +
    "O   |\n" +
    "    |\n" +
    "    |\n" +
    "    |\n" +
    "=========\n",

    "+---+\n" +
    "|   |\n" +
    "O   |\n" +
    "|   |\n" +
    "    |\n" +
    "    |\n" +
    "=========\n",

    " +---+\n" +
    " |   |\n" +
    " O   |\n" +
    "/|   |\n" +
    "     |\n" +
    "     |\n" +
    " =========\n",

    " +---+\n" +
    " |   |\n" +
    " O   |\n" +
    "/|\\  |\n" + //if you were wondering, the only way to print '\' is with a trailing escape character, which also happens to be '\'
    "     |\n" +
    "     |\n" +
    " =========\n",

    " +---+\n" +
    " |   |\n" +
    " O   |\n" +
    "/|\\  |\n" +
    "/    |\n" +
    "     |\n" +
    " =========\n",

    " +---+\n" +
    " |   |\n" +
    " O   |\n" +
    "/|\\  |\n" + 
    "/ \\  |\n" +
    "     |\n" +
    " =========\n"};

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = randomWord(words);

        char[] placeholders = new char[word.length()];
        for (int i = 0; i < placeholders.length; i++) {
            placeholders[i] = '_';
        }

        int misses = 0;
        char[] missedGuess = new char[6];
        
        while (misses < 6){
            System.out.println(gallows[misses]);
            System.out.print("Word: ");
            printPlaceHolders(placeholders);
            
            System.out.print("Misses: ");
            PrintMissedGuess(missedGuess);
            System.out.println("\n");

            if (Arrays.equals(word.toCharArray(), placeholders)){
                System.out.println("Good Work!!");
                break;
            }

            System.out.println("Guess: ");
            char guess = scan.nextLine().charAt(0);

            if (checkGuess(word, guess)){
                UpdateplaceHolders(word, guess, placeholders);
            } else {
                missedGuess[misses] = guess;
                misses++;
            }
        }
        if (misses == 6){
            System.out.println(gallows[misses]);
            System.out.println("You lost! Better Luck next time.");
            System.out.println("The word was: " + word);
        }
    }

}





