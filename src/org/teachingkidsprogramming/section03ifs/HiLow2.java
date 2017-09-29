package org.teachingkidsprogramming.section03ifs;

import java.util.Random;

// this variation tells the user how many guesses they have left

import org.teachingextensions.logo.Sound;
import org.teachingextensions.logo.utils.EventUtils.MessageBox;

public class HiLow2
{
  public static void main(String[] args)
  {
    Random rand = new Random();
    int answer = rand.nextInt(100) + 1;
    int tries = 8;
    for (int i = 1; i <= tries; i++)
    {
      int guess = MessageBox.askForNumericalInput("What is your guess?");
      //do this if the user wins the game
      if (guess == answer)
      {
        Sound.playBeep();
        MessageBox.showMessage("You dun diddly did it!");
        break;
      }
      //inform the user if their guess is too high
      else if (guess > answer)
      {
        MessageBox.showMessage("Too high.");
      }
      //inform the user if their guess is too low
      else
      {
        MessageBox.showMessage("Too low.");
      }
      //tests how many tries user has left
      if (i == tries)
      {
        MessageBox.showMessage("You dun goofed!");
      }
      MessageBox.showMessage("You have " + (tries - i) + " guesses left.");
    }
  }
}