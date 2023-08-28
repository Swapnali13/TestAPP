



import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
 class PageTwo extends JFrame implements ActionListener
{     
        JRadioButton jb[]=new JRadioButton[5];
	JButton b2,b3,b4,b5,b6,a2,a3,a4,a5,a6,imgb;
	ButtonGroup bg; JLabel imgl;
	JLabel l1=new JLabel("JAVA");JLabel l2=new JLabel("C++");
	PageTwo(String s)
	{
		 super(s);
		 setLayout(new BorderLayout());
		 setContentPane(new JLabel(new ImageIcon("G:/hk.jpg")));
		bg=new ButtonGroup();
                b2=new JButton("Collection-1"); a2=new JButton("Collection-1");                  
	        b3=new JButton("Collection-2"); a3=new JButton("Collection-2");                 
		b4=new JButton("Collection-3"); a4=new JButton("Collection-3"); 
                b5=new JButton("Collection-4"); a5=new JButton("Collection-4"); 
                b6=new JButton("Collection-5"); a6=new JButton("Collection-5");                 
                b2.addActionListener(this);     a2.addActionListener(this);
		b3.addActionListener(this);	a3.addActionListener(this);
		b4.addActionListener(this);	a4.addActionListener(this);
		b5.addActionListener(this);	a5.addActionListener(this);
		b6.addActionListener(this);	a6.addActionListener(this);
	  add(l1);add(l2);add(b2);add(b3);add(b4);add(b5);add(b6);add(a2);add(a3);add(a4);add(a5);add(a6);
	  l1.setBounds(145,50,120,20); l2.setBounds(415,50,120,20);    	
                      b2.setBounds(100,100,120,20); a2.setBounds(370,100,120,20);
                      b3.setBounds(100,130,120,20); a3.setBounds(370,130,120,20);
                      b4.setBounds(100,160,120,20); a4.setBounds(370,160,120,20);
                      b5.setBounds(100,190,120,20); a5.setBounds(370,190,120,20);   
                      b6.setBounds(100,220,120,20); a6.setBounds(370,220,120,20);                                                               
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null);setLocation(250,100);
	        setVisible(true);setSize(600,450);
		
	}	
                 public void actionPerformed(ActionEvent e)
               	{
                     if(e.getSource()==b2)
                      {
                            OnlineTest1 ot1=new OnlineTest1("Online Test Of Java");      
                      }                                               
                     if(e.getSource()==b3)
                      {
                            OnlineTest2 ot2=new OnlineTest2("Online Test Of Java");
                      }
                       if(e.getSource()==b4)
                      {
                            OnlineTest3 ot3=new OnlineTest3("Online Test Of Java");
                      }
                       if(e.getSource()==b5)
                      {
                            OnlineTest4 ot4=new OnlineTest4("Online Test Of Java");
                      }
                       if(e.getSource()==b6)
                      {
                            OnlineTest5 ot5=new OnlineTest5("Online Test Of Java");
                      }
                      if(e.getSource()==a2)
                      {
                            OnlineTest6 ot6=new OnlineTest6("Online Test Of Java");
                      }                                               
                     if(e.getSource()==a3)
                      {
                            OnlineTest7 ot7=new OnlineTest7("Online Test Of Java");
                      }
                       if(e.getSource()==a4)
                      {
                            OnlineTest8 ot8=new OnlineTest8("Online Test Of Java");
                      }
                       if(e.getSource()==a5)
                      {
                            OnlineTest9 ot9=new OnlineTest9("Online Test Of Java");
                      }
                       if(e.getSource()==a6)
                      {
                            OnlineTest10 ot10=new OnlineTest10("Online Test Of Java");
                      }
            }
                    public static void main(String s[])
                       	{                            
                             JFrame f=new JFrame(); 
                             try
	                       {
	                    	f.setContentPane(new JLabel(new ImageIcon(ImageIO.read(new File("E:/Test.jpg")))));
                               }
                             catch(IOException e)
	                     	{
	                          e.printStackTrace();
	                        }
                                JButton b=new JButton("Continue");  
                               	JLabel h=new JLabel(".....WELCOME TO TEST.....");
          	               	h.setFont(new Font("Couier New",Font.BOLD,22));h.setForeground(Color.BLUE);          	                	
                                f.add(b);f.add(h);h.setBounds(100,3,300,50);
                                b.setBounds(180,300,110,30);f. setLocation(250,100);
                                b.addActionListener(new ActionListener()
                                	 {        public void actionPerformed(ActionEvent e) 
                      	                       {
                                                  PageTwo ot=new PageTwo("Online Test Of Java"); 
                    	                       }
               	                     });
                                    f.pack(); f.setSize(500,450);f.setLayout(null); f.setVisible(true);
                            }                                               
          }
class OnlineTest1 extends JFrame implements ActionListener
{	
	JLabel l;
	JRadioButton jb[]=new JRadioButton[5];
	JButton b1,b2;ButtonGroup bg;
        int count=0,current=0,x=1,y=1,now=0;
	int m[]=new int[10];	
	OnlineTest1(String s)
	{
		super(s);
		l=new JLabel();
		add(l);
		bg=new ButtonGroup();
		for(int i=0;i<5;i++)
		{
			jb[i]=new JRadioButton();	
			add(jb[i]);
			bg.add(jb[i]);
		}
		b1=new JButton("Next"); b2=new JButton("Skip");
	        b1.addActionListener(this);
		b2.addActionListener(this);add(b1);add(b2);                                 
		set();
		l.setBounds(30,40,450,20);
		jb[0].setBounds(50,80,100,20);jb[1].setBounds(50,110,100,20);
		jb[2].setBounds(50,140,100,20);jb[3].setBounds(50,170,100,20);
		b1.setBounds(100,240,100,30);b2.setBounds(270,240,100,30);
		setLayout(null);setLocation(250,100);
		setVisible(true);setSize(600,450);
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==b1)
		{
			if(check())
			count=count+1;current++;
			set();	
			if(current==9)
			{
			b1.setEnabled(false);b2.setText("Result");
			}
		}
		if(e.getActionCommand().equals("Skip"))
		{
			JButton bk=new JButton("Skip"+x);
			bk.setBounds(480,20+30*x,100,30);
			add(bk);bk.addActionListener(this);
			m[x]=current;x++;current++;
			
			set();	
			if(current==9)
			b2.setText("Result");
			setVisible(false); setVisible(true);
			
		}
		for(int i=0,y=1;i<x;i++,y++)
		{
		  if(e.getActionCommand().equals("Skip"+y))
		  {
			if(check())
		        count=count+1;now=current;current=m[y];
			set();
			((JButton)e.getSource()).setEnabled(false);
			current=now;
		  }
		} 
			if(e.getActionCommand().equals("Result"))
		{
		     if(check())
			 count=count+1; current++;
                         JOptionPane.showMessageDialog(this,"Correct answers: "+count);
	  }
	}
	void set()
	{
		jb[4].setSelected(true);
		if(current==0)
		{
			l.setText("Que1: Which one among these is not a primitive datatype?");
			jb[0].setText("int");jb[1].setText("Float");jb[2].setText("boolean");jb[3].setText("char");	
		}
		if(current==1)
		{
			l.setText("Que2: Which class is the parent class of all classes in java?");
			jb[0].setText("Swing");jb[1].setText("Applet");jb[2].setText("Object");jb[3].setText("ActionEvent");
		}
		if(current==2)
		{
			l.setText("Que3: Which package is directly available to our classes?");
			jb[0].setText("swing");jb[1].setText("applet");jb[2].setText("net");jb[3].setText("lang");
		}
		if(current==3)
		{
			l.setText("Que4: String class is defined in ___ package.");
			jb[0].setText("lang");jb[1].setText("Swing");jb[2].setText("Applet");jb[3].setText("awt");
		}
		if(current==4)
		{
			l.setText("Que5: Which institute is best for java coaching?");
			jb[0].setText("Utek");jb[1].setText("Aptech");jb[2].setText("JavaTpoint");jb[3].setText("jtek");
		}
		if(current==5)
		{
			l.setText("Que6: Which one among these is not a keyword?");
			jb[0].setText("class");jb[1].setText("int");jb[2].setText("get");jb[3].setText("if");
		}
		if(current==6)
		{
			l.setText("Que7: Which one among these is not a class?");
			jb[0].setText("Applet");jb[1].setText("Actionperformed");jb[2].setText("ActionEvent");jb[3].setText      ("Button");
		}
		if(current==7)
		{
			l.setText("Que8: Which among these is not a function of Object class?");
			jb[0].setText("toString");jb[1].setText("finalize");jb[2].setText("equals");jb[3].setText("getDocumentBase");		
		}
		if(current==8)
		{
			l.setText("Que9: Which function is not found in Applet class?");
			jb[0].setText("init");jb[1].setText("main");jb[2].setText("start");jb[3].setText("destroy");
		}
		if(current==9)
		{
			l.setText("Que10: Which one among these is not a valid component?");
			jb[0].setText("JButton");jb[1].setText("JList");jb[2].setText("JButtonGroup");jb[3].setText("JTextArea");
		}
		l.setBounds(30,40,450,20);
		for(int i=0,j=0;i<=90;i+=30,j++)
			jb[j].setBounds(50,80+i,200,20);
	}
	boolean check()
	{
		if(current==0)
			return(jb[1].isSelected());
		if(current==1)
			return(jb[2].isSelected());
		if(current==2)
			return(jb[3].isSelected());
		if(current==3)
			return(jb[0].isSelected());
		if(current==4)
			return(jb[2].isSelected());
		if(current==5)
			return(jb[2].isSelected());
		if(current==6)
			return(jb[1].isSelected());
		if(current==7)
			return(jb[3].isSelected());
		if(current==8)
			return(jb[1].isSelected());
		if(current==9)
			return(jb[2].isSelected());
		return false;
	}
}

