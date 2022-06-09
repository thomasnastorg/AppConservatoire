package Model;

public class Cours {

    private Adherent ad;
    private Instrument instru;
    private String heure;
    private int prix;


    public Cours(Adherent ad, Instrument instru, String heure, int prix) {
        this.ad = ad;
        this.instru = instru;
        this.heure = heure;
        this.prix = prix;
    }

    public Adherent getAd() {
        return ad;
    }

    public void setAd(Adherent ad) {
        this.ad = ad;
    }

    public Instrument getInstru() {
        return instru;
    }

    public void setInstru(Instrument instru) {
        this.instru = instru;
    }

    public String getHeure() {
        return heure;
    }

    public void setHeure(String heure) {
        this.heure = heure;
    }

    public int getPrix() {
        return prix;
    }

    public void setPrix(int prix) {
        this.prix = prix;
    }
}

