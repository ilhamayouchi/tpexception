package exercice;
import java.util.InputMismatchException;
import java.util.Scanner;
public class SaisieCorrecte {
	public static int saisirEntier() throws InputMismatchException{
		Scanner s = new Scanner(System.in);
		int n ;
		while(true) {
		try {
			System.out.println("Saisie un nombre :");
			n = s.nextInt();
			System.out.println(" votre nombre est :  " + n);
			return n ;
		}
		catch (InputMismatchException e){
			System.out.println("Erreur resaisir un nombre entier .");
			s.next();
		}
		
	}
	}
	public static void main(String[] args) {
        int nombre = saisirEntier();
        System.out.println("Vous avez saisi : " + nombre);
    }
}
