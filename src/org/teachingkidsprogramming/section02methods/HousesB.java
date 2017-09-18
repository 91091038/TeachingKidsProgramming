package org.teachingkidsprogramming.section02methods;

import org.teachingextensions.logo.Tortoise;
import org.teachingextensions.logo.utils.ColorUtils.PenColors.Reds;

public class HousesB
{
  public static void main(String[] args)
  {
    Tortoise.show();
    Tortoise.setSpeed(10);
    Tortoise.setX(100);
    int height = 40;
    drawHouseFlatRoof(height);
    drawHousePointyRoof(30);
    drawHouseFlatRoof(120);
    drawHousePointyRoof(150);
    drawHouseFlatRoof(20);
    drawHousePointyRoof(100);
    drawHouseFlatRoof(200);
    drawHouseSlantedRoof(75);
    //draw house slanted roof
  }
  //define a method called drawHouseSlantedRoof;
  private static void drawHouseSlantedRoof(int height)
  {
    Tortoise.setPenColor(Reds.Red);
    Tortoise.move(height);
    drawSlantedRoof();
    Tortoise.move(height);
    Tortoise.turn(-90);
    Tortoise.move(20);
    Tortoise.turn(-90);
  }
  private static void drawSlantedRoof()
  {
    Tortoise.move(15);
    Tortoise.turn(120);
    Tortoise.move(30);
    Tortoise.turn(60);
  }
  //define a method called drawSlantedRoof
  private static void drawHousePointyRoof(int height)
  {
    Tortoise.setPenColor(Reds.Red);
    Tortoise.move(height);
    drawPointyRoof();
    Tortoise.move(height);
    Tortoise.turn(-90);
    Tortoise.move(20);
    Tortoise.turn(-90);
  }
  private static void drawPointyRoof()
  {
    Tortoise.turn(45);
    Tortoise.move(15);
    Tortoise.turn(90);
    Tortoise.move(15);
    Tortoise.turn(45);
  }
  private static void drawHouseFlatRoof(int height)
  {
    Tortoise.setPenColor(Reds.Red);
    Tortoise.move(height);
    drawFlatRoof();
    Tortoise.move(height);
    Tortoise.turn(-90);
    Tortoise.move(20);
    Tortoise.turn(-90);
  }
  private static void drawFlatRoof()
  {
    Tortoise.turn(90);
    Tortoise.move(30);
    Tortoise.turn(90);
  }
}
