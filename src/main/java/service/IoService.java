package service;

import model.Coin;
import model.Product;

import java.util.Map;

public class IoService {

    public void displayProductMenu(Map<Product, Integer> productStock) {
        System.out.println();
        System.out.println("Cod" + "  " + "Name" + "  " + "  " + "Price" + " " + " " + "Size" + "  " + "Stock");
        for (Product product : productStock.keySet()) {
            System.out.println(product.getCod() + "  " + product.getName() + "    " + product.getPrice() + "    " + product.getSize() +
                    "   " + productStock.get(product));
        }
    }

    public void displayCoinMenu(Map<Coin, Integer> coinStock) {
        System.out.println();
        System.out.println("Cod" + " " + "Value" + " " + "Stock");
        for (Coin coin : coinStock.keySet()) {
            System.out.println(coin.getCod() + "  " + coin.getValue() + "     " + coinStock.get(coin));
        }
    }



}
