package crudusercontrol;
import java.util.Date;

public class Module {

    private Acces acces;
    private String nom;
    private Date created_at;

    @Override
    public String toString() {
        return "Module{" +
                ", nom='" + nom + '\'' +
                "acces=" + acces +
                ", created_at=" + created_at +
                '}';
    }

    public Module(String nom,Acces acces) {

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

    public Module setAcces(Acces acces) {
        this.acces = acces;
        return this;
    }

    public Module setNom(String nom) {
        this.nom = nom;
        return this;
    }


}
