package application;

import entities.Client;
import entities.OrdemItem;
import entities.Order;
import entities.Product;
import enums.OrdemStatus;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws ParseException {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);

        System.out.println("Enter client Data:");
        System.out.print("Name");
        String name = entrada.nextLine();
        System.out.print("Email");
        String email = entrada.nextLine();
        System.out.print("Birth date (DD/MM/YYYY): ");
        Date birthDate = sdf.parse(entrada.next());
        Client client = new Client(name, email, birthDate);

        System.out.println("Enter Order Data:");
        System.out.println("Status:");
        OrdemStatus status = OrdemStatus.valueOf(entrada.next());

        System.out.println("Enter order DATA:");
        System.out.print("How many itens to this order:");
        int n = entrada.nextInt();
        Order order = new Order(new Date(),status,client);

        for (int i = 1; i <= n; i++){
            System.out.println("Enter #" + i + " item data ");
            System.out.println("Product Name:");
            entrada.nextLine();
            String nameProduct = entrada.nextLine();
            System.out.println("Product price;");
            double price = entrada.nextDouble();
            System.out.println("Quantity");
            int quantity = entrada.nextInt();

            Product product = new Product(nameProduct, price);

            OrdemItem it = new OrdemItem(quantity, price, product);

            order.addItens(it);
        }
        System.out.println();
        System.out.println(order);
        entrada.close();
    }
}
