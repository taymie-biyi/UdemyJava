public class Championship {
    public static void main(String[] args) {

        int gryffindor = 300;    //gryffindor points
        int ravenclaw = 200;    //ravenclaw points

         int margin = gryffindor - ravenclaw;


        //If gryffindor wins by a margin of 300 points or more:
             //print: 
        if (margin >= 300) {
            System.out.println("Gryffindor takes the house cup!");
        } 

        //If gryffindor wins by a margin of any points or ties: 
            //print: In second place, Gryffindor!
            else if (margin >= 0) {
                System.out.println("In second place, Gryffindor!" + gryffindor);
            }
        //If gryffindor loses within 100 points, print:
            //print: In third place, Gryffindor!
            else if (margin >= -100) {
                System.out.println("In third place, Gryffindor!");
            }
        //else:
           //print: In fourth place, Gryffindor! 
            else {
                System.out.println("In fourth place, Gryffindor!");
            }
    }
}
