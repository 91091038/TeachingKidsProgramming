package org.teachingkidsprogramming.section06modelviewcontroller;

import org.teachingextensions.logo.utils.EventUtils.MessageBox;

public class ExceptionalAdLibsVariation
{
  public static void main(String[] args)
  {
    String adverb = askAdverb();
    String edverb = askEdverb();
    String bodypart = askBodyPart();
  } //end of main
  private static String askAdverb()
  {
    String adverb = MessageBox.askForTextInput("Enter an adverb: ");
    if (adverb.isEmpty())
    {
      MessageBox.showMessage("You dun goofed! Enter an adverb.");
      askAdverb();
    }
    else if (adverb.matches("[\\d]*"))
    {
      MessageBox.showMessage("Numbers are not adverbs. Try again.");
      askAdverb();
    }
    return adverb;
  } //end of method
  private static String askEdverb()
  {
    String edverb = MessageBox.askForTextInput("Enter an ed-verb: ");
    if (edverb.isEmpty())
    {
      MessageBox.showMessage("You dun goofed! Enter an ed-verb.");
      askEdverb();
    }
    else if (edverb.matches("[\\d]*"))
    {
      MessageBox.showMessage("Numbers are not adverbs. You are not Bryan. Try again.");
      askEdverb();
    }
    return edverb;
  }
  private static String askBodyPart()
  {
    String bodypart = MessageBox.askForTextInput("Enter a body part: ");
    if (bodypart.isEmpty())
    {
      MessageBox.showMessage("You dun goofed! Enter an ed-verb: ");
    }
    else if (bodypart.matches("[\\d]*"))
    {
      MessageBox.showMessage("Numbers are not adverbs/ You are not Bryan. Try again");
      askBodyPart();
    }
    return bodypart;
  }
} //end of class
