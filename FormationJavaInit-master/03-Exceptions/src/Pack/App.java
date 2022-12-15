package Pack;

import Exceptions.MyException;

public class App {

	public static void main(String[] args) {
		
		//Exception: une erreur qui provoque l'arrêt de l'application
		//Pour éviter l'arrêt de l'application, il faut gérer l'exception
		//Pour gérer l'exception, il faut le bloc try - catch
		//Finally: bloc optionnel, exécuté dans tousles cas
		
		int x = 10;
		int[] tab = {10,20};
		
		try {

			//Ouverture d'un fichier pour lecture/écriture
			//Ouverture d'une connexion à une BD
			System.out.println(x / 2);
			System.out.println(tab[0]);
			
			
		} catch (Exception e) {
			System.out.println("Exception gérée.....");
			System.out.println("Message"+e.getMessage());
			e.printStackTrace();
		}finally {
			//Dans la pratique il utilisé pour libérer les ressources utilisées dans le try: BD, Fichiers,Api...
			System.out.println("bloc finally....");
			
			//fermeture du fichier
			//fermeture de la connexion
		}
//		}catch(ArrayIndexOutOfBoundsException e1) {
//			System.out.println("Exception tableau gérée....");
//		}
//		
		try {
			division(0);
		} catch (MyException e) {
			//Remplir un fichier log
			//Remplir un fichier BD
			System.out.println(e.getMessage());
		}
		
			
		
		System.out.println("Suite de l'application..........");

	}
	/**
	 * Méthode qui génère une exception si x = 0
	 * @param x
	 * @throws ArithmeticException
	 * @author Mathieu
	 */
	public static void division(int x) throws MyException {
		//Option1: gérer l'exception dans la méthode
//		try {
//			System.out.println(10 / x);
//		} catch (Exception e) {
//			System.out.println("Exception gérée par la méthode....");
//		}
		
		//option2:faire une remontée d'exception - c'est les appelants qui doivent gérer l'exception
		if(x != 0) {
			System.out.println(10 / x);
		}else {
			//throw mot clé qui permet de déclencher une exception
			throw new MyException("Mon message perso.....");
		}
		
	}

}
