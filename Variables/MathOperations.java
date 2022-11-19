public class MathOperations {
    public static void main(String[] args) {
        int bagOfSweets1 = 5;
        int bagOfSweets2 = 10;

        long starsInMilkyWay = 2500000000L;
        long starsInAndromeda = 1000000000000L;

        double testScores = 6.7;
        double bonusMarks = 2.5;

        System.out.println("Fred and George collected " + (bagOfSweets1 + bagOfSweets2) + " sweets");
        System.out.println("There are " + (starsInMilkyWay + starsInAndromeda) + " stars in the Milky Way and Andromeda galaxies.");
        System.out.println("With bonus marks, Ron scored " + (testScores + bonusMarks) + "/10 on his potions test. Snape wasn't too thrilled");

        System.out.println("Fred has  " + (bagOfSweets2 - bagOfSweets1) + " more sweets than George");
        System.out.println("The Andromeda Galaxy has " + (starsInAndromeda - starsInMilkyWay) + " more stars than the Milky Way");
        System.out.println("Snape ended up removing marks. Ron actually scored " + (testScores - bonusMarks) + " on his potions test");

        System.out.println("Fred and George used a special spell to multiply their sweets to: " + (bagOfSweets1*bagOfSweets2));
        System.out.println("Snape made an error on his excel, accidentally multiplying Ron's score to: " + (testScores*bonusMarks) + "/10");

        System.out.println("Originally, Fred had " + (bagOfSweets2/bagOfSweets1) +" times more sweets than George");
        System.out.println("Andromeda has " + (starsInAndromeda/starsInMilkyWay) + " times more stars");
        System.out.println("Snape caught the error. Furious, he divided Ron's score to: " + (testScores/bonusMarks));

    }
}
