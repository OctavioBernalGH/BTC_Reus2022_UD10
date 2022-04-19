package mainPackage;

import exceptionsPackage.ExceptionCustomizada;

/**
 * @author Octavio Bernal Vilana
 * @version 0.0.1
 *
 *          Se crear� una clase que generar� una excepci�pn personalizada.
 * 
 */
public class MainApp {

	public static void main(String[] args) {

		try {
			System.out.println("Hola");
			ExceptionCustomizada eCustom = new ExceptionCustomizada(404, "P�gina no encontrada");
			eCustom.generadorExcepciones();
		} catch (ExceptionCustomizada e) {
			System.out.println(e.getMessage());
		}

	}

}
