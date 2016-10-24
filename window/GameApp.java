import window.GameFrame;

/**
 * This class will run the game itself by creating a new frame for the game.
 * Features of Version 1.0:
 * The game is started by running this class.
 * Time spent on this class: 15 minutes.
 * @author Salar Hosseini & Sophia Weng
 * @version 5.0, June 12, 2014
 */ 
public class GameApp
{
  /**
   * This is the main method which will run the game.
   * @param args This is an array of Strings - the normal main method parameter.
   */ 
  public static void main (String [] args)
  {
    new GameFrame ();
  }
}