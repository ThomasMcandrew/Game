package game.worlds;

import game.GameContainer;
import game.assets.Assets;
import game.entities.AbstractEntity;
import game.entities.Player;
import game.tiles.Tile;

import java.awt.*;
import java.util.ArrayList;

public class World {
    protected Player player;
    protected ArrayList<AbstractEntity> entities;
    protected Tile[][] map;
    public void update(GameContainer gameContainer, float dt){
        player.update(gameContainer,dt);

    }
    public void render(GameContainer gameContainer, Graphics g){
        for(int x = 0; x < 200;x++){
            for(int y = 0; y < 200; y++){
                map[x][y].render(gameContainer,g,x * Assets.widthSmall * (int)gameContainer.getScale(),y * Assets.widthSmall * (int) gameContainer.getScale());
            }
        }
        player.render(gameContainer,g);
    }
    public void load(GameContainer gameContainer){
        map = new Tile[200][200];
        for(int x = 0; x < 200;x++){
            for(int y = 0; y < 200; y++){
                map[x][y] = Tile.tiles[0];
            }
        }
        player = new Player(gameContainer,39,30,32,32);
    }
    public void save(){

    }
}
