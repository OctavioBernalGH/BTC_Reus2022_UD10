package pooApp;

import java.util.Random;

import javax.swing.JOptionPane;

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
public class GeneradorNumeros {

	/* Atributos de clase */
	private int numeroIntroducido;
	private int numeroAleatorio = 0;
	Random rnd = new Random();

	/* Constructor de clase */
	public GeneradorNumeros() {

	}

	// Getters y setters
	public int getNumeroIntroducido() {
		return numeroIntroducido;
	}

	public void setNumeroIntroducido(int numeroIntroducido) {
		this.numeroIntroducido = numeroIntroducido;
	}

	public int getNumeroAleatorio() {
		return numeroAleatorio;
	}

	/* M�todo para generar un n�mero aleatorio en un rango definido. */
	public int generaAleatorio() {

		numeroAleatorio = (int) (rnd.nextDouble() * (500 + 1));
		return numeroAleatorio;
	}

	/*
	 * M�todo para comprobar si el n�mero introducido es menor o mayor al n�mero
	 * generado de forma aleatoria con la clase Random.
	 */
	public void comprobadorNumerico(int numeroIntroducido) {

		if (numeroIntroducido > numeroAleatorio) {
			JOptionPane.showMessageDialog(null, "El n�mero introducido es mayor al generado.");
		} else if (numeroIntroducido < numeroAleatorio) {
			JOptionPane.showMessageDialog(null, "El n�mero introducido es menor al generado.");
		}
	}

	// M�todo toString() para enviar a MainApp el n�mero aleatorio generado en
	// formato texto.
	@Override
	public String toString() {
		return "Numero generado: " + numeroAleatorio;
	}
}
