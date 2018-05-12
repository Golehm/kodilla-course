package com.kodilla.good.patterns.foodtodoor;

import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void main(String[] argv){
        List<Product> testList1 = new ArrayList<>();
        List<Product> testList2 = new ArrayList<>();
        List<Product> testList3 = new ArrayList<>();
        List<Product> testList4 = new ArrayList<>();
        List<Product> testList5 = new ArrayList<>();
        List<Product> testList6 = new ArrayList<>();

        Product bread = new Product(3,"Bread");
        Product roll = new Product(7,"Roll");
        Product pie = new Product(1,"Pie");
        Product lettuce = new Product(2,"Lettuce");
        Product carrot = new Product(8,"Carrot");
        Product banana = new Product(9,"Banana");
        Product orange = new Product(12,"Orange");
        Product pineapple = new Product(1,"Pineapple");
        Product cheese = new Product(2,"Cheese");
        Product butter = new Product(4,"Butter");

        testList1.add(bread);
        testList1.add(roll);
        testList1.add(pie);

        testList2.add(lettuce);

        testList3.add(carrot);
        testList3.add(banana);
        testList3.add(orange);
        testList3.add(pineapple);

        testList4.add(cheese);
        testList4.add(butter);

        testList5.add(banana);
        testList5.add(bread);
        testList5.add(carrot);
        testList5.add(cheese);
        testList5.add(pie);

        testList6.add(orange);
        testList6.add(carrot);
        testList6.add(roll);

        Process extraFoodShop1 = new ExtraFoodShop(testList1);
        Process extraFoodShop2 = new ExtraFoodShop(testList2);
        Process healthyShop1 = new HealthyShop(testList3);
        Process healthyShop2 = new HealthyShop(testList4);
        Process glutenFreeShop1 = new GlutenFreeShop(testList5);
        Process glutenFreeShop2 = new GlutenFreeShop(testList6);

        extraFoodShop1.process(new Product(2,"Kiwi"));
        extraFoodShop2.process(orange);
        healthyShop1.process(cheese);
        healthyShop2.process(bread);
        glutenFreeShop1.process(new Product(2,"Banana"));
        glutenFreeShop2.process(roll);
    }
}
