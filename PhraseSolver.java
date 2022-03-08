/*
 * Activity 2.5.2
 *
 *  The PhraseSolver class the PhraseSolverGam
 */
import java.util.Scanner;

public class PhraseSolver
{
  /* your code here - attributes */
  private Player player1;
  private Player player2;
  private Board game;
  private boolean solved;
  /* your code here - constructor(s) */
  PhraseSolver(){
    player1 = new Player();
    player2 = new Player();
    game = new Board();
    solved = false;

  }
  /* your code here - accessor(s) */

  /* your code here - mutator(s)  */

  public void play()
  {
    boolean solved = false;
    int currentPlayer = 1;

    Scanner input = new Scanner(System.in);

    boolean correct = true;
    while (!solved)
    {

      /* your code here - game logic */
      if (currentPlayer == 1){
        System.out.println(player1.getName());
      }
      else{
        System.out.println(player2.getName());
      }
      System.out.println(game.getSgetSolvedPhrase());
      System.out.println(game.getLgetLetterValue());

      /* your code here - determine how game ends */
      solved = true;
    }

  }

}
