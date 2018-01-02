// Name:Minjie Zhao
// USC NetID:7550095433
// USC loginID: minjiezh@usc.edu
// CS 455 PA1
// Spring 2017


import java.awt.*;
import java.awt.font.FontRenderContext;
import java.awt.geom.Rectangle2D;


/**
 * Bar class
 * A labeled bar that can serve as a single bar in a bar graph.
 * The text for the label is centered under the bar.
 * 
 * NOTE: we have provided the public interface for this class. Do not change
 * the public interface. You can add private instance variables, constants,
 * and private methods to the class. You will also be completing the
 * implementation of the methods given.
 * 
 */
public class Bar {
      int Draw_bottom,Draw_left,Draw_width,Draw_barHeight;
      double Draw_scale;
      Color Draw_color;
      String Draw_label;



   /**
      Creates a labeled bar.  You give the height of the bar in application
      units (e.g., population of a particular state), and then a scale for how
      tall to display it on the screen (parameter scale). 
  
      @param bottom  location of the bottom of the label
      @param left  location of the left side of the bar
      @param width  width of the bar (in pixels)
      @param barHeight  height of the bar in application units
      @param scale  how many pixels per application unit
      @param color  the color of the bar
      @param label  the label at the bottom of the bar
   */
   public Bar(int bottom, int left, int width, int barHeight,
              double scale, Color color, String label) {
      Draw_bottom = bottom;
      Draw_left=left;
      Draw_width=width;
      Draw_barHeight=barHeight;
      Draw_scale=scale;
      Draw_color=color;
      Draw_label= label;
      //System.out.println(Draw_barHeight+","+Draw_scale+","+Draw_width+","+Draw_label);

   }
   
   /**
      Draw the labeled bar. 
      @param g2  the graphics context
   */
   public void draw(Graphics2D g2) {
      Rectangle body = new Rectangle(Draw_left,Draw_bottom-Draw_barHeight, Draw_width, Draw_barHeight);
      //System.out.println(Draw_barHeight+","+Draw_scale+","+Draw_width+","+Draw_label);



      g2.setColor(Draw_color);
      g2.fill(body);
       //String label = "Hello, world!";   // suppose this is the label you want to display
       Font font = g2.getFont();
       FontRenderContext context = g2.getFontRenderContext();
       Rectangle2D labelBounds = font.getStringBounds(Draw_label, context);
       int widthOfLabel = (int)labelBounds.getWidth();
       int heightOfLabel = (int)labelBounds.getHeight();
       g2.setColor(Color.black);
      g2.drawString(Draw_label,Draw_left-(widthOfLabel-Draw_width)/2,Draw_bottom+heightOfLabel);//?????????

   }

}



