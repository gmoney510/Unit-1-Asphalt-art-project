import org.code.neighborhood.*;

public class PainterPlus extends Painter {

  // Turns the Painter to the right
  public void turnRight() {
    turnLeft();
    turnLeft();
    turnLeft();
  }

  // Turns the Painter to around 180 degrees
  public void turnAround() {
    turnLeft();
    turnLeft();
  }

  // Takes all paint from a paint bucket
  public void takeAllPaint() {
    while (isOnBucket()) {
      takePaint();
    }
  }

  // Moves forward while a Painter object can move
  public void moveFast() {
    while (canMove()) {
      move();
    }
  }

// Paints and moves while the Painter object has paint
  public void paintToEmpty(String color) {
    while (hasPaint()) {
      paint(color);
      move();
    }
  }

  // Moves, turns, and paints in a donut shape
  public void paintDonut(String color) {
    while (hasPaint()) {
      move();
      turnRight();
      paint(color);
      move();
      paint(color);
    }
  }
  
}