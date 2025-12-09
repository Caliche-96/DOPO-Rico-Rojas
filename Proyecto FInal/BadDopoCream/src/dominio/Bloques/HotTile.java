package dominio.Bloques;


/**
 * Esta clase pa a ser la del Bloqeu de fuego
 * 
 */
public class HotTile extends Block {
    private int posX;
    private int posY;

    /**
     * Constructor del Bloque de Fuego
     */
    public HotTile() {
        super("Bloque de Fuego", 250);
    }
    /**
     * Retorna la posicion X del Bloque de Fuego
     * @return
     */
    public int getPosX() {
        return posX;
    }
    /**
     * Retorna la posicion Y del Bloque de Fuego
     * @return
     */
    public int getPosY() {
        return posY;
    }
}

