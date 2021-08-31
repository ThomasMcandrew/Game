package game.game;

import game.GameContainer;
import game.display.Renderer;

public abstract class AbstractGame {

    public abstract void update(GameContainer gameContainer, float dt);
    public abstract void render(GameContainer gameContainer, Renderer r);

}
