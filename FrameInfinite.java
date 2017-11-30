import java.awt.*;
import java.applet.Applet;
import java.util.Random;
/*<applet code="Dailoges.java" width=500 height=500></applet>*/
public class FrameInfinite extends Applet{
	public void init(){
        for(;;){
        	new Framer("hello");

        }
	}
	public void paint(Graphics g){}
	public void start(){
		repaint();
	}
}
class Framer extends Frame{
	Random Rand=new Random();
	public Framer(String Title){
		super(Title);
		setLocation(Rand.nextInt(500),Rand.nextInt(400));
		setVisible(true);
	}
}