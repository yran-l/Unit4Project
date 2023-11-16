import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Animation extends JFrame {
    /**
     * door0 is when the door is completely closed.
     * door1 is when the door opens from remaining completely closed
     * door2 is when the door remains open from opening.
     * door3 is when the door closes from remaining completely open.
     */
    private JLabel gifLabel;
    private int currentGifIndex = 0; // Keep track of the current GIF index

    public Animation() {
        setTitle("Animation");
        setSize(1080, 1080);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        gifLabel = new JLabel();
        updateGif(); // Initialize the label with the first GIF
        add(gifLabel);

        JButton changeGifButton = new JButton("Change GIF");
        changeGifButton.addActionListener(e -> {
            // Change the GIF when the button is clicked
            currentGifIndex++;
            if (currentGifIndex > 3) {
                currentGifIndex = 0; // Reset to the first GIF
            }
            updateGif(); // Update the label with the new GIF
        });
        add(changeGifButton, BorderLayout.SOUTH);
    }

    public void updateGif() {
        // Load the GIF based on the current index
        ImageIcon gifIcon = new ImageIcon("door" + currentGifIndex + ".gif");
        gifLabel.setIcon(gifIcon);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Animation().setVisible(true));
    }
}
