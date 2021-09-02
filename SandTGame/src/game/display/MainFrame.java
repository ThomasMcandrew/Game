package game.display;

import game.GameContainer;

import javax.swing.*;
import java.awt.*;

import java.awt.image.BufferedImage;

public class MainFrame {

    private JFrame frame;
    private BufferedImage image;
    private Canvas canvas;

    public MainFrame(GameContainer gameContainer){

        image = new BufferedImage(gameContainer.getWidth(), gameContainer.getHeight(),BufferedImage.TYPE_INT_RGB);
        canvas = new Canvas();
        Dimension s = new Dimension((int)(gameContainer.getWidth() * gameContainer.getScale()),(int)(gameContainer.getHeight() * gameContainer.getScale()));
        canvas.setPreferredSize(s);
        canvas.setMaximumSize(s);
        canvas.setMinimumSize(s);

        frame = new JFrame(gameContainer.getTitle());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());
        frame.add(canvas,BorderLayout.CENTER);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setVisible(true);


    }


    public BufferedImage getImage() {
        return image;
    }

    public Canvas getCanvas() {
        return canvas;
    }

    public JFrame getFrame() {
        return frame;
    }
}
