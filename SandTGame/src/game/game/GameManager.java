package game.game;

import game.GameContainer;
import game.worlds.AbstractWorld;
import game.worlds.World1;

import java.awt.*;

public class GameManager extends AbstractGame {
    private AbstractWorld world;
    public GameManager(){
        world = new World1();
        world.load();
    }
    @Override
    public void update(GameContainer gameContainer, float dt) {
        world.update(gameContainer,dt);
    }

    @Override
    public void render(GameContainer gameContainer, Graphics g) {
        world.render(gameContainer,g);
    }
}
