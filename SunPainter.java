import org.code.neighborhood.*;

public class SunPainter extends PainterPlus {

  // Paints a sun
  public void paintSun(String color) {
    // moves foward 10 times
    move();
    move();
    move();
    move();
    move();
    move();
    move();
    move();
    move();
    move();
    while (hasPaint()) {
      move();
      paint(color);
      turnLeft();
      turnLeft();
      turnLeft();
    }
  }
  
}
