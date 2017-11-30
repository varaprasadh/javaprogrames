import java.util.Random;

import java.applet.Applet;
import java.awt.Graphics;
import java.awt.event.*;

import java.awt.*;
/*<applet code ="Practice.java" width=500 height =500></applet>*/
public class Practice extends Applet implements ItemListener,ActionListener {
 Label l1,l2;
 TextField t1,t2;
 Menu m1;
 Button b1;
 String s,s1,s2,s3,s4,s5;
 Checkbox ch1,ch2,ch3,ch4,ch5;
 CheckboxGroup cbg;
 Choice chh,a,b,c,d;
 List lis;
 Scrollbar sb;
TextArea ta;


public void init(){
	//setLayout(new FlowLayout());
	l1=new Label("label1");
	add(l1);
	l2=new Label("label2",2);
	add(l2);
	t1=new TextField("text field1");
	t2=new TextField("textfield2");
	t2.setEchoChar('*');
	add(t1);
	add(t2);
	ch1=new Checkbox();
	ch1.setLabel("CheckBox1");
	add(ch1);
	ch2=new Checkbox("CheckBox2");
	add(ch2);
	ch3=new Checkbox("CheckBox3",true);
	add(ch3);
	cbg=new CheckboxGroup();
    ch4=new Checkbox("CheckBox4",false,cbg);
    ch5=new Checkbox("Checkbox5",cbg,false);
     add(ch4);
     add(ch5);
     ch1.addItemListener(this);
     ch2.addItemListener(this);
     ch3.addItemListener(this);
     ch4.addItemListener(this);
     ch5.addItemListener(this);
     chh=new Choice();
    
     chh.add("a");
      
     chh.add("b");
     chh.add("c");
     chh.add("d");
     add(chh);
      chh.addItemListener(this);
      lis=new List(10,true);
      lis.add("david");
      lis.add("hitesh");
      lis.add("bunny");
      lis.add("varaprasadh",0);
      lis.add("and you");
      add(lis);
      lis.addItemListener(this);
      t1.addActionListener(this);
 /* sb=new Scrollbar(Scrollbar.HORIZONTAL,0,1,0,100);
  sb.setPrefferedSize(new Dimension(20,100));
  add(sb);
   */
 ta=new TextArea("gsayzsdgsfdsfsadacas",5,5);
 add(ta);


}
public void paint(Graphics g){
 s="label alignment constant"+l2.getAlignment();
 s1="state of checkbox  "+ch3.getState();
 g.drawString(s,100,100);
 g.drawString(s1,100,130);
 g.drawString("radiobutton state :"+cbg.getSelectedCheckbox(),100,150);
 g.drawString("choice cout"+chh.getSelectedIndex()+"item  "+chh.getSelectedItem(),100,170);
 g.drawString("list item: "+ lis.getSelectedItem(),100,300);
 g.drawString("textfield selected text :"+ t1.getSelectedText(),100,350);
}
public void itemStateChanged(ItemEvent ie){
	//getSelectedCheckbox().setLabel("checked");
 repaint();

}
public void start(){
	 repaint();
}
public void actionPerformed(ActionEvent ae){
	repaint();
}



}