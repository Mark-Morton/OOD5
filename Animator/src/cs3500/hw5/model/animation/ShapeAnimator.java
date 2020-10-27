package cs3500.hw5.model.animation;

import java.util.List;

public class ShapeAnimator {

  /**
   *
   */
  private ShapeTypes type;
  private List<Motion> motions;

  public enum ShapeTypes {
    rectangle,
    oval
  }
}
