public class PaymentFactory {

    public Payment getShape(String PaymentType){
        if(PaymentType == null){
            return null;
        }
        if(PaymentType.equalsIgnoreCase("Cash")){
            return new Cash();

        } else if(PaymentType.equalsIgnoreCase("CreditCard")){
            return new CreditCard();

        } else if(PaymentType.equalsIgnoreCase("Cash")){
            return new Cash();
        }

        return null;
    }

}