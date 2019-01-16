package model;

public class Coin {

    private Integer cod;
    private Integer value;

    public Coin(Integer cod, Integer value) {
        this.cod = cod;
        this.value = value;

    }

    public Integer getCod() {
        return cod;
    }

    public Integer getValue() {
        return value;
    }

    public void setCod(Integer cod) {
        this.cod = cod;
    }

    public void setValue(Integer value) {
        this.value = value;
    }


}
