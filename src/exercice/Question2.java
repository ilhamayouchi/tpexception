package exercice;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Question2 {
	
		public static int superieur() throws InputMismatchException{
			Scanner s = new Scanner(System.in);
			int n ;
			 try {
		            System.out.print("Veuillez saisir un entier supérieur à 10 : ");
		            int nombre = s.nextInt();

		            if (nombre <= 10) {
		                throw new IllegalArgumentException("L'entier doit être supérieur à 10.");
		            }
		            return nombre;

		        } catch (InputMismatchException e) {
		            throw new IllegalArgumentException("Erreur : Vous devez saisir un entier !");
		        }
		    }

		public static void main(String[] args) {
	        try {
	            int nombre = superieur();
	            System.out.println("Vous avez saisi : " + nombre);
	        } catch (IllegalArgumentException e) {
	            System.out.println("Erreur : " + e.getMessage());
	        }
	    }
	}


