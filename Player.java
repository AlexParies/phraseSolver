/*
 * Activity 2.5.2
 *
 * A Player class the PhraseSolverGame
 */
import java.util.Scanner;

public class Player
{
  /* your code here - attributes */
  private String name;
  private int score;
  /* your code here - constructor(s) */
  Player(){
    Scanner sc = new Scanner(System.in);
    System.out.println("What name");
    name = sc.nextLine();
    System.out.println("whelcome " + name);
    score = 0;
  }
  /* your code here - accessor(s) */

  /* your code here - mutator(s) */
}
