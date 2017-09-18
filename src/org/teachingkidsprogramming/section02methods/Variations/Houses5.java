package org.teachingkidsprogramming.section02methods.Variations;

import org.teachingextensions.logo.Tortoise;
import org.teachingextensions.logo.utils.ColorUtils.PenColors;

public class Houses5
{
  public static void main(String[] args)
  {
    Tortoise.show();
    Tortoise.setSpeed(10);
    Tortoise.setX(200);
    int height = 40;
    drawHouse(height);
    drawHouse(120);
    drawHouse(90);
    drawHouse(20);
  }
  private static void drawHouse(int height)
  {
    drawOddHouse(height);
    //end roof shape
    Tortoise.move(height);
    Tortoise.turn(-90);
    Tortoise.move(40 + 10);
    Tortoise.turn(-90);
  }
  private static void drawOddHouse(int height)
  {
    Tortoise.setPenColor(PenColors.Oranges.Coral);
    Tortoise.move(height); //23 are the shape of the roof of the house
    Tortoise.turn(-45);
    Tortoise.move(30);
    Tortoise.turn(45);
    Tortoise.move(30);
    Tortoise.turn(90);
    Tortoise.move(90);
    Tortoise.turn(90);
    Tortoise.move(30);
    Tortoise.turn(45);
    Tortoise.move(30);
    Tortoise.turn(-45);
  }
}