class OnlineTest2 extends JFrame implements ActionListener
{	
	JLabel l;
	JRadioButton jb[]=new JRadioButton[5];
	JButton b1,b2;ButtonGroup bg;
        int count=0,current=0,x=1,y=1,now=0;
	int m[]=new int[10];	
	OnlineTest2(String s)
	{
		super(s);
		l=new JLabel();add(l);
		bg=new ButtonGroup();
		for(int i=0;i<5;i++)
		{
			jb[i]=new JRadioButton();	
			add(jb[i]);
			bg.add(jb[i]);
		}
		b1=new JButton("Next");b2=new JButton("Skip");
		b1.addActionListener(this);
		b2.addActionListener(this);add(b1);add(b2);set();                                 
		l.setBounds(30,40,450,20);
		jb[0].setBounds(50,80,100,20);jb[1].setBounds(50,110,100,20);
		jb[2].setBounds(50,140,100,20);jb[3].setBounds(50,170,100,20);
		b1.setBounds(100,240,100,30);b2.setBounds(270,240,100,30);
		setLayout(null);setLocation(250,100);
		setVisible(true);setSize(600,450);
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==b1)
		{
			if(check())
			count=count+1;current++;
			set();	
			if(current==9)
			{
			b1.setEnabled(false);b2.setText("Result");
			}
		}
		if(e.getActionCommand().equals("Skip"))
		{
			JButton bk=new JButton("Skip"+x);
			bk.setBounds(480,20+30*x,100,30);
			add(bk);bk.addActionListener(this);
			m[x]=current;x++;current++;set();
			if(current==9)
			b2.setText("Result");
			setVisible(false); setVisible(true);
		}
		for(int i=0,y=1;i<x;i++,y++)
		{
		  if(e.getActionCommand().equals("Skip"+y))
		  {
			if(check())
		     count=count+1;now=current;current=m[y];
                     ((JButton)e.getSource()).setEnabled(false);
			current=now;
		  }
		}
		if(e.getActionCommand().equals("Result"))
		{
		     if(check())
			 count=count+1; current++;
                         JOptionPane.showMessageDialog(this,"Correct answers: "+count);
                }
	}
	void set()
	{jb[4].setSelected(true);
		if(current==0)
		{
			l.setText("Que1: Which of  the following is syntactically Wrong");
			jb[0].setText("int a");jb[1].setText("int 1b");jb[2].setText("int  _a");jb[3].setText("None of above");	
		}
		if(current==1)
		{
			l.setText("Que2: Which of  the following is syntactically Correct");
			jb[0].setText("int dz");jb[1].setText("int emp");jb[2].setText("int $student");jb[3].setText("All of above");
		}
		if(current==2)
		{
			l.setText("Que3: Which of  the following is Correct syntax of declaring enum");
			jb[0].setText("enum Days{MON,UE,WED}");jb[1].setText("enum Days{MON,UE,WED};");jb[2].setText("both");jb
[3].setText("None of Above");
		}
		if(current==3)
		{
			l.setText("Que4:How many  access Modifiers are there is java");
			jb[0].setText("2");jb[1].setText("3");jb[2].setText("4");jb[3].setText("1");
		}
		if(current==4)
		{
			l.setText("Que5:How many  access  levels are ther is java");
			jb[0].setText("2");jb[1].setText("3");jb[2].setText("4");jb[3].setText("1");
		}
		if(current==5)
		{
			l.setText("Que6: Which of the following class will not compile");
			jb[0].setText("class A{}");jb[1].setText("public class B{}");jb[2].setText("protected class B{}");jb[3].setText("All of  above will compile");
		}
		if(current==6)
		{
			l.setText("Que7: Which of the following class will be accessible in same package but not outside");
			jb[0].setText("class X{}");jb[1].setText("public class Y{}");jb[2].setText("private class Z{}");jb[3].setText("All  of above");
		}
		if(current==7)
		{
			l.setText("Que8: Which of the following method name does not follow JavaBeans standard");
			jb[0].setText("getData");jb[1].setText("setData");jb[2].setText("putData");jb[3].setText("isValid");		
		}
		if(current==8)
		{
			l.setText("Que9: Which is correct of syntax of creating object of  class XYZ");
			jb[0].setText("XYZ object=new XYZ");jb[1].setText("XYZ object=new XYZ();");jb[2].setText("XYZ object=new XYZ[];");jb[3].setText("None of  above");
		}
		if(current==9)
		{
			l.setText("Que10: What is default value 'char' data type in java?");
			jb[0].setText("0");jb[1].setText("null");jb[2].setText("'\u0000'");jb[3].setText("None of above-");
		}
		l.setBounds(30,40,450,20);
		for(int i=0,j=0;i<=90;i+=30,j++)
			jb[j].setBounds(50,80+i,200,20);
	}
	boolean check()
	{
		if(current==0)
			return(jb[1].isSelected());
		if(current==1)
			return(jb[3].isSelected());
		if(current==2)
			return(jb[2].isSelected());
		if(current==3)
			return(jb[1].isSelected());
		if(current==4)
			return(jb[2].isSelected());
		if(current==5)
			return(jb[2].isSelected());
		if(current==6)
			return(jb[0].isSelected());
		if(current==7)
			return(jb[2].isSelected());
		if(current==8)
			return(jb[1].isSelected());
		if(current==9)
			return(jb[2].isSelected());
		return false;
        }
}
class OnlineTest3 extends JFrame implements ActionListener
{	
	JLabel l;
	JRadioButton jb[]=new JRadioButton[5];
	JButton b1,b2;ButtonGroup bg;
        int count=0,current=0,x=1,y=1,now=0;
	int m[]=new int[10];	
	OnlineTest3(String s)
	{
		super(s);
		l=new JLabel();add(l);
                bg=new ButtonGroup();
		for(int i=0;i<5;i++)
		{
			jb[i]=new JRadioButton();	
			add(jb[i]);
			bg.add(jb[i]);
		}
		b1=new JButton("Next");b2=new JButton("Skip");
                b1.addActionListener(this);b2.addActionListener(this);
		add(b1);add(b2); set();l.setBounds(30,40,450,20);                                
		jb[0].setBounds(50,80,100,20);jb[1].setBounds(50,110,100,20);
		jb[2].setBounds(50,140,100,20);jb[3].setBounds(50,170,100,20);
		b1.setBounds(100,240,100,30);b2.setBounds(270,240,100,30);
		setLayout(null);setLocation(250,100);
		setVisible(true);setSize(600,450);
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==b1)
		{
			if(check())
			count=count+1;current++;set();
			if(current==9)
			{
			b1.setEnabled(false);b2.setText("Result");
			}
		}
		if(e.getActionCommand().equals("Skip"))
		{
			JButton bk=new JButton("Skip"+x);
			bk.setBounds(480,20+30*x,100,30);
			add(bk);bk.addActionListener(this);
			m[x]=current;x++;current++;set();
			if(current==9)
			b2.setText("Result");
			setVisible(false); setVisible(true);
		}
		for(int i=0,y=1;i<x;i++,y++)
		{
		  if(e.getActionCommand().equals("Skip"+y))
		  {
			if(check())
		       count=count+1;now=current;current=m[y];set();
			((JButton)e.getSource()).setEnabled(false);
			current=now;
		  }
		}
		if(e.getActionCommand().equals("Result"))
		{
		     if(check())
			 count=count+1; current++;
                         JOptionPane.showMessageDialog(this,"Correct answers: "+count);
		}
	}
	void set()
	{
		jb[4].setSelected(true);
		if(current==0)
		{
			l.setText("Que1: Which of  the following coding type is used for 'char' data type in java?");
			jb[0].setText("ASCII");jb[1].setText("ISCII");jb[2].setText("Unicode");jb[3].setText("None of above");	
		}
		if(current==1)
		{
			l.setText("Que2: Which of  the following values,a boolean variable can have?");
			jb[0].setText("0 and 1");jb[1].setText("true and false");jb[2].setText("u");jb[3].setText("None of above");
		}
		if(current==2)
		{
			l.setText("Que3: Which of  the following is Wrong syntax for  declering arrays?");
			jb[0].setText("Student[] s=new Person[4]");jb[1].setText("Student s[3];");jb[2].setText("Student[] s[]");jb[3].setText("Student p[][]=new Person[5][]");
		}
		if(current==3)
		{
			l.setText("Que4:Which of the following is wrong syntax for declaring 2-dimentional array?");
			jb[0].setText("Int arr[][]=new int[5][];");jb[1].setText("Int  []arr[]=new int[5][];");jb[2].setText("Int  [][]arr3=new int [5][];");jb[3].setText("None of above");
		}
		if(current==4)
		{
			l.setText("Que5:What should be return type of method which returns float array ?");
			jb[0].setText("float[]");jb[1].setText("[]float");jb[2].setText("flaot");jb[3].setText("None of above");
		}
		if(current==5)
		{
			l.setText("Que6: Which of the following method can accept long 2-D array as argument?");
			jb[0].setText("display([]long[] a)");jb[1].setText("display(lomg[][]a)");jb[2].setText("display([][]long a)");jb[3].setText("None of above");
		}
		if(current==6)
		{
			l.setText("Que7: Which of the following method is used to get charactor at specifide index");
			jb[0].setText("chatAt()");jb[1].setText("charAtIndex()");jb[2].setText("char()");jb[3].setText("None of above");
		}
		if(current==7)
		{
			l.setText("Que8:String is a?");
			jb[0].setText("object");jb[1].setText("variable");jb[2].setText("class");jb[3].setText("None of above");		
		}
		if(current==8)
		{
			l.setText("Que9: Which of the following is  incorrect ?");
			jb[0].setText("String in java are mutable");jb[1].setText("string is a class");jb[2].setText("Every stringin java is object of 'String' class");jb[3].setText("None of  above");
		}
		if(current==9)
		{
			l.setText("Que10: Which  of the following method is used to remove spaces from beginning and end of string ");
			jb[0].setText("removeSpace()");jb[1].setText("trim()");jb[2].setText("'Trim()");jb[3].setText("None of above");
		}
		l.setBounds(30,40,450,20);
		for(int i=0,j=0;i<=90;i+=30,j++)
			jb[j].setBounds(50,80+i,200,20);
	}
	boolean check()
	{
		if(current==0)
			return(jb[2].isSelected());
		if(current==1)
			return(jb[1].isSelected());
		if(current==2)
			return(jb[1].isSelected());
		if(current==3)
			return(jb[3].isSelected());
		if(current==4)
			return(jb[0].isSelected());
		if(current==5)
			return(jb[1].isSelected());
		if(current==6)
			return(jb[0].isSelected());
		if(current==7)
			return(jb[2].isSelected());
		if(current==8)
			return(jb[0].isSelected());
		if(current==9)
			return(jb[1].isSelected());
		return false;
        }
}
class OnlineTest4 extends JFrame implements ActionListener
{	
	JLabel l;
	JRadioButton jb[]=new JRadioButton[5];
	JButton b1,b2;ButtonGroup bg;
        int count=0,current=0,x=1,y=1,now=0;
	int m[]=new int[10];	
	OnlineTest4(String s)
	{
		super(s);
		l=new JLabel();add(l);
		bg=new ButtonGroup();
		for(int i=0;i<5;i++)
		{
			jb[i]=new JRadioButton();	
			add(jb[i]);
			bg.add(jb[i]);
		}
		b1=new JButton("Next");b2=new JButton("Skip");
		b1.addActionListener(this);b2.addActionListener(this);
		add(b1);add(b2);set();l.setBounds(30,40,450,20);                                 
		jb[0].setBounds(50,80,100,20);jb[1].setBounds(50,110,100,20);
		jb[2].setBounds(50,140,100,20);jb[3].setBounds(50,170,100,20);
		b1.setBounds(100,240,100,30);b2.setBounds(270,240,100,30);
		setLayout(null);setLocation(250,100);
		setVisible(true);setSize(600,450);
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==b1)
		{
			if(check())
			count=count+1;current++;set();
			if(current==9)
			{
			b1.setEnabled(false);b2.setText("Result");
			}
		}
		if(e.getActionCommand().equals("Skip"))
		{
			JButton bk=new JButton("Skip"+x);
			bk.setBounds(480,20+30*x,100,30);
			add(bk);bk.addActionListener(this);
			m[x]=current;x++;current++;set();
			if(current==9)
			b2.setText("Result");
			setVisible(false); setVisible(true);
			
		}
		for(int i=0,y=1;i<x;i++,y++)
		{
		  if(e.getActionCommand().equals("Skip"+y))
		  {
			if(check())
		       count=count+1;now=current;current=m[y];set();
			((JButton)e.getSource()).setEnabled(false);
			current=now;
		  }
		}
		if(e.getActionCommand().equals("Result"))
		{
		     if(check())
			 count=count+1; current++;
                         JOptionPane.showMessageDialog(this,"Correct answers: "+count);
		}
	}
     void set()
	{jb[4].setSelected(true);
		if(current==0)
		{
			l.setText("Que1: Which of the following method is used to get charactor at specified"
                                + " index?");
			jb[0].setText("chatAt()");jb[1].setText("charAtIndex()");jb[2].setText("char()");jb[3].setText("None of above");	
		}
		if(current==1)
		{
			l.setText("Que2:Which of the following keyword is used to inherit a class?");
			jb[0].setText("super");jb[1].setText("extends");jb[2].setText("extend");jb[3].setText("thise");
		}
		if(current==2)
		{
			l.setText("Que3: Proetected member of class can be accessed?");
			jb[0].setText("only through inheritance");jb[1].setText("only in same package");jb[2].setText("in same package and through inheritance in other package");jb[3].setText("All are correct");
		}
		if(current==3)
		{
			l.setText("Que4:Which of the following keyword is access member of super class from sub class?");
			jb[0].setText("this");jb[1].setText("super");jb[2].setText("Super");jb[3].setText("None of above");
		}
		if(current==4)
		{
			l.setText("Que5:Which of the following inheritance type is not allowed in java?");
			jb[0].setText("Multilevel");jb[1].setText("Multiple");jb[2].setText("Hirarchical");jb[3].setText("None of above");
		}
		if(current==5)
		{
			l.setText("Que6:Which of the following cannot be declared static?");
			jb[0].setText("method");jb[1].setText("variable");jb[2].setText("class");jb[3].setText("None of above");
		}
		if(current==6)
		{
			l.setText("Que7: Which of the following must be declared static?");
			jb[0].setText("main()");jb[1].setText("constructor");jb[2].setText("run()");jb[3].setText("None of above");
		}
		if(current==7)
		{
			l.setText("Que8:Which of the following keyword is used to prevent 'method overriding'?");
			jb[0].setText("const");jb[1].setText("protected");jb[2].setText("final");jb[3].setText("abstract");		
		}
		if(current==8)
		{
			l.setText("Que9: Which of the following is correct way of calling a default constructor ,of superclass Demo by subclass ?");
			jb[0].setText("super();");jb[1].setText("super.Demo();");jb[2].setText("Demo.super();");jb[3].setText("None of  above");
		}
		if(current==9)
		{
			l.setText("Que10:Method Overriding is also called?");
			jb[0].setText("Compile time Polimorphism");jb[1].setText("Runtime Polimorphism");jb[2].setText("Abstraction");jb
[3].setText("None of above");
		}
		l.setBounds(30,40,450,20);
		for(int i=0,j=0;i<=90;i+=30,j++)
			jb[j].setBounds(50,80+i,200,20);
	}
	boolean check()
	{
		if(current==0)
			return(jb[0].isSelected());
		if(current==1)
			return(jb[1].isSelected());
		if(current==2)
			return(jb[2].isSelected());
		if(current==3)
			return(jb[1].isSelected());
		if(current==4)
			return(jb[1].isSelected());
		if(current==5)
			return(jb[2].isSelected());
		if(current==6)
			return(jb[0].isSelected());
		if(current==7)
			return(jb[2].isSelected());
		if(current==8)
			return(jb[0].isSelected());
		if(current==9)
			return(jb[1].isSelected());
		return false;

        }
}
class OnlineTest5 extends JFrame implements ActionListener
{	
	JLabel l;
	JRadioButton jb[]=new JRadioButton[5];
	JButton b1,b2;ButtonGroup bg;
        int count=0,current=0,x=1,y=1,now=0;
	int m[]=new int[10];	
	OnlineTest5(String s)
	{
		super(s);
		l=new JLabel();add(l);
		bg=new ButtonGroup();
		for(int i=0;i<5;i++)
		{
			jb[i]=new JRadioButton();	
			add(jb[i]);
			bg.add(jb[i]);
		}
		b1=new JButton("Next");b2=new JButton("Skip");
		
                b1.addActionListener(this);b2.addActionListener(this);
		add(b1);add(b2);set();l.setBounds(30,40,450,20);
		jb[0].setBounds(50,80,100,20);jb[1].setBounds(50,110,100,20);
		jb[2].setBounds(50,140,100,20);jb[3].setBounds(50,170,100,20);
		b1.setBounds(100,240,100,30);b2.setBounds(270,240,100,30);
		setLayout(null);setLocation(250,100);
		setVisible(true);setSize(600,450);
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==b1)
		{
			if(check())
			count=count+1;current++;set();
			if(current==9)
			{
			b1.setEnabled(false);b2.setText("Result");
			}
		}
		if(e.getActionCommand().equals("Skip"))
		{
			JButton bk=new JButton("Skip"+x);
			bk.setBounds(480,20+30*x,100,30);
			add(bk);bk.addActionListener(this);
			m[x]=current;x++;current++;set();
			if(current==9)
			b2.setText("Result");setVisible(false); setVisible(true);
		}
		for(int i=0,y=1;i<x;i++,y++)
		{
		  if(e.getActionCommand().equals("Skip"+y))
		  {
			if(check())
		        count=count+1;now=current;current=m[y];set();
			((JButton)e.getSource()).setEnabled(false);
			current=now;
		  }
		}
		if(e.getActionCommand().equals("Result"))
		{
		     if(check())
			 count=count+1; current++;
                         JOptionPane.showMessageDialog(this,"Correct answers: "+count);
		}
	}
	void set()
	{
		jb[4].setSelected(true);
		if(current==0)
		{
			l.setText("Que1:What is true regarding method overriding?");
			jb[0].setText("rited only then it can be overriden");jb[1].setText("final method can't be overridden");jb[2].setText("All of above");jb[3].setText("None of above");	
		}
		if(current==1)
		{
			l.setText("Que2:Method overloading is also called?");
			jb[0].setText("Dynamic or runtime polymorphism");jb[1].setText("Static or compile time polimorphism");jb[2].setText("Encapsulation");jb[3].setText("None of above");
		}
		if(current==2)
		{
			l.setText("Que3:Which of the following can be overloaded?");
			jb[0].setText("Method");jb[1].setText("Constructors");jb[2].setText("Both of above");jb[3].setText("None of above");
		}
		if(current==3)
		{
			l.setText("Que4:JSP pages are");
			jb[0].setText("translated to.java file");jb[1].setText("compiled to.java file");jb[2].setText("translated to servlet");jb[3].setText("both a and c");
		}
		if(current==4)
		{
			l.setText("Que5:Which of not part of JSP life cycle?");
			jb[0].setText("jspInit()");jb[1].setText("service()");jb[2].setText("Loading of servlet instance");jb[3].setText("All are part of JSP life Cycle");
		}
		if(current==5)
		{
			l.setText("Que6:Which of the following method is used for request processing in jsp");
			jb[0].setText("_service()");jb[1].setText("_jspService");jb[2].setText("jspService");jb[3].setText("None of above");
		}
		if(current==6)
		{
			l.setText("Que7:What is use of <%include...%>");
			jb[0].setText("ession");jb[1].setText("Defines file to be included");jb[2].setText("All of above");jb[3].setText("None of above");
		}
		if(current==7)
		{
			l.setText("Que8:What is output of following code? "
                                + "out.print((2*5));");
			jb[0].setText("2*5");jb[1].setText("25");jb[2].setText("10");jb[3].setText("None of above");		
		}
		if(current==8)
		{
			l.setText("Que9: Which of the folowing tag is used for declaration in JSP");
			jb[0].setText("<%%>");jb[1].setText("<%!%>");jb[2].setText("<%@%>");jb[3].setText("None of  above");
		}
		if(current==9)
		{
			l.setText("Que10:Which of the following tag is used for creating instance variables in JSP?");
			jb[0].setText("<%%>");jb[1].setText("<%@%>");jb[2].setText("<%!%>");jb[3].setText("None of above");
		}
		l.setBounds(30,40,450,20);
		for(int i=0,j=0;i<=90;i+=30,j++)
			jb[j].setBounds(50,80+i,200,20);
	}
	boolean check()
	{
		if(current==0)
			return(jb[1].isSelected());
		if(current==1)
			return(jb[1].isSelected());
		if(current==2)
			return(jb[2].isSelected());
		if(current==3)
			return(jb[3].isSelected());
		if(current==4)
			return(jb[1].isSelected());
		if(current==5)
			return(jb[1].isSelected());
		if(current==6)
			return(jb[1].isSelected());
		if(current==7)
			return(jb[2].isSelected());
		if(current==8)
			return(jb[1].isSelected());
		if(current==9)
			return(jb[2].isSelected());
		return false;
       }
}
class OnlineTest6 extends JFrame implements ActionListener
{	
	JLabel l;
	JRadioButton jb[]=new JRadioButton[5];
	JButton b1,b2;ButtonGroup bg;
        int count=0,current=0,x=1,y=1,now=0;
	int m[]=new int[10];	
	OnlineTest6(String s)
	{
		super(s);
		l=new JLabel();	add(l);
		bg=new ButtonGroup();
		for(int i=0;i<5;i++)
		{
			jb[i]=new JRadioButton();	
			add(jb[i]);
			bg.add(jb[i]);
		}
		b1=new JButton("Next");b2=new JButton("Skip");
		b1.addActionListener(this);b2.addActionListener(this);
                add(b1);add(b2);set();l.setBounds(30,40,450,20);
		jb[0].setBounds(50,80,100,20);jb[1].setBounds(50,110,100,20);
		jb[2].setBounds(50,140,100,20);jb[3].setBounds(50,170,100,20);
		b1.setBounds(100,240,100,30);b2.setBounds(270,240,100,30);
		setLayout(null);setLocation(250,100);
		setVisible(true);setSize(600,450);
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==b1)
		{
			if(check())
			count=count+1;current++;set();
			if(current==9)
			{
			b1.setEnabled(false);b2.setText("Result");
			}
		}
		if(e.getActionCommand().equals("Skip"))
		{
			JButton bk=new JButton("Skip"+x);
			bk.setBounds(480,20+30*x,100,30);
			add(bk);bk.addActionListener(this);
			m[x]=current;x++;current++;set();
			if(current==9)
			b2.setText("Result");setVisible(false); setVisible(true);
		}
		for(int i=0,y=1;i<x;i++,y++)
		{
		  if(e.getActionCommand().equals("Skip"+y))
		  {
			if(check())
		        count=count+1;now=current;current=m[y];set();
		        ((JButton)e.getSource()).setEnabled(false);
			current=now;
		  }
		}
		if(e.getActionCommand().equals("Result"))
		{
		     if(check())
			 count=count+1; current++;
                         JOptionPane.showMessageDialog(this,"Correct answers: "+count);
		}
	}
     void set()
	{jb[4].setSelected(true);
		if(current==0)
		{
			l.setText("Que1. If the class name is X, what is the type of its “this” pointer (in a nonstatic, non-const member function)?");
			jb[0].setText("const X* const");jb[1].setText("X* const");jb[2].setText("X*");jb[3].setText("X&");	
		}
		if(current==1)
		{
			l.setText("Que2. Which classes allow primitive types to be accessed as objects?");
			jb[0].setText("Storage");jb[1].setText("Virtual");jb[2].setText("Friend");jb[3].setText("Wrapper");
		}
		if(current==2)
		{
			l.setText("Que3. Which one of the following is not a fundamental data type in C++");
			jb[0].setText("float");jb[1].setText("string");jb[2].setText("int");jb[3].setText("wchar_t");
		}
		if(current==3)
		{
			l.setText("Que4:Which of the following is a valid destructor of the class name 'Country'");
			jb[0].setText("int ~Country()");jb[1].setText("void Country()");jb[2].setText("int ~Country(Country obj)");jb[3].setText("void ~Country()");
		}
		if(current==4)
		{
			l.setText("Que5:Which of the following correctly describes C++ language?");
			jb[0].setText("Statically typed language");jb[1].setText("Dynamically typed language");jb[2].setText("Both Statically and dynamically typed language");jb[3].setText("Type-less language");
		}
		if(current==5)
		{
			l.setText("Que6: Which of the following keyword supports dynamic method resolution?");
			jb[0].setText("abstract");jb[1].setText("Virtual");jb[2].setText("Dynamic");jb[3].setText("Typeid");
		}
		if(current==6)
		{
			l.setText("Que7:Which of the following is not recommended in a header file?");
			jb[0].setText("Type definitions (typedefs)");jb[1].setText("Class definitions");jb[2].setText("Function definitions");jb[3].setText("Template definitions");
		}
		if(current==7)
		{
			l.setText("Que8:Which of the STL containers store the elements contiguously (in adjecent memory locations)?");
			jb[0].setText("std::vector");jb[1].setText("std::list");jb[2].setText("std::list");jb[3].setText("std::set");		
		}
		if(current==8)
		{
			l.setText("Que9:Which of the following is not a standard exception built in C++.");
			jb[0].setText("std::bad_creat");jb[1].setText("std::bad_alloc");jb[2].setText("std::bad_cast");jb[3].setText("std::bad_typeid");
		}
		if(current==9)
		{
			l.setText("Que10:What does STL stand for?");
			jb[0].setText("Simple Template Library");jb[1].setText("Standard Template Library");jb[2].setText("Static Type Library");jb[3].setText("Single Type-based Library");
		}
		l.setBounds(30,40,450,20);
		for(int i=0,j=0;i<=90;i+=30,j++)
			jb[j].setBounds(50,80+i,200,20);
	}
	boolean check()
	{
		if(current==0)
			return(jb[3].isSelected());
		if(current==1)
			return(jb[1].isSelected());
		if(current==2)
			return(jb[0].isSelected());
		if(current==3)
			return(jb[1].isSelected());
		if(current==4)
			return(jb[3].isSelected());
		if(current==5)
			return(jb[0].isSelected());
		if(current==6)
			return(jb[3].isSelected());
		if(current==7)
			return(jb[2].isSelected());
		if(current==8)
			return(jb[0].isSelected());
		if(current==9)
			return(jb[0].isSelected());
		return false;
       }
}
class OnlineTest7 extends JFrame implements ActionListener
{	
	JLabel l;
	JRadioButton jb[]=new JRadioButton[5];
	JButton b1,b2;ButtonGroup bg;
        int count=0,current=0,x=1,y=1,now=0;
	int m[]=new int[10];	
	OnlineTest7(String s)
	{
		super(s);
		l=new JLabel();add(l);
		bg=new ButtonGroup();
		for(int i=0;i<5;i++)
		{
			jb[i]=new JRadioButton();	
			add(jb[i]);
			bg.add(jb[i]);
		}
		b1=new JButton("Next");b2=new JButton("Skip");
		
                b1.addActionListener(this);b2.addActionListener(this);
                add(b1);add(b2);set();l.setBounds(30,40,450,20);  
		jb[0].setBounds(50,80,100,20);jb[1].setBounds(50,110,100,20);
		jb[2].setBounds(50,140,100,20);jb[3].setBounds(50,170,100,20);
		b1.setBounds(100,240,100,30);b2.setBounds(270,240,100,30);
		setLayout(null);setLocation(250,100);
		setVisible(true);setSize(600,450);
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==b1)
		{
			if(check())
			count=count+1;current++;set();
			if(current==9)
			{
			b1.setEnabled(false);b2.setText("Result");
			}
		}
		if(e.getActionCommand().equals("Skip"))
		{
			JButton bk=new JButton("Skip"+x);
			bk.setBounds(480,20+30*x,100,30);
			add(bk);bk.addActionListener(this);
			m[x]=current;x++;current++;set();
			if(current==9)
			b2.setText("Result");setVisible(false); setVisible(true);
		}
		for(int i=0,y=1;i<x;i++,y++)
		{
		  if(e.getActionCommand().equals("Skip"+y))
		  {
			if(check())
		        count=count+1;now=current;current=m[y];set();			
			((JButton)e.getSource()).setEnabled(false);
			current=now;
		  }
		}
		if(e.getActionCommand().equals("Result"))
		{
		     if(check())
			 count=count+1; current++;
                         JOptionPane.showMessageDialog(this,"Correct answers: "+count);
		}
	}
     void set()
	{jb[4].setSelected(true);
		if(current==0)
		{
			l.setText("Que1. Which one of the following is not a valid reserved keyword in C++");
			jb[0].setText("Explicit");jb[1].setText("Public");jb[2].setText("Implicit");jb[3].setText("Private");	
		}
		if(current==1)
		{
			l.setText("Que2.Each pass through a loop is called a/an");
			jb[0].setText("enumeration");jb[1].setText("iteration");jb[2].setText("culmination");jb[3].setText("pass through");
		}
		if(current==2)
		{
			l.setText("Que3. Which of the following relationship is known as inheritancerelationship?");
			jb[0].setText("‘has-a’ relationship");jb[1].setText("‘is-a’ relationship");jb[2].setText("association relationship");jb[3].setText("none of the above");
		}
		if(current==3)
		{
			l.setText("Que4: Which of the following is not a component of file system");
			jb[0].setText("Access method");jb[1].setText("Auxiliary storage management");jb[2].setText("Free integrity mechanism");jb[3].setText("None of the above");
		}
		if(current==4)
		{
			l.setText("Que5: *ptr++ is equivalenet to:");
			jb[0].setText("ptr++");jb[1].setText("*ptr++");jb[2].setText("++*ptr");jb[3].setText("None of the above");
		}
		if(current==5)
		{
			l.setText("Que6: Originally ‘C’ was developed as:");
			jb[0].setText("System programming language");jb[1].setText("General purpose language");jb[2].setText("Data processing language");jb[3].setText("None of above");
		}
		if(current==6)
		{
			l.setText("Que7:Which of the following is not a file operation:");
			jb[0].setText("Repositioning");jb[1].setText("Truncating");jb[2].setText("Appending");jb[3].setText("None of above");
		}
		if(current==7)
		{
			l.setText("Que8:Which looping process checks the test condition at the end of the loop?");
			jb[0].setText("for");jb[1].setText("while");jb[2].setText("do-while");jb[3].setText("no looping process checks the test condition at the end");		
		}
		if(current==8)
		{
			l.setText("Que9:The default access level assigned to members of a class is ___________");
			jb[0].setText("Private");jb[1].setText("Public");jb[2].setText("Protected");jb[3].setText("Needs to be assigned");
		}
		if(current==9)
		{
			l.setText("Que10:Which of the following language is not supported by C++?");
			jb[0].setText("Exception Handling");jb[1].setText("Reflection");jb[2].setText("Operator Overloading");jb[3].setText("Namespaces");
		}
		l.setBounds(30,40,450,20);
		for(int i=0,j=0;i<=90;i+=30,j++)
			jb[j].setBounds(50,80+i,200,20);
	}
	boolean check()
	{
		if(current==0)
			return(jb[2].isSelected());
		if(current==1)
			return(jb[2].isSelected());
		if(current==2)
			return(jb[0].isSelected());
		if(current==3)
			return(jb[2].isSelected());
		if(current==4)
			return(jb[2].isSelected());
		if(current==5)
			return(jb[2].isSelected());
		if(current==6)
			return(jb[0].isSelected());
		if(current==7)
			return(jb[0].isSelected());
		if(current==8)
			return(jb[2].isSelected());
		if(current==9)
			return(jb[3].isSelected());
		return false;
         }
}
class OnlineTest8 extends JFrame implements ActionListener
{	
	JLabel l;
	JRadioButton jb[]=new JRadioButton[5];
	JButton b1,b2;ButtonGroup bg;
        int count=0,current=0,x=1,y=1,now=0;
	int m[]=new int[10];	
	OnlineTest8(String s)
	{
		super(s);
		l=new JLabel();add(l);
		bg=new ButtonGroup();
		for(int i=0;i<5;i++)
		{
			jb[i]=new JRadioButton();	
			add(jb[i]);
			bg.add(jb[i]);
		}
		b1=new JButton("Next");b2=new JButton("Skip");
		b1.addActionListener(this);b2.addActionListener(this);
                add(b1);add(b2);set();l.setBounds(30,40,450,20);
		jb[0].setBounds(50,80,100,20);jb[1].setBounds(50,110,100,20);
		jb[2].setBounds(50,140,100,20);jb[3].setBounds(50,170,100,20);
		b1.setBounds(100,240,100,30);b2.setBounds(270,240,100,30);
		setLayout(null);setLocation(250,100);setVisible(true);setSize(600,450);
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==b1)
		{
			if(check())
			count=count+1;current++;set();
			if(current==9)
			{
			b1.setEnabled(false);b2.setText("Result");
			}
		}
		if(e.getActionCommand().equals("Skip"))
		{
			JButton bk=new JButton("Skip"+x);
			bk.setBounds(480,20+30*x,100,30);
			add(bk);bk.addActionListener(this);
			m[x]=current;x++;current++;set();
			if(current==9)
			b2.setText("Result");
			setVisible(false); setVisible(true);
		}
		for(int i=0,y=1;i<x;i++,y++)
		{
		  if(e.getActionCommand().equals("Skip"+y))
		  {
			if(check())
		        count=count+1;now=current;current=m[y];set();
			((JButton)e.getSource()).setEnabled(false);
			current=now;
		  }
		}
		if(e.getActionCommand().equals("Result"))
		{
		     if(check())
			 count=count+1; current++;
                         JOptionPane.showMessageDialog(this,"Correct answers: "+count);
		}
	}
     void set()
	{jb[4].setSelected(true);
		if(current==0)
		{
			l.setText("Que1.class derived: public base1, public base2 { } is an example of");
			jb[0].setText("Polymorphic inheritance");jb[1].setText("Multilevel inheritance");jb[2].setText("Hierarchical inheritance");jb[3].setText("Multiple inheritance");	
		}
		if(current==1)
		{
			l.setText("Que2Which of the following languages is a subset of C++ language?");
			jb[0].setText("C language");jb[1].setText("Java Language");jb[2].setText("C# language");jb[3].setText("language");
		}
		if(current==2)
		{
			l.setText("Que3. Which of the following language feature is not an access specifier in C++?");
			jb[0].setText("‘public");jb[1].setText("private");jb[2].setText("C protected");jb[3].setText("internal");
		}
		if(current==3)
		{
			l.setText("Que4: The statement i++; is equivalent to");
			jb[0].setText("i = i + i;");jb[1].setText("i = i + 1;");jb[2].setText("i = i - 1;");jb[3].setText("i --;");
		}
		if(current==4)
		{
			l.setText("Que5: In C language, a hexadecimal number is represented by writing");
			jb[0].setText("x");jb[1].setText("xo");jb[2].setText("ox");jb[3].setText("h");
		}
		if(current==5)
		{
			l.setText("Que6: Which of the following library function below by default aborts the program?");
			jb[0].setText("Terminate()");jb[1].setText("end()");jb[2].setText("Abort()");jb[3].setText("exit()");
		}
		if(current==6)
		{
			l.setText("Que7:Value of ix+j, if i,j are integer type and ix long type would be");
			jb[0].setText("integer");jb[1].setText("float");jb[2].setText("long integer");jb[3].setText("double percision");
		}
		if(current==7)
		{
			l.setText("Que8:Which of the following below can perform conversions between pointers to related classes?");
			jb[0].setText("A. cast_static");jb[1].setText("B. dynamic_cast");jb[2].setText("c. static_cast");jb[3].setText("D. cast_dynamic");		
		}
		if(current==8)
		{
			l.setText("Que9:How do we define a constructor?");
			jb[0].setText("a. x~() {}");jb[1].setText("B. X() {}~");jb[2].setText("C. X() ~{}");jb[3].setText("D. ~X() {}");
		}
		if(current==9)
		{
			l.setText("Que10:Vtables");
			jb[0].setText("creates a static table per class");jb[1].setText("creates a static table per object");jb[2].setText("creates a dynamic table per class");jb[3].setText("creates a dynamic table per object");
		}
		l.setBounds(30,40,450,20);
		for(int i=0,j=0;i<=90;i+=30,j++)
			jb[j].setBounds(50,80+i,200,20);
	}
	boolean check()
	{
		if(current==0)
			return(jb[1].isSelected());
		if(current==1)
			return(jb[3].isSelected());
		if(current==2)
			return(jb[3].isSelected());
		if(current==3)
			return(jb[0].isSelected());
		if(current==4)
			return(jb[1].isSelected());
		if(current==5)
			return(jb[3].isSelected());
		if(current==6)
			return(jb[1].isSelected());
		if(current==7)
			return(jb[2].isSelected());
		if(current==8)
			return(jb[2].isSelected());
		if(current==9)
			return(jb[3].isSelected());
		return false;
 }
}
class OnlineTest9 extends JFrame implements ActionListener
{	
	JLabel l;
	JRadioButton jb[]=new JRadioButton[5];
	JButton b1,b2;ButtonGroup bg;
        int count=0,current=0,x=1,y=1,now=0;
	int m[]=new int[10];	
	OnlineTest9(String s)
	{
		super(s);
		l=new JLabel();add(l);
		bg=new ButtonGroup();
		for(int i=0;i<5;i++)
		{
			jb[i]=new JRadioButton();	
			add(jb[i]);
			bg.add(jb[i]);
		}
		b1=new JButton("Next");
		b2=new JButton("Skip");
                b1.addActionListener(this);
		b2.addActionListener(this);add(b1);add(b2);set();                                 
		l.setBounds(30,40,450,20);
		jb[0].setBounds(50,80,100,20);jb[1].setBounds(50,110,100,20);
		jb[2].setBounds(50,140,100,20);jb[3].setBounds(50,170,100,20);
		b1.setBounds(100,240,100,30);b2.setBounds(270,240,100,30);
		setLayout(null);setLocation(250,100);setVisible(true);setSize(600,450);
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==b1)
		{
			if(check())
			count=count+1;current++;set();	
			
			if(current==9)
			{
			b1.setEnabled(false);b2.setText("Result");
			}
		}
		if(e.getActionCommand().equals("Skip"))
		{
			JButton bk=new JButton("Skip"+x);
			bk.setBounds(480,20+30*x,100,30);
			add(bk);bk.addActionListener(this);
			m[x]=current;x++;current++;
			set();	
			if(current==9)
			b2.setText("Result");
			setVisible(false); setVisible(true);
			
		}
		for(int i=0,y=1;i<x;i++,y++)
		{
		  if(e.getActionCommand().equals("Skip"+y))
		  {
			if(check())
		        count=count+1;now=current;current=m[y];
			set();
			((JButton)e.getSource()).setEnabled(false);
			current=now;
		  }
		}
		if(e.getActionCommand().equals("Result"))
		{
		     if(check())
			 count=count+1; current++;
                         JOptionPane.showMessageDialog(this,"Correct answers: "+count);
			// System.exit(0);
		}
	}
     void set()
	{jb[4].setSelected(true);
		if(current==0)
		{
			l.setText("Que1.Which of the following is the most general exception handler that catches exception of any type?");
			jb[0].setText("catch(std::exception)");jb[1].setText("catch(std::any_exception)");jb[2].setText("catch(…)");jb[3].setText
("catch()");	
		}
		if(current==1)
		{
			l.setText("Que2.In a group of nested loops, which loop is executed the most number of times?");
			jb[0].setText("the outermost loop");jb[1].setText("the outermost loop");jb[2].setText("all loops are executed the same number of times");jb[3].setText("cannot be determined without knowing the size of the loops");
		}
		if(current==2)
		{
			l.setText("Que3.Inline functions are invoked at the time of");
			jb[0].setText("‘Run time");jb[1].setText("Compile time");jb[2].setText("Depends on how it is invoked");jb[3].setText("Both b and c above");
		}
		if(current==3)
		{
			l.setText("Que4: Which of the following below is /are a valid iterator type?");
			jb[0].setText("Input Iterator");jb[1].setText("Backward Iterator");jb[2].setText("Forward Iterator");jb[3].setText("Both a and c above");
		}
		if(current==4)
		{
			l.setText("Que5: What defines a general set of operations that will be applied to various types of data?");
			jb[0].setText("Template class");jb[1].setText("Function template");jb[2].setText("Class template");jb[3].setText("Both a and c above");
		}
		if(current==5)
		{
			l.setText("Que6: Which of the following functions below can be used Allocate space for array in memory?");
			jb[0].setText("calloc()");jb[1].setText("malloc()");jb[2].setText("Realloc()");jb[3].setText("both a and b");
		}
		if(current==6)
		{
			l.setText("Que7:STL is based on which of the following programmingparadigms?");
			jb[0].setText("Structured Programming");jb[1].setText("Object Oriented Programming (OOP)");jb[2].setText("Functional Programming");jb[3].setText("Aspect Oriented Programming (AOP)");
		}
		if(current==7)
		{
			l.setText("Que8:If there is more than one statement in the block of a for loop, which of the following must be placed at the beginning and the ending of the loop block?");
			jb[0].setText("parentheses ( )");jb[1].setText("braces { }");jb[2].setText("brackets [ ].");jb[3].setText("arrows < >");		
		}
		if(current==8)
		{
			l.setText("Que9:Which of the following members do get inherited but become private members in child class");
			jb[0].setText("Public");jb[1].setText("Private");jb[2].setText("Protected");jb[3].setText("All the above");
		}
		if(current==9)
		{
			l.setText("Que10:Which looping process is best used when the number of iterations is known?");
			jb[0].setText("for");jb[1].setText("while");jb[2].setText("do-while");jb[3].setText("all looping processes require that the iterations be known");
		}
		l.setBounds(30,40,450,20);
		for(int i=0,j=0;i<=90;i+=30,j++)
			jb[j].setBounds(50,80+i,200,20);
	}
	boolean check()
	{
		if(current==0)
			return(jb[2].isSelected());
		if(current==1)
			return(jb[2].isSelected());
		if(current==2)
			return(jb[2].isSelected());
		if(current==3)
			return(jb[0].isSelected());
		if(current==4)
			return(jb[3].isSelected());
		if(current==5)
			return(jb[3].isSelected());
		if(current==6)
			return(jb[2].isSelected());
		if(current==7)
			return(jb[2].isSelected());
		if(current==8)
			return(jb[1].isSelected());
		if(current==9)
			return(jb[2].isSelected());
		return false;
}
}
class OnlineTest10 extends JFrame implements ActionListener
{	
	JLabel l;
	JRadioButton jb[]=new JRadioButton[5];
	JButton b1,b2;ButtonGroup bg;
        int count=0,current=0,x=1,y=1,now=0;
	int m[]=new int[10];	
	OnlineTest10(String s)
	{
		super(s);
		l=new JLabel();
		add(l);
		bg=new ButtonGroup();
		for(int i=0;i<5;i++)
		{
			jb[i]=new JRadioButton();	
			add(jb[i]);
			bg.add(jb[i]);
		}
		b1=new JButton("Next");
		b2=new JButton("Skip");
                b1.addActionListener(this);
		b2.addActionListener(this);add(b1);add(b2);                                 
		set();
		l.setBounds(30,40,450,20);
		jb[0].setBounds(50,80,100,20);jb[1].setBounds(50,110,100,20);
		jb[2].setBounds(50,140,100,20);jb[3].setBounds(50,170,100,20);
		b1.setBounds(100,240,100,30);b2.setBounds(270,240,100,30);
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null);setLocation(250,100);
		setVisible(true);setSize(600,450);
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==b1)
		{
			if(check())
			count=count+1;current++;
			set();	
			if(current==9)
			{
			b1.setEnabled(false);b2.setText("Result");
			}
		}
		if(e.getActionCommand().equals("Skip"))
		{
			JButton bk=new JButton("Skip"+x);
			bk.setBounds(480,20+30*x,100,30);
			add(bk);bk.addActionListener(this);
			m[x]=current;x++;current++;
			set();	
			if(current==9)
			b2.setText("Result");
			setVisible(false); setVisible(true);
			
		}
		for(int i=0,y=1;i<x;i++,y++)
		{
		  if(e.getActionCommand().equals("Skip"+y))
		  {
			if(check())
		        count=count+1;now=current;current=m[y];
			set();
			((JButton)e.getSource()).setEnabled(false);
			current=now;
		  }
		}
		if(e.getActionCommand().equals("Result"))
		{
		     if(check())
			 count=count+1; current++;
                         JOptionPane.showMessageDialog(this,"Correct answers: "+count);
			 //System.exit(0);
		}
	}
     void set()
	{jb[4].setSelected(true);
		if(current==0)
		{
			l.setText("Que1.In a C language ‘3’ represents");
			jb[0].setText("A digit");jb[1].setText("An integer");jb[2].setText("A character");jb[3].setText("A word");	
		}
		if(current==1)
		{
			l.setText("Que2.Which header file should we include for using std::auto_ptr?");
			jb[0].setText("<memory>");jb[1].setText("<alloc>");jb[2].setText("<autoptr>");jb[3].setText("<smartptr>");
		}
		if(current==2)
		{
			l.setText("Que3.What is the implicit pointer that is passed as the first argument for nonstatic member functions?");
			jb[0].setText("‘‘self’ pointer");jb[1].setText("std::auto_ptr pointer");jb[2].setText("‘Myself’ pointer");jb[3].setText("‘this’ pointer");
		}
		if(current==3)
		{
			l.setText("Que4: Which of the following operators can be overloaded?");
			jb[0].setText(". (dot or member access operator)");jb[1].setText("& (address-of operator)");jb[2].setText("sizeof operator");jb
[3].setText("?: (conditional operator)");
		}
		if(current==4)
		{
			l.setText("Que5: Which of the following operators below allow to define the member functions of a class outside the class?");
			jb[0].setText("::");jb[1].setText("?");jb[2].setText(":?");jb[3].setText("%");
		}
		if(current==5)
		{
			l.setText("Que6: Which of the following is not a valid conditional inclusions in preprocessor directives");
			jb[0].setText("#ifdef");jb[1].setText("#ifundef");jb[2].setText("#endif");jb[3].setText("#elif");
		}
		if(current==6)
		{
			l.setText("Que7:Which of the following is not a standard exception built in C++.");
			jb[0].setText("std::bad_creat");jb[1].setText("std::bad_alloc");jb[2].setText("std::bad_cast");jb[3].setText
("std::bad_typeid");
		}
		if(current==7)
		{
			l.setText("Que8:Which of the following functions below can be used Allocate space for array in memory?");
			jb[0].setText("calloc()");jb[1].setText("malloc()");jb[2].setText("Realloc()");jb[3].setText("both a and b");		
		}
		if(current==8)
		{
			l.setText("Que9:Which of the following is not a valid conditional inclusions in preprocessor directives");
			jb[0].setText("#ifdef");jb[1].setText("#ifundef");jb[2].setText("#endif");jb[3].setText("#elif");
		}
		if(current==9)
		{
			l.setText("Que10:Value of a in a = (b = 5, b + 5); is");
			jb[0].setText("unk value");jb[1].setText("Syntax error");jb[2].setText("5");jb[3].setText("10");
		}
		l.setBounds(30,40,450,20);
		for(int i=0,j=0;i<=90;i+=30,j++)
			jb[j].setBounds(50,80+i,200,20);
	}
	boolean check()
	{
		if(current==0)
			return(jb[0].isSelected());
		if(current==1)
			return(jb[0].isSelected());
		if(current==2)
			return(jb[3].isSelected());
		if(current==3)
			return(jb[3].isSelected());
		if(current==4)
			return(jb[3].isSelected());
		if(current==5)
			return(jb[0].isSelected());
		if(current==6)
			return(jb[1].isSelected());
		if(current==7)
			return(jb[3].isSelected());
		if(current==8)
			return(jb[0].isSelected());
		if(current==9)
			return(jb[1].isSelected());
		return false;
	}
}





