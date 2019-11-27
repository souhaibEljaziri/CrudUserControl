
import java.util.ArrayList;
import java.util.Date;

public class Roles {


    private String name;
    private Date created_at;
    ArrayList<Module> modules = new ArrayList<Module>();

    public Roles(String name, ArrayList<Module> modules) {
        this.name = name;
        this.created_at = new Date();
        this.modules = modules;
    }

    public ArrayList<Module> getModules() {
        return modules;
    }

    public Roles setModules(ArrayList<Module> modules) {
        this.modules = modules;
        return this;
    }

    public Roles(String name, Date created_at) {

        this.name = name;
        this.created_at = new Date();

    }

    public Roles setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return name;
    }
    public Date getCreated_at() {
        return created_at;
    }

    @Override
    public String toString() {
        return "Roles{" +
                "name='" + name + '\'' +
                ", created_at=" + created_at +
                ", modules=" + modules +
                '}';
    }
}
