package game.game;

import game.GameContainer;

import java.awt.*;

public abstract class AbstractGame {

    public abstract void update(GameContainer gameContainer, float dt);
    public abstract void render(GameContainer gameContainer, Graphics g);

}
