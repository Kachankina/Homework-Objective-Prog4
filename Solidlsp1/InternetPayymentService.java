package Solidlsp1;

public class InternetPaymentService implements Payable{
    @Override
    public void paymentWebMoney(int amount) { System.out.printf("Internet pay by web money %d\n", amount); }

    @Override
    public void payCreditCard(int amount) { System.out.printf("Internet pay  by credit card %d\n", amount);}

    @Override
    public void payPhoneNumber(int amount) {
        throw new NotImplementedException();
    }

}
    

