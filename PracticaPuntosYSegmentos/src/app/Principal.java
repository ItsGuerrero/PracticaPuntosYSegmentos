package app;

import java.util.Random;

import clases.Punto;
import clases.Segmento;

public class Principal {

	public static void main(String[] args) {
		/**
		 * Importamos la clase random que calculará un numero aleatorio del 1 al 10
		 */
		Random random = new Random();
		/**
		 * Creacion del punto 1 con coordenada x e y aleatorias entre 0 y 10
		 */
		Punto p1 = new Punto(random.nextInt(11), random.nextInt(11));
		/**
		 * Creacion del punto 2 con coordenada x e y aleatorias entre 0 y 10
		 */
		Punto p2 = new Punto(random.nextInt(11), random.nextInt(11));
		/**
		 * Creacion del punto 3 con coordenada x e y aleatorias entre 0 y 10
		 */
		Punto p3 = new Punto(random.nextInt(11), random.nextInt(11));
		/**
		 * Creacion del punto 4 con coordenada x e y aleatorias entre 0 y 10
		 */
		Punto p4 = new Punto(random.nextInt(11), random.nextInt(11));
		
		/**
		 * Creación del segmento 1 compuesto por el punto 1 y punto 2
		 */
		Segmento s1 = new Segmento(p1, p2);
		/**
		 * Creación del segmento 1 compuesto por el punto 1 y punto 2
		 */
		Segmento s2 = new Segmento(p3, p4);
		
		/**
		 * Calcula la distancia del segmento 1
		 */
		s1.distancia();
		/**
		 * Calcula la distancia del segmento 2
		 */
		s2.distancia();

	}

}
