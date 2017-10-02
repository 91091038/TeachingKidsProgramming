package org.teachingkidsprogramming.section03ifs;

import java.util.Random;

import org.teachingextensions.logo.Sound;
import org.teachingextensions.logo.utils.EventUtils.MessageBox;

public class HiLow5
//let user decide the range
{
  public static void main(String[] args)
  {
    Random rand = new Random();
    int range = MessageBox.askForNumericalInput("What would you like your range to be?");
    int answer = rand.nextInt(range) + 1;
    int upperRange = range;
    for (int i = 1; i <= 8; i++)
    {
      int guess = MessageBox.askForNumericalInput("What is your guess?");
      //input validation
      while (guess < 1 || guess > upperRange)
      {
        MessageBox.showMessage("Please enter a valid number between 1 and " + upperRange);
        guess = MessageBox.askForNumericalInput("What is your guess?");
      }
      if (guess == answer)
      {
        Sound.playBeep();
        MessageBox.showMessage("You dun diddly did it!");
        break;
      }
      else if (guess > answer)
      {
        MessageBox.showMessage("Too high.");
      }
      else
      {
        MessageBox.showMessage("Too low.");
      }
      if (i == 8)
      {
        MessageBox.showMessage("You dun goofed!");
      }
    }
  }
}