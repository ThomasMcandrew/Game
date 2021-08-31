package game.assets.imageutils;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class ImageUtils {

    public static BufferedImage loadImage(String path) {
        try {
//			return ImageIO.read(ImageLoader.class.getResource(path));
            return ImageIO.read(new File(path));

        } catch (IOException e) {
            System.out.println("Error");
            // TODO Auto-generated catch block
            e.printStackTrace();
            System.exit(1);
        }
        return null;
    }

}
