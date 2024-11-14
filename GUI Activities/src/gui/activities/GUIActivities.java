/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gui.activities;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
/**
 *
 * @author USER
 */
public class GUIActivities extends JFrame {
    
    private JLabel lable1,label2;
    private JTextField textField1 = new JTextField(10);
    private JButton plainButton1,plainButton2;
    private JRadioButton b1,b2,b3;
    private JCheckBox cb1,cb2;
    
    public GUIActivities(){
       super("Think");
       Container container = getContentPane();
       container.setLayout(new FlowLayout());
       JLabel label1 = new JLabel("What is this animal?");
       label1.setToolTipText("this is label1");
       container.add(label1);
       setSize(275,200);
       setVisible(true);
       Icon dragon = new ImageIcon("GUIActivities/src/gui/dragon.jpg");
       JLabel label2 = new JLabel("", dragon,SwingConstants.LEFT);
       label2.setToolTipText("This is a dragon");
       container.add(label2);
       
       container.add(textField1);
       plainButton1 = new JButton("Dragon");
       plainButton2 = new JButton("Rabbit");
       plainButton1.setSize(100,40); plainButton2.setSize(100,80);
       plainButton1.setLocation(20,30); plainButton2.setLocation(40,80);
       container.add(plainButton1);add(plainButton2);
       
       b1 = new JRadioButton("Zebra");
       b2 = new JRadioButton("Bird");
       b3 = new JRadioButton("Lion");
       
       b1.setBounds(20,20,200,50);
       b2.setBounds(20,70,200,50);
       b3.setBounds(20,110,200,50);
       
       container.add(b1);
       container.add(b2);
       container.add(b3);
       
       cb1 = new JCheckBox("Fish");
       cb2 = new JCheckBox("Cat");
       
       cb1.setBounds(20,20,200,50);
       cb2.setBounds(20,70,200,50);
       
       add(cb1);
       add(cb2);

    }
    public static void main(String[] args) {
        GUIActivities application = new GUIActivities();
        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
