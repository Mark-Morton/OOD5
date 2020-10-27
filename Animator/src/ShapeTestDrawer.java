import cs3500.hw5.model.Position2D;
import cs3500.hw5.model.shape2D.IShape;
import cs3500.hw5.model.shape2D.Oval;
import cs3500.hw5.model.shape2D.Rectangle;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.GeneralPath;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class ShapeTestDrawer extends JComponent {
  @Override
  public void paint(Graphics g) {
    Graphics2D g2 = (Graphics2D) g;

    IShape rectangle = new Rectangle(250, 250, new Position2D(200, 200), Color.BLACK);

    IShape oval = new Oval(250, 250, new Position2D(150, 200), Color.RED);

    IShape oval1 = new Oval(200, 50, new Position2D(200, 200), Color.BLUE);

    IShape oval2 = new Oval(200, 50, new Position2D(250, 200), Color.GREEN);

    GeneralPath path = oval.getBounds();
    GeneralPath path2 = rectangle.getBounds();
    GeneralPath path3 = oval1.getBounds();
    GeneralPath path4 = oval2.getBounds();

    g2.setPaint(rectangle.getColor());
    g2.fill(path2);
    g2.draw(path2);

    g2.setPaint(oval.getColor());
    g2.fill(path);
    g2.draw(path);

    g2.setPaint(oval1.getColor());
    g2.fill(path3);
    g2.draw(path3);

    g2.setPaint(oval2.getColor());
    g2.fill(path4);
    g2.draw(path4);

  }

  IShape rectangle = new Rectangle(100, 200, new Position2D(100, 100), Color.BLUE);
  public static void main(String[] args) {
    JFrame frame = new JFrame("Draw GeneralPath Demo");
    frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    frame.getContentPane().add(new ShapeTestDrawer());
    frame.pack();
    frame.setSize(new Dimension(400, 400));
    frame.setVisible(true);
  }
}