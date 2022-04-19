package mainApp;

import javax.swing.JOptionPane;

import pooApp.GeneradorNumeros;

/*
 * @author: Octavio Bernal
 * @version: 0.0.1
 * @date: 19/04/2022
 * 
 * Se genera un número aleatorio en la clase GeneradorNumeros y des de la clase
 * MainApp se intentará adivinar ese número. Se contaran los intentos y cuando
 * se acierte se mostrará dicho número y el número acertado.
 * 
 *  Se utiliza bloque try-catch para excepción de tipo de entrada.
 */
public class MainApp {

	public static void main(String[] args) {

		// Creamos un objeto de la clase GeneradorNumeros.
		GeneradorNumeros gn = new GeneradorNumeros();
		int numeroIntroducido = 0;
		int contador = 0;

		// Invocamos la función que genera el número aleatorio.
		gn.generaAleatorio();

		// Mientras se cumpla bucle infinito hasta acertar el número generado.
		// Bloque try-catch.
		while (numeroIntroducido != gn.getNumeroAleatorio()) {
			try {
				numeroIntroducido = Integer.parseInt(JOptionPane.showInputDialog("Introduce un número"));
				JOptionPane.showMessageDialog(null, "Intento número " + contador);
				gn.comprobadorNumerico(numeroIntroducido);
				contador++;
			} catch (NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "Error de entrada " + e.getMessage());
			}

		}

		// Se muestra el número de intentos y el número aleatorio acertado.
		System.out.println("El número introducido es: " + gn.getNumeroAleatorio());
		System.out.println("Has utilizado " + contador + " intentos.");

	}
}
