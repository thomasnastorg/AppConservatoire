package Model;

public class Inscription {
    private String nomintru;
    private String  heur;

    private int paye;
    private int prix;


    public Inscription(String nomintru, String heur, int paye, int prix) {
        this.nomintru = nomintru;
        this.heur = heur;
        this.paye = paye;
        this.prix = prix;
    }


    public String getNomintru() {
        return nomintru;
    }

    public void setNomintru(String nomintru) {
        this.nomintru = nomintru;
    }

    public String getHeur() {
        return heur;
    }

    public void setHeur(String heur) {
        this.heur = heur;
    }

    public int getPaye() {
        return paye;
    }

    public void setPaye(int paye) {
        this.paye = paye;
    }

    public int getPrix() {
        return prix;
    }

    public void setPrix(int prix) {
        this.prix = prix;
    }
}
