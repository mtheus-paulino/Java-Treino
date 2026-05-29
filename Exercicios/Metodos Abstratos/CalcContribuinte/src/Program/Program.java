package Program;

import entities.TaxPayer;
import entities.Company;
import entities.Individual;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<TaxPayer> list = new ArrayList<>();

        System.out.print("Enter the number of tax payers: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.println("Tax payer #" + (i + 1) + " ata:");
            System.out.print("Individual or company? (i/c)? ");
            char op = sc.nextLine().charAt(0);

            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Anual income: ");
            Double income = sc.nextDouble();
            sc.nextLine();
            if (op == 'i') {
                System.out.print("Health expenditures: ");
                double expenditures = sc.nextDouble();
                sc.nextLine();

                list.add(new Individual(name, income, expenditures));
            } else if (op == 'c') {
                System.out.print("Number of employees: ");
                int employees = sc.nextInt();
                sc.nextLine();

                list.add(new Company(name, income, employees));
            }

        }

        double total = 0.0;
        System.out.println("\nTAXES PAID:");
        for (TaxPayer taxPayer : list){
            System.out.printf("%s: $ %.2f%n", taxPayer.getName()
            , taxPayer.tax());
            total += taxPayer.tax();
        }

        System.out.printf("\nTOTAL TAXES: $ %.2f", total);

    }
}

