package service;

import model.Coin;
import model.CurrencyType;
import model.Product;

import java.util.HashMap;
import java.util.Map;

public class VendingMachine {

    private CurrencyType currencyType = CurrencyType.RON;

    private Map<Product, Integer> productStock;

    private Map<Coin, Integer> coinStock;

    private IoService ioService;


    public VendingMachine() {
        ioService= new IoService();
        productStock = new HashMap();
        Product product  = new Product(03,"  Fanta ",2,"0,5L");
        Product product1 = new Product(02,"  Sprite",3,"0,5L");
        Product product2 = new Product(01,"  Dorna ",1,"0,5L");
        Product product3 = new Product(04,"  Cola  ",4,"0,25");

        productStock.put(product,6);
        productStock.put(product1,5);
        productStock.put(product2,4);
        productStock.put(product3,8);


        coinStock = new HashMap();
        Coin coin01 = new Coin(201, 1);
        Coin coin05 = new Coin(203, 10);
        Coin coin10 = new Coin(202, 5);

        coinStock.put(coin01,50);
        coinStock.put(coin05,25);
        coinStock.put(coin10,40);

    }

    public void run(){

        ioService.displayProductMenu(productStock);
        ioService.displayCoinMenu(coinStock);
    }



}
