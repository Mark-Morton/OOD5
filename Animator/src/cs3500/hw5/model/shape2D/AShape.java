package cs3500.hw5.model.shape2D;

import cs3500.hw5.model.Position2D;
import java.awt.Color;
import java.awt.geom.GeneralPath;
import java.awt.geom.Path2D;
import javax.swing.text.Position;

public abstract class AShape implements IShape {

  // the position located at the center of the shape
  private Position2D position;

  // the path that surrounds the shape
  private GeneralPath bounds;

  // the color of the shape
  private Color color;

  AShape(Position2D position, Color color) {
    this.position = position;
    this.color = color;
  }


  /**
   * Method outputs the position of the shape.
   *
   * @return The at the center of the shape.
   */
  @Override
  public Position2D getPosition() {
    return position;
  }

  /**
   * Method that shows what the Path2D that marks the boundary of the shape is.
   *
   * @return the boundary of the shape
   */
  @Override
  public GeneralPath getBounds() {
    return bounds;
  }

  /**
   * Method returns the color of the shape.
   *
   * @return teh shape's color.
   */
  @Override
  public Color getColor() {
    return color;
  }
}
