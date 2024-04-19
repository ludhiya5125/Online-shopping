//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Product tv = new Electronics("Smart Phone", 523, 65.99, 9, "Vivo", 12);
        Product shirt = new Clothing("Women's Top", 150, 15.99, 20, "M", "Cotton");
      // Add products to the shopping cart
        ShoppingCart cart = new ShoppingCart();
        cart.addToCart(tv);
        cart.addToCart(shirt);

        // Display cart contents and total price
        cart.displayCart();
        System.out.println("Total Price: $" + cart.calculateTotalPrice());

        scanner.close();
    }
}
