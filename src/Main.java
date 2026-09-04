import entities.Product;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Product> product = new ArrayList<>();
        System.out.println("How many products do you want to register? ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            boolean productNewSearch = false;
            System.out.println("Enter a product: ");
            Integer id = sc.nextInt();
            System.out.println("Enter a Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.println("Enter a price: ");
            Double price = sc.nextDouble();
            System.out.println("Enter a quantity: ");
            Integer quantity = sc.nextInt();

            for (Product newId : product){
                if (newId.getId() == id){
                    productNewSearch = true;
                }
            }
            if (productNewSearch){
                System.out.println("ID number, not added ");
            }
            else {
                System.out.println("ID added");
                product.add(new Product(name, id, price, quantity));
            }
        }

        for (Product newProduct : product){
            System.out.println(newProduct);
        }

        System.out.println("Set a low stock threshold");
        Integer lowStock = sc.nextInt();


        while (true){
            System.out.println("Select the option: ");
            System.out.println("----------------------- ");
            System.out.println("1 - Incoming Inventory ");
            System.out.println("2 - Stock out ");
            System.out.println("3 - Discount on a product ");
            System.out.println("4 - List all products ");
            System.out.println("5 - Total inventory value ");
            System.out.println("6 - Low-stock products ");
            System.out.println("7 - Most expensive / cheapest product");
            System.out.println("0 - Exit ");
            System.out.println("----------------------- ");
            int option = sc.nextInt();

            switch (option){
                case 1:
                    System.out.println("Which ID do you want to search for? ");
                    int idSearchAdd = sc.nextInt();
                    System.out.println("How much do you want to add to inventory? ");
                    int add = sc.nextInt();
                    Product found = null;
                    for (Product idSearchNew : product){
                        if (idSearchNew.getId() == idSearchAdd){
                            found = idSearchNew;
                            break;
                        }
                    }
                    if (found != null){
                        found.addStock(add);
                    }
                    else {
                        System.out.println("No product found with this id ");
                    }

                    for (Product newProduct : product){
                        System.out.println(newProduct);
                    }
                    break;

                case 2:
                    System.out.println("Which ID do you want to search for? ");
                    int idSearchRemove = sc.nextInt();
                    System.out.println("How much do you want to remove to inventory? ");
                    int remove = sc.nextInt();
                    Product foundRemove = null;
                    for (Product idSearchNewRemove : product){
                        if (idSearchNewRemove.getId() == idSearchRemove){
                            foundRemove = idSearchNewRemove;
                            break;
                        }
                    }
                    if (foundRemove != null){
                        foundRemove.removeStock(remove);
                    }
                    else {
                        System.out.println("No product found with this id ");
                    }

                    for (Product newProduct : product){
                        System.out.println(newProduct);
                    }
                    break;

                case 3:
                    System.out.println("Which ID do you want to search for? ");
                    int idSearchPercentage = sc.nextInt();
                    System.out.println("What is the percentage? ");
                    double percentage = sc.nextDouble();
                    Product foundPercentage = null;
                    for (Product idSearchNewPercentage : product){
                        if (idSearchNewPercentage.getId() == idSearchPercentage){
                            foundPercentage = idSearchNewPercentage;
                            break;
                        }
                    }
                    if (foundPercentage != null){
                        foundPercentage.applyDiscount(percentage);
                    }
                    else {
                        System.out.println("No product found with this id ");
                    }

                    for (Product newProduct : product){
                        System.out.println(newProduct);
                    }
                    break;

                case 4:
                    for (Product newProduct : product){
                        System.out.println(newProduct);
                    }
                    break;

                case 5:
                    double valueTotal = 0.0;
                    for (int i = 0; i < product.size(); i++){
                        valueTotal += product.get(i).getQuantity() * product.get(i).getPrice();
                    }
                    System.out.printf("Total stock value: %.2f%n", valueTotal);
                    break;

                case 6:
                    boolean foundLow = false;
                    for (Product lowStockQuantity : product){
                        if (lowStock > lowStockQuantity.getQuantity() ){
                            System.out.println(lowStockQuantity);
                            foundLow = true;
                        }
                    }
                    if (foundLow != true){
                        System.out.println("There are no products below");
                    }
                    break;

                case 7:
                    Product mostExpensive = product.get(0);
                    Product cheapest  = product.get(0);
                    for (Product productComparison : product){
                        if (productComparison.getPrice() > mostExpensive.getPrice()){
                            mostExpensive = productComparison;
                        }
                        if (productComparison.getPrice() < cheapest.getPrice()){
                            cheapest = productComparison;
                        }
                    }
                    System.out.println(mostExpensive);
                    System.out.println(cheapest);
                    break;

                case 0:
                    System.out.println("Closing the program...");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid option, please try again. ");

            }


        }

    }
}