package clases;

public class Segmento {
	Punto a;
	Punto b;
	
	/**
	 * Constructor que por defecto crea un punto en la coordenada (0,0) y (1,1)
	 */
	public Segmento () {
		Punto a = new Punto(0,0);
		Punto b = new Punto(1,1);
	}
	
	/**
	 * Constructor que crea un segmento entre los puntos pasados como parámetros
	 * @param a Punto a
	 * @param b Punto b
	 */
	public Segmento(Punto a, Punto b) {
		this.a = a;
		this.b = b;
	}

	public Punto getA() {
		return a;
	}

	public void setA(Punto a) {
		this.a = a;
	}

	public Punto getB() {
		return b;
	}

	public void setB(Punto b) {
		this.b = b;
	}
	
	/**
	 * Método que calcula la distancia entre dos puntos
	 * @return La distancia que existe entre el punto a y el punto b
	 */
	public double distancia() {
        int x1 = a.getX();
        int y1 = a.getY();
        int x2 = b.getX();
        int y2 = b.getY();
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
	}

	@Override
	public String toString() {
		return "[" + "(" + a.toString() + ")" + "(" + b.toString() + ")" + "]";
	}
	
	
}
