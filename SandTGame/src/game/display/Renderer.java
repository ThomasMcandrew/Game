package game.display;

import game.GameContainer;

import java.awt.image.DataBufferInt;

public class Renderer {

    private int pW, pH;
    private int[] p;

    public Renderer(GameContainer gameContainer){
        pW = gameContainer.getWidth();
        pH = gameContainer.getHeight();
        p = ((DataBufferInt) gameContainer.getWindow().getImage().getRaster().getDataBuffer()).getData();
    }
    public void clear(){
        for(int i = 0; i < p.length;i++){
            p[i] = 0;
        }
    }
}
