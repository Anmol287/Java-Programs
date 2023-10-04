import java.applet.Applet;
import java.awt.*;

public class polygon extends Applet {
    int x[]={20,45,75,65,35};
    int y[]={75,45,75,100,100};

    public void paint(Graphics g){
        g.drawPolygon(x,y,5);
    }
    
}
/*
 * <applet code="polygon.class" width="300" height="300">
 * </applet>
 */
