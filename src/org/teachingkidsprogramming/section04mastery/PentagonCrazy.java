package org.teachingkidsprogramming.section04mastery;

import org.teachingextensions.logo.Tortoise;
import org.teachingextensions.logo.utils.ColorUtils.ColorWheel;
import org.teachingextensions.logo.utils.ColorUtils.PenColors.Blues;
import org.teachingextensions.logo.utils.ColorUtils.PenColors.Purples;

public class PentagonCrazy
{
  public static void main(String[] args)
  {
    Tortoise.show();
    Tortoise.setSpeed(10);
    createColorPalette();
    //
    drawPentagon();
  }

  private static void drawPentagon()
  {
    for(int i = 0; i < 200; i++) {
      
    adjustPen();
      for(i = 0; i < 5; i++)
      {
       Tortoise.move(i);
      }
      
    Tortoise.turn(360/5);
    Tortoise.turn(1);
    }
  }

  private static void adjustPen()
  {
    int j = 1;
    Tortoise.setPenColor(ColorWheel.getNextColor());
    Tortoise.setPenWidth(j);
  //        If the tortoise's pen width is greater than 4, then --#17
    if(Tortoise.getPenWidth() > 4) {      
    Tortoise.setPenWidth(1);
    }
    j++;
  }

  private static void createColorPalette()
  {
    ColorWheel.addColor(Blues.SteelBlue);
    //    Add dark orchid to the color wheel --#11
    ColorWheel.addColor(Purples.DarkOrchid);
    //    Add dark slate blue to the color wheel --#12
    ColorWheel.addColor(Blues.DarkSlateBlue);
    //    Add teal to the color wheel --#13
    ColorWheel.addColor(Blues.Teal);
    //    Add indigo to the color wheel --#14
    ColorWheel.addColor(Purples.Indigo);
  }
}
