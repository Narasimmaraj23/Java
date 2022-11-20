public class BankMain {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount("Vignesh",100000);

        bankAccount.withdraw(500);
        bankAccount.deposit(2000);
        bankAccount.withdraw(10000);

        System.out.println(bankAccount.getOwner());
        System.out.println(bankAccount.getBalance());
    }
}
