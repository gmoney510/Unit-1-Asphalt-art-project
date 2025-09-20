import org.code.neighborhood.*;

public class NeighborhoodRunner {
  public static void main(String[] args) {
    
//BackgroundPainter Painting
BackgroundPainter bg = new BackgroundPainter(); 

    bg.setPaint(144);
    bg.paintBackground("LightCyan");
    
// SandPainter Painting
SandPainter sp = new SandPainter();
  sp.turnRight();
  sp.moveFast();
  sp.turnLeft();
  sp.setPaint(36);
  sp.paintSand("Wheat");
  sp.turnLeft();
  sp.move();
// OceanPainter Painting
OceanPainter op = new OceanPainter();
  
  op.setPaint(24);
  op.paintOcean("DodgerBlue");

SunPainter sun = new SunPainter();
  sun.setPaint(4);
  sun.paintSun("Yellow");
  

    


    
  }
}