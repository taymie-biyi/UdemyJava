public class BooleanComparisons {
    public static void main(String[] args) {
        // The greater than comparison, '>' and The less than comparison, '<'
        int chemistryGrade = 95;
        int biologyGrade = 75;
        int englishGrade = 75;

        System.out.println(biologyGrade > chemistryGrade);
        System.out.println(biologyGrade < chemistryGrade);

        double sales = 37.55;
        double costs = 5.55;

        System.out.println(sales > costs);
        System.out.println(sales < costs);

        //The greater than or equals to comparison,'>='  
        System.out.println(biologyGrade >= englishGrade);
        System.out.println(chemistryGrade >= englishGrade);

        //The less than or equal comparison,'<='
        System.out.println(biologyGrade <= englishGrade);
        System.out.println(chemistryGrade <= englishGrade);

        //The equals to operator, '=='
        System.out.println(biologyGrade == englishGrade);
        System.out.println(chemistryGrade == englishGrade);

        //The not equal comparison, "!="
        System.out.println(biologyGrade != englishGrade);
        System.out.println(chemistryGrade != englishGrade);

        /* Never use the equals to and not equals to operator to compare a string
         * The '=' is different from '=='
         * '==' is used for comparisons while '=' is used to assign values*/

    }
}
