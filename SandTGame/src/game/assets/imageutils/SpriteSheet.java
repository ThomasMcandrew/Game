package game.assets.imageutils;

import java.awt.image.BufferedImage;

public class SpriteSheet {
    public BufferedImage sheet;

    public SpriteSheet(BufferedImage sheet) {
        this.sheet = sheet;
    }

    public BufferedImage crop(int x, int y, int width, int height) {
        if(x + width > sheet.getWidth() || y + height > sheet.getHeight()) {
            return null;
        }
        return sheet.getSubimage(x, y, width, height);
    }
}
