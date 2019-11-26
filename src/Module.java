import java.util.Date;

public class Module {

    private Acces acces;
    private String nom;
    private Date created_at;
    public Module(int id, Acces acces, String nom, Date created_at) {

        this.acces = acces;

        this.nom = nom;
        this.created_at = new Date();
    }
    public Acces getAcces() {
        return acces;
    }

    public String getNom() {
        return nom;
    }

    public Date getCreated_at() {
        return created_at;
    }

    public void setAcces(Acces acces) {
        this.acces = acces;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }


}
