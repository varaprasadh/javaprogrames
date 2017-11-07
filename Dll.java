import java.awt.*;
import java.applet.*;
/*<applet code="Dll" width=900 height=900>
</applet>
*/
public class Dll extends Applet implements Runnable
{
   Thread t;
   Font f;
   String msg="";
   public void init()
   {
    //  f=new Font("CASTELLER",2,20);
     setBackground(Color.pink);
   }
   public void start()
   {
      t=new Thread(this);
      t.start();
   }
   public void run()
   {
     repaint();
   }
  public void paint(Graphics g)
  { 
    g.setColor(Color.gray); 
    g.setFont(new Font("CASTELLER",2,30));
    g.drawString("Double Link List",100,30);
    
    try{Thread.sleep(1000);}
    catch(InterruptedException ie){}
    g.setColor(Color.blue); 
    g.setFont(new Font("CASTELLER",2,15));
    g.drawRect(130,70,60,20);
    g.drawLine(170,70,170,90);
    g.drawLine(150,70,150,90);
   
    try{Thread.sleep(1000);}
    catch(InterruptedException ie){}
    g.drawString("10",153,85);
   
    try{Thread.sleep(1000);}
    catch(InterruptedException ie){}
    g.drawLine(185,75,230,75);
    g.drawOval(184,74,2,2);
    g.drawLine(190,85,235,85);
    g.drawOval(236,84,2,2);
    g.fillOval(236,84,2,2); 
   
    try{Thread.sleep(1000);}
    catch(InterruptedException ie){}
    g.drawRect(230,70,60,20);  
    g.drawLine(270,70,270,90);
    g.drawLine(250,70,250,90);
    g.drawLine(150,70,150,90);
   
    try{Thread.sleep(1000);}
    catch(InterruptedException ie){}
    g.drawString("20",253,85);
   
    try{Thread.sleep(1000);}
    catch(InterruptedException ie){}
    g.drawLine(285,75,330,75);
    g.drawOval(284,74,2,2);
    g.drawLine(290,85,335,85);
    g.drawOval(336,84,2,2);
    g.fillOval(336,84,2,2);
    
    try{Thread.sleep(1000);}
    catch(InterruptedException ie){}
    g.drawRect(330,70,60,20);
    g.drawLine(370,70,370,90);
    g.drawLine(350,70,350,90);
   
    try{Thread.sleep(1000);}
    catch(InterruptedException ie){}
    g.drawString("30",353,85);
    
    g.drawString(msg,430,85);
    try{Thread.sleep(1000);}
    catch(InterruptedException ie){}
 
    g.setFont(new Font("CASTELLER",2,20));

    try{Thread.sleep(1000);}
    catch(InterruptedException ie){}
    g.drawString("Insert At First Node",80,200);   
      
    try{Thread.sleep(1000);}
    catch(InterruptedException ie){}
    g.setFont(new Font("CASTELLER",2,15));
    g.drawRect(30,70,60,20);
    g.drawLine(70,70,70,90);
    g.drawLine(50,70,50,90);

    try{Thread.sleep(1000);}
    catch(InterruptedException ie){}
    g.drawLine(85,75,130,75);
    g.drawOval(84,74,2,2);
    g.drawLine(90,85,135,85);
    g.drawOval(136,84,2,2);
    g.fillOval(136,84,2,2);

    try{Thread.sleep(1000);}
    catch(InterruptedException ie){}
    g.drawString("40",53,85);
    g.setFont(new Font("CASTELLER",2,20));

    try{Thread.sleep(1000);}
    catch(InterruptedException ie){}
    g.drawString("Insert At Last Node",100,230);   
       
    try{Thread.sleep(1000);}
    catch(InterruptedException ie){}
    g.setFont(new Font("CASTELLER",2,15));
    g.drawRect(430,70,60,20);
    g.drawLine(470,70,470,90);
    g.drawLine(450,70,450,90);

    try{Thread.sleep(1000);}
    catch(InterruptedException ie){}
    g.drawLine(385,75,430,75);
    g.drawOval(384,74,2,2);
    g.drawLine(390,85,435,85);
    g.drawOval(436,84,2,2);
    g.fillOval(436,84,2,2);

    try{Thread.sleep(1000);}
    catch(InterruptedException ie){}
    g.drawString("50",453,85);

    try{Thread.sleep(1000);}
    catch(InterruptedException ie){}
   
   }
  }


