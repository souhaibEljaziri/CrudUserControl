import java.util.ArrayList;
public class Main {
    static ArrayList<User> Users = new ArrayList<User>();
    static ArrayList<Module> Modulelist1 = new ArrayList<Module>();
    static ArrayList<Module> Modulelist2 = new ArrayList<Module>();
    public static void main(String[] args) {
        Acces acces1=new Acces(true,true,true);
        Module modules1=new Module(acces1,"User");
        Module modules2=new Module(acces1,"Roles");
        Module modules3=new Module(new Acces(true,false,false),"User");
        Modulelist1.add(modules1);
        Modulelist1.add(modules2);

        Modulelist2.add(modules3);
        Roles role1=new Roles("super admin",Modulelist1);
        Roles role2=new Roles("admin",Modulelist2);
        User user1=new User("souhaib eljaziri","seljaziri@vermeg.com",role1);
        User user2=new User("hamza","hamza@vermeg.com",role2);
        Users.add(user1);
        Users.add(user2);

    }
}
