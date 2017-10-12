import java.applet.Applet;
import java.awt.*;
import java.util.ArrayList;
import java.awt.event.*;

/*<Applet Code="Apple.java" width = 500 height = 500></Applet>*/
 public class Apple extends Applet implements ActionListener{
    TextField t1,t2;
    Label l1,l2,l3;
    Button b1,b2,b3,b4;
    int idc=0;
    String name="",mob="";
    String msg,list="";
    //String act="";
    boolean flag=false,valid=false,see=false;
    ArrayList<String>names=new ArrayList<String>();
    ArrayList<String>mobs=new ArrayList<String>();

   public void init(){
       names.add("vara");
       mobs.add("8106492369");
            
     setBackground(Color.orange);
     setForeground(Color.blue);
     t1=new TextField("");
     t2=new TextField("");
     l1=new Label("user name: ");
     l2=new Label("mobile:");
     l3=new Label("LOGIN");
    // l4=new Label("REGISTER");
     b1=new Button("login");
     b2=new Button("reset");
     b3=new Button("register");
     b4=new Button("see list");
     
     setLayout(null);
     l3.setBounds(10,10,100,50);
     l1.setBounds(20,70,100,30);
     l2.setBounds(20,110,100,30);
     t1.setBounds(130,70,100,30);
     t2.setBounds(130,110,100,30);
     b1.setBounds(100,160,100,60);
     b2.setBounds(220,160,100,60);
     b3.setBounds(160,230,100,60);
     l3.setBackground(Color.white);
     l3.setForeground(Color.red);
     l1.setBackground(Color.orange);
     l1.setForeground(Color.black);
     l2.setBackground(Color.orange);
     l2.setForeground(Color.black);
  //   b1.setColor(Color.blue);
      b4.setBounds(300,300,100,30);
      b4.setVisible(false);
	add(l1);
	add(l2);
	add(l3);
	add(t1);
	add(t2);
	add(b1);
	add(b2);
	add(b3);
        add(b4);
     b1.addActionListener(this);
     b2.addActionListener(this);
     b3.addActionListener(this);
     b4.addActionListener(this);


     
   }
   public void paint(Graphics g){
  
    if(see=true){
   
     g.drawString(list,200,400);
      see=false;
    }
    if(valid=true){
    g.setColor(Color.black);
    g.drawString(msg,50,350);
     
    }
   else if(valid=false){
     g.setColor(Color.red);
     g.drawString(msg,50,350);
    }  
     // valid=false;
   }
   public void start(){
   repaint();
   }
   public void actionPerformed(ActionEvent ae){
    if((ae.getActionCommand())=="login"){
     name= t1.getText();
     mob=t2.getText();
      if((check(name,mob))){
       showStatus("successfully logged in");
       msg=name+" ,welcome";
       b4.setVisible(true);
       valid=true;
       see=true;
          t1.setText(null);
          t2.setText(null);
       }
       else {
        b4.setVisible(false);
        msg=name+", come with correct details";
        valid=false;
        see=false;
       }
       repaint();
     }
    if((ae.getActionCommand())=="reset"){
      reset();
     b4.setVisible(false);
    }
    if((ae.getActionCommand())=="register")
    { 
      l3.setText("REGISTER");
      b1.setLabel("submit");
      b3.setLabel("Login");
      b4.setVisible(false);
      setBackground(Color.yellow);
      see=false;
      valid=false;
      reset();
      repaint();
    }
    if((ae.getActionCommand())=="Login")
    {
      l3.setText("LOGIN");
      b1.setLabel("login");
      b3.setLabel("register");
      setBackground(Color.green);
      reset();
    }
    if((ae.getActionCommand())=="submit"){
     name=t1.getText();
     mob=t2.getText();
     if(!(check(name,mob))){
     add(name,mob);
     idc++;
     showStatus("successfully registered and id is"+idc);}
     else showStatus("already registere");

   }
   if((ae.getActionCommand())=="see list"){
     for( int i=0;i<names.size();i++){
      list +=""+ names.get(i)+""+mobs.get(i);
     }
     repaint();
     b4.setVisible(false);
   }


   }
   public boolean check(String name,String mob){
            for(int i=0;i<names.size();i++){
       if(name.equals(names.get(i)) && mob.equals(mobs.get(i)) ){
              return true;    }
       else{ return false;}
                          }
     if(name ==null || mob==null || mob.length()>10||mob.length()<10||mob.charAt(0)<7){
       return false;
     }    
     else{ return true;}
}
   
     public void reset(){
      t1.setText(null);
     t2.setText(null);
      
}    
    
  
    
  
    public void add(String name,String mob){
     names.add(name);
     mobs.add(mob);
    }
}

