import java.util.Random;

public class food {

    private final int posX;
    private final int posY;

    public food() {
        posX = generatePos(graphics.WIDTH);
        posY = generatePos(graphics.HEIGHT);
    }

    private int generatePos(int size) {
        Random random = new Random();
        return random.nextInt(size / graphics.TICK_SIZE) * graphics.TICK_SIZE;
    }

    public int getPosX() {
        return posX;
    }

    public int getPosY() {
        return posY;
    }
}