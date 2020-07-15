package aplication;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;

public class Program {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
	
		
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println("Enter cliente data:");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Email: ");
		String email = sc.nextLine();
		System.out.print("Birth date (DD/MM/YYYY): ");
		Date birth = sdf.parse(sc.next());
		
		Client client = new Client(name, email, birth);
		
		
		System.out.println("Enter order data:");
		sc.nextLine();
		System.out.print("Status: ");
		OrderStatus status = OrderStatus.valueOf(sc.next());
				
		System.out.print("How many items to this order? ");
		int intem = sc.nextInt();
	
		Order order = new Order(new Date(), status, client);
		
		for(int i=1; i<=intem; i++) {
			System.out.println("Enter "+ "#"+i + " item data:");
			sc.nextLine();
			System.out.print("Product name: ");
			String nameProduto = sc.nextLine();
			System.out.print("Product price: ");
			double priceProduto = sc.nextDouble();
			
			Product product = new Product(nameProduto, priceProduto);
			
			System.out.print("Quantity: ");
			int quantidade = sc.nextInt();
			
            OrderItem orderItem = new OrderItem(quantidade, priceProduto, product);
			order.addItem(orderItem);
			
		}	
			System.out.println();
			System.out.println(order);

		sc.close();

	}

}
