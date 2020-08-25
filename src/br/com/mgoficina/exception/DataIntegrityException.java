package br.com.mgoficina.exception;

public class DataIntegrityException  extends RuntimeException{

	private static final long serialVersionUID = 1L;
	private static final String MESSAGE = "Campo Inválido: ";
	
	public DataIntegrityException(String message) {
		super(MESSAGE + message);
	}
	
}
