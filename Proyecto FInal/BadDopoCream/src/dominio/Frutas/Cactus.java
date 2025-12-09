package dominio.Frutas;
// Clase que representa una fruta del tipo Cactus
public class Cactus {
    private int posX;
    private int posY;
    private int Score=250;

    public Cactus(int posX, int posY, int Score) {
        this.posX = posX;
        this.posY = posY;
        this.Score = Score;
    }

    /**
     * Getter de la posición X
     * @return
     */
    public int getPosX() {
        return posX;
    }

    /**
     * Getter de la posición Y
     * @return
     */
    public int getPosY() {
        return posY;
    }

    /**
     * Getter de los puntos que otorga la fruta
     * @return
     */
    public int getScore() {
        return Score;  
    }


}
