package testprogramme;
import ma.projet.bean.Developpeur;
import ma.projet.bean.Manager;
import ma.projet.AffichagePer;
import ma.projet.Personne;
import java.util.*;


public class Test {
    public static void main(String[] args) {
       
        Developpeur dev1 = new Developpeur(1, "ilhame", "ayouchi", 3000, "java");
        Manager mgr1 = new Manager(2, "Sophia", "morchid", 4000, "IT");

        
        List<Personne> personnes = new ArrayList<>();
        personnes.add(dev1);
        personnes.add(mgr1);

        
        AffichagePer.afficherPersonnes(personnes);
    }
}
