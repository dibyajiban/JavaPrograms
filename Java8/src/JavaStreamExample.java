import java.util.*;  
import java.util.stream.Collectors;
class Product{  
    int id;  
    String name;  
    float price;  
    public Product(int id, String name, float price) {  
        this.id = id;  
        this.name = name;  
        this.price = price;  
    }  
}  
public class JavaStreamExample {  
    public static void main(String[] args) {  
        List<Product> productsList = new ArrayList<Product>();  
        //Adding Products  
        productsList.add(new Product(1,"HP Laptop",25000f));  
        productsList.add(new Product(2,"Dell Laptop",30000f));  
        productsList.add(new Product(3,"Lenevo Laptop",28000f));  
        productsList.add(new Product(4,"Sony Laptop",28000f));  
        productsList.add(new Product(5,"Apple Laptop",90000f));  
        /*productsList.stream()  
                    .filter(p ->p.price> 3000)   // filtering price  
                    .map(pm ->pm.price)          // fetching price  
                    .forEach(System.out::println);  // iterating price  
        
        List<Float> pricesList =  productsList.stream()  
                .filter(p ->p.price> 3000 && p.id > 2)   // filtering price  
                .map(pm ->pm.price)          // fetching price  
                .collect(Collectors.toList());  
        System.out.println(pricesList);*/
        
        /*List<Product> products = productsList.stream()
                .filter(p -> p.price > 18)
                .map(Product::new)
                .collect(Collectors.toList());*/
        
        productsList.forEach(x -> System.out.println(x.id +" "+ x.name));
    }  
}  