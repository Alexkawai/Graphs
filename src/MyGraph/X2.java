/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package MyGraph;
 import java.awt.Color;
 import java.awt.Graphics; 
import javax.swing.JFrame; 
public class X2 extends JFrame { 
X2(String s){ 
super(s); 
setLayout(null);
 setSize(600,300); 
setVisible(true); 
this.setDefaultCloseOperation(DISPOSE_ON_CLOSE); 
this.setResizable(false);
 this.setLocation(300, 300); 
} 
@Override
public void paint(Graphics gr){ 
int y; int j=0; int k=0; 
gr.setColor(Color.WHITE); 
gr.fillRect(0, 0, 600, 300);
 gr.setColor(Color.lightGray);
 while (j<600){
     gr.drawLine(j, 0, j, 300);
     j+=30;
 }
  while (j <300){
     gr.drawLine(0, k, 600, k);
     k+=30;
 }
  gr.setColor(Color.BLACK);
  gr.drawLine(300, 0, 300, 300);
  gr.drawLine(0, 250, 600, 250);
  gr.drawLine(120, 240, 120, 260);
  gr.drawLine(480, 240, 480, 260);
  gr.drawString("0",305,165);
  gr.drawString("-"+"\u03c0",125,240);
  gr.drawString("\u03c0",485,240);
  gr.setColor(Color.red);
  for(double i=0;i<1000;i++){
      y=-(int)(i*i/300)+250;
      gr.drawLine((int)i+300, y, (int)i+300, y);
      gr.drawLine(-(int)i+300, y, -(int)i+300, y);
  }
 gr.dispose();
}
}
