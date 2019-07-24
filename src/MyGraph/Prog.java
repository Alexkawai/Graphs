/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyGraph;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
/**
 *
 * @author lehai
 */
public class Prog extends JFrame {
 Prog(String s){
 
super(s);
setLayout(null);
setSize(100,300);
setVisible(true);
//setResizable(false);
setDefaultCloseOperation(EXIT_ON_CLOSE);
Button b1=new Button("First button");
b1.setBounds(2,5,96,22);
add(b1);
Button b2=new Button("Second button");
b1.setBounds(2,100,96,22);
add(b2);
b1.addActionListener(new Handler(b1,b2));
b2.addActionListener(new Handler(b1,b2));
        }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       // System.out.print("Hello");
        new Prog("");  
        Graphic gr = new Graphic("");
    } 
}
class Handler implements ActionListener{
 private Button ba;
 private Button bb;
 String temp;
 Handler(Button b1,Button b2){
 this.ba=b1;
 this.bb=b2;
 }

    @Override
    public void actionPerformed(ActionEvent e) {
         temp=ba.getLabel();
 ba.setLabel(bb.getLabel());
 bb.setLabel(temp); //To change body of generated methods, choose Tools | Templates.
    }
}