package cs3500.hw5.model.shape2D;

import cs3500.hw5.model.Position2D;
import java.awt.Color;
import java.util.Scanner;

public class ShapeFactory {

  public static IShape createShape(String shape) {
    Scanner s = new Scanner(shape);
    String shapeType = s.next();
    switch (shape) {
      case "rectangle":
        return new Rectangle(s.nextInt(), s.nextInt(), new Position2D(s.nextInt(), s.nextInt()),
            new Color(s.nextInt(), s.nextInt(), s.nextInt()));
      case "oval":
        return new Oval(s.nextInt(), s.nextInt(), new Position2D(s.nextInt(), s.nextInt()),
            new Color(s.nextInt(), s.nextInt(), s.nextInt()));
      default:
        throw new IllegalArgumentException("must say valid shape");
    }
  }
}
