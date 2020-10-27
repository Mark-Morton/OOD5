package cs3500.hw5.model.shape2D;

import cs3500.hw5.model.Position2D;
import java.awt.Color;
import java.awt.Shape;
import java.awt.geom.GeneralPath;

public interface IShape {

  /**
   * Method outputs the position of the shape.
   *
   * @return The at the center of the shape.
   */
  public Position2D getPosition();

  /**
   * Method that shows what the Path2D that marks the boundary of the shape is.
   *
   * @return the boundary of the shape
   */
  public GeneralPath getBounds();


  /**
   * Method returns the color of the shape.
   *
   * @return the shape's color.
   */
  public Color getColor();



}
