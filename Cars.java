import java.awt.*;
import java.awt.event.*;
import java.applet.Applet;
import java.util.Random;
/*<applet code="Cars.java" width=500 height=500 ></applet>*/

public class Cars extends Applet implements Runnable{
Thread t;
Font f=new Font("SansSerif",Font.BOLD+Font.PLAIN,20);
boolean ms=true;
Random r =new Random();
String msg="",winner="";
int x1=10,x2=10,x3=10; 
int x1s=2,x2s=2,x3s=2;
public void init(){
setBackground(Color.green);
setFont(f);
//setStroke(10);

}
public void start(){
 t= new Thread(this);
t.start();

}
public void run(){
while(x1<450&&x2<450&&x3<450){
  try{
      x1s=r.nextInt(5);
      x2s=r.nextInt(5);
      x3s=r.nextInt(5);
     repaint();
    t.sleep(100);
    x1=x1+x1s;
    x2=x2+x2s;
    x3=x3+x3s;
  ms=true;
  }
  catch(InterruptedException e){}
  msg="mr."+lead(x1,x2,x3)+"...is in 1St postion now";
}
ms=false;
winner="mr."+lead(x1,x2,x3)+" Won The Race";
repaint();
}
public String lead(int x1, int x2,int x3){
String a="RED",b="BLUE",c="YELLOW",m="";
if(x1>x2 &&x1>x3){return m=""+a;}
if(x2>x1 && x2>x3){return m=""+b;}
if(x3>x1&&x3>x2){ return  m=""+c;}
return m;
}


public void paint(Graphics g){
g.setColor(new Color(100,150,180));
g.drawString("WELCOME TO THE CAR RACE!",50,50);
g.setColor(Color.black);
g.fillRect(0,200,500,150);
g.setColor(Color.white);
g.drawLine(0,200,500,200); //deviders
g.drawLine(0,250,500,250);
g.drawLine(0,300,500,300);
g.drawLine(0,350,500,350); 
g.drawLine(450,200,450,350); //end line
g.drawLine(60,200,60,350); //start line
g.setColor(Color.red);
g.fillRect(x1,210,30,30);   //cars
g.setColor(Color.blue);
g.fillRect(x2,260,30,30);
g.setColor(Color.orange);
g.fillRect(x3,310,30,30);
g.setColor(Color.gray);
if(ms){g.drawString(msg,60,150);}
if(!ms){g.drawString(winner,60,150);}
}

}
