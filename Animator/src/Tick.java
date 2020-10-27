import cs3500.hw5.model.shape2D.IShape;
import java.util.HashMap;

public class Tick {
  private HashMap<String, IShape> shapes;
  private int t;

  Tick(int time) {
    this.t = time;
  }

  public void addShape(String name, IShape shape) {
    shapes.put(name, shape);
  }

  public IShape getShape(String shapeName) {
    return shapes.get(shapeName);
  }
}
