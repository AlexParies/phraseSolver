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

  Player(String inputName){
    name = inputName;
    score = 0;
    System.out.println("hi " + name);
  }
  /* your code here - accessor(s) */
  public String getName(){
    //incomplete
    return name;
  }
  public int getScore(){//incomplete
    return score;
  }
  /* your code here - mutator(s) */
  public void setName(String newName){
    name = newName;
  }
  public void setScore(int newScore){
    score = newScore;
  }
}
