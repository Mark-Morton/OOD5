package cs3500.hw5.model.shape2D;
import cs3500.hw5.model.Position2D;
import java.awt.Color;
import java.awt.geom.Ellipse2D;
import java.awt.geom.GeneralPath;

public class Oval implements IShape {

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
   * Constructor to make an Oval.
   *
   * @param height height of oval
   * @param width width of oval
   * @param position center position of oval
   * @param color color of oval
   */
  public Oval(int height, int width, Position2D position, Color color) {
    this.position = position;
    this.color = color;
    this.height = height;
    this.width = width;
    this.bounds = this.makeOvularPath();
  }

  private GeneralPath makeOvularPath() {
    double x = position.getX() - width / 2;
    double y = position.getY() - height / 2;
    GeneralPath path = new GeneralPath(new Ellipse2D.Double(x, y, width, height));
    path.closePath();
    return path;
  }

  /**
   * Method outputs the position of the shape.
   *
   * @return The at the center of the shape.
   */
  @Override
  public Position2D getPosition() {
    return this.position;
  }

  /**
   * Method that shows what the Path2D that marks the boundary of the shape is.
   *
   * @return the boundary of the shape
   */
  @Override
  public GeneralPath getBounds() {
    return this.bounds;
  }

  /**
   * Method returns the color of the shape.
   *
   * @return teh shape's color.
   */
  @Override
  public Color getColor() {
    return this.color;
  }
}
