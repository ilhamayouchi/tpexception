package ma.projet.bean;

import ma.projet.Personne;

public class Developpeur extends Personne {
    private String specialite;

    
    public Developpeur(int id, String nom, String prenom, double salaire, String specialite) {
        super(id, nom, prenom, salaire);
        this.specialite = specialite;
    }

    
    @Override
    public double calculerSalaire() {
        return salaire * 1.10;  
    }
}
