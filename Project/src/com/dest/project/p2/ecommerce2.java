
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;
public class ecommerce2 {
// Product class represents a product with a name and price
static class Product{
	private String name;  
	private double price;
	public Product(String name, double price) {
		this.name = name;
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public double getPrice() {
		return price;
	}
	@Override
	public String toString() {
		return name + " - ₹" + price;
		}
	}
// Cart class manages a list of products added to the cart
static class Cart {
private ArrayList<Product> items;
public Cart() {
items = new ArrayList<>();
}
public void addItem(Product product) {  
	items.add(product);
}
public double getTotalPrice() {
double total = 0;
for (Product item : items) { 
	total += item.getPrice();
}
return total;
}
public ArrayList<Product> getItems() {
return items;
}
public void clear() {  
	items.clear();
}
@Override
public String toString() {
if (items.isEmpty()) {
	return "Your cart is empty.";
	}
	StringBuilder sb = new StringBuilder("Cart items:\n");
	for (Product item : items) {  sb.append(item).append("\n");
	}
	sb.append("Total: ₹").append(getTotalPrice());
	return sb.toString();
	}
	}
	// BillGenerator class generates and prints the bill in a separate thread
	static class BillGenerator implements Runnable {
	private Cart cart;
	private static final String COMPANY_NAME = "Simple Shop";
	private static final String LOCATION = "Bangalore, India";
	private static final String FILE_PATH = "D:\\\\Invoices\\\\invoice.txt"; // File path for invoice
	public BillGenerator(Cart cart) {
	this.cart = cart;
	}
	@Override
	public void run() {  generateBill();
	}
	public void generateBill() {
		Date date = new Date();
		StringBuilder billContent = new StringBuilder();  billContent.append("\n--- Bill ---\n");
		billContent.append("Company: ").append(COMPANY_NAME).append("\n");
		billContent.append("Date: ").append(date.toString()).append("\n");  
		billContent.append("Location: ").append(LOCATION).append("\n");  
		billContent.append("------------------------------\n");
	for (Product item : cart.getItems()) {  
		billContent.append(item).append("\n");
	}
	billContent.append("Total: ₹").append(cart.getTotalPrice()).append("\n"); 
	billContent.append("------------------------------\n");

	// Add a thank you message  
	String[] messages = {
	"Thank you for shopping with us!",
	"Have a great day!",
	"See you again soon!", 
	"Happy Shopping!" };
	Random random = new Random();
	int messageIndex = random.nextInt(messages.length);  
	billContent.append(messages[messageIndex]).append("\n");

	saveBillToFile(billContent.toString()); 
	System.out.println("\n--- Bill ---"); 
	System.out.println(billContent);
	}
	private void saveBillToFile(String billContent) {
	try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_PATH))) {  writer.write(billContent);
	System.out.println("Invoice saved as " + FILE_PATH);
	} catch (IOException e) {
		e.printStackTrace();
		System.out.println("Error saving the invoice.");
		}
		}
		}
		// Order class represents a completed order
		static class Order {
		private ArrayList<Product> products;
		private double totalPrice;
		private Date date;
		public Order(ArrayList<Product> products, double totalPrice) {
		this.products = new ArrayList<>(products);
		this.totalPrice = totalPrice;
		this.date = new Date();
		}
		public ArrayList<Product> getProducts() {
		return products;
		}
		public double getTotalPrice() {
		return totalPrice;
		}

		public Date getDate() {
		return date;
		}
		@Override
		public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Order Date: ").append(date.toString()).append("\n");
		for (Product item : products) {  sb.append(item).append("\n");
		}
		sb.append("Total: ₹").append(totalPrice);
		return sb.toString();
		}
		}
		private static ArrayList<Order> orderHistory = new ArrayList<>();
		public static void main(String[] args) {  Scanner scanner = new Scanner(System.in);
		// Welcome message
		System.out.println("Welcome to Simple Shop - Your Shopping Experience!");  Cart cart = new Cart();
		ArrayList<Product> electronics = new ArrayList<>();  
		ArrayList<Product> clothingMen = new ArrayList<>();
		ArrayList<Product> clothingWomen = new ArrayList<>(); 
		ArrayList<Product> clothingChildren = new ArrayList<>();
		ArrayList<Product> HomeDecoration = new ArrayList<>();
		// Adding products to categories
		electronics.add(new Product("Smart TV", 45000.00));  
		electronics.add(new Product("Headphones", 3000.00));
		electronics.add(new Product("Smartphone", 25000.00));
		electronics.add(new Product("Laptop", 60000.00));  
		electronics.add(new Product("Bluetooth Speaker", 4000.00));
		clothingMen.add(new Product("Men's T-Shirt", 800.00)); 
		clothingMen.add(new Product("Men's Jeans", 1500.00));
		clothingMen.add(new Product("Men's Jacket", 2500.00));


		clothingMen.add(new Product("Men's Shorts", 1000.00)); 
		clothingWomen.add(new Product("Women's Dress", 3500.00));
		clothingWomen.add(new Product("Women's Skirt", 1500.00)); 
		clothingWomen.add(new Product("Women's Blouse", 2000.00));
		clothingWomen.add(new Product("Women's Jacket", 3000.00)); 
		clothingWomen.add(new Product("Women's Hat", 600.00)); 
		clothingChildren.add(new Product("Children's Dress", 2000.00));
		clothingChildren.add(new Product("Children's T-Shirt", 600.00)); 
		clothingChildren.add(new Product("Children's Shorts", 800.00)); 
		clothingChildren.add(new Product("Children's Jacket", 1500.00)); 
		clothingChildren.add(new Product("Children's Shoes", 1200.00));
		HomeDecoration.add(new Product("Vacuum Cleaner", 7000.00));
		HomeDecoration.add(new Product("Coffee Maker", 3000.00)); 
		HomeDecoration.add(new Product("Blender", 2000.00));
		HomeDecoration.add(new Product("Toaster", 1500.00));
		HomeDecoration.add(new Product("Iron", 1200.00));
		boolean shopping = true;  while (shopping) {
		System.out.println("Select an option:"); 
		System.out.println("1. Select a product category");
		System.out.println("2. View Cart");  
		System.out.println("3. View Orders");
		System.out.println("4. Checkout");
		System.out.println("5. Exit");
		int option = scanner.nextInt(); 
		scanner.nextLine(); // Consume newline  switch (option)
		{
		case_1:
			System.out.println("Select a product category:"); 
			System.out.println("1. Electronics");
			System.out.println("2. Clothing");
			System.out.println("3. Home Goods");
			int categoryChoice = scanner.nextInt();
			scanner.nextLine(); 
			{
				case_1:
					displayAndHandleCategory(scanner, electronics, cart);
		break; 
		case_2:
		System.out.println("Select a clothing subcategory:");  System.out.println("1. Men");
		System.out.println("2. Women");  System.out.println("3. Children");
		int clothingChoice = scanner.nextInt();  scanner.nextLine(); // Consume newline
		switch (clothingChoice) {
		case 1:
		displayAndHandleCategory(scanner, clothingMen, cart);
		break;  case 2:
		displayAndHandleCategory(scanner, clothingWomen, cart);
		break;  case 3:
		displayAndHandleCategory(scanner, clothingChildren, cart);
		break;  default:
		System.out.println("Invalid choice. Please try again.");
		break;
		}
		break;  case_3:
		displayAndHandleCategory(scanner, HomeDecoration, cart);
		break;  
			System.out.println("Invalid choice. Please try again.");
			break;
		}
		break;  case_2:
		System.out.println(cart);
		break;  case_3:
		viewOrders();
		break;  case_4:
		if (cart.getItems().isEmpty()) {  System.out.println("Your cart is empty.");  break;
		}
		System.out.print("Ready to pay? (yes/no): ");
		String readyToPay = scanner.nextLine();
		if (readyToPay.equalsIgnoreCase("yes")) {
		// Generate and print bill in a separate thread
		Thread billThread = new Thread(new BillGenerator(cart)); 
		billThread.start();
		try {
		billThread.join();
		} catch (InterruptedException e)
		{  
			e.printStackTrace();
		}
		// Create an order and add it to the order history
		Order order = new Order(cart.getItems(), cart.getTotalPrice());
		orderHistory.add(order);
		// Clear the cart after checkout  cart.clear();
		} else {
		System.out.println("Continue shopping...");
		}
		break; 
		case_5:
			shopping = false;
		System.out.println("Thank you for shopping with us!");
		break;
			System.out.println("Invalid choice. Please try again.");
		break;
		}-
	}
//		scanner.close();
		}
		// Display the list of products in a category and handle adding to cart or going back
		private static void displayAndHandleCategory(Scanner scanner, ArrayList<Product> products, Cart cart) {
		boolean inCategory = true;  while (inCategory) {
		displayProducts(products);


		System.out.println((products.size() + 1) + ". Go back");  System.out.print("Enter the product number to add to cart or go back: ");  int productChoice = scanner.nextInt();
		scanner.nextLine(); // Consume newline
		if (productChoice > 0 && productChoice <= products.size()) {  Product selectedProduct = products.get(productChoice - 1);  cart.addItem(selectedProduct);  System.out.println(selectedProduct.getName() + " added to cart.");
		} else if (productChoice == products.size() + 1) {  inCategory = false;
		} else {
		System.out.println("Invalid choice. Please try again.");
		}
		}
		}
		// Display the list of products in a category
		private static void displayProducts(ArrayList<Product> products) {  System.out.println("Available products:");
		for (int i = 0; i < products.size(); i++) {  System.out.println((i + 1) + ". " + products.get(i));
		}
		}
		// Display order history
		private static void viewOrders() {
		if (orderHistory.isEmpty()) {  System.out.println("No orders found.");  return;
		}
		System.out.println("Order History:");
		for (int i = 0; i < orderHistory.size(); i++) {  System.out.println("\nOrder " + (i + 1) + ":");  System.out.println(orderHistory.get(i));
		}
		}
		}
	
