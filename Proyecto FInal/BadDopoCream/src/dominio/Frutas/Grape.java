package dominio.Frutas;

import dominio.Fruit;

public class Grape extends Fruit {
    private int posX;
    private int posY;

    /**
     * Constructor de la Uva
     */
    public Grape() {
        super("Uva", 50); 

    }

    /**
     * Retorna la posicion X de la Uva
     * @return
     */
    @Override
    public int getPosX() {
        return posX;
    }


    /**
     * Retorna la posicion Y de la Uva
     * @return
     */
    @Override
    public int getPosY() {
        return posY;
    }

}
