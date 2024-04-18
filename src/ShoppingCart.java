import java.util.ArrayList;
import java.util.List;
public class ShoppingCart
{
    private List<Product> cartItems;

    public ShoppingCart() {
        cartItems = new ArrayList<>();
    }

    public void addToCart(Product product) {
        cartItems.add(product);
        System.out.println("Product added to cart: " + product.getProductName());
    }
    public void displayCart() {
        if (cartItems.isEmpty()) {
            System.out.println("Your shopping cart is empty.");
        } else {
            System.out.println("Shopping Cart Contents:");
            for (Product item : cartItems) {
                item.display();
                System.out.println("*****");
            }
        }
    }
    public double calculateTotalPrice() {
        double total = 0;
        for (Product item : cartItems) {
            total += item.getPrice();
        }
        return total;
    }
}
