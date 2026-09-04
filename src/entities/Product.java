package entities;

public class Product {
    private String name;
    private Integer id;
    private Double price;
    private Integer quantity;


    public Product(String name, Integer id, Double price, Integer quantity) {
        this.name = name;
        this.id = id;
        this.price = price;
        this.quantity = quantity;
    }

    public void applyDiscount (double percentage){
        price -= price * (percentage / 100);
    }

    public void addStock(int amount) {
        quantity += amount ;
    }

    public void removeStock(int amount) {
        if (quantity >= amount){
            quantity -= amount ;
        }
        else {
            System.out.println("No quantity in stock");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Integer getId() {
        return id;
    }

    public Double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Product "
                +" name = "
                + name
                + " , id = "
                + id
                + " , price = "
                + price
                + ", quantity = "
                + quantity;
    }
}
