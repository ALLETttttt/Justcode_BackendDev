package Ex1;

public class Product {

    private String name;
    private Money price;

    public Product(String name, Money price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Money getPrice() {
        return price;
    }

    public void setPrice(Money price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    public void reducePrice(int dollar, int cent) {
        price.subtract(dollar, cent);
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.print("Price: ");
        price.display();
    }
}
