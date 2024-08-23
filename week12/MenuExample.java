/*4.Write a program to create a menu with several menu items.Program:*/
/*package pack;
import javax.swing.*;
import java.awt.*; 
import java.awt.event.*;
class Menu implements ActionListener{
static JLabel text;
public static void main(String args[]){
JFrame frame = new JFrame("Menu");
frame.setSize(500,500);
frame.setLayout(new FlowLayout());
Menu obj = new Menu();

JMenu menu = new JMenu("Select Here");
JMenuItem item[] = new JMenuItem[5];
for(int i=0;i<5;i++)
{
item[i]=new JMenuItem("Item "+(i+1));
item[i].addActionListener(obj);
menu.add(item[i]);
}
JMenuBar mb=new JMenuBar();
mb.add(menu);
frame.setJMenuBar(mb);
text = new JLabel();
frame.add(text);
frame.setVisible(true);
}
public void actionPerformed(ActionEvent e){
text.setText("Menu Item Selected : "+e.getActionCommand());
}}*/

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

 class MenuExample extends JFrame {

    public MenuExample() {
        setTitle("Swing Menu Example");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create a menu bar
        JMenuBar menuBar = new JMenuBar();

        // Create menus
        JMenu fileMenu = new JMenu("File");
        JMenu editMenu = new JMenu("Edit");
        JMenu helpMenu = new JMenu("Help");

        // Create menu items
        JMenuItem newItem = new JMenuItem("New");
        JMenuItem openItem = new JMenuItem("Open");
        JMenuItem saveItem = new JMenuItem("Save");
        JMenuItem exitItem = new JMenuItem("Exit");

        JMenuItem cutItem = new JMenuItem("Cut");
        JMenuItem copyItem = new JMenuItem("Copy");
        JMenuItem pasteItem = new JMenuItem("Paste");

        JMenuItem aboutItem = new JMenuItem("About");

        // Add action listeners to menu items
        exitItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        aboutItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(MenuExample.this, "Swing Menu Example\nCreated by Your Name");
            }
        });

        // Add menu items to menus
        fileMenu.add(newItem);
        fileMenu.add(openItem);
        fileMenu.add(saveItem);
        fileMenu.addSeparator();
        fileMenu.add(exitItem);

        editMenu.add(cutItem);
        editMenu.add(copyItem);
        editMenu.add(pasteItem);

        helpMenu.add(aboutItem);

        // Add menus to menu bar
        menuBar.add(fileMenu);
        menuBar.add(editMenu);
        menuBar.add(helpMenu);

        // Set the menu bar for the frame
        setJMenuBar(menuBar);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new MenuExample().setVisible(true);
            }
        });
    }
}

