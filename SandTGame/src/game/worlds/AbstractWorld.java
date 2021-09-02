package game.worlds;

import game.GameContainer;
import game.entities.AbstractEntity;
import game.entities.Player;

import java.awt.*;
import java.util.ArrayList;

public abstract class AbstractWorld {
    protected Player player;
    protected ArrayList<AbstractEntity> entities;
    protected int[][] map;
    public abstract void update(GameContainer gameContainer, float dt);
    public abstract void render(GameContainer gameContainer, Graphics g);
    public abstract void load();
    public abstract void save();
}
