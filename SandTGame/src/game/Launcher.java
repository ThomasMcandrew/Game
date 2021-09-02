package game;

import game.assets.Assets;
import game.game.GameManager;

public class Launcher {

    public static void main(String[] args){
        Assets.init();
        GameManager gameManager = new GameManager();
        GameContainer g = new GameContainer(gameManager);
        gameManager.load(g);
        g.start();
    }
}
