import java.awt.*;
import java.applet.Applet;
import java.awt.event.*;
/*<applet code="Snack.java" width=600 height=500></applet>*/
 class Snake{
  int height=10;
  int width=10;
  
}


 public class Snack extends Applet implements Runnable,KeyListener{
    Thread t;
    Snake s[]=new Snake[10];
    int dx=5,dy=5;
    int x=100,y=250;
    int xleft=-1,xright=1,ydown=-1,yup=-1;
    public void init(){
      setBackground(Color.black);
      addKeyListener(this);

    }
    public void paint(Graphics g){
      g.setColor(Color.white);

      for(int i=0;i<10;i++){
      g.fillRect(x+i*10,y,s[i].width,s[i].height);
      }
    }
    public void start(){
      t=new Thread(this);
      t.start();
    }
    public void run(){
      for(;;){
        try{
          repaint();

        if(xright>0){x=x+dx;}
        if(xleft>0){x=x-dx;}



         if(ydown>0){y += dy;}
         if(yup>0){
           y-=dy; }


          t.sleep(100);
          if(x>600)
          x=0;

        }
        catch(InterruptedException e){}
      }
    }
 public void keyPressed(KeyEvent ke){
  if(ke.getKeyCode()==ke.VK_UP){
     yup=1;
     ydown=xright=xleft=-1;
     repaint();

  }
  if(ke.getKeyCode()==ke.VK_DOWN){
    ydown=1;
    yup=xright=xleft=-1;
    repaint();

  }
  if(ke.getKeyCode()==ke.VK_RIGHT){
    xright=1;
    xleft=ydown=yup=-1;
    repaint();

  }
  if(ke.getKeyCode()==ke.VK_LEFT){
    xleft=1;
    xright=yup=ydown=-1;
    repaint();

  }
 }
 public void keyReleased(KeyEvent ke){}
 public void keyTyped(KeyEvent ke){}
}
