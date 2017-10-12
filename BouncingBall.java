import java.applet.Applet;
import java.awt.Color;
import java.awt.color.*;
import java.awt.Graphics;
import java.util.Random;

/*<Applet Code ="BouncingBall.java" Width=500 Height=500></Applet>*/
public class BouncingBall extends Applet implements Runnable{
        Random r=new Random();
	Thread t;
	int x=0,y=250,x1=450,y1=250;
	int xspeed=5,yspeed=5,x1speed=5,y1speed=5;
	
	public void init(){
                setSize(500,500);
		setBackground(Color.black);
		
	}
	public void paint(Graphics g){
		g.setColor(Color.yellow);
		g.fillOval(x,y,50,50);
                g.setColor(Color.blue);
                g.fillOval(x1,y1,50,50);
	}
        public void update(){
          xspeed=r.nextInt(10);
          yspeed=r.nextInt(10);
        
 
        }
       public void updates(){
           x1speed=r.nextInt(10);
          y1speed=r.nextInt(10);
         
      }
	public void start(){
	    t=new Thread(this);
		t.start();
	}
	public void run(){
		for(;;){
			repaint();
		try{ t.sleep(50);
		x=x+xspeed;
		y=y+yspeed;
                x1=x1-x1speed;
                y1=y1-y1speed;
		if(x>=450||y>=450){
                      
                          update();
			  xspeed=-1*xspeed;
                          yspeed=-1*yspeed;
                     
		}
                if(y1<0||x1<0){
                        updates();
                        y1speed=-1*y1speed;
                         x1speed=-1*x1speed;
                     
              }
                if(x<0||y<0){
                          update();
                          xspeed=-1*xspeed*-1;
                          yspeed=-1*yspeed*-1;
                        
                  }
                if(x1>450||y1>450){
                        updates();
                        y1speed=-1*y1speed*-1;
                        x1speed=-1*x1speed*-1;
                      
              }
                 if(x1-50==x && y1-50==y||x+50==x1&&y+50==y1){
                   update();
                   updates();
                }
			
		}
		catch(InterruptedException e){}
	}}
	

}

