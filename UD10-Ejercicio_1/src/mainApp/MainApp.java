package mainApp;

import javax.swing.JOptionPane;

import pooApp.GeneradorNumeros;

/*
 * @author: Octavio Bernal
 * @version: 0.0.1
 * @date: 19/04/2022
 * 
 * Se genera un n�mero aleatorio en la clase GeneradorNumeros y des de la clase
 * MainApp se intentar� adivinar ese n�mero. Se contaran los intentos y cuando
 * se acierte se mostrar� dicho n�mero y el n�mero acertado.
 * 
 *  Se utiliza bloque try-catch para excepci�n de tipo de entrada.
 */
public class MainApp {

	public static void main(String[] args) {

		// Creamos un objeto de la clase GeneradorNumeros.
		GeneradorNumeros gn = new GeneradorNumeros();
		int numeroIntroducido = 0;
		int contador = 0;

		// Invocamos la funci�n que genera el n�mero aleatorio.
		gn.generaAleatorio();

		// Mientras se cumpla bucle infinito hasta acertar el n�mero generado.
		// Bloque try-catch.
		while (numeroIntroducido != gn.getNumeroAleatorio()) {
			try {
				numeroIntroducido = Integer.parseInt(JOptionPane.showInputDialog("Introduce un n�mero"));
				JOptionPane.showMessageDialog(null, "Intento n�mero " + contador);
				gn.comprobadorNumerico(numeroIntroducido);
				contador++;
			} catch (NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "Error de entrada " + e.getMessage());
			}

		}

		// Se muestra el n�mero de intentos y el n�mero aleatorio acertado.
		System.out.println("El n�mero introducido es: " + gn.getNumeroAleatorio());
		System.out.println("Has utilizado " + contador + " intentos.");

	}
}
