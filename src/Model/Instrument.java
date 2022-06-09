package Model;

public class Instrument {
    int id;
    String nomintru;

    public Instrument(int id, String nomintru) {
        this.id = id;
        this.nomintru = nomintru;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomintru() {
        return nomintru;
    }

    public void setNomintru(String nomintru) {
        this.nomintru = nomintru;
    }
}
