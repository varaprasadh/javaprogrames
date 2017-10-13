import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import java.applet.Applet;
import java.util.Scanner;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.Font;
/*<applet code = "Mover.java" height = 500 width=500></applet>*/
public class Mover extends Applet implements KeyListener{
int score=0,t,r=1;
int xdir=0 ,ydir=350;
int x=50,y=50;
Font f=new Font("SansSerif",Font.PLAIN+Font.BOLD,40);
public void init(){
 setBackground(Color.green);
 setForeground(Color.red);
 setFont(f);
 addKeyListener(this);
}
public void paint(Graphics g){

g.setColor(Color.black);
g.drawLine(0,350,200,350);
g.drawLine(0,400,250,400);
g.drawLine(200,350,200,100);
g.drawLine(250,400,250,150);
g.drawLine(200,100,500,100);
g.drawLine(250,150,500,150);
g.setColor(Color.black);
g.fillRect(0,350,250,50);
g.fillRect(200,100,50,250);
g.fillRect(200,100,300,50);
g.setColor(Color.blue);
g.fillRect(xdir,ydir,50,50);
g.setColor(Color.orange);
g.fillRect(380,280,70,150);
g.setColor(Color.pink);
g.fillOval(10,40,150,110);
g.setColor(Color.red);
g.drawString("MR.MOVER",220,30);
}
public void start(){
repaint();

}
public void keyPressed(KeyEvent ke){
int keycode=ke.getKeyCode();
if( ydir<=450 && xdir<=400){                                                        
if( (ydir==350&&xdir<=150) || (xdir==200 &&ydir>=100)|| (ydir==100 && xdir<=450&& xdir>=200))
{

if (keycode==KeyEvent.VK_UP){

ydir=ydir-y;
repaint();
t=1;
}
if(keycode==KeyEvent.VK_DOWN){

ydir=ydir+y;
repaint();
t=1;
}
if(keycode==KeyEvent.VK_LEFT){
xdir=xdir-x;
repaint();
t=1;
}
if(keycode==KeyEvent.VK_RIGHT){
xdir=xdir+x;
repaint();
t=1;
}
}}

else{ xdir=-50; ydir=350; r++; showStatus("round 2 started and score):-"+score);}
if(ydir==350 &&xdir>200){ t=0; xdir=200; repaint();}
if(xdir==200 &&(ydir<100 || ydir>350)){ t=0;ydir=100; repaint();}
if(ydir==100&& xdir<200){ xdir=200;t=0; repaint();} 
if((ydir==350 &&xdir==200)||(xdir==200&&ydir==100)||(ydir==100&&xdir==450)){ if(t==1){score +=50;} showStatus("round : "+r+"//your score is):-  "+score);if(t==0){showStatus("u cant raid on park");}}
}
public void keyReleased(KeyEvent ke){}
public void keyTyped(KeyEvent ke){}
}