import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
 class PageTwo extends JFrame implements ActionListener
{     
        JRadioButton jb[]=new JRadioButton[5];
	JButton b2,b3,b4,b5,b6,a2,a3,a4,a5,a6,imgb;
	ButtonGroup bg; JLabel imgl;
	JLabel l1=new JLabel("JAVA");JLabel l2=new JLabel("C++");
	PageTwo(String s)
	{
		 super(s);
		 setLayout(new BorderLayout());
		 setContentPane(new JLabel(new ImageIcon("G:/hk.jpg")));
		bg=new ButtonGroup();
                b2=new JButton("Collection-1"); a2=new JButton("Collection-1");                  
	        b3=new JButton("Collection-2"); a3=new JButton("Collection-2");                 
		b4=new JButton("Collection-3"); a4=new JButton("Collection-3"); 
                b5=new JButton("Collection-4"); a5=new JButton("Collection-4"); 
                b6=new JButton("Collection-5"); a6=new JButton("Collection-5");                 
                b2.addActionListener(this);     a2.addActionListener(this);
		b3.addActionListener(this);	a3.addActionListener(this);
		b4.addActionListener(this);	a4.addActionListener(this);
		b5.addActionListener(this);	a5.addActionListener(this);
		b6.addActionListener(this);	a6.addActionListener(this);
	  add(l1);add(l2);add(b2);add(b3);add(b4);add(b5);add(b6);add(a2);add(a3);add(a4);add(a5);add(a6);
	  l1.setBounds(145,50,120,20); l2.setBounds(415,50,120,20);    	
                      b2.setBounds(100,100,120,20); a2.setBounds(370,100,120,20);
                      b3.setBounds(100,130,120,20); a3.setBounds(370,130,120,20);
                      b4.setBounds(100,160,120,20); a4.setBounds(370,160,120,20);
                      b5.setBounds(100,190,120,20); a5.setBounds(370,190,120,20);   
                      b6.setBounds(100,220,120,20); a6.setBounds(370,220,120,20);                                                               
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null);setLocation(250,100);
	        setVisible(true);setSize(600,450);
		
	}	
                 public void actionPerformed(ActionEvent e)
               	{
                     if(e.getSource()==b2)
                      {
                            OnlineTest1 ot1=new OnlineTest1("Online Test Of Java");      
                      }                                               
                     if(e.getSource()==b3)
                      {
                            OnlineTest2 ot2=new OnlineTest2("Online Test Of Java");
                      }
                       if(e.getSource()==b4)
                      {
                            OnlineTest3 ot3=new OnlineTest3("Online Test Of Java");
                      }
                       if(e.getSource()==b5)
                      {
                            OnlineTest4 ot4=new OnlineTest4("Online Test Of Java");
                      }
                       if(e.getSource()==b6)
                      {
                            OnlineTest5 ot5=new OnlineTest5("Online Test Of Java");
                      }
                      if(e.getSource()==a2)
                      {
                            OnlineTest6 ot6=new OnlineTest6("Online Test Of Java");
                      }                                               
                     if(e.getSource()==a3)
                      {
                            OnlineTest7 ot7=new OnlineTest7("Online Test Of Java");
                      }
                       if(e.getSource()==a4)
                      {
                            OnlineTest8 ot8=new OnlineTest8("Online Test Of Java");
                      }
                       if(e.getSource()==a5)
                      {
                            OnlineTest9 ot9=new OnlineTest9("Online Test Of Java");
                      }
                       if(e.getSource()==a6)
                      {
                            OnlineTest10 ot10=new OnlineTest10("Online Test Of Java");
                      }
            }
                    public static void main(String s[])
                       	{                            
                             JFrame f=new JFrame(); 
                             try
	                       {
	                    	f.setContentPane(new JLabel(new ImageIcon(ImageIO.read(new File("E:/Test.jpg")))));
                               }
                             catch(IOException e)
	                     	{
	                          e.printStackTrace();
	                        }
                                JButton b=new JButton("Continue");  
                               	JLabel h=new JLabel(".....WELCOME TO TEST.....");
          	               	h.setFont(new Font("Couier New",Font.BOLD,22));h.setForeground(Color.BLUE);          	                	
                                f.add(b);f.add(h);h.setBounds(100,3,300,50);
                                b.setBounds(180,300,110,30);f. setLocation(250,100);
                                b.addActionListener(new ActionListener()
                                	 {        public void actionPerformed(ActionEvent e) 
                      	                       {
                                                  PageTwo ot=new PageTwo("Online Test Of Java"); 
                    	                       }
               	                     });
                                    f.pack(); f.setSize(500,450);f.setLayout(null); f.setVisible(true);
                            }                                               
          }
