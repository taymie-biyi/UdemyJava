public class MathOperations {
    public static void main(String[] args) {
        int bagOfSweets1 = 5;
        int bagOfSweets2 = 10;

        long starsInMilkyWay = 2500000000L;
        long starsInAndromeda = 1000000000000L;

        double testScores = 6.7;
        double bonusMarks = 2.5;

        // The addition operator '+'

        System.out.println("Fred and George collected " + (bagOfSweets1 + bagOfSweets2) + " sweets");
        System.out.println("There are " + (starsInMilkyWay + starsInAndromeda) + " stars in the Milky Way and Andromeda galaxies.");
        System.out.println("With bonus marks, Ron scored " + (testScores + bonusMarks) + "/10 on his potions test. Snape wasn't too thrilled");

        //The subtraction operator '-'

        System.out.println("Fred has  " + (bagOfSweets2 - bagOfSweets1) + " more sweets than George");
        System.out.println("The Andromeda Galaxy has " + (starsInAndromeda - starsInMilkyWay) + " more stars than the Milky Way");
        System.out.println("Snape ended up removing marks. Ron actually scored " + (testScores - bonusMarks) + " on his potions test");

        // The multiplication operator '*'

        System.out.println("Fred and George used a special spell to multiply their sweets to: " + (bagOfSweets1*bagOfSweets2));
        System.out.println("Snape made an error on his excel, accidentally multiplying Ron's score to: " + (testScores*bonusMarks) + "/10");

        // The division operator '/'

        System.out.println("Originally, Fred had " + (bagOfSweets2/bagOfSweets1) +" times more sweets than George");
        System.out.println("Andromeda has " + (starsInAndromeda/starsInMilkyWay) + " times more stars");
        System.out.println("Snape caught the error. Furious, he divided Ron's score to: " + (testScores/bonusMarks));

        // The modulus operator '%' - returns the remainder of a division

        System.out.println("10 is an even number, since dividing 10 by 2 has a remainder of: " + (10 % 2));
        System.out.println("5 is an odd number, since dividing 5 by 2 has a remainder of: " + (5 % 2));

        //The 'add one' operator, '++' - increases the value by 1

        int counter = 0;
        counter++;
        counter++;
        counter++;
        counter++;
        System.out.println("I count: " + counter);

        // The 'minus one' operator, '--' - decreases the value by 1
        
        counter--;
        counter--;
        counter--;
        counter--;
        System.out.println("I count: " + counter);

        // The 'add by' operator, '+=' - increases the value by the number on the right

        int passengers = 0;
        passengers += 9;
        System.out.println("I count: " + passengers);

        //The 'subtract by' operator, '-=' - decreases the value by the number on the right
        passengers -= 5;
        System.out.println("Some passengers got off at the next bus stop, now, there are " + passengers + " remaining in the bus.");
    }
}