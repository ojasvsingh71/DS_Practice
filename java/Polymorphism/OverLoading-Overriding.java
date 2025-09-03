class PaymentGateway{
    void pay(double amount){
        System.out.println("PaymentGateway pay");
    }
    void pay(double amount,String promoCode){

    }
}

class DebitCardPayment extends PaymentGateway{
    void pay(double amount){
        System.out.println("DebitCardPayment pay");
        super.pay(200);
    }
}

class UPIPayment extends PaymentGateway{
    void pay(double amount){
        System.out.println("UPIPayment pay");
    }
}

class main{
    public static void main(String []arg){
        PaymentGateway a= new DebitCardPayment();
        a.pay(20);
    }
}