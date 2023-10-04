import java.applet.Applet;
import java.awt.*;

public class SmileyFace extends Applet {

public void paint (Graphics g) {

g.setColor(Color.yellow); 
g.fillOval(28,20,158,150);// For face
g.setColor(Color.black);
g.fillOval(50,60,15,25);// Left Eye
g.setColor(Color.red);
g.fillOval(55,65,5,10);
g.setColor(Color.black);// Right Eye
g.fillOval(120,60,15,25);
g.setColor(Color.red);
g.fillOval(125,65,5,10);
g.setColor(Color.black);
int x[] ={95,85,106,95};
int y[] ={85,104,104,85};
g.drawPolygon(x, y, 4);
g.setColor(Color.red); 
 g.drawArc(55,95,78,50,0,-180); // Smile
g.drawArc(55,95,78,55,0,-180);// Nose
g.drawLine(50,122,60,116);
g.drawLine(128,118,140,128);  

}
}/* <applet code=SmileyFace width=700 height=500> 
  </applet>*/