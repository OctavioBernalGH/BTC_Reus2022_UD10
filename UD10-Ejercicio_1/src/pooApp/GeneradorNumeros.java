package pooApp;

import java.util.Random;

import javax.swing.JOptionPane;

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

	/* Método para generar un número aleatorio en un rango definido. */
	public int generaAleatorio() {

		numeroAleatorio = (int) (rnd.nextDouble() * (500 + 1));
		return numeroAleatorio;
	}

	/*
	 * Método para comprobar si el número introducido es menor o mayor al número
	 * generado de forma aleatoria con la clase Random.
	 */
	public void comprobadorNumerico(int numeroIntroducido) {

		if (numeroIntroducido > numeroAleatorio) {
			JOptionPane.showMessageDialog(null, "El número introducido es mayor al generado.");
		} else if (numeroIntroducido < numeroAleatorio) {
			JOptionPane.showMessageDialog(null, "El número introducido es menor al generado.");
		}
	}

	// Método toString() para enviar a MainApp el número aleatorio generado en
	// formato texto.
	@Override
	public String toString() {
		return "Numero generado: " + numeroAleatorio;
	}
}
