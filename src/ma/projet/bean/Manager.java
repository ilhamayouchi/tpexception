package ma.projet.bean;

import ma.projet.Personne;

public class Manager extends Personne {
    private String service;

    
    public Manager(int id, String nom, String prenom, double salaire, String service) {
        super(id, nom, prenom, salaire);
        this.service = service;
    }
    
    @Override
    public double calculerSalaire() {
        return salaire * 1.30; 
    }
}
