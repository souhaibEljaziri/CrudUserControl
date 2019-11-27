
import java.util.ArrayList;
import java.util.Date;
public class User {

    private final String name;
    private final String email;
    private final Date created_at;
    private final Roles role;
    ArrayList<Person> Personlist = new ArrayList<Person>();
    public User(Builder builder) {
        this.name = builder.name;
        this.email = builder.email;
        created_at = builder.created_at;
        this.role=builder.role;
        this.Personlist=builder.Personlist;
    }

    public Roles getRole() {
        return role;
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

    public ArrayList<Person> getPersonlist() {
        return Personlist;
    }

    public static class Builder {

private String name;
private String email;
private Date   created_at;
private Roles role;
private  ArrayList<Person> Personlist = new ArrayList<Person>();

    public static Builder newInstance()
    {
        return new Builder();
    }
    private Builder() {}
    public void addPerson(Person p) {
        Personlist.add(p);
    }
    public void RemovePerson(Person p) {
        Personlist.remove(p);
    }



    public ArrayList<Person> getPersonlist() {
        return Personlist;
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


    public Builder setName(String name) {
        this.name = name;
        return this;
    }
    public Builder setPersonlist(ArrayList<Person> personlist) {
        this.Personlist = Personlist;
        return this;
    }
    public Builder setEmail(String email) {
        this.email = email;
        return this;
    }

    public Builder setRole(Roles role) {
        this.role = role;
        return this;
    }
    public User build()
    {
        return new User(this);
    }

}
    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", created_at=" + created_at +
                ", role=" + role +
                '}';
    }

}