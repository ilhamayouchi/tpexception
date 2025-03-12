package ma.projet;
import java.util.List;
public class AffichagePer {
	    public static void afficherPersonnes(List<? extends Personne> personnes) {
	        for (Personne p : personnes) {
	            System.out.println(p.affiche());
	        }
	    }
	}

