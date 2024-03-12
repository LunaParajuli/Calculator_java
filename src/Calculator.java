import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


class Calculator extends JFrame implements ActionListener
{ 
   JLabel l1;
   JButton b0,b1,b2,b3,b4,b5,b6,b7,b8,b9,b11,  add,sub,mul,div,  ans,clr; 
   JTextField t1;
   Container c; 
   
    String s0,s1,s2;
    
  Calculator()
  {
    
    s0=s1=s2="";   
      
   setTitle("Calculator(Luna)");
   setSize(530,430);
   setBackground(Color.DARK_GRAY);
   setLocationRelativeTo(null);
   setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   
   c=this.getContentPane();
   c.setLayout(null);
   
   t1 = new JTextField();
   t1.setBounds(150,30,200,50);
   t1.setBackground(Color.WHITE);
   c.add(t1);
   
   b7=new JButton("7");
   b7.setBounds(30,110,50,50);
   b7.setFont( new Font("Serif",Font.BOLD,25));
   b7.addActionListener(this);
   c.add(b7);
   
   b8=new JButton("8");
   b8.setBounds(100,110,50,50);
   b8.setFont( new Font("Serif",Font.BOLD,25));
   b8.addActionListener(this);
   c.add(b8);
   
   b9=new JButton("9");
   b9.setBounds(170,110,50,50);
   b9.setFont( new Font("Serif",Font.BOLD,25));
   b9.addActionListener(this);
   c.add(b9);
   
   b4=new JButton("4");
   b4.setBounds(30,180,50,50);
   b4.setFont( new Font("Serif",Font.BOLD,25));
   b4.addActionListener(this);
   c.add(b4);
   
   b5=new JButton("5");
   b5.setBounds(100,180,50,50);
   b5.setFont( new Font("Serif",Font.BOLD,25));
   b5.addActionListener(this);
   c.add(b5);
   
   b6=new JButton("6");
   b6.setBounds(170,180,50,50);
   b6.setFont( new Font("Serif",Font.BOLD,25));
   b6.addActionListener(this);
   c.add(b6);
   
   b1=new JButton("1");
   b1.setBounds(30,250,50,50);
   b1.setFont( new Font("Serif",Font.BOLD,25));
   b1.addActionListener(this);
   c.add(b1);
   
   b2=new JButton("2");
   b2.setBounds(100,250,50,50);
   b2.setFont( new Font("Serif",Font.BOLD,25));
   b2.addActionListener(this);
   c.add(b2);
   
   b3=new JButton("3");
   b3.setBounds(170,250,50,50);
   b3.setFont( new Font("Serif",Font.BOLD,25));
   b3.addActionListener(this);
   c.add(b3);
   
   b0= new JButton("0");
   b0.setBounds(30,320,50,50);
   b0.setFont( new Font("Serif",Font.BOLD,25));
   b0.addActionListener(this);
   c.add(b0);
   
   b11= new JButton(".");
   b11.setBounds(100,320,50,50);
   b11.setFont( new Font("Serif",Font.BOLD,25));
   b11.addActionListener(this);
   c.add(b11);
   
   mul=new JButton("*");
   mul.setBounds(290,110,50,50);
   mul.setFont( new Font("Serif",Font.BOLD,25));
   mul.addActionListener(this);
   c.add(mul);
   
   div=new JButton("/");
   div.setBounds(360,110,50,50);
   div.setFont( new Font("Serif",Font.BOLD,25));
   div.addActionListener(this);
   c.add(div);
   
   add=new JButton("+");
   add.setBounds(290,180,50,50);
   add.setFont( new Font("Serif",Font.BOLD,25));
   add.addActionListener(this);
   c.add(add);
   
   sub=new JButton("-");
   sub.setBounds(360,180,50,50);
   sub.setFont( new Font("Serif",Font.BOLD,25));
   sub.addActionListener(this);
   c.add(sub);
   
   ans=new JButton("Ans");
   ans.setBounds(320,290,80,50);
   ans.setFont( new Font("Serif",Font.BOLD,25));
   ans.setBackground(Color.red);
   ans.addActionListener(this);
   c.add(ans);
   
   clr=new JButton("Clr");
   clr.setBounds(410,290,80,50);
   clr.setFont( new Font("Serif",Font.BOLD,25));
   clr.setBackground(Color.red);
   clr.addActionListener(this);
   c.add(clr);
  
   setVisible(true);
  }
  public void actionPerformed(ActionEvent ae)
  {
     
       String s = ae.getActionCommand();
        if ((s.charAt(0) >= '0' && s.charAt(0) <= '9') || s.charAt(0) == '.') {
         if (!s1.equals(""))
           s2 = s2 + s;
            else
                s0 = s0 + s;
            t1.setText(s0 + s1 + s2);
        }
        else if (s.charAt(0) == 'clr') {
            s0 = s1 = s2 = "";
            t1.setText(s0 + s1 + s2);
        }
        else if (s.charAt(0) == 'ans') {
            double te;
            if (s1.equals("+"))
                te = (Double.parseDouble(s0) + Double.parseDouble(s2));
            else if (s1.equals("-"))
                te = (Double.parseDouble(s0) - Double.parseDouble(s2));
            else if (s1.equals("/"))
                te = (Double.parseDouble(s0) / Double.parseDouble(s2));
            else
                te = (Double.parseDouble(s0) * Double.parseDouble(s2));
            t1.setText(s0 + s1 + s2 + "=" + te);
            s0 = Double.toString(te);
            s1 = s2 = "";
        }
        else {
            if (s1.equals("") || s2.equals(""))
                s1 = s;
            else {
                double te;

                if (s1.equals("+"))
                    te = (Double.parseDouble(s0) + Double.parseDouble(s2));
                else if (s1.equals("-"))
                    te = (Double.parseDouble(s0) - Double.parseDouble(s2));
                else if (s1.equals("/"))
                    te = (Double.parseDouble(s0) / Double.parseDouble(s2));
                else
                    te = (Double.parseDouble(s0) * Double.parseDouble(s2));
                s0 = Double.toString(te);
                s1 = s;
                s2 = "";
            }
            t1.setText(s0 + s1 + s2);
        }  
  }   
  
 public static void main(String args[])
   {
    new Calculator() ;
   }
}