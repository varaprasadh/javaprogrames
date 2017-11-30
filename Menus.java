import java.awt.*;
import java.applet.Applet;
/*<applet code="Menus.java" width=500 height=500></applet>*/
public class Menus extends Applet{

public void init(){
 Mframe f=new Mframe("MenuExample");
f.setSize(500,500);
 f.setVisible(true);

}
public void paint(Graphics g){}
public void start(){
	repaint();
}

}
class Mframe extends Frame{

	Menu m;
	MenuItem a,b,c,d;
	Panel p;
	MenuBar mb;

    public Mframe(String title){
    		super(title);

   //  this.setDefaultCloseOperation(Frame.EXIT_ON_CLOSE);
   /*  addWindowListener(new WindowAdapter(){
     	public void windowClosing(WindowEvent w){
     		System.exit(0);
     	}
     }); */
	//p=new Panel();
	m=new Menu("menu");
	a=new MenuItem("its a");
	b=new MenuItem("its b");
	c=new MenuItem("its c");
	d=new MenuItem("its d");
	Menu e=new Menu("try");
	MenuItem a1,a2,a3,a4;
	a1=new MenuItem("item1");
	a2=new MenuItem("item2");
    a3=new MenuItem("item3");
    a4=new MenuItem("item4");
    e.add(a1);
     e.add(a2);
     e.add(a3);
     e.add(a4);
     m.add(e);
	mb=new MenuBar();
	setMenuBar(mb);
	m.add(a);
	m.add(b);
	m.add(c);
	m.add(d);
	mb.add(m);
}

}