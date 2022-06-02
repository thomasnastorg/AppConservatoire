package Model;

public class Adherent extends Personne{



    private String niveaux;

    public Adherent(String nom, String prenom, String adresse, String mail, String niveaux) {
        super(nom, prenom, tel, adresse, mail,niveaux);
    }




    public String getNiveaux() {
        return niveaux;
    }

    public void setNiveaux(String niveaux) {
        this.niveaux = niveaux;
    }
}
