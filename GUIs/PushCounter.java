import java.awt.Dimension;
import javax.swing.JFrame;

/**
 * Demonstrates a graphical user interface and an event listener.
 *
 * @author mvail
 */
public class PushCounter
{
   /**
    * Creates and displays the main program frame.
    * @param args
    */
   public static void main(String[] args)
   {
      JFrame frame = new JFrame("Push Counter");
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      // If we want to add something, we must get the contentPanel and add to it.
      frame.getContentPane().add(new PushCounterPanel());

      frame.pack();
      frame.setVisible(true);
   }
}
