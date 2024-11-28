/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package stack.calculator;
import java.io.*;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import java.awt.*;
public class stack {

/**
 *This class will return an image
 *from a binary data.
 */
class BufferedImageCustom {
   public Image imageReturn() 
      throws IOException {
      Image image;
      
      InputStream bis = getClass().getResourceAsStream("/resources/icon/icon.png");
      BufferedImage bImage2 = ImageIO.read(bis);
      image = bImage2;
      
      return image;
   }       
}



    }

    // Add methods for your calculator logic (e.g., push, pop, evaluate expressions, etc.)


