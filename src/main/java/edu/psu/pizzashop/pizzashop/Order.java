package edu.psu.pizzashop.pizzashop;

public class Order {
    String pizza;
    int pop;
    int wing;

    String creaditCardNum;
    String CCV;
    String expirationDate;

    public String getCreaditCardNum() {
        return creaditCardNum;
    }

    public void setCreaditCardNum(String creaditCardNum) {
        this.creaditCardNum = creaditCardNum;
    }

    // That was easy
    public String getPizza() {
        return pizza;
    }

    public void setPizza(String pizza) {
        this.pizza = pizza;
    }

    public int getPop() {
        return pop;
    }

    public void setPop(int pop) {
        this.pop = pop;
    }

    public int getWing() {
        return wing;
    }

    public void setWing(int wing) {
        this.wing = wing;
    }


}
