package Solidlsp1;

import ...

public class Main {
    public static void main(String[] args){
        InternetPaymentService internetService = new InternetPaymentService();
        internetService.payWebMoney(amount 10);
        internetService.payWebMoney(amount 10);
        internetService.payWebMoney(amount 10);

        TerminalPaymentService terminalService = new TerminalPaymentService();
        terminalService.payWebMoney(amount 10);
        terminalService.payCreditCard(amount 10);
        terminalService.payPhoneNumber(amount 10);
    
        test1(internetService);
        test2(internetService);

    }

    static void test1(Payable payable){}
    static void test2(Payable payable){}
}
}