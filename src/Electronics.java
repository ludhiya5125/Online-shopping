public class Electronics extends Product
{
    private String brand;
    private int warrantyPeriod;
    public Electronics()
    {
        System.out.println("Add Electronics:");
    }
    public Electronics(String productName, int productId, double price, int quantityInStock,String brand,int warrantyPeriod)
    {
        super(productName,productId,price,quantityInStock);
        this.brand=brand;
        this.warrantyPeriod=warrantyPeriod;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getWarrantyPeriod() {
        return warrantyPeriod;
    }

    public void setWarrantyPeriod(int warrantyPeriod) {
        this.warrantyPeriod = warrantyPeriod;
    }
    public void display()
    {
        System.out.println("Electronics Info : ");
        super.display();
        System.out.println("brand : "+brand);
        System.out.println("warrantyPeriod : "+warrantyPeriod);
    }
}
