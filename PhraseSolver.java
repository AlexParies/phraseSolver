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

    boolean correct = false;
    while (!solved)
    {
      System.out.println("Frase: " + game.getSolvedPhrase());

      /* your code here - game logic */
      if (currentPlayer == 1){
        System.out.println(player1.getName() + ", guess letter/phrase");
      }
      else{
        System.out.println(player2.getName() + ", guess letter/phrase");
      }
      System.out.println("The value for this guess: " + game.getLetterValue());

      String currentGuess = input.nextLine();

      correct = game.guessLetter(currentGuess)
      solved = game.isSolved(currentGuess)

      if (correct) {
        if(currentPlayer == 1){
          player1.setScore(player1.getScore() + game.getLetterValue());
        }
        else{
          player2.setScore(player2.getScore() = game.getLetterValue());
        }
      }
      else if(!correct && !solved){
        if (currentPlayer == 1){
          currentPlayer =2;
        }
        else{
          currentPlayer =1;
        }
      }
      if(solved){
        System.out.println("game over");
        if (player1.getScore() > player2.getScore()){
          System.out.println(player1.getName() + "wins");
        }
        else if(player1.getScore() < player2.getScore()){
          System.out.println(player2.getName() + "wins");
        }
        else{
          System.out.print("its a tie");
        }
      }
      //reset letter value for next return
      game.setLetterValue();

      System.out.println(player1.getName() + " has " + player1.getScore());
      System.out.println(player2.getName() + " has " + player2.getScore());
    }

  }

}
