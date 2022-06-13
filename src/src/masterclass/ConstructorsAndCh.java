package masterclass;

public class ConstructorsAndCh {




    public static void main(String[] args) {

        BankAccount first = new BankAccount();
        BankAccount second = new BankAccount();

        first.setBalance(177.5);
        first.withdrawFunds(100.0);
        System.out.println(first.getBalance());

        first.setPhone("666-666-6666");
        System.out.println(first.getPhone());

        first.setAccountNum("4567");
        System.out.println(first.getAccountNum());

        first.deposit(777.77);
        System.out.println(first.getBalance());

        first.withdrawFunds(899.0);




//        first.setAccountNum();
        second.setAccountNum("2324");
        second.setBalance(2300.00);
        second.setEmail("Jill@gmail.com");
        second.setCustomer("Jill");
        second.setPhone("555-555-5555");
        System.out.println(second.getAccountNum());

    }
}
