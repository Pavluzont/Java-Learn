package Part2.Exercise8;

import Part2.Exercise8.bank.Bank;
import Part2.Exercise8.bank.BankManager;

public class Customer {

    public void accessBankVault(Bank bank) {
//        bank.accessVault();
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
