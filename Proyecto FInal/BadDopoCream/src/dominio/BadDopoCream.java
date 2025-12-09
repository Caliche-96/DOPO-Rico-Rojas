package dominio;

public class BadDopoCream {
    private Board board;
    private boolean enEjecucion=false


    public BadDopoCream(){}
    
    public Board getBoard() {
        return board;
    } 
    
    public void setPlayer(int x, int y) {
        board.setPlayer(x, y);
    }
    public void startGame() {
        // Lógica para iniciar el juego, configurar el tablero, etc.
    }

    public void updateGame() {
        board.update();
        // Lógica adicional para actualizar el estado del juego
    }


    
}
