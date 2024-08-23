/*2. Create a GUI with title STUDENT which has labels roll no., name, course, gender, class,
address with textboxes for taking input from the user(without any functionality) and
checkboxes for selecting the course, radio buttons for selecting gender with appropriate
background color.*/

import java.applet.Applet;
import java.awt.event.*;
import java.awt.*; 
import javax.swing.*;
import java.lang.*;
import java.awt.*;
import java.awt.event.*;

class Student extends Frame {
    Label l1, l2, l3, l4, l5, l6;
    TextField t1, t2, t3, t4, t5, t6;

    Student() {
        l1 = new Label("Name");
        l1.setBounds(60, 80, 100, 20);
        l2 = new Label("Roll No");
        l2.setBounds(60, 110, 100, 20);
        l3 = new Label("course");
        l3.setBounds(60, 140, 100, 20);
        l4 = new Label("gender");
        l4.setBounds(60, 170, 100, 20);
        l5 = new Label("class");
        l5.setBounds(60, 200, 100, 20);
        l6 = new Label("address");
        l6.setBounds(60, 230, 100, 20);

        t1 = new TextField();
        t1.setBounds(160, 80, 200, 20);
        t2 = new TextField();
        t2.setBounds(160, 110, 200, 20);
        t3 = new TextField();
        t3.setBounds(160, 200, 200, 20);
        t4 = new TextField();
        t4.setBounds(160, 230, 200, 20);

        Checkbox c1 = new Checkbox("java");
        c1.setBounds(160, 140, 90, 20);
        Checkbox c2 = new Checkbox("Dsa");
        c2.setBounds(250, 140, 90, 20);

        CheckboxGroup cbg = new CheckboxGroup();
        Checkbox c3 = new Checkbox("male", false, cbg);
        c3.setBounds(160, 170, 90, 20);
        Checkbox c4 = new Checkbox("female", false, cbg);
        c4.setBounds(250, 170, 90, 20);

        Button b = new Button("submit");
        b.setBounds(160, 280, 90, 30);
        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                setBackground(Color.BLACK);
            }
        });

        add(l1);
        add(l2);
        add(l3);
        add(l4);
        add(l5);
        add(l6);
        add(t1);
        add(t2);
        add(t3);
        add(t4);
        add(c1);
        add(c2);
        add(c3);
        add(c4);
        add(b);

        setSize(400, 400);
        setTitle("Student details");
        setLayout(null);
        setVisible(true);
    }

    public static void main(String args[]) {
        Student s = new Student();
    }
}

 /*class Students extends Applet{
public static Label l,l1,l2,l3,l4,l5,l6,l7;
public static TextField t1,t2,t3,t4;
public static JComboBox cb;
public static void main(String[] args) {
Frame f=new Frame("Student Registration form");
f.setBackground(Color.PINK);
l1=new Label("Roll no");
l1.setBounds(50,80,50,20);
l2=new Label("Name");
l2.setBounds(50,110,50,20);

l3=new Label("Class");
l3.setBounds(50,140,50,20);
l4=new Label("Gender");
l4.setBounds(50,170,50,20);
//l7=new Label("collage");
//l7.setBounds(50,170,50,20);
l5=new Label("Course");
l5.setBounds(50,200,50,20);
l6=new Label("Address");
l6.setBounds(50,230,50,20);
String course[]={"DSA","DAA","OOPS","C","DBMS","COA"};
cb=new JComboBox(course);
cb.setBounds(140,200,80,20);
t1=new TextField();
t1.setBounds(140,80,100,20);
t2=new TextField();
t2.setBounds(140,110,100,20);
t3=new TextField();
t3.setBounds(140,230,100,20); 
CheckboxGroup cbg=new CheckboxGroup(); 
Checkbox box1=new Checkbox("024",false,cbg);
Checkbox box2=new Checkbox("025",false,cbg); 
Checkbox box3=new Checkbox("026",false,cbg); box1.setBounds(140,140,40,20);
box2.setBounds(200,140,40,20);
box3.setBounds(240,140,40,20); 
CheckboxGroup cbg1=new CheckboxGroup();
Checkbox box4=new Checkbox("Male",false,cbg1); 
Checkbox box5=new Checkbox("Female",false,cbg1);
box4.setBounds(140,170,60,20);
box5.setBounds(200,170,60,20); 
Button b=new Button("Submit");
b.setBounds(140,280,70,30);
l=new Label("Submitted!");
l.setBounds(140,320,70,40);
l.setVisible(false);
b.addActionListener(new ActionListener(){
//@java.lang.Override
public void actionPerformed(ActionEvent e){
l.setVisible(true);
}
});
f.add(l1);
f.add(l2);
//f.add(l7);
f.add(l3);
f.add(l4);
f.add(l6);
f.add(t1);
f.add(t2);
f.add(box1);
f.add(box2);
f.add(box3);
f.add(box4);
f.add(box5);
f.add(l5);
f.add(cb);
f.add(t3);
f.add(b);
f.add(l);
//f.add(l7);
f.setSize(400,400);
f.setLayout(null);
f.setVisible(true);
f.addWindowListener(new WindowAdapter() { 
public void windowClosing(WindowEvent e) {
System.exit(0);}
});
}}*/
