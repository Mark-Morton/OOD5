package cs3500.hw5.model.animation;

import java.util.ArrayList;
import javax.swing.event.MenuDragMouseListener;

public class Motion {

  String shapeName;

  ShapeState start;

  ShapeState end;

  public Motion(String shapeName, ShapeState start, ShapeState end) {
    this.shapeName = shapeName;
    this.end = end;
    this.start = start;

  }

  // interpolate frames by seeing how long an action would take and how big the corresponding
  // integer change would be.

}
