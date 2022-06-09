package com.antonio.examen.junio;

/**
 * Nos devuelve la inferfaz "Vehicle" extraida de "Bike"
 *
 * @author Antonio Carmona Bacon
 *
 */
interface Vehicle {

	/**
	 * Cambia la marcha
	 * 
	 * @param newGear nueva marcha
	 */
	void changeGear(int newGear);

	/**
	 * Incrementa la velocidad
	 * 
	 * @param increment incrementar velocidad
	 */
	void speedUp(int increment);

	/**
	 * Decrementa la velocidad
	 * 
	 * @param decrement decrementar velocidad
	 */
	void applyBrakes(int decrement);

	/**
	 * Imprime los parametros (speed, gear)
	 */
	void printStates();

}