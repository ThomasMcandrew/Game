package game.entities;

import java.awt.Graphics;
import java.awt.event.KeyEvent;

import game.GameContainer;
import game.assets.Assets;

public class Player extends AbstractEntity {
    public Player(){
        x=40;
        y=40;
        width=32;
        height=32;
    }
    @Override
    public void update(GameContainer gameContainer, float dt) {
        if (gameContainer.getInput().isKey(KeyEvent.VK_W)){
            y-=3;
        }
        if (gameContainer.getInput().isKey(KeyEvent.VK_S)){
            y+=3;
        }
        if (gameContainer.getInput().isKey(KeyEvent.VK_A)){
            x-=3;
        }
        if (gameContainer.getInput().isKey(KeyEvent.VK_D)){
            x+=3;
        }
    }

    @Override
    public void render(GameContainer gameContainer, Graphics g) {
        g.drawImage(Assets.player.get(0),(int)x,(int)y,(int)(width *gameContainer.getScale()),(int)(height * gameContainer.getScale()),null);
    }

    

}
