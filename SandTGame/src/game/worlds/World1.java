package game.worlds;

import game.GameContainer;
import game.assets.Assets;
import game.entities.Player;

import java.awt.*;

public class World1 extends AbstractWorld {
    @Override
    public void update(GameContainer gameContainer, float dt) {
        player.update(gameContainer,dt);
    }

    @Override
    public void render(GameContainer gameContainer, Graphics g) {
        for(int x = 0; x < 200;x++){
            for(int y = 0; y < 200; y++){
                g.drawImage(Assets.tiles.get(map[x][y]),x * Assets.widthSmall * (int)gameContainer.getScale(),y * Assets.widthSmall * (int) gameContainer.getScale(),
                        (int)(Assets.tiles.get(map[x][y]).getWidth() * gameContainer.getScale()),(int)(Assets.tiles.get(map[x][y]).getHeight() * gameContainer.getScale()),null);
            }
        }
        player.render(gameContainer,g);
    }

    @Override
    public void load() {
        map = new int[200][200];
        for(int x = 0; x < 200;x++){
            for(int y = 0; y < 200; y++){
                map[x][y] = 25;
            }
        }
        player = new Player();
    }

    @Override
    public void save() {

    }
}
