package model;

public class Product {

    private Integer cod;
    private String name;
    private Integer price;
    private String size;

    public Product(Integer cod, String name, Integer price, String size) {
        this.cod = cod;
        this.name = name;
        this.price = price;
        this.size = size;



    }

    public void setCod(Integer cod) {
        this.cod = cod;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public Integer getCod() {
        return cod;
    }

    public String getName() {
        return name;
    }

    public Integer getPrice() {
        return price;
    }

    public String getSize() {
        return size;
    }
}
