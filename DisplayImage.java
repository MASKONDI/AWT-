import java.awt.*;  
import java.applet.*;  
/*<applet code='DisplayImage.class' width='400'height='400' >
</applet>*/  
	  
public class DisplayImage extends Applet {  
  
  Image picture;  
  
  public void init() {  
    picture = getImage(getDocumentBase(),"pic 1.jpg");  
  }  
	    
  public void paint(Graphics g) {  
    g.drawImage(picture, 30,30, this);  
  }  
      
  }  
