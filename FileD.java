import java.awt.*;
import java.awt.event.*;
 class SimpleF extends Frame{
	public SimpleF(String title){
		super(title);
		addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent we){
				System.exit(0);
			}
		});
	}
}
 class FileD {
	public static void main(String args[]){
		Frame f=new SimpleF("File dailog demo");
		f.setSize(100,100);
		f.setVisible(true);
		FileDialog fd=new FileDialog(f,"File Dailog");
		fd.setVisible(true);
	}
}