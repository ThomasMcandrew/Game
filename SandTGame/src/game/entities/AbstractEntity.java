package game.entities;

import game.GameContainer;

import java.awt.*;

public abstract class AbstractEntity {
    protected float x,y;
    protected int width,height;
    public abstract void update(GameContainer gameContainer, float dt);
    public abstract void render(GameContainer gameContainer, Graphics g);
}
