package es.upm.aled.lab2.kinematics;

import java.util.ArrayList;
import java.util.List;

/**
 * Esta clase sirve para representar los segmentos del esqueleto. Cada segmento
 * tiene una longitud (en cm), un ángulo respecto a su segmento padre (en
 * radianes) y una lista con sus segmentos hijos, de forma que todos juntos
 * forman un árbol de segmentos.
 *
 */
public class Segment {

	private double length;
	private double angle;
	private List<Segment> children;

	/**
	 * Constructor de la clase Segment con dos parámetros, su longitud y su ángulo.
	 * Al crearse, el segmento no tiene ningún hijo.
	 *
	 * @param length La longitud del segmento, en cm.
	 * @param angle  El ángulo respecto al segmento padre, en radianes.
	 */
	public Segment(double length, double angle) {
		this.length = length;
		this.angle = angle;
		this.children = new ArrayList<>();
	}
	/**
	 * Devuelve la longitud del segmento.
	 *
	 * @return La longitud del segmento, en cm.
	 */
	public double getLength() {
		return length;
	}
	/**
	 * Devuelve el ángulo del segmento respecto a su segmento padre.
	 *
	 * @return El ángulo del segmento, en radianes.
	 */
	public double getAngle() {
		return angle;
	}
	/**
	 * Devuelve la lista de segmentos hijos de este segmento.
	 *
	 * @return Una lista con todos los segmentos hijos.
	 */
	public List<Segment> getChildren(){
		return children;
	}
	/**
	 * Cambia el ángulo del segmento respecto a su segmento padre.
	 *
	 * @param angle El nuevo ángulo, en radianes.
	 */
	public void setAngle(double angle) {
		this.angle= angle;
	}
	/**
	 * Añade un segmento a la lista de hijos si no está añadido ya. Así se evita
	 * que la cadena cinemática acabe con elementos duplicados.
	 *
	 * @param child El segmento que se quiere añadir como hijo.
	 */
	public void addChild(Segment child) {
		if (!children.contains(child))
			children.add(child);
	}

}
