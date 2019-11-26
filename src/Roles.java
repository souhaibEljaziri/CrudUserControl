import java.util.ArrayList;
import java.util.Date;

public class Roles {


    private String name;
    private Date created_at;
    ArrayList<Module> modules = new ArrayList<Module>();

    public Roles(String name, Date created_at, ArrayList<Module> modules) {
        this.name = name;
        this.created_at = created_at;
        this.modules = modules;
    }

    public void setModules(ArrayList<Module> modules) {
        this.modules = modules;
    }

    public Roles(String name, Date created_at) {

        this.name = name;
        this.created_at = new Date();

    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public Date getCreated_at() {
        return created_at;
    }




}
