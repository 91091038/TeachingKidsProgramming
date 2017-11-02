package org.teachingkidsprogramming.section04mastery;

import org.teachingextensions.logo.Tortoise;
import org.teachingextensions.logo.utils.ColorUtils.ColorWheel;
import org.teachingextensions.logo.utils.ColorUtils.PenColors.Greens;
import org.teachingextensions.logo.utils.ColorUtils.PenColors.Reds;
import org.teachingkidsprogramming.recipes.quizzes.graders.PentagonCrazyQuizGrader;
import org.teachingkidsprogramming.recipes.quizzes.graders.PentagonQuizAdapter;

public class PentagonCrazyQuiz extends PentagonQuizAdapter
{
  public void question1()
  {
    //  Question 1 
    //  createAStitch (recipe below) 
    createAStitch();
  }
  private void createAStitch()
  {
    //  ------------- Recipe for createAStitch
    Tortoise.move(6);
    //  ------------- End of createAStitch recipe
  }
  @Override
  public void question2()
  {
    for (int i = 0; i < 76; i++)
    {
      sewAStitch();
    }
  }
  @Override
  public void question3()
  {
    ColorWheel.addColor(Greens.Lime);
  }
  @Override
  public void question4()
  {
    ColorWheel.addColor(Reds.Red);
  }
  public static void main(String[] args)
  {
    new PentagonCrazyQuizGrader().grade(new PentagonCrazyQuiz());
  }
}
