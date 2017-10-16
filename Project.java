import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;
/*<applet code="Project.java" width=700 height =500></applet>*/

public class Project extends Applet implements Runnable{
Thread t;
TextArea ta;
int frame=1,text=1;
String postorder="";
boolean subtree=false,tree=false,root=false,thread=false,goleaf=true;
Font f=new Font("SansSerif",Font.PLAIN+Font.BOLD,30);

public void init(){
setBackground(Color.orange);
setForeground(Color.blue);
setFont(f);


}
public void paint(Graphics g){

Graphics2D g2= (Graphics2D)g;
if(tree){
//nodes postioning..
g.setColor(Color.red);
g.fillOval(300,100,50,50); //1          
g.fillOval(250,200,50,50); //2        
g.fillOval(350,200,50,50); //3         
g.fillOval(200,300,50,50); //4      
g.fillOval(300,300,50,50); //5

/*
borders around nodes..
*/
g.setColor(Color.blue);
g.drawOval(300,100,49,49);
g.drawOval(250,200,49,49);
g.drawOval(350,200,49,49);
g.drawOval(200,300,49,49);
g.drawOval(300,300,49,49);

//nodes linking..

g.drawLine(325,150,275,200);   //1-2
g.drawLine(325,150,375,200);   //1-3
g.drawLine(275,250,225,300);   //2-4
g.drawLine(275,250,325,300);   //2-5

g.setColor(Color.blue);
g.drawString("A",315,135);
g.drawString("B",265,235);                     //300,125 ,250,125  1
g.drawString("C",365,235);
g.drawString("D",215,335);                    //250,225,200,225   2
g.drawString("E",315,335);                      //4//200,325,150,325 4
     
// arrows left side..
g2.setStroke(new BasicStroke(3));
  switch(frame){
          
  case 1:  g.drawLine(240,125,290,125); g.drawLine(280,115,290,125); g.drawLine(280,135,290,125); frame++;
           if(goleaf){g.drawString("GO TO LEFTMOST LEAFNODE",50,50);}
           if(root){
            g.drawString("PICK IT AND MOVE TO OUTPUT",10,50);
             postorder += "A";
           g.drawString(postorder,200,450);
               tree=false;
            
             text++;

            }

            break;
  case 2:  g.drawLine(190,225,240,225); g.drawLine(240,225,230,215); g.drawLine(240,225,230,235);
            if(goleaf){g.drawString("GO TO LEFTMOST LEAFNODE",50,50);} goleaf=false;
            if(subtree){ g.drawString("THIS IS ROOT OF 'D'&'E' SO PICK IT",20,50);
             postorder += "B-";
             g.drawString(postorder,200,450);
             tree=false; text=2;
             subtree=false;
            }
            
               frame++; break;
  case 3:  g.drawLine(140,325,190,325); g.drawLine(180,315,190,325); g.drawLine(180,335,190,325); frame++;
         
           g.drawString("PICK THAT LEFT NODE AND DISPLAY",50,50);
           postorder += ""+"D";
           g.drawString(postorder,200,450);
         
          
                 break;

  case 4:  g.drawLine(360,325,410,325); g.drawLine(360,325,370,315); g.drawLine(360,325,370,335); 

             g.drawString("AGAIN TAKE RIGHT NODE",50,50);
             postorder += "-"+"E-";                                 // 
             g.drawString(postorder,200,450); frame=2;
             subtree=true;
             break;
            
  case 5:  g.drawLine(410,225,460,225); g.drawLine(410,225,420,215); g.drawLine(410,225,420,235);  
              g.drawString("AGAIN TAKE THAT RIGHT NODE",50,50);
              postorder += ""+"C-";
             g.drawString(postorder,200,450);
              tree=false; text++;;
            break;

  }


} 

else{
switch(text){
case 0: g.setColor(Color.blue);
        g.drawString("POSTORDER TRAVERSAL",200,100);
     
        g.setColor(Color.black);
        g.drawString("POSTORDER TRAVEL MEANS ..",10,150);
        g.drawString("LEFTN0DE->RIGHTNODE->ROOT",10,180);
        g.drawString("TRAVERSING START FROM LEAF NODES",10,240);
       try{t.sleep(2500);}catch(InterruptedException e){}
         tree=true;
         
         break;
case 1: g.setColor(Color.black);
        g.drawString("BINARY SEARCH TREE",200,150);
        g.drawString("POSTORDER TRAVERSAL",180,180);
        g.setColor(Color.blue);
        new Font("sansSerif",Font.PLAIN,3);
        g.setColor(Color.blue);
        g.drawString("@varaprasadh",380,480);
        text=0;
       
      try{  t.sleep(2000); } catch(InterruptedException e){}
      
          break;
case 2:  
        new Font("Sans",Font.PLAIN,3);
        g.setColor(Color.blue);
       
        g.drawString("HERE LEFT SUBTREE OVER  ..",20,100); 
        g.drawString("WE HAVE GO RIGHT SUBTREE BUT",20,140); 
        g.drawString( "THERE IS SINGLE NODE..",20,190);
        g.drawString("SO SIMPLY PIC IT",20,230); 
         tree=true;
           frame=5;
       try{ t.sleep(2500);}catch(InterruptedException e){}
          break;
           
case 3: g.drawString("ALL CHILD NODES ARE COMPLETED",50,100);
        g.drawString("WE CAN SIMPLY PICK ROOT NODE",50,150);
         tree=true;
          frame=1; root=true;
       try{  t.sleep(2500); } catch(InterruptedException e){}
        break;
case 4: g.drawString("Thank you",250,200);
         thread=true; 
         break;





}


}
}
public void start(){ 

   t=new Thread(this);
   t.start();

}
public void run(){
 while(true){  
  try{
     repaint();
     t.sleep(2000);
 
    }
  catch(InterruptedException e){}
    if(thread){break;}
}
}
/*public void actionPerformed(ActionEvent ae){
  String s=ae.getActionCommand();
if(s.equals("START")){
 c++; 
 t.notify();
 
b.setLabel("PAUSE/PLAY");
b.setBounds(50,50,100,50);
}

if(s.equals("PAUSE/PLAY")){
 slep=slep*-1;
if(slep==1){
 try{t.wait();  } catch(InterruptedException e){}
       }
if(slep==-1){
 t.notify();
}

}
} */
}

