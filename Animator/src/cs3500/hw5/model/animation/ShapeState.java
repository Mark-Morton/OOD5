package cs3500.hw5.model.animation;

import java.util.ArrayList;
import java.util.List;

public class ShapeState {

  List<Integer> values;

  public ShapeState(List<Integer> values) {
    this.values = values;
  }

  public ShapeState(int t, int x, int y, int w, int h, int r, int g, int b) {
    this.values = new ArrayList<>();
    this.values.add(t);
    this.values.add(x);
    this.values.add(y);
    this.values.add(w);
    this.values.add(h);
    this.values.add(r);
    this.values.add(g);
    this.values.add(b);
  }

  // Make a setter and getter for each value.

}
