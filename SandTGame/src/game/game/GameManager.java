package game.game;

import game.GameContainer;
import game.worlds.World;

import java.awt.*;

public class GameManager extends AbstractGame {
    private World world;
    public GameManager(){
        world = new World();
    }
    @Override
    public void update(GameContainer gameContainer, float dt) {
        world.update(gameContainer,dt);
    }

    @Override
    public void render(GameContainer gameContainer, Graphics g) {
        world.render(gameContainer,g);
    }

    @Override
    public void load(GameContainer gameContainer) {
        world.load(gameContainer);
    }
}
