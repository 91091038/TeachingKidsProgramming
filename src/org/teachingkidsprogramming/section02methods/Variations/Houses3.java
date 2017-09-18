package org.teachingkidsprogramming.section02methods.Variations;

import org.teachingextensions.logo.Tortoise;
import org.teachingextensions.logo.utils.ColorUtils.PenColors;
import org.teachingextensions.logo.utils.ColorUtils.PenColors.Reds;
import org.teachingextensions.virtualproctor.VirtualProctor;

public class Houses3
{
  public static void main(String[] args)
  {
    VirtualProctor.setClassName("Palm Digital");
    VirtualProctor.setName("Tharushi");
    Tortoise.show();
    Tortoise.setSpeed(5);
    Tortoise.setX(200);
    int height = 40;
    drawHousePointyRoof(height);
    drawHouseSlantedRoof(120);
    drawOddHouse(90);
    drawHousePointyRoof(20);
  }
  private static void drawHousePointyRoof(int height)
  {
    Tortoise.setPenColor(PenColors.getRandomColor());
    Tortoise.move(height);
    //start roof
    pointyRoof();
    //end roof
    Tortoise.move(height);
    Tortoise.turn(-90);
    Tortoise.move(40 + 10);
    Tortoise.turn(-90);
  }
  private static void drawHouseSlantedRoof(int height)
  {
    Tortoise.setPenColor(Reds.Red);
    Tortoise.move(height);
    slantedRoof();
    Tortoise.move(height);
    Tortoise.turn(-90);
    Tortoise.move(20);
    Tortoise.turn(-90);
  }
  private static void pointyRoof()
  {
    Tortoise.setPenWidth(4);
    Tortoise.turn(45);
    Tortoise.move(15);
    Tortoise.turn(90);
    Tortoise.move(15);
    Tortoise.turn(45);
  }
  private static void slantedRoof()
  {
    Tortoise.move(15);
    Tortoise.turn(120);
    Tortoise.move(30);
    Tortoise.turn(60);
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
