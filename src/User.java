import java.util.Date;

public class User {

private String name;
private String email;
private Date created_at;
private Roles role;
    public User( String name, String email, Date created_at,Roles role) {


        this.name = name;
        this.email = email;
        created_at = new Date();
        role=role;

    }


    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public Date getCreated_at() {
        return created_at;
    }

    public Roles getRole() {
        return role;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setRole(Roles role) {
        this.role = role;
    }
}
