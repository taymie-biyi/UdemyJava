public class LogicalOperators {
    public static void main(String[] args) {
        //Logical Operator - Using many comparisions into one condition

        //The OR Operator (comparison1 || comparison2)
        int chemistryGrade = 76;
        int englishGrade = 65;

        String language = "Java";

        if (chemistryGrade >75 || englishGrade > 75 || language.equals("Java")) {
            System.out.println("Congratulations, You got the scholarship!");
        } else {
            System.out.println("We're sorry, you didn't get the scholarship.");
        }

        // The AND Operator (Comparison1 && Comparison2)
        int credits = 56;
        double GPA = 3.2;

        if (credits >= 40 && GPA > 2.0) {
            System.out.println("You earned your diploma");
        } else {
            System.out.println("Sorry, you need at least 40 credits and a minimum of 2.0 GPA");
        }
    }
}
