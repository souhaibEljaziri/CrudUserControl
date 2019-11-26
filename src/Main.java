import java.util.ArrayList;

public class Main {
    static ArrayList<User> Users = new ArrayList<User>();
    static ArrayList<Module> Modulelist1 = new ArrayList<Module>();
    static ArrayList<Module> Modulelist2 = new ArrayList<Module>();
    public static void main(String[] args) {
        Acces acces1=new Acces(true,true,true);
        Module modules1=new Module("User",acces1);
        Module modules2=new Module("Roles",acces1);
        Module modules3=new Module("User",new Acces(true,false,false));
        Modulelist1.add(modules1);
        Modulelist1.add(modules2);

        Modulelist2.add(modules3);
        Roles role1=new Roles("super admin",Modulelist1);
        Roles role2=new Roles("admin",Modulelist2);
        User user1=User.Builder.newInstance().setName("souhaib eljaziri").setEmail("seljaziri@vermeg.com").setRole(role1).build();
        User user2=User.Builder.newInstance().setName("hamza").setEmail("hamza@vermeg.com").setRole(role2).build();

        Users.add(user1);
        Users.add(user2);
        System.out.println(user1);
        System.out.println(user2);
    }
}
