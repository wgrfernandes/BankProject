import BankAccount.CheckingAccount;
import BankAccount.User;
import BankAccount.Account;
import Utils.IntercationMenu;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        String password = scanner.nextLine();

        User user1 = new User(1, name, password);

        CheckingAccount checkingAccount = new CheckingAccount(1, user1.getId(), 1);

        System.out.println(checkingAccount.getBalance());


        System.out.println("Obrigado por utilizar os nossos servicos\n");
    }
}