package application;

import entities.Client;
import entities.OrdemItem;
import entities.Product;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);

        Product p = new Product("TV", 1000.0);

        OrdemItem oi1 = new OrdemItem(1, 1000.0, p);

        System.out.println(oi1.getProduct().getName());

        /*System.out.print("Enter client Data:");
        System.out.println("Name");
        String name = entrada.nextLine();
        System.out.println("Email");
        String email = entrada.nextLine();
        System.out.println("Birth date (DD/MM/YYYY): ");
        String birthDate = entrada.next();
        Client client = new Client(name, email, (String) birthDate);

        System.out.println("Enter Order Data:");
        System.out.println("Status:");
        String status = entrada.nextLine();

        System.out.print("Enter order DATA:");
        System.out.println("How many itens to this order:");
        int n = entrada.nextInt();

        for (int i = 1; i < n; i++){
            System.out.println("Enter #"+i+" item data ");
            System.out.println("Product Name:");
            String nameProduct = entrada.nextLine();
            System.out.println("Product price;");
            double price = entrada.nextDouble();
            System.out.println("Quantity");
            int quantity = entrada.nextInt();
            Product product = new Product(nameProduct,price);
        }



        entrada.close();*/
    }
}
