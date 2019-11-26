package crudusercontrol;
import java.util.ArrayList;
import java.util.Date;

public class Person {
    private String cin;
    private  String name;
    private  String tel;
    private  Date created_at;
    private static Person pere=new Person();
     ArrayList<Payment> Paymentlist = new ArrayList<Payment>();
    public Person() {}
    public Person(String cin, String name, String tel) {
        this.cin = cin;
        this.name = name;
        this.tel = tel;
        this.created_at = new Date();
    }
    public static Person getInstance(){
      return pere;
   }
    public String getCin() {
        return cin;
    }

    public String getName() {
        return name;
    }

    public String getTel() {
        return tel;
    }

    public Date getCreated_at() {
        return created_at;
    }

    public Person getPere() {
        return pere;
    }

    public  ArrayList<Payment> getPaymentlist() {
        return Paymentlist;
    }

    public void setCin(String cin) {
        this.cin = cin;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public void setCreated_at(Date created_at) {
        this.created_at = created_at;
    }

    public void setPere(Person pere) {
        this.pere = pere;
    }

    public void setPaymentlist(ArrayList<Payment> Paymentlist) {
        this.Paymentlist = Paymentlist;
    }

    @Override
    public String toString() {
        return "Person{" + "cin=" + cin + ", name=" + name + ", tel=" + tel + ", created_at=" + created_at + '}';
    }

 
    
}