import java.applet.*;
import java.awt.*;
import java.awt.event.*;
//import javax.swing.*;
//import javax.swing.event.*;
/*<applet code="Cal1" width=330 height=540>
</applet>*/
    public class Cal1 extends Applet implements ActionListener{
	Button b[]=new Button[20];
	TextArea ta;
	String str="";

	public Insets getInsets(){
		return new Insets(30,5,5,5);
	}

	public void init(){
		setBackground(Color.orange);
		ta=new TextArea(1,10);
		ta.setVisible(true);

		Font f=new Font("Arial",Font.BOLD,25);
		Font f1=new Font("Arial",Font.BOLD,30);
		ta.setFont(f1);
		setFont(f);
	
		setLayout(new BorderLayout());
		add(ta,BorderLayout.NORTH);
		Panel p1=new Panel();
		Panel p2=new Panel();
		p1.setLayout(new GridBagLayout());
		p2.setLayout(new GridBagLayout());
	
		GridBagConstraints gbc=new GridBagConstraints();
	
		b[1]=new Button("1");
		gbc.gridx=0;
		gbc.gridy=0;
		//gbc.gridheight=4;
		gbc.ipadx=50;
		gbc.ipady=60;
		gbc.fill=GridBagConstraints.HORIZONTAL;
		gbc.anchor=GridBagConstraints.FIRST_LINE_START;
		
		p1.add(b[1],gbc);
		
		b[1].addActionListener(this);

	
		b[2]=new Button("2");
		gbc.gridx=1;
		gbc.gridy=0;
		p1.add(b[2],gbc);
		b[2].addActionListener(this);

		b[3]=new Button("3");
		gbc.gridx=2;
		gbc.gridy=0;
		p1.add(b[3],gbc);
		b[3].addActionListener(this);

		b[4]=new Button("4");
		gbc.gridx=0;
		gbc.gridy=1;
		p1.add(b[4],gbc);
		b[4].addActionListener(this);
	
		b[5]=new Button("5");
		gbc.gridx=1;
		gbc.gridy=1;
		p1.add(b[5],gbc);
		b[5].addActionListener(this);
	
		b[6]=new Button("6");
		gbc.gridx=2;
		gbc.gridy=1;
		p1.add(b[6],gbc);
		b[6].addActionListener(this);
	
		b[7]=new Button("7");
		gbc.gridx=0;
		gbc.gridy=3;
		p1.add(b[7],gbc);
		b[7].addActionListener(this);
	
		b[8]=new Button("8");
		gbc.gridx=1;
		gbc.gridy=3;
		p1.add(b[8],gbc);
		b[8].addActionListener(this);
	
		b[9]=new Button("9");
		gbc.gridx=2;
		gbc.gridy=3;
		p1.add(b[9],gbc);
		b[9].addActionListener(this);
	
		b[10]=new Button(".");
		gbc.gridx=0;
		gbc.gridy=4;
		p1.add(b[10],gbc);
		b[10].addActionListener(this);
	
		b[11]=new Button("0");
		gbc.gridx=1;
		gbc.gridy=4;
		p1.add(b[11],gbc);
		b[11].addActionListener(this);
	
		b[12]=new Button("Del");
		gbc.gridx=2;
		gbc.gridy=4;
		p1.add(b[12],gbc);
		b[12].addActionListener(this);
		
		b[13]=new Button("+");
		gbc.gridx=0;
		gbc.gridy=0;
		gbc.ipadx=30;
		gbc.ipady=60;
		//gbc.fill=GridBagConstraints.HORIZONTAL;
		gbc.anchor=GridBagConstraints.FIRST_LINE_START;
		p2.add(b[13],gbc);
		b[13].addActionListener(this);
	
		b[14]=new Button("-");
		gbc.gridx=0;
		gbc.gridy=1;
		gbc.ipadx=12;
		gbc.ipady=30;
		gbc.fill=GridBagConstraints.HORIZONTAL;
		gbc.anchor=GridBagConstraints.FIRST_LINE_START;
		p2.add(b[14],gbc);
		b[14].addActionListener(this);
	
		b[15]=new Button("/");
		gbc.gridx=0;
		gbc.gridy=2;
		gbc.ipadx=12;
		gbc.ipady=30;
		gbc.fill=GridBagConstraints.HORIZONTAL;
		gbc.anchor=GridBagConstraints.FIRST_LINE_START;
		p2.add(b[15],gbc);
		b[15].addActionListener(this);

		
		b[16]=new Button("*");
		gbc.gridx=0;
		gbc.gridy=3;
		gbc.ipadx=12;
		gbc.ipady=30;
		gbc.fill=GridBagConstraints.HORIZONTAL;
		gbc.anchor=GridBagConstraints.FIRST_LINE_START;
		p2.add(b[16],gbc);
		b[16].addActionListener(this);
	
		b[17]=new Button("=");
		gbc.gridx=0;
		gbc.gridy=4;
		gbc.ipadx=12;
		gbc.ipady=55;
		gbc.fill=GridBagConstraints.HORIZONTAL;
		gbc.anchor=GridBagConstraints.PAGE_END;
		p2.add(b[17],gbc);
		b[17].addActionListener(this);
	
		b[18]=new Button("CLEAR");
		gbc.gridy=4;
		gbc.ipadx=20;
		gbc.ipady=60;
		gbc.fill=GridBagConstraints.BOTH;
		gbc.anchor=GridBagConstraints.PAGE_END;
		add(b[18],BorderLayout.SOUTH);
		b[18].addActionListener(this);
	
		//add(p1);
		add(p1,BorderLayout.WEST);
		add(p2,BorderLayout.EAST);
	}
	
	public void actionPerformed(ActionEvent ae)
	{
	
	if(ae.getSource()==b[18])
	{
		str="";
		ta.setText("");
	}
if(ae.getSource()==b[1])
{
ta.setText(str+='1');
}
if(ae.getSource()==b[2])
{
ta.setText(str+='2');
}
if(ae.getSource()==b[3])
{
ta.setText(str+='3');
}
if(ae.getSource()==b[4])
{
ta.setText(str+='4');
}
if(ae.getSource()==b[5])
{
ta.setText(str+='5');
}
if(ae.getSource()==b[6])
{
ta.setText(str+='6');
}
if(ae.getSource()==b[7])
{
ta.setText(str+='7');
}
if(ae.getSource()==b[8])
{
ta.setText(str+='8');
}
if(ae.getSource()==b[9])
{
ta.setText(str+='9');
}
if(ae.getSource()==b[10])
{
ta.setText(str+='.');
}
if(ae.getSource()==b[11])
{
ta.setText(str+='0');
}
if(ae.getSource()==b[12])
{
ta.setText(str=str.substring(0,str.length()-1));
}
if(ae.getSource()==b[13])
{
ta.setText(str+='+');
}
if(ae.getSource()==b[14])
{
ta.setText(str+='-');
}
if(ae.getSource()==b[16])
{
ta.setText(str+='*');
}
if(ae.getSource()==b[15])
{
ta.setText(str+='/');
}
if(ae.getSource()==b[17])
{
float result=0;
char x='w';
boolean op=false;
String first,second;
first=second="";
float a,b;a=b=1;
for(int i=0;i<=str.length()-1;i++){
if(str.charAt(i)=='+'||str.charAt(i)=='-'||str.charAt(i)=='*'||str.charAt(i)=='/'){
op=true;
x=str.charAt(i);
continue;
}
if(op==false)
first=first+str.charAt(i);
else
second=second+str.charAt(i);
}
a=Float.valueOf(first);
b=Float.valueOf(second);
if(x=='+')
result=(a+b);
if(x=='-')
result=(a-b);
if(x=='*')
result=(a*b);
if(x=='/')
result=(a/b);
ta.setText(""+result);
}
}
}
