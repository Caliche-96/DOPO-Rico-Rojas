package dominio;

public abstract class Block {
	/**
	 * Se hará la clase diferenciadora de los bloques
	 */
	protected int posX;
	protected int posY;
	protected boolean IsDestructible;

	
	public Block(int posX,int posY, boolean IsDestructible) {
		this.posX = posX;
		this.posY = posY;
		this.IsDestructible = IsDestructible;
		
		
	}
}


