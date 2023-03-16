package Exercise8;

public class Customer {

    public void accessBankVault(Bank bank) {
        bank.accessVault();
    }

    public void accessBankVault(BankManager manager, Bank bank) {
        manager.accessVault(bank);
    }

    public static void main(String[] args) {
        Customer customer = new Customer();
        Bank bank = new Bank();
        BankManager manager = new BankManager();

        customer.accessBankVault(bank);
        customer.accessBankVault(manager, bank);

    }
}
