package masterclass;

public class ConstructorsAndCh {




    public static void main(String[] args) {

        System.out.println("//////////");
        BankAccount first = new BankAccount();
        BankAccount second = new BankAccount();
        BankAccount deflt = new BankAccount();

        System.out.println(deflt.getBalance());
        System.out.println(deflt.getCustomer());
        System.out.println("/////////");

//        first.setBalance(177.5);
//        first.withdrawFunds(100.0);
//        System.out.println(first.getBalance());
//
//        first.setPhone("666-666-6666");
//        System.out.println(first.getPhone());
//
//        first.setAccountNum("4567");
//        System.out.println(first.getAccountNum());
//
//        first.deposit(777.77);
//        System.out.println(first.getBalance());
//
//        first.deposit(99.00);
//        first.withdrawFunds(899.0);

    BankAccount jenny = new BankAccount("555-444-3333", 560.00, "jenny", "jenny@gmail.com", "456789");

        System.out.println("***");
        BankAccount tim = new BankAccount("tim@gmail", "12345");  // 2 constructor call - only takes email + accnt#
        System.out.println("tims #: " + tim.getPhone() + " | tim's name: " + tim.getCustomer() + " | tim's email: " + tim.getEmail());
        System.out.println("***");

        System.out.println(String.format("jenny's phone #: %s%n her name: %s%n her email: %s%n   her balance: %.3f", jenny.getPhone(),
                jenny.getCustomer(), jenny.getEmail(), jenny.getBalance()));
//        first.setAccountNum();
//        second.setAccountNum("2324");
//        second.setBalance(2300.00);
//        second.setEmail("Jill@gmail.com");
//        second.setCustomer("Jill");
//        second.setPhone("555-555-5555");
//        System.out.println(second.getAccountNum());

    }
}
