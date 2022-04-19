package exceptionsPackage;

/**
 * @author Octavio Bernal Vilana
 * @version 0.0.1
 *
 *          Se crear� una clase que generar� una excepci�pn personalizada.
 * 
 */
public class ExceptionCustomizada extends Exception {

	private int codigoException;
	private String eMensaje;

	public ExceptionCustomizada(int codigoException, String eMensaje) {
		this.codigoException = codigoException;
		this.eMensaje = eMensaje;
	}

	public void generadorExcepciones() throws ExceptionCustomizada {
		throw new ExceptionCustomizada(codigoException, eMensaje);
	}

	@Override
	public String getMessage() {
		String eMessage = "";
		switch (codigoException) {
		case 100:
			eMessage = "C�digo error 100 " + eMensaje;
		}

		return eMessage;
	}
}
