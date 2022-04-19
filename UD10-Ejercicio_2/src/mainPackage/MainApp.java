package mainPackage;

import exceptionsPackage.ExceptionCustomizada;

/**
 * @author Octavio Bernal Vilana
 * @version 0.0.1
 *
 *          Se creará una clase que generará una excepciópn personalizada.
 * 
 */
public class MainApp {

	public static void main(String[] args) {

		try {
			System.out.println("Hola");
			ExceptionCustomizada eCustom = new ExceptionCustomizada(404, "Página no encontrada");
			eCustom.generadorExcepciones();
		} catch (ExceptionCustomizada e) {
			System.out.println(e.getMessage());
		}

	}

}
