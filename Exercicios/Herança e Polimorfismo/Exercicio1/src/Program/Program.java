package Program;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<Product> list = new ArrayList<>();

        System.out.print("Enter the number of products: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 1; i <= n; i++) {
            System.out.println("Product " + i + " data:");
            System.out.print("Common, used or imported (c/u/i)? ");
            char op = sc.nextLine().charAt(0);
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Price: ");
            double price = sc.nextDouble();
            sc.nextLine();
            if (op == 'c') {
                list.add(new Product(name, price));
            } else if (op == 'u') {
                System.out.print("Manufacture date (DD/MM/YYYY): ");
                LocalDate date = LocalDate.parse(sc.next(), DateTimeFormatter.ofPattern("dd/mm/YYYY"));
                list.add(new UsedProduct(name, price, date));
            } else if (op == 'i') {
                System.out.print("Custom fee: ");
                double customFee = sc.nextDouble();
                sc.nextLine();
                list.add(new ImportedProduct(name, price, customFee));
            }
        }
        System.out.println("PRICE TAGS:");
        for (Product product: list){
            System.out.println(product.priceTag());
        }

    }

}