
public class ForaDoIntervaloException extends Exception {

	public ForaDoIntervaloException(String message) {
		super("Valor fora do intervalo: " + message);
	}

}
