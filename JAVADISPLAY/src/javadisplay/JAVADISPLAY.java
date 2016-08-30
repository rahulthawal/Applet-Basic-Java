/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javadisplay;

/**
 *
 * @author rahulthawal
 */
import java.awt.*;
import java.awt.Graphics2D;
import javax.swing.*;

public class JAVADISPLAY extends JApplet {

    /**
     * @param g2
     * @param args the command line arguments
     */
    public void drawJava(Graphics2D g2) {
        // generate first number randomly. The panel width is 1000
        int x = (int) (Math.random() * 1000); 
        //generate second number randomly. The panel height is 700
        int y = (int) (Math.random() * 700); 
        
        // draw String on these randomly select ed numebrs
        g2.drawString("java", x, y); 
    }
    
   public Color chooseColor() {
        // choosing red color value randomly
        int r = (int) (Math.random() * 255);
        // choosing green color value randomly
        int g = (int) (Math.random() * 255);
        // choosing blue color value randomly
        int b = (int) (Math.random() * 255);
        // constructing a colo r by providing R-G-B values
        Color c = new Color(r, g, b); 
        return c;
   }   
   
   public Font chooseFont() {
        // generating a random value that helps in choosing a font
       int fontChoice = (int) (Math.random() * 4 ) + 1;
       
        // declaring font reference
        Font f = null;
        
        // using switch based logic for selecting font
        switch (fontChoice) 
        {
                case 1: f = new Font("Serif", Font.BOLD, 20);
                break;
                case 2: f = new Font("SansSerif", Font.PLAIN, 17);
                break;
                case 3: f = new Font("Monospaced" , Font.ITALIC, 23);
                break;
                case 4: f = new Font("Dialog", Font.ITALIC, 30);
                break;
        } // end switch
            return f;
   }
   
   public void paint(Graphics g) {

   
   for (int i =1; i <= 400; i++) 
   {
            Graphics2D g2 = (Graphics2D) g;
            // choosing random color by calling chooseColor() method
            Color c = chooseColor();
            
            // setting color
            g2.setColor(c);
            // choosing random Font by calling chooseColor() method
            Font f = chooseFont();
            g2.setFont(f);
            
            // drawing string “java” by calling drawJava() method
            
            drawJava((Graphics2D) g2);
   }
   
   }
   
}