package dominio;

public class Fruit {
    private String type; // e.g., Cherry, Strawberry, etc.
    private static int points;
    private boolean isCollected=false;
    private int posX;
    private int posY;
    public Fruit(String type, int points) {
        this.type = type;
        this.points = points;
    }
    public void collect() {
        isCollected = true;
    }
    public String getType() {
        return type;
    }
    public int getPoints() {
        return points;
    }
    public void addFruit() {
    	
    }

    public boolean isCollected() {
        return isCollected;
    }
    
    public int getPosX() {
        return posX;
    }
    public int getPosY() {
        return posY;
    }

}
