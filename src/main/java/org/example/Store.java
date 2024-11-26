package org.example;

import org.example.model.Bread;
import org.example.model.Chocolate;
import org.example.model.Coke;
import org.example.model.ProductForSale;

public class Store {
    public static void main(String[] args) {
        startStore();
    }
        public static void startStore() {
            ProductForSale chocolate = new Chocolate("Dark Chocolate", 40, "Makes You Smile");
            ProductForSale coke = new Coke("Coke", 25, "Please Drink Cold");
            ProductForSale bread = new Bread("Black", 10, "Healty");

            ProductForSale[] products = {chocolate, coke, bread};

        }


    public static void listProducts(ProductForSale[] products) {

        for (ProductForSale product:products){
            product.showDetails();
        }

    }
}