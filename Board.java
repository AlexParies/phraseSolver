/*
 * Activity 2.5.2
 *
 * A Board class the PhraseSolverGam
 */
import java.util.Scanner;
import java.io.File;

public class  Board
{
  private String solvedPhrase;
  private String phrase;
  private int currentLetterValue;

  /* your code here - constructor(s) */
  Board(){
    solvedPhrase = "";
    phrase = loadPhrase();
    setLetterValue();
    System.out.println("Phrase: " + phrase); //test code
    System.out.println("SolvedPhrase: " + solvedPhrase); //more test code
  }
  /* your code here - accessor(s) */
  public int getLetterValue(){
    //incomplete
    return currentLetterValue;
  }
  public String getSolvedPhrase(){
    //incomplete
    return solvedPhrase;
  }
  public String getPhrase(){
    //incomplete
    return phrase;
  }
  /* your code here - mutator(s)  */


  /* ---------- provided code, do not modify ---------- */
  public void setLetterValue()
  {
    int randomInt = (int) ((Math.random() * 10) + 1) * 100;
    currentLetterValue = randomInt;
  }

  public boolean isSolved(String guess)
  {
    if (phrase.equals(guess))
    {
      return true;
    }
    return false;
  }

  private String loadPhrase()
  {
    String tempPhrase = "";

    int numOfLines = 0;
    try
    {
      Scanner sc = new Scanner(new File("phrases.txt"));
      while (sc.hasNextLine())
      {
        tempPhrase = sc.nextLine().trim();
        numOfLines++;
      }
    } catch(Exception e) { System.out.println("Error reading or parsing phrases.txt"); }

		int randomInt = (int) ((Math.random() * numOfLines) + 1);

    try
    {
      int count = 0;
      Scanner sc = new Scanner(new File("phrases.txt"));
      while (sc.hasNextLine())
      {
        count++;
        String temp = sc.nextLine().trim();
        if (count == randomInt)
        {
          tempPhrase = temp;
        }
      }
    } catch (Exception e) { System.out.println("Error reading or parsing phrases.txt"); }

    for (int i = 0; i < tempPhrase.length(); i++)
    {
      if (tempPhrase.substring(i, i + 1).equals(" "))
      {
        solvedPhrase += "  ";
      }
      else
      {
        solvedPhrase += "_ ";
      }
    }

    return tempPhrase;
  }
/*
goes through the phrase
if the phrase equals the guessLetter
found letter and add to guessLetter
else {
  find a new one
}

*/
  public boolean guessLetter(String guess)
  {
    boolean foundLetter = false;
    String newSolvedPhrase = "";

    for (int i = 0; i < phrase.length(); i++)
    {
      if (phrase.substring(i, i + 1).equals(guess))
      {
        newSolvedPhrase += guess + " ";
        foundLetter = true;
      }
      else
      {
        newSolvedPhrase += solvedPhrase.substring(i * 2, i * 2 + 1) + " ";
      }
    }
    solvedPhrase = newSolvedPhrase;
    return foundLetter;
  }
}
