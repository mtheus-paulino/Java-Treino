package application;

import model.entities.Account;
import model.exceptions.BusinessException;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter account data");
        System.out.print("Number: ");
        int number = sc.nextInt();
        sc.nextLine();
        System.out.print("Holder: ");
        String holder = sc.nextLine();
        System.out.println("Initial balance: ");
        double valueInitial = sc.nextDouble();
        sc.nextLine();
        System.out.println("Withdraw limit: ");
        double limit = sc.nextDouble();
        sc.nextLine();

        Account account = new Account(number, holder, valueInitial, limit);

        System.out.println("Enter amount for withdraw: ");
        double amount = sc.nextDouble();

       try {
           account.validateWithdraw(amount);
           System.out.printf("New balance: %.2f", account.getBalance());
       } catch (BusinessException e) {
           System.out.println(e.getMessage());
       }

       sc.close();

    }
}
