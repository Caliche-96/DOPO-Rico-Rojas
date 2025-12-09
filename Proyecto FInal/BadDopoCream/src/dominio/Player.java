package dominio;

import domain.objects.IceBlock; // Se asume que existe esta clase

public class Player extends Entity{
    private String name;
    private String color; // Vainilla (blanco), Fresa (rosado), Chocolate (café) [cite: 29]
    private int score;

    public Player(String name, String color) {
        // Constructor, inicialización...
    }
    
    // Habilidad 1: Crear bloques de hielo [cite: 32]
    public IceBlock createIceBlock() {
        // Lógica para crear un bloque en la dirección de la mirada [cite: 32, 33]
        return new IceBlock(); // Retorna el nuevo bloque o null si no se crea
    }
    
    // Habilidad 2: Romper bloques de hielo [cite: 35]
    public void breakIceBlock() {
        // Lógica para romper bloques en efecto dominó [cite: 35]
    }

    @Override
    public void move() {
        // Implementación del movimiento básico (Norte, Sur, Este, Oeste) [cite: 30]
    }
}