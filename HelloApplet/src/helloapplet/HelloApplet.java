/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloapplet;

import java.awt.Graphics;
import javax.swing.JApplet;

/**
 *
 * @author rahulthawal
 */
public class HelloApplet extends JApplet {

    /**
     * @param args the command line arguments
     */
    // overriding paint method
    // overriding init method
public void init ( ) 
{
System.out.println("init() called");
}
// overriding start method
public void start ( )
{
System.out.println("start() called");
}
// overriding paint method

@Override
public void paint(Graphics g) 
{
// write code here u want to display & draw by using Graphics object
    g.drawString("Hello World", 50 , 50);
    
}
    // overriding stop method
public void stop(){
System.out. println("stop() called");
}
// overriding destroy method
public void destroy()
{
System.out.println("destroy() called");
}
    
}
