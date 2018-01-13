import java.util.Random;
import java.awt.*;
import java.applet.Applet;
import java.awt.event.*;
/*<applet code="FloppyBird.java" width=600 height=500></applet>*/
  public class FloppyBird extends Applet implements KeyListener, Runnable{
  Thread t;
  int i;
  int wallx[] ={200,350,600};
  int wally[]={300,200,150};
  int wally1[]={400,300,250};
  int wdx=5,sleep=100;
  int score=0;
  int birdy=200,birdx=50,bdy=10;
  boolean startflag=false;
  boolean gameend=false;
  public void init(){
    setBackground(Color.black);
    addKeyListener(this);

  }
  public void paint(Graphics g){
    if(!startflag){
      g.setFont(new Font("sans",Font.BOLD,30));
      setBackground(Color.yellow);
      g.setColor(Color.magenta);
      g.drawString("Floppy - the game!",200,250);
      
    }
   else if(gameend){
       setBackground(Color.yellow);
       g.setColor(Color.red);
       g.setFont(new Font("sans",Font.BOLD,30));
       g.drawString("game over!",200,250);
       g.drawString("your score :"+(score-1),250,300);
       removeKeyListener(this);
     }
    else{
      setBackground(Color.black);
    for(i=0;i<3;i++)
    {
      if((birdx+50)==wallx[i] && (birdy<wally[i] ||  birdy>wally[i] && (birdy+50)>wally1[i] || birdy>500)){
       gameend=true;
       repaint();
       t.stop();
    }
      if(wallx[i]==0)
      { wallx[i]=600;
      }
    if((birdx+50==wallx[i])){ score++; }
    g.setColor(Color.white);
    g.fillRect(wallx[i],0,20,wally[i]);
    g.fillRect(wallx[i],wally1[i],20,600);
    }
   g.setColor(Color.green);
   g.fillRect(birdx,birdy,50,50);
   }
}
  public void start(){
    t=new Thread(this);
    }
    public void run()
    {
      for(;;)
      {
        try
        {
        t.sleep(sleep);
        for(i=0;i<3;i++){   wallx[i] -= wdx;}
        if(startflag){ birdy += 10; }
        repaint();
      }
      catch(InterruptedException e){}
  }
}
   public void keyPressed(KeyEvent ke){
    startflag=true;
    if(ke.getKeyCode() ==ke.VK_SPACE){
    birdy -= 50;
    showStatus("game started! and your score is:"+score);
    t.start();
    repaint();
  }
}
public void keyReleased(KeyEvent ke){  }
public void keyTyped(KeyEvent ke){  }
}
