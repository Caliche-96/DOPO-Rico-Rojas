package dominio.Frutas;

import dominio.Fruit;

public class Banana extends Fruit {
    private final static int posX;
    private final static int posY;

    /**
     * Constructor del Platano
     */
    public Banana() {
        super("Platano", 100); 

    }

    /**
     * Retorna la posicion X del Platano
     * @return
     */
    @Override
    public int getPosX() {
        return posX;
    }   
    /**
     * Retorna la posicion Y del Platano
     * @return
     */
    @Override
    public int getPosY() {
        return posY;
    }
}
