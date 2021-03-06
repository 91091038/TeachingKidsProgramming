package org.teachingkidsprogramming.section02methods.Variations;

import org.teachingextensions.logo.Tortoise;

public class Houses7
{
  public static void main(String[] args)
  {
    Tortoise.show();
    Tortoise.setSpeed(10);
    Tortoise.setX(0);
    int height = 40;
    drawHouse(height);
    drawHouse(120);
    drawHouse(90);
    drawHouse(20);
  }
  private static void drawHouse(int height)
  {
    drawRoundHouse(height);
    //end roof shape
    Tortoise.move(height);
    Tortoise.turn(-90);
    Tortoise.move(40);
    Tortoise.turn(-90);
  }
  private static void drawRoundHouse(int height)
  {
    Tortoise.move(height);
    for (int i = 0; i < 1440; i++)
    {
      Tortoise.turn(.125);
      Tortoise.move(.25);
    }
  }
}
