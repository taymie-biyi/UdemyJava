public class IfElse {
    public static void main(String[] args) {
        int grade = 65;

        // If - Else Statement (comparing two statements)
        if (grade > 65) {
            System.out.println("Great job, you passed!");
        } else {
            System.out.println("Better luck next time!");
        }

        //If - Else If - Else statement (comparing 3 0r more conditions)
        if (grade >= 85) {
            System.out.println("Excellent! You got an A+.");
        } else if (grade >= 80) {
            System.out.println("Excellent! You got an A.");
        } else if (grade >= 75) {
            System.out.println("Very Good! You got a B+.");
        } else if (grade >= 70) {
            System.out.println("Very Good! You got a B.");
        } else if (grade >= 65) {
            System.out.println("Good! You got a C+.");
        } else if (grade >= 60) {
            System.out.println("Good! You got a C.");
        } else if (grade >= 55) {
            System.out.println("You got a D+.");
        } else if (grade >= 50) {
            System.out.println("You got a D.");
        } else {
            System.out.println("You got a F. Study hard next time!");
        }
    }
}
