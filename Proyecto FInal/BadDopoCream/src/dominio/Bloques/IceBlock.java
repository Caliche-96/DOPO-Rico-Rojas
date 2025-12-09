package dominio.Bloques;

import dominio.Block;

public class IceBlock extends Block {
    private int posX;
    private int posY;
    private boolean IsDestructible;
    /**
     * Constructor del Bloque de Hielo
     */
    public IceBlock() {
        super("Bloque de Hielo", 300);
        this.IsDestructible = true;
    }

}
