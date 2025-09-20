import org.code.neighborhood.*;
public class OceanPainter extends PainterPlus {

  // Paints ocean
   public void paintOcean(String color) {
 {
  turnRight();
  move();
  move();
  move();
  move();
  move();
  move();
  move();
  move();
  turnLeft();   
  turnToEast();
  paintRow(color);
  turnLeft();
  move();
  turnLeft();
  paintRow(color);
    
  
    }
   }
// Paints row
  public void paintRow(String color) {
    //checks if the painter can move
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
  
  // Turns west
  public void turnToWest() {
    if (isFacingEast()) {
      turnRight();
      
      if (canMove()){
        move();
      }
      
      turnRight();
    }
  }
}
  
