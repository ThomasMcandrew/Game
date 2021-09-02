package game.entities;

import game.GameContainer;

import javax.swing.text.html.parser.Entity;
import java.awt.*;

public abstract class AbstractEntity {
    public static final int DEFAULT_HEALTH = 3;
    protected float x,y;
    protected int health;
    protected int width,height;
    protected Rectangle bounds;
    protected GameContainer gameContainer;

    public AbstractEntity(GameContainer gameContainer, float x, float y, int width, int height){
        this.gameContainer = gameContainer;
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        health = DEFAULT_HEALTH;
        bounds = new Rectangle(0,0,width,height);
    }

    public abstract void update(GameContainer gameContainer, float dt);
    public abstract void render(GameContainer gameContainer, Graphics g);
    public abstract void die();

}
