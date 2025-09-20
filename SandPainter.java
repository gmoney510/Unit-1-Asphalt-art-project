import org.code.neighborhood.*;
public class SandPainter extends PainterPlus {

  // Paints the sand
   public void paintSand(String color) {
 {
      turnToEast();
      paintRow(color);
      turnLeft();
      move();
      turnLeft();
      paintRow(color);
      turnRight();
      move();
      turnRight();
      paintRow(color);
  
    }
   }
// Paints row for sand
  public void paintRow(String color) {
while (canMove()) {
      paint(color);
      move();
    }
    paint(color);
    
  }

  
    
   


// Turns east
public void turnToEast() {
    if (isFacingWest()) {
      turnLeft();
      
      if (canMove()){
        move();
      }
      
      turnLeft();
    }
  }
  
  // Turn west
  public void turnToWest() {
    // checks if painter is facing east
    if (isFacingEast()) {
      turnRight();
      
      if (canMove()){
        move();
      }
      
      turnRight();
    }
  }
}
  