class OnlineTest1 extends JFrame implements ActionListener
{	
	JLabel l;
	JRadioButton jb[]=new JRadioButton[5];
	JButton b1,b2;ButtonGroup bg;
        int count=0,current=0,x=1,y=1,now=0;
	int m[]=new int[10];	
	OnlineTest1(String s)
	{
		super(s);
		l=new JLabel();
		add(l);
		bg=new ButtonGroup();
		for(int i=0;i<5;i++)
		{
			jb[i]=new JRadioButton();	
			add(jb[i]);
			bg.add(jb[i]);
		}
		b1=new JButton("Next"); b2=new JButton("Skip");
	        b1.addActionListener(this);
		b2.addActionListener(this);add(b1);add(b2);                                 
		set();
		l.setBounds(30,40,450,20);
		jb[0].setBounds(50,80,100,20);jb[1].setBounds(50,110,100,20);
		jb[2].setBounds(50,140,100,20);jb[3].setBounds(50,170,100,20);
		b1.setBounds(100,240,100,30);b2.setBounds(270,240,100,30);
		setLayout(null);setLocation(250,100);
		setVisible(true);setSize(600,450);
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==b1)
		{
			if(check())
			count=count+1;current++;
			set();	
			if(current==9)
			{
			b1.setEnabled(false);b2.setText("Result");
			}
		}
		if(e.getActionCommand().equals("Skip"))
		{
			JButton bk=new JButton("Skip"+x);
			bk.setBounds(480,20+30*x,100,30);
			add(bk);bk.addActionListener(this);
			m[x]=current;x++;current++;
			
			set();	
			if(current==9)
			b2.setText("Result");
			setVisible(false); setVisible(true);
			
		}
		for(int i=0,y=1;i<x;i++,y++)
		{
		  if(e.getActionCommand().equals("Skip"+y))
		  {
			if(check())
		        count=count+1;now=current;current=m[y];
			set();
			((JButton)e.getSource()).setEnabled(false);
			current=now;
		  }
		} 
			if(e.getActionCommand().equals("Result"))
		{
		     if(check())
			 count=count+1; current++;
                         JOptionPane.showMessageDialog(this,"Correct answers: "+count);
	  }
	}
	void set()
	{
		jb[4].setSelected(true);
		if(current==0)
		{
			l.setText("Que1: Which one among these is not a primitive datatype?");
			jb[0].setText("int");jb[1].setText("Float");jb[2].setText("boolean");jb[3].setText("char");	
		}
		if(current==1)
		{
			l.setText("Que2: Which class is the parent class of all classes in java?");
			jb[0].setText("Swing");jb[1].setText("Applet");jb[2].setText("Object");jb[3].setText("ActionEvent");
		}
		if(current==2)
		{
			l.setText("Que3: Which package is directly available to our classes?");
			jb[0].setText("swing");jb[1].setText("applet");jb[2].setText("net");jb[3].setText("lang");
		}
		if(current==3)
		{
			l.setText("Que4: String class is defined in ___ package.");
			jb[0].setText("lang");jb[1].setText("Swing");jb[2].setText("Applet");jb[3].setText("awt");
		}
		if(current==4)
		{
			l.setText("Que5: Which institute is best for java coaching?");
			jb[0].setText("Utek");jb[1].setText("Aptech");jb[2].setText("JavaTpoint");jb[3].setText("jtek");
		}
		if(current==5)
		{
			l.setText("Que6: Which one among these is not a keyword?");
			jb[0].setText("class");jb[1].setText("int");jb[2].setText("get");jb[3].setText("if");
		}
		if(current==6)
		{
			l.setText("Que7: Which one among these is not a class?");
			jb[0].setText("Applet");jb[1].setText("Actionperformed");jb[2].setText("ActionEvent");jb[3].setText      ("Button");
		}
		if(current==7)
		{
			l.setText("Que8: Which among these is not a function of Object class?");
			jb[0].setText("toString");jb[1].setText("finalize");jb[2].setText("equals");jb[3].setText("getDocumentBase");		
		}
		if(current==8)
		{
			l.setText("Que9: Which function is not found in Applet class?");
			jb[0].setText("init");jb[1].setText("main");jb[2].setText("start");jb[3].setText("destroy");
		}
		if(current==9)
		{
			l.setText("Que10: Which one among these is not a valid component?");
			jb[0].setText("JButton");jb[1].setText("JList");jb[2].setText("JButtonGroup");jb[3].setText("JTextArea");
		}
		l.setBounds(30,40,450,20);
		for(int i=0,j=0;i<=90;i+=30,j++)
			jb[j].setBounds(50,80+i,200,20);
	}
	boolean check()
	{
		if(current==0)
			return(jb[1].isSelected());
		if(current==1)
			return(jb[2].isSelected());
		if(current==2)
			return(jb[3].isSelected());
		if(current==3)
			return(jb[0].isSelected());
		if(current==4)
			return(jb[2].isSelected());
		if(current==5)
			return(jb[2].isSelected());
		if(current==6)
			return(jb[1].isSelected());
		if(current==7)
			return(jb[3].isSelected());
		if(current==8)
			return(jb[1].isSelected());
		if(current==9)
			return(jb[2].isSelected());
		return false;
	}
}

