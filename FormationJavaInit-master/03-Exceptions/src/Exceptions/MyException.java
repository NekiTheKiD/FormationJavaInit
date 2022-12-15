package Exceptions;
/*
 * Pour créer des exceptions personnalisées:
 * 1- Hériter de la classe
 * 2- Appeler le constructeur de la classe mère et lui lui fournir un message personnalisé
 * 
 */
public class MyException extends Exception{

	public MyException(String message) {
		super(message);
	}
}
