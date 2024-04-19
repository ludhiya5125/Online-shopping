import java.util.ArrayList;
import java.util.List;
public class ShoppingCart
{
    private List<Product> cartItems;

    public ShoppingCart() {
        cartItems = new ArrayList<>();
    }
    public void addProduct(Product product) throws DuplicateProductIDException
    {
        for(Product p:cartItems)
        {
            if(p.getProductId()==product.getProductId())
            {
                throw new DuplicateProductIDException("Product id:"+product.getProductId()+" already present in the cart");
            }
        }
        cartItems.add(product);

    }
    public void deleteProduct(int id)throws ProductNotFoundException
    {
        boolean finding=false;
        for(int i=0;i<cartItems.size();i++)
        {
            if (cartItems.get(i).getProductId() == id) {
                cartItems.remove(i);
                finding = true;
                break;
            }
        }
        if(!finding)
        {
            throw new ProductNotFoundException("Product that you require with ID:"+id+" is not found in your cart");
        }
    }
   /* public void addToCart(Product product) {
        cartItems.add(product);
        System.out.println("Product added to cart: " + product.getProductName());
    }*/
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
