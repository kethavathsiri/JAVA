/*. Write a program to create a frame by creating an object to Jframe class and include close
button to terminate the application of the frame.*/
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class MyFrame{
public static void main(String args[]){
JFrame f=new JFrame("MY Frame");
JButton b=new JButton("close");
b.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent e){
System.exit(0);
}
});
f.getContentPane().add(b);
f.setSize(300,200);
f.setVisible(true);
}
}
/*package pack;
import java.applet.Applet;
import java.awt.event.*;
import java.awt.*; 
import javax.swing.*;
class Objects extends JFrame{
public static void main(String[] args) {
JFrame f=new JFrame("JFrame");
//JLabel l=new JLabel("Hello Java");
//l.setBounds(100,50,100,100);
//f.add(l);
f.setSize(300,300);
f.setLayout(null);
f.setVisible(true);
f.addWindowListener(new WindowAdapter() {
public void windowClosing(WindowEvent e) {
System.exit(0);
}});
}
}*/

