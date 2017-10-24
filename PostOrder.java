import java.applet.Applet;

import java.awt.*;

import java.awt.event.*;

/*<applet code="PostOrder.java" width=700 height =700></applet>*/



public class PostOrder extends Applet implements Runnable{

Thread t;

TextArea ta;

int frame=1,text=0;

String postorder="";

boolean tree=false,thread=false,subtree=false,goleaf=false, sub=false;  
boolean subt=false,subleaf=false;

Font f=new Font("SansSerif",Font.PLAIN+Font.BOLD,30);



public void init(){

setBackground(Color.orange);

setForeground(Color.blue);

setFont(f);





}

public void paint(Graphics g){



Graphics2D g2= (Graphics2D)g;

g2.setStroke(new BasicStroke(4));
g.setColor(Color.green);
g.drawRect(5,5,690,690);
g.setColor(Color.gray);
g.drawString("POSTORDER",500,550);

if(tree){

//nodes postioning..

g.setColor(Color.red);

g.fillOval(300,100,50,50); //1          

g.fillOval(250,200,50,50); //2        

g.fillOval(350,200,50,50); //3         

g.fillOval(200,300,50,50); //4      

g.fillOval(300,300,50,50); //5

g.fillOval(150,400,50,50); //6

g.fillOval(250,400,50,50);//7

g.fillOval(350,400,50,50);//8

g.fillOval(400,300,50,50);//9

/*

borders around nodes..

*/

g.setColor(Color.black);

g.drawOval(300,100,49,49);//1

g.drawOval(250,200,49,49);//2

g.drawOval(350,200,49,49);//3

g.drawOval(200,300,49,49);//4

g.drawOval(300,300,49,49);//5

g.drawOval(150,400,49,49);//6

g.drawOval(250,400,49,49);//7

g.drawOval(350,400,49,49);//8

g.drawOval(400,300,49,49);//9



//nodes linking..

g2.setStroke(new BasicStroke(3));

g.drawLine(325,150,275,200);   //1-2

g.drawLine(325,150,375,200);   //1-3

g.drawLine(275,250,225,300);   //2-4

g.drawLine(275,250,325,300);   //2-5

g.drawLine(380,250,425,300);   //3-9

g.drawLine(225,350,175,400);   //4-6

g.drawLine(325,350,275,400);  //5-7
                               
g.drawLine(325,350,375,400);  //5-8





g.setColor(Color.blue);

g.drawString("A",315,135);

g.drawString("B",265,235);                     //300,125 ,250,125  1

g.drawString("C",365,235);

g.drawString("D",215,335);                    //250,225,200,225   2

g.drawString("E",315,335); 

g.drawString("F",415,335);

g.drawString("G",165,435);

g.drawString("H",265,435);

g.drawString("I",375,435);                     //4//200,325,150,325 4

     
switch(frame){
 case 1:               ///AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA

            g.drawLine(240,125,290,125); g.drawLine(280,115,290,125); g.drawLine(280,135,290,125); 

           if(goleaf){
           g.drawString("goto the left most leaf node",50,50 ); frame++;
           }
          if(subleaf){
          	frame=9;
          	goleaf=true;
          	g.drawString("GOTO LEAF NODE AS WELL",50,50);

          }
          if(subt){
          	postorder+= "A";
          	g.drawString(postorder,200,550);

          	g.drawString("take this master root ",50,50);

          	tree=false; subt=false;
          }







            break;

  case 2:   ///BBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBB
               g.drawLine(190,225,240,225); g.drawLine(240,225,230,215); g.drawLine(240,225,230,235); 
                        if(goleaf){
           g.drawString("goto the left most leaf node",50,50); frame++;

           }
           if(subt){
           	tree=false;
           	subt=false;
           }
        if(sub){

        	goleaf=true; frame=5;
        	g.drawString("GOTO LEAF OF RIGHT SUBTREE",50,50);
        }
       if(subtree){
        postorder += "B-";
        g.drawString(postorder,200,550);
        g.drawString("pick this",50,50);

        tree=false; frame=1;
         subtree=false;goleaf=false;           
 
        }

                break;
       

  case 3: 
               //DDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDD
             g.drawLine(140,325,190,325); g.drawLine(180,315,190,325); g.drawLine(180,335,190,325); 
                                   if(goleaf){
           g.drawString("goto the left most leaf node",50,50); frame++;

           }
           if(subtree){
           	g.drawString("take this root node",50,50);
           postorder +="D-";
           g.drawString(postorder,200,500);
           subtree=false;
           frame=2; subt=true;

           }

         

          

                 break;




 case 4:           ///GGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGG
               g.drawLine(150,425,100,425); g.drawLine(150,425,140,415); g.drawLine(150,425,140,435);
                   if(goleaf){
           g.drawString("take that leaf node",50,50);
                goleaf=false;
               frame=3; subtree=true;
                postorder +="G-";
                g.drawString(postorder,200,550);
           }
       

          break;



  case 5 :

            ///EEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEE
              g.drawLine(360,325,410,325); g.drawLine(360,325,370,315); g.drawLine(360,325,370,335);
              if(goleaf){
              	g.drawString("GOTO LEFT MOST LEAF NODE",50,50);
              	frame++;
              }
             if(subt){
             	g.drawString("THIS IS ROOT OF 'H' & 'I'",50,50);
             	postorder += "E-";
             	g.drawString(postorder,200,550);
             	subt=false; frame = 2;
             	tree=false;sub=false;
             }


             break;

     

     case 6: ///HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHh
             g.drawLine(250,425,200,425); g.drawLine(250,425,240,415); g.drawLine(250,425,240,435);
               if(goleaf){
               	g.drawString("take this as a leaf node ",50,50);
               	postorder+="H-";
               	g.drawString(postorder,200,550);
              
               frame=7;
               }





               break;




   case 7: ///IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII
               g.drawLine(400,425,450,425); g.drawLine(400,425,410,415); g.drawLine(400,425,410,435); 
              if(goleaf){
              	g.drawString("AGAIN TAKE THIS RIGHT NODE",50,50);
              	postorder +="I-";
              	g.drawString(postorder,200,550);
                frame=5;goleaf=false; subt=true;

              }









       break;
case 8:  //FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFf
 
          g.drawLine(450,325,500,325);g.drawLine(450,325,460,315); g.drawLine(450,325,460,335);
           if(goleaf){
           	postorder+="F-";
           	g.drawString(postorder,200,550);
           	g.drawString("simply pick it",50,50);
           	frame=9; subtree=true; goleaf=false;
           }


    break;




  case 9:
              ///CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC
              g.drawLine(410,225,460,225); g.drawLine(410,225,420,215); g.drawLine(410,225,420,235); 
             if(goleaf){
             	g.drawString("goto the leaf node",50,50);
                frame=8;


             }
             if(subtree){
             	g.drawString("it is the root of 'F'",50,50);
             	postorder += "C-";
             	g.drawString(postorder,200,550);
               frame=1; tree=false;
               subtree=false; subleaf=false; goleaf=false;

             }
            

            

            break;









}


}
else{

switch(text){



case 0: g.setColor(Color.black);

        g.drawString("BINARY SEARCH TREE",200,150);

        g.drawString("POSTORDER TRAVERSAL",180,180);

        g.setColor(Color.blue);

        new Font("sansSerif",Font.PLAIN,3);

        g.setColor(Color.blue);

        g.drawString("@varaprasadh",380,480);

        text++;


       

      try{  t.sleep(2000); } catch(InterruptedException e){}

      

          break;

    case 1: g.setColor(Color.blue);

        g.drawString("POSTORDER TRAVERSAL",200,100);

     

        g.setColor(Color.black);

        g.drawString("POSTORDER TRAVEL MEANS ..",10,150);

        g.drawString("LEFTN0DE->RIGHTNODE->ROOT",10,180);

        g.drawString("TRAVERSING START FROM LEAF NODES",10,240);

       try{t.sleep(2500);}catch(InterruptedException e){}

         tree=true;
        goleaf=true; text++;
         

         break;

case 2:  

        new Font("Sans",Font.PLAIN,1);
        g.setColor(Color.blue);
      g.drawString("HERE ONE OF SUBTREE OF ROOT 'B' IS OVER ",10,100);

      g.drawString(" SO WE HAVE TO GOTO LEAF OF RIGHT SUBTREE",10,150);

      tree=true;
      frame=2; sub=true;
     


        text++;
          break;
 case  3: 
             g.setColor(Color.blue);
            g.drawString("both subtrees of root B are over", 10,100);
            g.drawString("so we can pick it and output it",10,150);
            tree=true; subtree=true;
            text++;
         
          break;
 case 4:   g.setColor(Color.blue);
          g.drawString("1 of subtree 0f Master-root 'A' is over",10,200);

          g.drawString("we have to go for right",10,250);

         tree=true; subleaf=true; text++; frame=1;

          break;         

           

case 5 : g.setColor(Color.blue);
         g.drawString("ALL CHILD NODES ARE COMPLETED",50,100);

        g.drawString("WE CAN SIMPLY PICK ROOT (A) NODE",50,150);
            tree=true; subt=true;
       
          text++;
        break;

case 6  : g.setColor(Color.black);
        g.drawString("Thank You!!",250,200);

         
          thread=false;
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

     t.sleep(2500);

 

    }

  catch(InterruptedException e){}

    if(thread){break;}

}

}



}

















