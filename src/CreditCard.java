
public class CreditCard implements Payment{
   private String name;
   private String CardNumber;
   private String CVV;
   private String address;
   private float amount;
   CreditCard(){}
    public CreditCard(String name, String CardNumber, String CVV, String address) {
        this.name = name;
        this.CardNumber = CardNumber;
        this.CVV = CVV;
        this.address = address;
    }
    public CreditCard setName(String name) {
        this.name = name;
        return this;
    }

    public CreditCard setCardNumber(String CardNumber) {
        this.CardNumber = CardNumber;
        return this;
    }

    public CreditCard setCVV(String CVV) {
        this.CVV = CVV;
        return this;
    }

    public CreditCard setAddress(String address) {
        this.address = address;
        return this;
    }

    public String getName() {
        return name;
    }

    public String getCardNumber() {
        return CardNumber;
    }

    public String getCVV() {
        return CVV;
    }

    public String getAddress() {
        return address;
    }

    @Override
    public float GetPayment(float amount) {
        return (this.amount=this.amount-amount);
    }

    @Override
    public float SetPayment(float amount) {
        return (this.amount=this.amount+amount);
    }
    @Override
    public String toString() {
        return "CreditCard{" + "name=" + name + ", CardNumber=" + CardNumber + ", CVV=" + CVV + ", address=" + address + ", amount=" + amount + '}';
    }

}