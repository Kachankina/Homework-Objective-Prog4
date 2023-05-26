package Solidlsp1;

public interface Payable {
    void payWebMoney(int amount);
    void payCreditCard(int amount);
    void payPhoneNumber(int amount);
}