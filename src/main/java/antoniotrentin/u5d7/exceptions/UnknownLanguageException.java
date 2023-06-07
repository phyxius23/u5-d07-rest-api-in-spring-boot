package antoniotrentin.u5d7.exceptions;

@SuppressWarnings("serial") // suggerita da eclipse (che fa?)
public class UnknownLanguageException extends RuntimeException {

	// Costruttore
	public UnknownLanguageException(String lang) {
		super(lang + " non è una scelta valida");
	}
}
