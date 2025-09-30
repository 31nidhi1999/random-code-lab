/*
    using lamda expression as well as method reference

    If we wan to sort array/collection of non primitive type using different criteria then we should
    implement Comparator interface.

    It is a Functional Interface which contain  int compare(T o1, T o2)

    - Returns a negative integer(-1) : If first argument is less than the second argument.
    - Returns zero(0): If first argument is equal to the second argument.
    - Returns a positive integer(1) : If first argument is greater than the second argument.
*/

import java.util.Comparator;
import java.util.ArrayList;
import java.util.List;
public class ProductComparator{
    public static void main(String args[]){
        List<Product> products = new ArrayList<>();

        products.add(new Product("Wireless Earbuds", 4999, 3499, 4.3, "Electronics"));
        products.add(new Product("Yoga Mat", 1200, 999, 4.7, "Fitness"));
        products.add(new Product("Laptop Backpack", 2500, 1999, 4.5, "Accessories"));
        products.add(new Product("Smartwatch", 9999, 7499, 4.2, "Wearables"));
        products.add(new Product("Bluetooth Speaker", 3000, 2250, 4.6, "Electronics"));
        products.add(new Product("Running Shoes", 5500, 4400, 4.8, "Footwear"));
        products.add(new Product("Coffee Maker", 6000, 4800, 4.1, "Kitchen"));
        products.add(new Product("DSLR Camera", 45000, 38000, 4.4, "Photography"));     
    
        /*
        Custom sorting in decending order on base on discount percentage
            Wireless Earbuds - 30.006001200240046% off
            Smartwatch - 25.002500250025% off
            Bluetooth Speaker - 25.0% off
            Laptop Backpack - 20.04% off
            Running Shoes - 20.0% off
            Coffee Maker - 20.0% off
            Yoga Mat - 16.75% off8
        */
        Comparator<Product> rankingDiscountPer = (Product p1, Product p2)->{
            double diff = (p2.getDiscountPer()-p1.getDiscountPer()); 
            if (diff < 0) {
                return -1;
                } else if (diff == 0) {
                return 0;
                } else {
                    return 1;
                }
        };


       /* 
            Wireless Earbuds - 30.01% offElectronics
            Bluetooth Speaker - 25.0% offElectronics
            Smartwatch - 25.0% offWearables
            Laptop Backpack - 20.04% offAccessories
            Coffee Maker - 20.0% offKitchen
            Running Shoes - 20.0% offFootwear
            Yoga Mat - 16.75% offFitness
            DSLR Camera - 15.56% offPhotography
        */
        Comparator<Product> rankingDiscountPer1= Comparator.comparing(Product::getDiscountPer).reversed().thenComparing(Product::getProdName);
        
        products.sort(rankingDiscountPer1);
        
        System.out.println("Custom sorting in decending order on base on discount percentage");
        for(Product p : products){
            System.out.println(p.getProdName() + " - " + p.getDiscountPer() + "% off" + p.getCategory());
        }

        /*
        Custom sorting in accessending order on base on rating
            Coffee Maker - 4.1 rating
            Smartwatch - 4.2 rating
            Wireless Earbuds - 4.3 rating
            DSLR Camera - 4.4 rating
            Laptop Backpack - 4.5 rating
            Bluetooth Speaker - 4.6 rating
            Yoga Mat - 4.7 rating
            Running Shoes - 4.8 rating
        */
        Comparator<Product> rating = Comparator.comparing(Product::getRating);

        /*
        If we want hight rating product first then we can used reversed function to achive our goal
            Running Shoes - 4.8 rating
            Yoga Mat - 4.7 rating
            Bluetooth Speaker - 4.6 rating
            Laptop Backpack - 4.5 rating
            DSLR Camera - 4.4 rating
            Wireless Earbuds - 4.3 rating
            Smartwatch - 4.2 rating
            Coffee Maker - 4.1 rating
        */
        //Comparator<Product> rating = Comparator.comparing(Product::getRating).reversed();

        products.sort(rating);
        
        System.out.println("Custom sorting in accessending order on base on rating");
        for(Product p : products){
            System.out.println(p.getProdName() + " - " + p.getRating() + " rating");
        }

        

    }
}