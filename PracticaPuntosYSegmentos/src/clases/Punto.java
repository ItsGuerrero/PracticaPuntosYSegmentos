package clases;

public class Punto {
	int x;
	int y;
	/**
	 * Constructor por defecto que crea un punto en las coordenadas (0,0)
	 */
	public Punto() {
		this.x = 0;
		this.y = 0;
	}
	/**
	 * Constructor que crea un punto en las coordenadas recibidas por parametros
	 * @param x coordenada x
	 * @param y coordenada y
	 */
	public Punto(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	@Override
	public String toString() {
		return "(" + x + "," + y + ")";
	}
	
	
}
