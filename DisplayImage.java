import java.awt.*;  
import java.applet.*;  

public class DisplayImage extends Applet {
  Image picture;  
  
  public void init() {  
    picture = getImage(getDocumentBase(),"sonoo.jpg");  
  }  
    
  public void paint(Graphics g) {  
    g.drawImage(picture, 70,60, this);  
  }  
      
  /*  
  <applet code="DisplayImage.class" width="300" height="300">  
  </applet>
  */
  }
