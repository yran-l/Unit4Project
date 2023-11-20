import javax.swing.*;

/**
 * Swing application that is used for displaying an animated door.
 */

public class Animation extends JFrame {

    /**
     * Label to display the door animation.
     */

    private JLabel gifLabel;

    /**
     * To keep track of which GIF is being displayed
     * door0 is when the door is completely closed.
     * door1 is the whole opening and closing animation of the door.
     */
    private int currentGifIndex = 0; // Keep track of the current GIF index

    /**
     * Constructs the Animation JFrame.
     * Initializes the frame title, size, and close operation.
     * Creates a GIF label.
     */

    public Animation() {
        setTitle("Animation");
        setSize(1080, 1080);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        gifLabel = new JLabel();
        add(gifLabel);
        updateGif(); // Update the label with the initial GIF
    }

    /**
     * The updateGif method is used to toggle between the two gifs and will update the label.
     */

    public void updateGif() {
        // Toggle between 0 and 1 for the current index
        currentGifIndex = (currentGifIndex + 1) % 2;

        ImageIcon gifIcon = new ImageIcon("door" + currentGifIndex + ".gif");
        gifLabel.setIcon(gifIcon);
    }

    /**
     * Create and displays the Animation JFrame.
     */

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Animation().setVisible(true));
    }
}
