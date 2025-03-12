package exercie2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Suitefibonacci {
    public static int calculerFibonacci(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Le nombre doit être supérieur ou égal à 0.");
        }
        if (n == 0 || n == 1) {
            return 1;
        }
        return calculerFibonacci(n - 1) + calculerFibonacci(n - 2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;

        while (true) {
            try {
                System.out.print("Entrez un entier positif pour la suite de Fibonacci : ");
                n = scanner.nextInt();
                
                System.out.println("Le " + n + "ème nombre de Fibonacci est : " + calculerFibonacci(n));
                break; // Sortie de la boucle si tout est correct

            } catch (InputMismatchException e) {
                System.out.println("Erreur : Veuillez entrer un entier valide !");
                scanner.next(); // Nettoyer le scanner pour éviter une boucle infinie
            } catch (IllegalArgumentException e) {
                System.out.println("Erreur : " + e.getMessage());
            }
        }
        scanner.close();
    }
}
