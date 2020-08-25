package br.com.mgoficina.exception;

public class ObjectNotFoundException extends RuntimeException{

	private static final long serialVersionUID = 1L;
	private static final String MESSAGE = "Objeto não encontrado!";
	
	public ObjectNotFoundException() {
		super(MESSAGE);
	}

}