class OnlineTest2 extends JFrame implements ActionListener
{	
	JLabel l;
	JRadioButton jb[]=new JRadioButton[5];
	JButton b1,b2;ButtonGroup bg;
        int count=0,current=0,x=1,y=1,now=0;
	int m[]=new int[10];	
	OnlineTest2(String s)
	{
		super(s);
		l=new JLabel();add(l);
		bg=new ButtonGroup();
		for(int i=0;i<5;i++)
		{
			jb[i]=new JRadioButton();	
			add(jb[i]);
			bg.add(jb[i]);
		}
		b1=new JButton("Next");b2=new JButton("Skip");
		b1.addActionListener(this);
		b2.addActionListener(this);add(b1);add(b2);set();                                 
		l.setBounds(30,40,450,20);
		jb[0].setBounds(50,80,100,20);jb[1].setBounds(50,110,100,20);
		jb[2].setBounds(50,140,100,20);jb[3].setBounds(50,170,100,20);
		b1.setBounds(100,240,100,30);b2.setBounds(270,240,100,30);
		setLayout(null);setLocation(250,100);
		setVisible(true);setSize(600,450);
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==b1)
		{
			if(check())
			count=count+1;current++;
			set();	
			if(current==9)
			{
			b1.setEnabled(false);b2.setText("Result");
			}
		}
		if(e.getActionCommand().equals("Skip"))
		{
			JButton bk=new JButton("Skip"+x);
			bk.setBounds(480,20+30*x,100,30);
			add(bk);bk.addActionListener(this);
			m[x]=current;x++;current++;set();
			if(current==9)
			b2.setText("Result");
			setVisible(false); setVisible(true);
		}
		for(int i=0,y=1;i<x;i++,y++)
		{
		  if(e.getActionCommand().equals("Skip"+y))
		  {
			if(check())
		     count=count+1;now=current;current=m[y];
                     ((JButton)e.getSource()).setEnabled(false);
			current=now;
		  }
		}
		if(e.getActionCommand().equals("Result"))
		{
		     if(check())
			 count=count+1; current++;
                         JOptionPane.showMessageDialog(this,"Correct answers: "+count);
                }
	}
	void set()
	{jb[4].setSelected(true);
		if(current==0)
		{
			l.setText("Que1: Which of  the following is syntactically Wrong");
			jb[0].setText("int a");jb[1].setText("int 1b");jb[2].setText("int  _a");jb[3].setText("None of above");	
		}
		if(current==1)
		{
			l.setText("Que2: Which of  the following is syntactically Correct");
			jb[0].setText("int dz");jb[1].setText("int emp");jb[2].setText("int $student");jb[3].setText("All of above");
		}
		if(current==2)
		{
			l.setText("Que3: Which of  the following is Correct syntax of declaring enum");
			jb[0].setText("enum Days{MON,UE,WED}");jb[1].setText("enum Days{MON,UE,WED};");jb[2].setText("both");jb
[3].setText("None of Above");
		}
		if(current==3)
		{
			l.setText("Que4:How many  access Modifiers are there is java");
			jb[0].setText("2");jb[1].setText("3");jb[2].setText("4");jb[3].setText("1");
		}
		if(current==4)
		{
			l.setText("Que5:How many  access  levels are ther is java");
			jb[0].setText("2");jb[1].setText("3");jb[2].setText("4");jb[3].setText("1");
		}
		if(current==5)
		{
			l.setText("Que6: Which of the following class will not compile");
			jb[0].setText("class A{}");jb[1].setText("public class B{}");jb[2].setText("protected class B{}");jb[3].setText("All of  above will compile");
		}
		if(current==6)
		{
			l.setText("Que7: Which of the following class will be accessible in same package but not outside");
			jb[0].setText("class X{}");jb[1].setText("public class Y{}");jb[2].setText("private class Z{}");jb[3].setText("All  of above");
		}
		if(current==7)
		{
			l.setText("Que8: Which of the following method name does not follow JavaBeans standard");
			jb[0].setText("getData");jb[1].setText("setData");jb[2].setText("putData");jb[3].setText("isValid");		
		}
		if(current==8)
		{
			l.setText("Que9: Which is correct of syntax of creating object of  class XYZ");
			jb[0].setText("XYZ object=new XYZ");jb[1].setText("XYZ object=new XYZ();");jb[2].setText("XYZ object=new XYZ[];");jb[3].setText("None of  above");
		}
		if(current==9)
		{
			l.setText("Que10: What is default value 'char' data type in java?");
			jb[0].setText("0");jb[1].setText("null");jb[2].setText("'\u0000'");jb[3].setText("None of above-");
		}
		l.setBounds(30,40,450,20);
		for(int i=0,j=0;i<=90;i+=30,j++)
			jb[j].setBounds(50,80+i,200,20);
	}
	boolean check()
	{
		if(current==0)
			return(jb[1].isSelected());
		if(current==1)
			return(jb[3].isSelected());
		if(current==2)
			return(jb[2].isSelected());
		if(current==3)
			return(jb[1].isSelected());
		if(current==4)
			return(jb[2].isSelected());
		if(current==5)
			return(jb[2].isSelected());
		if(current==6)
			return(jb[0].isSelected());
		if(current==7)
			return(jb[2].isSelected());
		if(current==8)
			return(jb[1].isSelected());
		if(current==9)
			return(jb[2].isSelected());
		return false;
        }
}
class OnlineTest3 extends JFrame implements ActionListener
{	
	JLabel l;
	JRadioButton jb[]=new JRadioButton[5];
	JButton b1,b2;ButtonGroup bg;
        int count=0,current=0,x=1,y=1,now=0;
	int m[]=new int[10];	
	OnlineTest3(String s)
	{
		super(s);
		l=new JLabel();add(l);
                bg=new ButtonGroup();
		for(int i=0;i<5;i++)
		{
			jb[i]=new JRadioButton();	
			add(jb[i]);
			bg.add(jb[i]);
		}
		b1=new JButton("Next");b2=new JButton("Skip");
                b1.addActionListener(this);b2.addActionListener(this);
		add(b1);add(b2); set();l.setBounds(30,40,450,20);                                
		jb[0].setBounds(50,80,100,20);jb[1].setBounds(50,110,100,20);
		jb[2].setBounds(50,140,100,20);jb[3].setBounds(50,170,100,20);
		b1.setBounds(100,240,100,30);b2.setBounds(270,240,100,30);
		setLayout(null);setLocation(250,100);
		setVisible(true);setSize(600,450);
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==b1)
		{
			if(check())
			count=count+1;current++;set();
			if(current==9)
			{
			b1.setEnabled(false);b2.setText("Result");
			}
		}
		if(e.getActionCommand().equals("Skip"))
		{
			JButton bk=new JButton("Skip"+x);
			bk.setBounds(480,20+30*x,100,30);
			add(bk);bk.addActionListener(this);
			m[x]=current;x++;current++;set();
			if(current==9)
			b2.setText("Result");
			setVisible(false); setVisible(true);
		}
		for(int i=0,y=1;i<x;i++,y++)
		{
		  if(e.getActionCommand().equals("Skip"+y))
		  {
			if(check())
		       count=count+1;now=current;current=m[y];set();
			((JButton)e.getSource()).setEnabled(false);
			current=now;
		  }
		}
		if(e.getActionCommand().equals("Result"))
		{
		     if(check())
			 count=count+1; current++;
                         JOptionPane.showMessageDialog(this,"Correct answers: "+count);
		}
	}
	void set()
	{
		jb[4].setSelected(true);
		if(current==0)
		{
			l.setText("Que1: Which of  the following coding type is used for 'char' data type in java?");
			jb[0].setText("ASCII");jb[1].setText("ISCII");jb[2].setText("Unicode");jb[3].setText("None of above");	
		}
		if(current==1)
		{
			l.setText("Que2: Which of  the following values,a boolean variable can have?");
			jb[0].setText("0 and 1");jb[1].setText("true and false");jb[2].setText("u");jb[3].setText("None of above");
		}
		if(current==2)
		{
			l.setText("Que3: Which of  the following is Wrong syntax for  declering arrays?");
			jb[0].setText("Student[] s=new Person[4]");jb[1].setText("Student s[3];");jb[2].setText("Student[] s[]");jb[3].setText("Student p[][]=new Person[5][]");
		}
		if(current==3)
		{
			l.setText("Que4:Which of the following is wrong syntax for declaring 2-dimentional array?");
			jb[0].setText("Int arr[][]=new int[5][];");jb[1].setText("Int  []arr[]=new int[5][];");jb[2].setText("Int  [][]arr3=new int [5][];");jb[3].setText("None of above");
		}
		if(current==4)
		{
			l.setText("Que5:What should be return type of method which returns float array ?");
			jb[0].setText("float[]");jb[1].setText("[]float");jb[2].setText("flaot");jb[3].setText("None of above");
		}
		if(current==5)
		{
			l.setText("Que6: Which of the following method can accept long 2-D array as argument?");
			jb[0].setText("display([]long[] a)");jb[1].setText("display(lomg[][]a)");jb[2].setText("display([][]long a)");jb[3].setText("None of above");
		}
		if(current==6)
		{
			l.setText("Que7: Which of the following method is used to get charactor at specifide index");
			jb[0].setText("chatAt()");jb[1].setText("charAtIndex()");jb[2].setText("char()");jb[3].setText("None of above");
		}
		if(current==7)
		{
			l.setText("Que8:String is a?");
			jb[0].setText("object");jb[1].setText("variable");jb[2].setText("class");jb[3].setText("None of above");		
		}
		if(current==8)
		{
			l.setText("Que9: Which of the following is  incorrect ?");
			jb[0].setText("String in java are mutable");jb[1].setText("string is a class");jb[2].setText("Every stringin java is object of 'String' class");jb[3].setText("None of  above");
		}
		if(current==9)
		{
			l.setText("Que10: Which  of the following method is used to remove spaces from beginning and end of string ");
			jb[0].setText("removeSpace()");jb[1].setText("trim()");jb[2].setText("'Trim()");jb[3].setText("None of above");
		}
		l.setBounds(30,40,450,20);
		for(int i=0,j=0;i<=90;i+=30,j++)
			jb[j].setBounds(50,80+i,200,20);
	}
	boolean check()
	{
		if(current==0)
			return(jb[2].isSelected());
		if(current==1)
			return(jb[1].isSelected());
		if(current==2)
			return(jb[1].isSelected());
		if(current==3)
			return(jb[3].isSelected());
		if(current==4)
			return(jb[0].isSelected());
		if(current==5)
			return(jb[1].isSelected());
		if(current==6)
			return(jb[0].isSelected());
		if(current==7)
			return(jb[2].isSelected());
		if(current==8)
			return(jb[0].isSelected());
		if(current==9)
			return(jb[1].isSelected());
		return false;
        }
}
class OnlineTest4 extends JFrame implements ActionListener
{	
	JLabel l;
	JRadioButton jb[]=new JRadioButton[5];
	JButton b1,b2;ButtonGroup bg;
        int count=0,current=0,x=1,y=1,now=0;
	int m[]=new int[10];	
	OnlineTest4(String s)
	{
		super(s);
		l=new JLabel();add(l);
		bg=new ButtonGroup();
		for(int i=0;i<5;i++)
		{
			jb[i]=new JRadioButton();	
			add(jb[i]);
			bg.add(jb[i]);
		}
		b1=new JButton("Next");b2=new JButton("Skip");
		b1.addActionListener(this);b2.addActionListener(this);
		add(b1);add(b2);set();l.setBounds(30,40,450,20);                                 
		jb[0].setBounds(50,80,100,20);jb[1].setBounds(50,110,100,20);
		jb[2].setBounds(50,140,100,20);jb[3].setBounds(50,170,100,20);
		b1.setBounds(100,240,100,30);b2.setBounds(270,240,100,30);
		setLayout(null);setLocation(250,100);
		setVisible(true);setSize(600,450);
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==b1)
		{
			if(check())
			count=count+1;current++;set();
			if(current==9)
			{
			b1.setEnabled(false);b2.setText("Result");
			}
		}
		if(e.getActionCommand().equals("Skip"))
		{
			JButton bk=new JButton("Skip"+x);
			bk.setBounds(480,20+30*x,100,30);
			add(bk);bk.addActionListener(this);
			m[x]=current;x++;current++;set();
			if(current==9)
			b2.setText("Result");
			setVisible(false); setVisible(true);
			
		}
		for(int i=0,y=1;i<x;i++,y++)
		{
		  if(e.getActionCommand().equals("Skip"+y))
		  {
			if(check())
		       count=count+1;now=current;current=m[y];set();
			((JButton)e.getSource()).setEnabled(false);
			current=now;
		  }
		}
		if(e.getActionCommand().equals("Result"))
		{
		     if(check())
			 count=count+1; current++;
                         JOptionPane.showMessageDialog(this,"Correct answers: "+count);
		}
	}
     void set()
	{jb[4].setSelected(true);
		if(current==0)
		{
			l.setText("Que1: Which of the following method is used to get charactor at specified"
                                + " index?");
			jb[0].setText("chatAt()");jb[1].setText("charAtIndex()");jb[2].setText("char()");jb[3].setText("None of above");	
		}
		if(current==1)
		{
			l.setText("Que2:Which of the following keyword is used to inherit a class?");
			jb[0].setText("super");jb[1].setText("extends");jb[2].setText("extend");jb[3].setText("thise");
		}
		if(current==2)
		{
			l.setText("Que3: Proetected member of class can be accessed?");
			jb[0].setText("only through inheritance");jb[1].setText("only in same package");jb[2].setText("in same package and through inheritance in other package");jb[3].setText("All are correct");
		}
		if(current==3)
		{
			l.setText("Que4:Which of the following keyword is access member of super class from sub class?");
			jb[0].setText("this");jb[1].setText("super");jb[2].setText("Super");jb[3].setText("None of above");
		}
		if(current==4)
		{
			l.setText("Que5:Which of the following inheritance type is not allowed in java?");
			jb[0].setText("Multilevel");jb[1].setText("Multiple");jb[2].setText("Hirarchical");jb[3].setText("None of above");
		}
		if(current==5)
		{
			l.setText("Que6:Which of the following cannot be declared static?");
			jb[0].setText("method");jb[1].setText("variable");jb[2].setText("class");jb[3].setText("None of above");
		}
		if(current==6)
		{
			l.setText("Que7: Which of the following must be declared static?");
			jb[0].setText("main()");jb[1].setText("constructor");jb[2].setText("run()");jb[3].setText("None of above");
		}
		if(current==7)
		{
			l.setText("Que8:Which of the following keyword is used to prevent 'method overriding'?");
			jb[0].setText("const");jb[1].setText("protected");jb[2].setText("final");jb[3].setText("abstract");		
		}
		if(current==8)
		{
			l.setText("Que9: Which of the following is correct way of calling a default constructor ,of superclass Demo by subclass ?");
			jb[0].setText("super();");jb[1].setText("super.Demo();");jb[2].setText("Demo.super();");jb[3].setText("None of  above");
		}
		if(current==9)
		{
			l.setText("Que10:Method Overriding is also called?");
			jb[0].setText("Compile time Polimorphism");jb[1].setText("Runtime Polimorphism");jb[2].setText("Abstraction");jb
[3].setText("None of above");
		}
		l.setBounds(30,40,450,20);
		for(int i=0,j=0;i<=90;i+=30,j++)
			jb[j].setBounds(50,80+i,200,20);
	}
	boolean check()
	{
		if(current==0)
			return(jb[0].isSelected());
		if(current==1)
			return(jb[1].isSelected());
		if(current==2)
			return(jb[2].isSelected());
		if(current==3)
			return(jb[1].isSelected());
		if(current==4)
			return(jb[1].isSelected());
		if(current==5)
			return(jb[2].isSelected());
		if(current==6)
			return(jb[0].isSelected());
		if(current==7)
			return(jb[2].isSelected());
		if(current==8)
			return(jb[0].isSelected());
		if(current==9)
			return(jb[1].isSelected());
		return false;

        }
}
class OnlineTest5 extends JFrame implements ActionListener
{	
	JLabel l;
	JRadioButton jb[]=new JRadioButton[5];
	JButton b1,b2;ButtonGroup bg;
        int count=0,current=0,x=1,y=1,now=0;
	int m[]=new int[10];	
	OnlineTest5(String s)
	{
		super(s);
		l=new JLabel();add(l);
		bg=new ButtonGroup();
		for(int i=0;i<5;i++)
		{
			jb[i]=new JRadioButton();	
			add(jb[i]);
			bg.add(jb[i]);
		}
		b1=new JButton("Next");b2=new JButton("Skip");
		
                b1.addActionListener(this);b2.addActionListener(this);
		add(b1);add(b2);set();l.setBounds(30,40,450,20);
		jb[0].setBounds(50,80,100,20);jb[1].setBounds(50,110,100,20);
		jb[2].setBounds(50,140,100,20);jb[3].setBounds(50,170,100,20);
		b1.setBounds(100,240,100,30);b2.setBounds(270,240,100,30);
		setLayout(null);setLocation(250,100);
		setVisible(true);setSize(600,450);
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==b1)
		{
			if(check())
			count=count+1;current++;set();
			if(current==9)
			{
			b1.setEnabled(false);b2.setText("Result");
			}
		}
		if(e.getActionCommand().equals("Skip"))
		{
			JButton bk=new JButton("Skip"+x);
			bk.setBounds(480,20+30*x,100,30);
			add(bk);bk.addActionListener(this);
			m[x]=current;x++;current++;set();
			if(current==9)
			b2.setText("Result");setVisible(false); setVisible(true);
		}
		for(int i=0,y=1;i<x;i++,y++)
		{
		  if(e.getActionCommand().equals("Skip"+y))
		  {
			if(check())
		        count=count+1;now=current;current=m[y];set();
			((JButton)e.getSource()).setEnabled(false);
			current=now;
		  }
		}
		if(e.getActionCommand().equals("Result"))
		{
		     if(check())
			 count=count+1; current++;
                         JOptionPane.showMessageDialog(this,"Correct answers: "+count);
		}
	}
	void set()
	{
		jb[4].setSelected(true);
		if(current==0)
		{
			l.setText("Que1:What is true regarding method overriding?");
			jb[0].setText("rited only then it can be overriden");jb[1].setText("final method can't be overridden");jb[2].setText("All of above");jb[3].setText("None of above");	
		}
		if(current==1)
		{
			l.setText("Que2:Method overloading is also called?");
			jb[0].setText("Dynamic or runtime polymorphism");jb[1].setText("Static or compile time polimorphism");jb[2].setText("Encapsulation");jb[3].setText("None of above");
		}
		if(current==2)
		{
			l.setText("Que3:Which of the following can be overloaded?");
			jb[0].setText("Method");jb[1].setText("Constructors");jb[2].setText("Both of above");jb[3].setText("None of above");
		}
		if(current==3)
		{
			l.setText("Que4:JSP pages are");
			jb[0].setText("translated to.java file");jb[1].setText("compiled to.java file");jb[2].setText("translated to servlet");jb[3].setText("both a and c");
		}
		if(current==4)
		{
			l.setText("Que5:Which of not part of JSP life cycle?");
			jb[0].setText("jspInit()");jb[1].setText("service()");jb[2].setText("Loading of servlet instance");jb[3].setText("All are part of JSP life Cycle");
		}
		if(current==5)
		{
			l.setText("Que6:Which of the following method is used for request processing in jsp");
			jb[0].setText("_service()");jb[1].setText("_jspService");jb[2].setText("jspService");jb[3].setText("None of above");
		}
		if(current==6)
		{
			l.setText("Que7:What is use of <%include...%>");
			jb[0].setText("ession");jb[1].setText("Defines file to be included");jb[2].setText("All of above");jb[3].setText("None of above");
		}
		if(current==7)
		{
			l.setText("Que8:What is output of following code? "
                                + "out.print((2*5));");
			jb[0].setText("2*5");jb[1].setText("25");jb[2].setText("10");jb[3].setText("None of above");		
		}
		if(current==8)
		{
			l.setText("Que9: Which of the folowing tag is used for declaration in JSP");
			jb[0].setText("<%%>");jb[1].setText("<%!%>");jb[2].setText("<%@%>");jb[3].setText("None of  above");
		}
		if(current==9)
		{
			l.setText("Que10:Which of the following tag is used for creating instance variables in JSP?");
			jb[0].setText("<%%>");jb[1].setText("<%@%>");jb[2].setText("<%!%>");jb[3].setText("None of above");
		}
		l.setBounds(30,40,450,20);
		for(int i=0,j=0;i<=90;i+=30,j++)
			jb[j].setBounds(50,80+i,200,20);
	}
	boolean check()
	{
		if(current==0)
			return(jb[1].isSelected());
		if(current==1)
			return(jb[1].isSelected());
		if(current==2)
			return(jb[2].isSelected());
		if(current==3)
			return(jb[3].isSelected());
		if(current==4)
			return(jb[1].isSelected());
		if(current==5)
			return(jb[1].isSelected());
		if(current==6)
			return(jb[1].isSelected());
		if(current==7)
			return(jb[2].isSelected());
		if(current==8)
			return(jb[1].isSelected());
		if(current==9)
			return(jb[2].isSelected());
		return false;
       }
}
class OnlineTest6 extends JFrame implements ActionListener
{	
	JLabel l;
	JRadioButton jb[]=new JRadioButton[5];
	JButton b1,b2;ButtonGroup bg;
        int count=0,current=0,x=1,y=1,now=0;
	int m[]=new int[10];	
	OnlineTest6(String s)
	{
		super(s);
		l=new JLabel();	add(l);
		bg=new ButtonGroup();
		for(int i=0;i<5;i++)
		{
			jb[i]=new JRadioButton();	
			add(jb[i]);
			bg.add(jb[i]);
		}
		b1=new JButton("Next");b2=new JButton("Skip");
		b1.addActionListener(this);b2.addActionListener(this);
                add(b1);add(b2);set();l.setBounds(30,40,450,20);
		jb[0].setBounds(50,80,100,20);jb[1].setBounds(50,110,100,20);
		jb[2].setBounds(50,140,100,20);jb[3].setBounds(50,170,100,20);
		b1.setBounds(100,240,100,30);b2.setBounds(270,240,100,30);
		setLayout(null);setLocation(250,100);
		setVisible(true);setSize(600,450);
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==b1)
		{
			if(check())
			count=count+1;current++;set();
			if(current==9)
			{
			b1.setEnabled(false);b2.setText("Result");
			}
		}
		if(e.getActionCommand().equals("Skip"))
		{
			JButton bk=new JButton("Skip"+x);
			bk.setBounds(480,20+30*x,100,30);
			add(bk);bk.addActionListener(this);
			m[x]=current;x++;current++;set();
			if(current==9)
			b2.setText("Result");setVisible(false); setVisible(true);
		}
		for(int i=0,y=1;i<x;i++,y++)
		{
		  if(e.getActionCommand().equals("Skip"+y))
		  {
			if(check())
		        count=count+1;now=current;current=m[y];set();
		        ((JButton)e.getSource()).setEnabled(false);
			current=now;
		  }
		}
		if(e.getActionCommand().equals("Result"))
		{
		     if(check())
			 count=count+1; current++;
                         JOptionPane.showMessageDialog(this,"Correct answers: "+count);
		}
	}
     void set()
	{jb[4].setSelected(true);
		if(current==0)
		{
			l.setText("Que1. If the class name is X, what is the type of its “this” pointer (in a nonstatic, non-const member function)?");
			jb[0].setText("const X* const");jb[1].setText("X* const");jb[2].setText("X*");jb[3].setText("X&");	
		}
		if(current==1)
		{
			l.setText("Que2. Which classes allow primitive types to be accessed as objects?");
			jb[0].setText("Storage");jb[1].setText("Virtual");jb[2].setText("Friend");jb[3].setText("Wrapper");
		}
		if(current==2)
		{
			l.setText("Que3. Which one of the following is not a fundamental data type in C++");
			jb[0].setText("float");jb[1].setText("string");jb[2].setText("int");jb[3].setText("wchar_t");
		}
		if(current==3)
		{
			l.setText("Que4:Which of the following is a valid destructor of the class name 'Country'");
			jb[0].setText("int ~Country()");jb[1].setText("void Country()");jb[2].setText("int ~Country(Country obj)");jb[3].setText("void ~Country()");
		}
		if(current==4)
		{
			l.setText("Que5:Which of the following correctly describes C++ language?");
			jb[0].setText("Statically typed language");jb[1].setText("Dynamically typed language");jb[2].setText("Both Statically and dynamically typed language");jb[3].setText("Type-less language");
		}
		if(current==5)
		{
			l.setText("Que6: Which of the following keyword supports dynamic method resolution?");
			jb[0].setText("abstract");jb[1].setText("Virtual");jb[2].setText("Dynamic");jb[3].setText("Typeid");
		}
		if(current==6)
		{
			l.setText("Que7:Which of the following is not recommended in a header file?");
			jb[0].setText("Type definitions (typedefs)");jb[1].setText("Class definitions");jb[2].setText("Function definitions");jb[3].setText("Template definitions");
		}
		if(current==7)
		{
			l.setText("Que8:Which of the STL containers store the elements contiguously (in adjecent memory locations)?");
			jb[0].setText("std::vector");jb[1].setText("std::list");jb[2].setText("std::list");jb[3].setText("std::set");		
		}
		if(current==8)
		{
			l.setText("Que9:Which of the following is not a standard exception built in C++.");
			jb[0].setText("std::bad_creat");jb[1].setText("std::bad_alloc");jb[2].setText("std::bad_cast");jb[3].setText("std::bad_typeid");
		}
		if(current==9)
		{
			l.setText("Que10:What does STL stand for?");
			jb[0].setText("Simple Template Library");jb[1].setText("Standard Template Library");jb[2].setText("Static Type Library");jb[3].setText("Single Type-based Library");
		}
		l.setBounds(30,40,450,20);
		for(int i=0,j=0;i<=90;i+=30,j++)
			jb[j].setBounds(50,80+i,200,20);
	}
	boolean check()
	{
		if(current==0)
			return(jb[3].isSelected());
		if(current==1)
			return(jb[1].isSelected());
		if(current==2)
			return(jb[0].isSelected());
		if(current==3)
			return(jb[1].isSelected());
		if(current==4)
			return(jb[3].isSelected());
		if(current==5)
			return(jb[0].isSelected());
		if(current==6)
			return(jb[3].isSelected());
		if(current==7)
			return(jb[2].isSelected());
		if(current==8)
			return(jb[0].isSelected());
		if(current==9)
			return(jb[0].isSelected());
		return false;
       }
}
class OnlineTest7 extends JFrame implements ActionListener
{	
	JLabel l;
	JRadioButton jb[]=new JRadioButton[5];
	JButton b1,b2;ButtonGroup bg;
        int count=0,current=0,x=1,y=1,now=0;
	int m[]=new int[10];	
	OnlineTest7(String s)
	{
		super(s);
		l=new JLabel();add(l);
		bg=new ButtonGroup();
		for(int i=0;i<5;i++)
		{
			jb[i]=new JRadioButton();	
			add(jb[i]);
			bg.add(jb[i]);
		}
		b1=new JButton("Next");b2=new JButton("Skip");
		
                b1.addActionListener(this);b2.addActionListener(this);
                add(b1);add(b2);set();l.setBounds(30,40,450,20);  
		jb[0].setBounds(50,80,100,20);jb[1].setBounds(50,110,100,20);
		jb[2].setBounds(50,140,100,20);jb[3].setBounds(50,170,100,20);
		b1.setBounds(100,240,100,30);b2.setBounds(270,240,100,30);
		setLayout(null);setLocation(250,100);
		setVisible(true);setSize(600,450);
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==b1)
		{
			if(check())
			count=count+1;current++;set();
			if(current==9)
			{
			b1.setEnabled(false);b2.setText("Result");
			}
		}
		if(e.getActionCommand().equals("Skip"))
		{
			JButton bk=new JButton("Skip"+x);
			bk.setBounds(480,20+30*x,100,30);
			add(bk);bk.addActionListener(this);
			m[x]=current;x++;current++;set();
			if(current==9)
			b2.setText("Result");setVisible(false); setVisible(true);
		}
		for(int i=0,y=1;i<x;i++,y++)
		{
		  if(e.getActionCommand().equals("Skip"+y))
		  {
			if(check())
		        count=count+1;now=current;current=m[y];set();			
			((JButton)e.getSource()).setEnabled(false);
			current=now;
		  }
		}
		if(e.getActionCommand().equals("Result"))
		{
		     if(check())
			 count=count+1; current++;
                         JOptionPane.showMessageDialog(this,"Correct answers: "+count);
		}
	}
     void set()
	{jb[4].setSelected(true);
		if(current==0)
		{
			l.setText("Que1. Which one of the following is not a valid reserved keyword in C++");
			jb[0].setText("Explicit");jb[1].setText("Public");jb[2].setText("Implicit");jb[3].setText("Private");	
		}
		if(current==1)
		{
			l.setText("Que2.Each pass through a loop is called a/an");
			jb[0].setText("enumeration");jb[1].setText("iteration");jb[2].setText("culmination");jb[3].setText("pass through");
		}
		if(current==2)
		{
			l.setText("Que3. Which of the following relationship is known as inheritancerelationship?");
			jb[0].setText("‘has-a’ relationship");jb[1].setText("‘is-a’ relationship");jb[2].setText("association relationship");jb[3].setText("none of the above");
		}
		if(current==3)
		{
			l.setText("Que4: Which of the following is not a component of file system");
			jb[0].setText("Access method");jb[1].setText("Auxiliary storage management");jb[2].setText("Free integrity mechanism");jb[3].setText("None of the above");
		}
		if(current==4)
		{
			l.setText("Que5: *ptr++ is equivalenet to:");
			jb[0].setText("ptr++");jb[1].setText("*ptr++");jb[2].setText("++*ptr");jb[3].setText("None of the above");
		}
		if(current==5)
		{
			l.setText("Que6: Originally ‘C’ was developed as:");
			jb[0].setText("System programming language");jb[1].setText("General purpose language");jb[2].setText("Data processing language");jb[3].setText("None of above");
		}
		if(current==6)
		{
			l.setText("Que7:Which of the following is not a file operation:");
			jb[0].setText("Repositioning");jb[1].setText("Truncating");jb[2].setText("Appending");jb[3].setText("None of above");
		}
		if(current==7)
		{
			l.setText("Que8:Which looping process checks the test condition at the end of the loop?");
			jb[0].setText("for");jb[1].setText("while");jb[2].setText("do-while");jb[3].setText("no looping process checks the test condition at the end");		
		}
		if(current==8)
		{
			l.setText("Que9:The default access level assigned to members of a class is ___________");
			jb[0].setText("Private");jb[1].setText("Public");jb[2].setText("Protected");jb[3].setText("Needs to be assigned");
		}
		if(current==9)
		{
			l.setText("Que10:Which of the following language is not supported by C++?");
			jb[0].setText("Exception Handling");jb[1].setText("Reflection");jb[2].setText("Operator Overloading");jb[3].setText("Namespaces");
		}
		l.setBounds(30,40,450,20);
		for(int i=0,j=0;i<=90;i+=30,j++)
			jb[j].setBounds(50,80+i,200,20);
	}
	boolean check()
	{
		if(current==0)
			return(jb[2].isSelected());
		if(current==1)
			return(jb[2].isSelected());
		if(current==2)
			return(jb[0].isSelected());
		if(current==3)
			return(jb[2].isSelected());
		if(current==4)
			return(jb[2].isSelected());
		if(current==5)
			return(jb[2].isSelected());
		if(current==6)
			return(jb[0].isSelected());
		if(current==7)
			return(jb[0].isSelected());
		if(current==8)
			return(jb[2].isSelected());
		if(current==9)
			return(jb[3].isSelected());
		return false;
         }
}
class OnlineTest8 extends JFrame implements ActionListener
{	
	JLabel l;
	JRadioButton jb[]=new JRadioButton[5];
	JButton b1,b2;ButtonGroup bg;
        int count=0,current=0,x=1,y=1,now=0;
	int m[]=new int[10];	
	OnlineTest8(String s)
	{
		super(s);
		l=new JLabel();add(l);
		bg=new ButtonGroup();
		for(int i=0;i<5;i++)
		{
			jb[i]=new JRadioButton();	
			add(jb[i]);
			bg.add(jb[i]);
		}
		b1=new JButton("Next");b2=new JButton("Skip");
		b1.addActionListener(this);b2.addActionListener(this);
                add(b1);add(b2);set();l.setBounds(30,40,450,20);
		jb[0].setBounds(50,80,100,20);jb[1].setBounds(50,110,100,20);
		jb[2].setBounds(50,140,100,20);jb[3].setBounds(50,170,100,20);
		b1.setBounds(100,240,100,30);b2.setBounds(270,240,100,30);
		setLayout(null);setLocation(250,100);setVisible(true);setSize(600,450);
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==b1)
		{
			if(check())
			count=count+1;current++;set();
			if(current==9)
			{
			b1.setEnabled(false);b2.setText("Result");
			}
		}
		if(e.getActionCommand().equals("Skip"))
		{
			JButton bk=new JButton("Skip"+x);
			bk.setBounds(480,20+30*x,100,30);
			add(bk);bk.addActionListener(this);
			m[x]=current;x++;current++;set();
			if(current==9)
			b2.setText("Result");
			setVisible(false); setVisible(true);
		}
		for(int i=0,y=1;i<x;i++,y++)
		{
		  if(e.getActionCommand().equals("Skip"+y))
		  {
			if(check())
		        count=count+1;now=current;current=m[y];set();
			((JButton)e.getSource()).setEnabled(false);
			current=now;
		  }
		}
		if(e.getActionCommand().equals("Result"))
		{
		     if(check())
			 count=count+1; current++;
                         JOptionPane.showMessageDialog(this,"Correct answers: "+count);
		}
	}
     void set()
	{jb[4].setSelected(true);
		if(current==0)
		{
			l.setText("Que1.class derived: public base1, public base2 { } is an example of");
			jb[0].setText("Polymorphic inheritance");jb[1].setText("Multilevel inheritance");jb[2].setText("Hierarchical inheritance");jb[3].setText("Multiple inheritance");	
		}
		if(current==1)
		{
			l.setText("Que2Which of the following languages is a subset of C++ language?");
			jb[0].setText("C language");jb[1].setText("Java Language");jb[2].setText("C# language");jb[3].setText("language");
		}
		if(current==2)
		{
			l.setText("Que3. Which of the following language feature is not an access specifier in C++?");
			jb[0].setText("‘public");jb[1].setText("private");jb[2].setText("C protected");jb[3].setText("internal");
		}
		if(current==3)
		{
			l.setText("Que4: The statement i++; is equivalent to");
			jb[0].setText("i = i + i;");jb[1].setText("i = i + 1;");jb[2].setText("i = i - 1;");jb[3].setText("i --;");
		}
		if(current==4)
		{
			l.setText("Que5: In C language, a hexadecimal number is represented by writing");
			jb[0].setText("x");jb[1].setText("xo");jb[2].setText("ox");jb[3].setText("h");
		}
		if(current==5)
		{
			l.setText("Que6: Which of the following library function below by default aborts the program?");
			jb[0].setText("Terminate()");jb[1].setText("end()");jb[2].setText("Abort()");jb[3].setText("exit()");
		}
		if(current==6)
		{
			l.setText("Que7:Value of ix+j, if i,j are integer type and ix long type would be");
			jb[0].setText("integer");jb[1].setText("float");jb[2].setText("long integer");jb[3].setText("double percision");
		}
		if(current==7)
		{
			l.setText("Que8:Which of the following below can perform conversions between pointers to related classes?");
			jb[0].setText("A. cast_static");jb[1].setText("B. dynamic_cast");jb[2].setText("c. static_cast");jb[3].setText("D. cast_dynamic");		
		}
		if(current==8)
		{
			l.setText("Que9:How do we define a constructor?");
			jb[0].setText("a. x~() {}");jb[1].setText("B. X() {}~");jb[2].setText("C. X() ~{}");jb[3].setText("D. ~X() {}");
		}
		if(current==9)
		{
			l.setText("Que10:Vtables");
			jb[0].setText("creates a static table per class");jb[1].setText("creates a static table per object");jb[2].setText("creates a dynamic table per class");jb[3].setText("creates a dynamic table per object");
		}
		l.setBounds(30,40,450,20);
		for(int i=0,j=0;i<=90;i+=30,j++)
			jb[j].setBounds(50,80+i,200,20);
	}
	boolean check()
	{
		if(current==0)
			return(jb[1].isSelected());
		if(current==1)
			return(jb[3].isSelected());
		if(current==2)
			return(jb[3].isSelected());
		if(current==3)
			return(jb[0].isSelected());
		if(current==4)
			return(jb[1].isSelected());
		if(current==5)
			return(jb[3].isSelected());
		if(current==6)
			return(jb[1].isSelected());
		if(current==7)
			return(jb[2].isSelected());
		if(current==8)
			return(jb[2].isSelected());
		if(current==9)
			return(jb[3].isSelected());
		return false;
 }
}
class OnlineTest9 extends JFrame implements ActionListener
{	
	JLabel l;
	JRadioButton jb[]=new JRadioButton[5];
	JButton b1,b2;ButtonGroup bg;
        int count=0,current=0,x=1,y=1,now=0;
	int m[]=new int[10];	
	OnlineTest9(String s)
	{
		super(s);
		l=new JLabel();add(l);
		bg=new ButtonGroup();
		for(int i=0;i<5;i++)
		{
			jb[i]=new JRadioButton();	
			add(jb[i]);
			bg.add(jb[i]);
		}
		b1=new JButton("Next");
		b2=new JButton("Skip");
                b1.addActionListener(this);
		b2.addActionListener(this);add(b1);add(b2);set();                                 
		l.setBounds(30,40,450,20);
		jb[0].setBounds(50,80,100,20);jb[1].setBounds(50,110,100,20);
		jb[2].setBounds(50,140,100,20);jb[3].setBounds(50,170,100,20);
		b1.setBounds(100,240,100,30);b2.setBounds(270,240,100,30);
		setLayout(null);setLocation(250,100);setVisible(true);setSize(600,450);
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==b1)
		{
			if(check())
			count=count+1;current++;set();	
			
			if(current==9)
			{
			b1.setEnabled(false);b2.setText("Result");
			}
		}
		if(e.getActionCommand().equals("Skip"))
		{
			JButton bk=new JButton("Skip"+x);
			bk.setBounds(480,20+30*x,100,30);
			add(bk);bk.addActionListener(this);
			m[x]=current;x++;current++;
			set();	
			if(current==9)
			b2.setText("Result");
			setVisible(false); setVisible(true);
			
		}
		for(int i=0,y=1;i<x;i++,y++)
		{
		  if(e.getActionCommand().equals("Skip"+y))
		  {
			if(check())
		        count=count+1;now=current;current=m[y];
			set();
			((JButton)e.getSource()).setEnabled(false);
			current=now;
		  }
		}
		if(e.getActionCommand().equals("Result"))
		{
		     if(check())
			 count=count+1; current++;
                         JOptionPane.showMessageDialog(this,"Correct answers: "+count);
			// System.exit(0);
		}
	}
     void set()
	{jb[4].setSelected(true);
		if(current==0)
		{
			l.setText("Que1.Which of the following is the most general exception handler that catches exception of any type?");
			jb[0].setText("catch(std::exception)");jb[1].setText("catch(std::any_exception)");jb[2].setText("catch(…)");jb[3].setText
("catch()");	
		}
		if(current==1)
		{
			l.setText("Que2.In a group of nested loops, which loop is executed the most number of times?");
			jb[0].setText("the outermost loop");jb[1].setText("the outermost loop");jb[2].setText("all loops are executed the same number of times");jb[3].setText("cannot be determined without knowing the size of the loops");
		}
		if(current==2)
		{
			l.setText("Que3.Inline functions are invoked at the time of");
			jb[0].setText("‘Run time");jb[1].setText("Compile time");jb[2].setText("Depends on how it is invoked");jb[3].setText("Both b and c above");
		}
		if(current==3)
		{
			l.setText("Que4: Which of the following below is /are a valid iterator type?");
			jb[0].setText("Input Iterator");jb[1].setText("Backward Iterator");jb[2].setText("Forward Iterator");jb[3].setText("Both a and c above");
		}
		if(current==4)
		{
			l.setText("Que5: What defines a general set of operations that will be applied to various types of data?");
			jb[0].setText("Template class");jb[1].setText("Function template");jb[2].setText("Class template");jb[3].setText("Both a and c above");
		}
		if(current==5)
		{
			l.setText("Que6: Which of the following functions below can be used Allocate space for array in memory?");
			jb[0].setText("calloc()");jb[1].setText("malloc()");jb[2].setText("Realloc()");jb[3].setText("both a and b");
		}
		if(current==6)
		{
			l.setText("Que7:STL is based on which of the following programmingparadigms?");
			jb[0].setText("Structured Programming");jb[1].setText("Object Oriented Programming (OOP)");jb[2].setText("Functional Programming");jb[3].setText("Aspect Oriented Programming (AOP)");
		}
		if(current==7)
		{
			l.setText("Que8:If there is more than one statement in the block of a for loop, which of the following must be placed at the beginning and the ending of the loop block?");
			jb[0].setText("parentheses ( )");jb[1].setText("braces { }");jb[2].setText("brackets [ ].");jb[3].setText("arrows < >");		
		}
		if(current==8)
		{
			l.setText("Que9:Which of the following members do get inherited but become private members in child class");
			jb[0].setText("Public");jb[1].setText("Private");jb[2].setText("Protected");jb[3].setText("All the above");
		}
		if(current==9)
		{
			l.setText("Que10:Which looping process is best used when the number of iterations is known?");
			jb[0].setText("for");jb[1].setText("while");jb[2].setText("do-while");jb[3].setText("all looping processes require that the iterations be known");
		}
		l.setBounds(30,40,450,20);
		for(int i=0,j=0;i<=90;i+=30,j++)
			jb[j].setBounds(50,80+i,200,20);
	}
	boolean check()
	{
		if(current==0)
			return(jb[2].isSelected());
		if(current==1)
			return(jb[2].isSelected());
		if(current==2)
			return(jb[2].isSelected());
		if(current==3)
			return(jb[0].isSelected());
		if(current==4)
			return(jb[3].isSelected());
		if(current==5)
			return(jb[3].isSelected());
		if(current==6)
			return(jb[2].isSelected());
		if(current==7)
			return(jb[2].isSelected());
		if(current==8)
			return(jb[1].isSelected());
		if(current==9)
			return(jb[2].isSelected());
		return false;
}
}
class OnlineTest10 extends JFrame implements ActionListener
{	
	JLabel l;
	JRadioButton jb[]=new JRadioButton[5];
	JButton b1,b2;ButtonGroup bg;
        int count=0,current=0,x=1,y=1,now=0;
	int m[]=new int[10];	
	OnlineTest10(String s)
	{
		super(s);
		l=new JLabel();
		add(l);
		bg=new ButtonGroup();
		for(int i=0;i<5;i++)
		{
			jb[i]=new JRadioButton();	
			add(jb[i]);
			bg.add(jb[i]);
		}
		b1=new JButton("Next");
		b2=new JButton("Skip");
                b1.addActionListener(this);
		b2.addActionListener(this);add(b1);add(b2);                                 
		set();
		l.setBounds(30,40,450,20);
		jb[0].setBounds(50,80,100,20);jb[1].setBounds(50,110,100,20);
		jb[2].setBounds(50,140,100,20);jb[3].setBounds(50,170,100,20);
		b1.setBounds(100,240,100,30);b2.setBounds(270,240,100,30);
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null);setLocation(250,100);
		setVisible(true);setSize(600,450);
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==b1)
		{
			if(check())
			count=count+1;current++;
			set();	
			if(current==9)
			{
			b1.setEnabled(false);b2.setText("Result");
			}
		}
		if(e.getActionCommand().equals("Skip"))
		{
			JButton bk=new JButton("Skip"+x);
			bk.setBounds(480,20+30*x,100,30);
			add(bk);bk.addActionListener(this);
			m[x]=current;x++;current++;
			set();	
			if(current==9)
			b2.setText("Result");
			setVisible(false); setVisible(true);
			
		}
		for(int i=0,y=1;i<x;i++,y++)
		{
		  if(e.getActionCommand().equals("Skip"+y))
		  {
			if(check())
		        count=count+1;now=current;current=m[y];
			set();
			((JButton)e.getSource()).setEnabled(false);
			current=now;
		  }
		}
		if(e.getActionCommand().equals("Result"))
		{
		     if(check())
			 count=count+1; current++;
                         JOptionPane.showMessageDialog(this,"Correct answers: "+count);
			 //System.exit(0);
		}
	}
     void set()
	{jb[4].setSelected(true);
		if(current==0)
		{
			l.setText("Que1.In a C language ‘3’ represents");
			jb[0].setText("A digit");jb[1].setText("An integer");jb[2].setText("A character");jb[3].setText("A word");	
		}
		if(current==1)
		{
			l.setText("Que2.Which header file should we include for using std::auto_ptr?");
			jb[0].setText("<memory>");jb[1].setText("<alloc>");jb[2].setText("<autoptr>");jb[3].setText("<smartptr>");
		}
		if(current==2)
		{
			l.setText("Que3.What is the implicit pointer that is passed as the first argument for nonstatic member functions?");
			jb[0].setText("‘‘self’ pointer");jb[1].setText("std::auto_ptr pointer");jb[2].setText("‘Myself’ pointer");jb[3].setText("‘this’ pointer");
		}
		if(current==3)
		{
			l.setText("Que4: Which of the following operators can be overloaded?");
			jb[0].setText(". (dot or member access operator)");jb[1].setText("& (address-of operator)");jb[2].setText("sizeof operator");jb
[3].setText("?: (conditional operator)");
		}
		if(current==4)
		{
			l.setText("Que5: Which of the following operators below allow to define the member functions of a class outside the class?");
			jb[0].setText("::");jb[1].setText("?");jb[2].setText(":?");jb[3].setText("%");
		}
		if(current==5)
		{
			l.setText("Que6: Which of the following is not a valid conditional inclusions in preprocessor directives");
			jb[0].setText("#ifdef");jb[1].setText("#ifundef");jb[2].setText("#endif");jb[3].setText("#elif");
		}
		if(current==6)
		{
			l.setText("Que7:Which of the following is not a standard exception built in C++.");
			jb[0].setText("std::bad_creat");jb[1].setText("std::bad_alloc");jb[2].setText("std::bad_cast");jb[3].setText
("std::bad_typeid");
		}
		if(current==7)
		{
			l.setText("Que8:Which of the following functions below can be used Allocate space for array in memory?");
			jb[0].setText("calloc()");jb[1].setText("malloc()");jb[2].setText("Realloc()");jb[3].setText("both a and b");		
		}
		if(current==8)
		{
			l.setText("Que9:Which of the following is not a valid conditional inclusions in preprocessor directives");
			jb[0].setText("#ifdef");jb[1].setText("#ifundef");jb[2].setText("#endif");jb[3].setText("#elif");
		}
		if(current==9)
		{
			l.setText("Que10:Value of a in a = (b = 5, b + 5); is");
			jb[0].setText("unk value");jb[1].setText("Syntax error");jb[2].setText("5");jb[3].setText("10");
		}
		l.setBounds(30,40,450,20);
		for(int i=0,j=0;i<=90;i+=30,j++)
			jb[j].setBounds(50,80+i,200,20);
	}
	boolean check()
	{
		if(current==0)
			return(jb[0].isSelected());
		if(current==1)
			return(jb[0].isSelected());
		if(current==2)
			return(jb[3].isSelected());
		if(current==3)
			return(jb[3].isSelected());
		if(current==4)
			return(jb[3].isSelected());
		if(current==5)
			return(jb[0].isSelected());
		if(current==6)
			return(jb[1].isSelected());
		if(current==7)
			return(jb[3].isSelected());
		if(current==8)
			return(jb[0].isSelected());
		if(current==9)
			return(jb[1].isSelected());
		return false;
	}
}

