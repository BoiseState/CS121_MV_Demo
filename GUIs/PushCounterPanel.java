import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * Demo basic features of an event-driven GUI.
 * @author mvail
 */
public class PushCounterPanel extends JPanel {
    private int pushCount;
    private JLabel label;
    private JButton upButton;
    private JButton downButton;
    private static final String LABEL = "Pushes: ";
	
	/**
	 * Initializes the buttons and preview panel and adds the listener
	 * to all of the buttons.
	 */
	public PushCounterPanel()
	{
        pushCount = 0;

        label = new JLabel(LABEL + pushCount);
        upButton = new JButton("Increase Count");
        downButton = new JButton("Decrease Count");

        ActionListener buttonListener = new PushButtonListener();
        upButton.addActionListener(buttonListener);
        downButton.addActionListener(buttonListener);

        this.add(upButton); //required or they never show up
        this.add(downButton);
        this.add(label);
	}

    /**
     * Listener for "Push Me" button.
     */
    private class PushButtonListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            JButton sourceButton = (JButton) e.getSource();
            if (sourceButton == upButton) {
                pushCount++;
            } else {
                pushCount--;
            }
            label.setText(LABEL + pushCount);
        }
        
    }
}
