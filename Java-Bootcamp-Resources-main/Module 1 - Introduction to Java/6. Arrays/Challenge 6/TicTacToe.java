import java.util.Arrays;
import java.util.Scanner;

public class TicTacToe {

    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {        
      System.out.println("\nLet's play tic tac toe");
      //Task 1: Create an array with three rows of '_' characters.
      char[][] board = {
        {'_', '_', '_'},
        {'_', '_', '_'},
        {'_', '_', '_'}
      };
      //Task 2: Call the function printBoard();
      printBoard(board);
      /*
      {  Task 3: Loop through turns.

      if (X) turn {
     Task 4: call askUser(). 
     Task 5: populate the board using askUser's return value.
      } else {
      Task 4: call askUser(). 
      Task 5: populate the board using askUser's return value. Then, print it.

                  }
                  
                Task 6 - Call the function.
                   if return value == 3 {
                     print: X wins and break the loop
                  } else if return value == -3 {
                     print: O wins and break the loop
                  }

              } 
              */
              for (int i = 0; i < 9; i++) {
                System.out.print("Turn: ");
                if (i % 2 == 0){
                  System.out.println("X");
                  int[] spot = askUser(board);
                  board[spot[0]][spot[1]] = 'X';
                  printBoard(board);
                } else {
                  System.out.println("O");
                  int[] spot = askUser(board);
                  board[spot[0]][spot[1]] = 'O';
                  printBoard(board);
                }
                
                if (checkWin(board) == 3) {
                  System.out.println("X wins!!");
                  break;
                } else if (checkWin(board) == -3) {
                  System.out.println("O wins!!");
                  break;
                } else if (checkWin(board) == 8) {
                  System.out.println("It's a tie!!");
                }
              }

            scan.close();
        }


    /** Task 2 - Write a function that prints the board.
     * Function name - printBoard()
     * @param board (char[][])
     * 
     * Inside the function:
     *   1. print a new line.
     *   2. print the board.
     *      • separate each row by two lines. 
     *      • each row precedes a tab of space
     *      • each character in the grid has one space from the other character
     */     
        public static void printBoard(char[][] board) {
          for (int i = 0; i < board.length; i++) {
            System.out.print("\n");
            for (int j = 0; j < board[i].length; j++) {
              System.out.print(board[i][j] + " ");
            }
            System.out.print("\n");
          }
        }
   /** Task 4 - Write a function that lets the user choose a spot
     * Function name – askUser
     * @param board (char[][] board)
     * @return spot (int[])
     * 
     * Inside the function
     *   1. Asks the user: - pick a row and column number: 
     *   2. Check if the spot is taken. If so, let the user choose again.
     *   3. Return the row and column in an int[] array.
     * 
     */
        private static int[] askUser(char[][] board) {
          System.out.println("pick a row and column number:");
          int row = scan.nextInt();
          int col = scan.nextInt();

          if (board[row][col] != '_'){
            System.out.println("Spot taken! Please try again");
            row = scan.nextInt();
            col = scan.nextInt();
          }

          int[] spot = {row, col};
          return spot;
        }
    /** Task 6 - Write a function that determines the winner
     * Function name - checkWin 
     * @param board (char[][])
     * @return count (int)
     * 
     * Inside the function:
     *   1. Make a count variable that starts at 0.
     *   2. Check every row for a straight X or straight O (Task 7).
     *   3. Check every column for a straight X or straight O (Task 8).
     *   4. Check the left diagonal for a straight X or straight O (Task 9).
     *   5. Check the right diagonal for a straight X or straight O (Task 10).
     */
        public static int checkWin(char[][] board) {
          int count = 0;
          for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
              if (board[i][j] == 'X') {
                 count++;
              } else if (board[i][j] == 'O'){
                 count--;
              }
            }
            if ((count == 3) || (count == -3)){
              return count;
            } else {
              count = 0;
            }
          }

          for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
              if (board[j][i] == 'X') {
                 count++;
              } else if (board[j][i] == 'O'){
                 count--;
              }
            }
            if ((count == 3) || (count == -3)){
              return count;
            } else {
              count = 0;
            }
          }

          for (int i = 0; i < 3; i++) {
            if (board[i][i] == 'X') {
              count++;
            } else if (board[i][i] == 'O'){
              count--;
            }
          }
          if ((count == 3) || (count == -3)){
            return count;
          } else {
            count = 0;
          }

          for (int i = 0; i < 3; i++) {
            if (board[i][2-i] == 'X') {
              count++;
            } else if (board[i][i] == 'O'){
              count--;
            }
          }
          if ((count == 3) || (count == -3)){
            return count;
          } else {
             count = 0;
          }

          return count;
        }
}
