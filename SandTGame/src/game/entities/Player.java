package game.entities;

import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;

import game.GameContainer;
import game.assets.Animation;
import game.assets.Assets;

public class Player extends AbstractEntity {
    private Animation animDown, animUp, animLeft, animRight;

    public Player(GameContainer gameContainer, float x, float y, int width, int height){
        super( gameContainer,  x,  y,  width,  height);
//        animDown = new Animation(500, Assets.player_down);
//        animUp = new Animation(500, Assets.player_up);
//        animLeft = new Animation(500, Assets.player_left);
//        animRight = new Animation(500, Assets.player_right);
    }

    @Override
    public void update(GameContainer gameContainer, float dt) {
//        animDown.tick();
//        animUp.tick();
//        animRight.tick();
//        animLeft.tick();
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

    @Override
    public void die() {

    }


}
