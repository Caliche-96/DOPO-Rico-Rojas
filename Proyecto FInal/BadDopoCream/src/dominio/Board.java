package dominio;

import java.util.ArrayList;

public class Board {
	
	//Atributos
	private final int width;
	private final int height;
	private final Block[][] celdas;
	private ArrayList<Fruit> frutas = new ArrayList<>();
	private ArrayList<Enemy> enemigos = new ArrayList<>();
	private Player player;
	private  int levelNumber;


	//Constructor
	public Board(int width, int height, int levelNumber) {
		this.width= width;
		this.height= height;
		this.levelNumber= levelNumber;
		this.celdas= new Block[height][width];
		this.frutas= new ArrayList<>();
		this.enemigos= new ArrayList<>();
		this.player= new Player("ol", "vainilla");

		
		for (int r=0; r< height; r++) {
			for (int c=0; c<width; c++) {
				celdas [r][c]= new Block(0,c, false);
			}
		}
	}
	
	//En este método hay que colocar una excepción
	public boolean IsOn(int x, int y) {
		return x>=0 && x< width && y>= 0 && y<height;
		
	}
	
	public Block getBlock(int x, int y) {
		return celdas[y][x];
		
	}
	
	public void setBlock(int x, int y, Block b) {
		celdas[y][x]= b;
	}
	
	//Corregir este método
	//Adicionar varias cosas
	public void addFruit( Fruit f) {
		f.addFruit();
	}
	
	public void addEnemies(Enemy e) {
		enemigos.add(e);
	}

	public void setPlayer(int X, int Y) {
		this.player= new Player(X, Y);
	}

	public Fruit getFruitsAt(int x, int y) {
		for (Fruit f : frutas) {
			if (!f.isCollected() && f.getPosX()==x && f.getPosY()==y) 
				return f;
		}
		return null;
	}

	public ArrayList<Enemy> getEnemies() {
		return enemigos;
	}

	public Player getPlayer() {
		return player;
	}

	public void update() {
		// Actualizar estado del tablero, enemigos, jugador, etc.
		for (Enemy e : enemigos) {
			e.move();
		}
		player.move();

		//Eliminar frutas recogidas
		frutas.removeIf(Fruit::isCollected);

	}

	public boolean isLevelCompleted() {
		// Lógica para determinar si el nivel está completado
		return frutas.stream().allMatch(Fruit::isCollected);
	}

	
}
