package game.tiles;

import game.GameContainer;

import java.awt.*;
import java.awt.image.BufferedImage;

public class Tile {
    //statics
    public static Tile[] tiles = new Tile[256];
    public static Tile grassTile = new GrassTile(0);

    //class
    public static final int TILE_WIDTH = 32, TILE_HEIGHT = 32;

    protected BufferedImage image;
    protected final int id;

    public Tile(BufferedImage image, int id){
        this.image = image;
        this.id = id;

        tiles[id] = this;
    }
    public void tick(){

    }
    public void render(GameContainer gameContainer, Graphics g,int x, int y){
        g.drawImage(image,x,y,(int)(TILE_WIDTH * gameContainer.getScale()),(int)(TILE_HEIGHT * gameContainer.getScale()),null);
    }
    public boolean isSolid(){
        return false;
    }
    public int getId(){
        return id;
    }


}