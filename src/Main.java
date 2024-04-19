//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.*;
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        /*Scanner scanner = new Scanner(System.in);

        // Create some sample products
        Product tv = new Electronics("Smart Phone", 523, 65.99, 9, "Vivo", 12);
        Product shirt = new Clothing("Women's Top", 150, 15.99, 20, "M", "Cotton");

        // Add products to the shopping cart
        ShoppingCart cart = new ShoppingCart();
        cart.addToCart(tv);
        cart.addToCart(shirt);

        // Display cart contents and total price
        cart.displayCart();
        System.out.println("Total Price: $" + cart.calculateTotalPrice());

        scanner.close();*/
        ShoppingCart cart = new ShoppingCart();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Add Electronics to Cart");
            System.out.println("2. Add Clothing to Cart");
            System.out.println("3. Display Cart");
            System.out.println("4. Calculate Total Price");
            System.out.println("5. Delete Product from Cart");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    try {
                        System.out.print("Enter product name: ");
                        String name = scanner.nextLine();
                        System.out.print("Enter product ID: ");
                        int id = scanner.nextInt();
                        System.out.print("Enter price: ");
                        double price = scanner.nextDouble();
                        System.out.print("Enter quantity in stock: ");
                        int quantity = scanner.nextInt();
                        scanner.nextLine(); // Consume newline
                        System.out.print("Enter brand: ");
                        String brand = scanner.nextLine();
                        System.out.print("Enter warranty period (in months): ");
                        int warranty = scanner.nextInt();
                        scanner.nextLine(); // Consume newline
                        Electronics electronics = new Electronics(name, id, price, quantity, brand, warranty);
                        cart.addProduct(electronics);
                    } catch (DuplicateProductIDException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 2:
                    try {
                        System.out.print("Enter product name: ");
                        String name = scanner.nextLine();
                        System.out.print("Enter product ID: ");
                        int id = scanner.nextInt();
                        System.out.print("Enter price: ");
                        double price = scanner.nextDouble();
                        System.out.print("Enter quantity in stock: ");
                        int quantity = scanner.nextInt();
                        scanner.nextLine(); // Consume newline
                        System.out.print("Enter size: ");
                        String size = scanner.nextLine();
                        System.out.print("Enter material: ");
                        String material = scanner.nextLine();
                        Clothing clothing = new Clothing(name, id, price, quantity, size, material);
                        cart.addProduct(clothing);
                    } catch (DuplicateProductIDException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 3:
                    cart.displayCart();
                    break;
                case 4:
                    System.out.println("Total Price: $" + cart.calculateTotalPrice());
                    break;
                case 5:
                    try {
                        System.out.print("Enter product ID to delete: ");
                        int deleteId = scanner.nextInt();
                        cart.deleteProduct(deleteId);
                        System.out.println("Product with ID " + deleteId + " deleted from cart.");
                    } catch (ProductNotFoundException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 6:
                    System.out.println("Exiting...");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 6.");
            }
        }
    }
}

