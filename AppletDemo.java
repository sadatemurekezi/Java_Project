import java. applet.*;
import java.awt.*;

/*<applet code=AppletDemo width=400 height=600>
  </applet>  */

 class AppletDemo extends Applet
{

        public void init()
        {
		setBackground(Color.black);
		setForeground(Color.yellow);	
	}
        public void paint(Graphics g)
        {
           g.drawString("Welcome to Applets",40,40);
        }


}