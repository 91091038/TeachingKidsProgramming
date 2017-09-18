package org.teachingkidsprogramming.section02methods.Variations;

import org.teachingextensions.logo.Tortoise;
import org.teachingextensions.logo.utils.ColorUtils.PenColors;
import org.teachingextensions.virtualproctor.VirtualProctor;

public class Houses4
{
  public static void main(String[] args)
  {
    VirtualProctor.setClassName("Palm Digital");
    VirtualProctor.setName("Tharushi");
    Tortoise.show();
    Tortoise.setSpeed(3);
    Tortoise.setX(0);
    int height = 40;
    drawHouse(height);
    drawHouse(120);
    drawHouse(90);
    drawHouse(20);
  }
  private static void drawHouse(int height)
  {
    Tortoise.setPenColor(PenColors.getRandomColor());
    Tortoise.move(height);
    //start roof
    slantedRoof();
    //end roof
    Tortoise.move(height);
    Tortoise.turn(-90);
    Tortoise.move(20);
    Tortoise.turn(-90);
  }
  private static void slantedRoof()
  {
    Tortoise.move(15);
    Tortoise.turn(120);
    Tortoise.move(30);
    Tortoise.turn(60);
  }
}
