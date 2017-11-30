import java.awt.*;
import java.applet.*;
import java.util.Random;
import java.awt.Font;
/*<applet code="Banne.java" width=500 height=500></applet>*/

public class Banner extends Applet implements Runnable{
Thread t;
String text=" enjoy this awsome morning";

char ch;

public void init()
{
	setBackground(Color.yellow);
   Random rand=new Random();
	t=new Thread(this);
}
public void start(){

	t.start();
}
public void run(){
	while(true){
     try{
     	  repaint();
     	 
    
          t.sleep(300);
     }

     catch(InterruptedException e){}
	}
}
public void paint(Graphics g){
	ch=text.charAt(0);
	text=text.substring(1,text.length());
	text+=""+ch;
     g.setFont(new Font("sans",Font.BOLD,100));
	g.setColor(new Color(200,100,150));
  //  g.setColor(new Color(rand.nextInt(255),rand.nextInt(255),rand.nextInt(255)));
	g.drawString(text,0,200);
	//////////////////////////////////
}

}