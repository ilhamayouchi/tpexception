package ma.projet;



public abstract class Personne {
    protected int id;
    protected String nom;
    protected String prenom;
    protected double salaire;

    
    public Personne(int id, String nom, String prenom, double salaire) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.salaire = salaire;
    }
    public abstract double calculerSalaire();

    public String affiche() {
        return "ID: " + id + ", Nom: " + nom + ", Prénom: " + prenom + ", Salaire: " + calculerSalaire();
    }
}
