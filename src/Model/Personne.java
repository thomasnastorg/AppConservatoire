package Model;

public class Personne {
    private int id;
    private String nom;
    private String prenom;
    private int tel;
    private String adresse;
    private String mail;


    public Personne(String nom, String prenom, int tel, String adresse, String mail){
        this.nom = nom;
        this.prenom = prenom;
        this.tel = tel;
        this.adresse = adresse;
        this.mail = mail;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public int getTel() {
        return tel;
    }

    public void setTel(int tel) {
        this.tel = tel;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Personne{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", tel=" + tel +
                ", adresse='" + adresse + '\'' +
                ", mail='" + mail + '\'' +
                '}';
    }
}
