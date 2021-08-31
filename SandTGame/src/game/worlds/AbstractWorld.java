package game.worlds;

import game.GameContainer;
import game.display.Renderer;
import game.entities.AbstractEntity;

import java.util.ArrayList;

public abstract class AbstractWorld {
    protected ArrayList<AbstractEntity> entities;
    public abstract void update(GameContainer gameContainer, float dt);
    public abstract void render(GameContainer gameContainer, Renderer r);
    public abstract void load();
    public abstract void save();
}
