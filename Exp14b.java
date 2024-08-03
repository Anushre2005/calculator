import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
public class Exp14b
{
 public static void main(String[] args)
{
 A a = new A();
 }
}
class A extends JFrame implements ActionListener
{
 double n1, n2, ans;
 char op;
 JFrame j1;
 JTextField t1;
 JButton b0, b1, b2, b3, b4, b5, b6, b7, b8, b9, b_dec, b_add, b_sub, b_mul, b_div, clr, b_eq;
A()
{
 j1 = new JFrame("Calculator");
 t1 = new JTextField(5);
 b0 = new JButton("0");
 b1 = new JButton("1");
 b2 = new JButton("2");
 b3 = new JButton("3");
 b4 = new JButton("4");
 b5 = new JButton("5");
 b6 = new JButton("6");
 b7 = new JButton("7");
 b8 = new JButton("8");
 b9 = new JButton("9");
 b_eq = new JButton("=");
 b_add = new JButton("+");
 b_sub = new JButton("-");
 b_mul = new JButton("*");
 b_div = new JButton("/");
 b_dec = new JButton(".");
 clr = new JButton("CLR");
 b0.addActionListener(this);
 b1.addActionListener(this);
 b2.addActionListener(this);
 b3.addActionListener(this);
 b4.addActionListener(this);
 b5.addActionListener(this);
 b6.addActionListener(this);
 b7.addActionListener(this);
 b8.addActionListener(this);
 b9.addActionListener(this);
 b_add.addActionListener(this);
 b_sub.addActionListener(this);
 b_mul.addActionListener(this);
 b_dec.addActionListener(this);
 b_div.addActionListener(this);
 b_eq.addActionListener(this);
 clr.addActionListener(this);
 j1.add(t1);
 j1.add(clr);
 j1.add(b_eq);
 j1.add(b0);
 j1.add(b1);
 j1.add(b2);
 j1.add(b3);
 j1.add(b4);
 j1.add(b5);
 j1.add(b6);
 j1.add(b7);
 j1.add(b8);
 j1.add(b9);
 j1.add(b_add);
 j1.add(b_sub);
 j1.add(b_mul);
 j1.add(b_div);
 j1.add(b_dec);
 j1.setSize(400, 400);
 j1.setLayout(new FlowLayout());
 j1.setVisible(true);
 j1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 }
 public void actionPerformed(ActionEvent e)
{
 if (e.getSource() == b0)
{
 t1.setText(t1.getText().concat("0"));
 }
else if (e.getSource() == b1)
{
 t1.setText(t1.getText().concat("1"));
 }
else if (e.getSource() == b2)
{
 t1.setText(t1.getText().concat("2"));
 }
else if (e.getSource() == b3)
{
 t1.setText(t1.getText().concat("3"));
 }
else if (e.getSource() == b4)
{
 t1.setText(t1.getText().concat("4"));
 }
else if (e.getSource() == b5)
{
 t1.setText(t1.getText().concat("5"));
 }
else if (e.getSource() == b6)
{
 t1.setText(t1.getText().concat("6"));
 }
else if (e.getSource() == b7)
{
 t1.setText(t1.getText().concat("7"));
 }
else if (e.getSource() == b8)
{
 t1.setText(t1.getText().concat("8"));
 }
else if (e.getSource() == b9)
{
 t1.setText(t1.getText().concat("9"));
 }
else if (e.getSource() == clr)
{
 t1.setText(" ");
 }
else if (e.getSource() == b_dec)
{
 t1.setText(t1.getText().concat("."));
 }
else if (e.getSource() == b_add)
{
 n1 = Double.parseDouble(t1.getText());
 op = '+';
 t1.setText("");
 }
else if (e.getSource() == b_sub)
{
 n1 = Double.parseDouble(t1.getText());
 op = '-';
 t1.setText("");
 } else if (e.getSource() == b_mul)
{
 n1 = Double.parseDouble(t1.getText());
 op = '*';
 t1.setText("");
 }
else if (e.getSource() == b_div)
{
 n1 = Double.parseDouble(t1.getText());
 op = '/';
 t1.setText("");
 }
else if (e.getSource() == b_eq)
{
 n2 = Double.parseDouble(t1.getText());
 switch (op)
{
 case '+':
 ans = n1 + n2;
 break;
 case '-':
 ans = n1 - n2;
 break;
 case '*':
 ans = n1 * n2;
 break;
 case '/':
 ans = n1 / n2;
 break;
 default:
 ans = 0;
 }
 t1.setText("" + ans);
 }
 }
}
