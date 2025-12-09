package dominio.Frutas;

import dominio.Fruit;

public class Cherry extends Fruit {
    private int posX;
    private int posY;

    /**
     * Constructor de la Cereza
     */
    public Cherry() {
        super("Cereza", 150); 

    }

    /**
     * Retorna la posicion X de la Cereza
     * @return
     */
    @Override
    public int getPosX() {
        return posX;
    }   
    /**
     * Retorna la posicion Y de la Cereza
     * @return
     */
    @Override
    public int getPosY() {
        return posY;
    }

}
