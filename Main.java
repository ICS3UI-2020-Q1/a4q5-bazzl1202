import java.util.Scanner;
/**
 * Asks user for intger and prints out Hailstone sequence
 * @author Liana Bazzarella
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // create scanner for user input
    Scanner input = new Scanner(System.in);

    // ask the user for an integer
    System.out.println("Please enter a positive integer to see the hailstone sequence.");
    int integer = input.nextInt();

    // tells the user the hailstone sequence is starting
    System.out.println("Hailstone sequence is the following:");
    System.out.println(integer);

    // hailstone sequence operations
    while(integer > 1){
      if( integer%2 == 0){
      integer = integer/2;
      System.out.println(integer);
    } else if( integer%2 == 1){
      integer = 3*integer + 1;
      System.out.println(integer);
    }
    }
  
  }
}
