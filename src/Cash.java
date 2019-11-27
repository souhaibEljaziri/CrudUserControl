
import java.util.Date;

public class Cash implements Payment{
float amount;

    @Override
    public String toString() {
        return "Cash{" + "amount=" + amount + '}';
    }

    @Override
    public float SetPayment(float amount) {
        return (this.amount=this.amount+amount);
    }

    @Override
    public float GetPayment(float amount) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}