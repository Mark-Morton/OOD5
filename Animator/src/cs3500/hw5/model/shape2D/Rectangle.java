package cs3500.hw5.model.shape2D;

import cs3500.hw5.model.Position2D;
import java.awt.geom.GeneralPath;
import java.awt.Color;
public class Rectangle implements IShape {

  // the position located at the center of the shape
  private Position2D position;

  // the path that surrounds the shape
  private GeneralPath bounds;

  // the color of the shape
  private Color color;

  // height of rectangle
  private int height;

  // width of the rectangle
  private int width;

  /**
   * Constructor to make a Rectangle.
   *
   * @param height height of Rectangle
   * @param width width of Rectangle
   * @param position center position of Rectangle
   * @param color color of Rectangle
   */
  public Rectangle(int height, int width, Position2D position, Color color) {
    this.position = position;
    this.color = color;
    this.height = height;
    this.width = width;
    this.bounds = this.makeRectanglePath();
  }

  private GeneralPath makeRectanglePath() {
    double x = position.getX();
    double y = position.getY();
    double[] xPoints = {x - width/2, x + width/2,  x + width/2,  x - width/2};
    double[] yPoints = {y - height/2, y - height/2, y + height/2, y + height/2};

    GeneralPath path = new GeneralPath(GeneralPath.WIND_EVEN_ODD,
        xPoints.length);
    path.moveTo(xPoints[0], yPoints[0]);
    for (int i = 1; i < xPoints.length; i++) {
      path.lineTo(xPoints[i], yPoints[i]);
    }
    path.closePath();
    return path;
  }


  @Override
  public Position2D getPosition() {
    return this.position;
  }


  @Override
  public GeneralPath getBounds() {
    return this.bounds;
  }

  @Override
  public Color getColor() {
    return this.color;
  }
}
