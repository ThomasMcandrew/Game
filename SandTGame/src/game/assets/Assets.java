package game.assets;

import game.assets.imageutils.ImageUtils;
import game.assets.imageutils.SpriteSheet;

import java.awt.image.BufferedImage;
import java.util.ArrayList;

public class Assets {
    public static final int widthSmall = 32, heightSmall = 32;
    public static ArrayList<BufferedImage> tiles = new ArrayList<>();
    public static ArrayList<BufferedImage> player = new ArrayList<>();
    public static void init(){
        SpriteSheet sheet = new SpriteSheet(ImageUtils.loadImage("Assets\\floor\\dungeon_tiles.png"));

        for (int y = 0; y < sheet.sheet.getHeight() / heightSmall; y++) {
            for (int x = 0; x < sheet.sheet.getWidth() / widthSmall; x++) {
                    tiles.add(sheet.crop(x * widthSmall, y * heightSmall, widthSmall, heightSmall));
            }
        }
        SpriteSheet _player = new SpriteSheet(ImageUtils.loadImage("Assets\\player\\player.png"));


        for (int y = 0; y < _player.sheet.getHeight() / heightSmall; y++) {
            for (int x = 0; x < _player.sheet.getWidth() / widthSmall; x++) {
                    player.add(_player.crop(x * 64, y * 64, 64, 64));
            }
        }
    }

}
