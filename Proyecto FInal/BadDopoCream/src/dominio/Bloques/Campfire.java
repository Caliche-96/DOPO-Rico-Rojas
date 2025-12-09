package dominio.Bloques;

public class Campfire extends Block {
    private int posX;
    private int posY;

    /**
     * Constructor de la fogata
     */
    public Campfire() {
        super("Fogata", 200);
    }
    /**
     * Retorna la posicion X de la fogata
     * @return
     */
    public int getPosX() {
        return posX;
    }
    /**
     * Retorna la posicion Y de la fogata
     * @return
     */
    public int getPosY() {
        return posY;
    }
}
