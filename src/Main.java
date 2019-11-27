
import java.util.ArrayList;


public class Main {
    static ArrayList<User> Users = new ArrayList<User>();
    static ArrayList<Module> Modulelist1 = new ArrayList<Module>();
    static ArrayList<Module> Modulelist2 = new ArrayList<Module>();



    static boolean verifier_acces(User user1,String module_name,String acces_name)
    {
        if(acces_name.equals("add"))
        {
        return (user1.getRole().getModules().stream().filter(e->e.getNom().equals(module_name)&&e.getAcces().isAdd()).count()>=1);

        }
        else if(acces_name.equals("update"))
        {

            return (user1.getRole().getModules().stream().filter(e->e.getNom().equals(module_name)&&e.getAcces().isUpdate()).count()>=1);
        }
        else if(acces_name.equals("delete"))
        {

            return (user1.getRole().getModules().stream().filter(e->e.getNom().equals(module_name)&&e.getAcces().isUpdate()).count()>=1);
        }
        return false;
    }
    public static void main(String[] args) {
        Acces acces1=new Acces(true,true,true);
        Module modules1=new Module("User",acces1);
        Module modules2=new Module("Person",acces1);
        Module modules3=new Module("User",new Acces(true,false,false));
        Modulelist1.add(modules1);
        Modulelist1.add(modules2);

        Modulelist2.add(modules3);
        Roles role1=new Roles("super admin",Modulelist1);
        Roles role2=new Roles("admin",Modulelist2);
        User user1=User.Builder.newInstance().setName("souhaib eljaziri").setEmail("seljaziri@vermeg.com").setRole(role1).build();
        User user2=User.Builder.newInstance().setName("hamza").setEmail("hamza@vermeg.com").setRole(role2).build();
/*
        //verifier que l'utilisateur user1 peut ajouter un utilisateur
        System.out.println("l'utilisateur user1 peut ajouter un utilisateur :"+(user1.getRole().getModules().stream().filter(e->e.getNom().equals("User")&&e.getAcces().isAdd()).count()>=1));
        //verifier que l'utilisateur user1 peut supprimer un utilisateur
        System.out.println("l'utilisateur user1 peut supprimer un utilisateur :"+(user1.getRole().getModules().stream().filter(e->e.getNom().equals("User")&&e.getAcces().isDelete()).count()>=1));
        //verifier que l'utilisateur user1 peut modifier un utilisateur
        System.out.println("l'utilisateur user1 peut modifier un utilisateur :"+(user1.getRole().getModules().stream().filter(e->e.getNom().equals("User")&&e.getAcces().isUpdate()).count()>=1));
*/
        Users.add(user1);
        Users.add(user2);
        System.out.println(verifier_acces(user1,"User","add"));
        PaymentFactory PaymentFactory1=new PaymentFactory();

        CreditCard Payment1= (CreditCard) PaymentFactory1.Paymentmethode("CreditCard");
        Payment1.setCardNumber("1341655").setName("ahmed").setAddress("france ...").setCVV("123").SetPayment(100);
       
        Person client1=new Person("1111","mouhamed","97105554");
        user1.Personlist.add(client1);
        client1.getPaymentlist().add(Payment1);
        
        //affchier les information des utilisateurs
         for(User userp:Users)
         {
             
             System.out.println(userp);
             (userp.Personlist).stream().forEach(User_person->{System.out.println(User_person);
             
                     (User_person.Paymentlist).stream().forEach(person_payment->{System.out.println(person_payment);});
                     
                     });
         }
      //  User.Personlist.stream().forEach(e->System.out.println(e));
      
         
        
    }
}
