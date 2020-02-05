package edu.psu.pizzashop.pizzashop;

public class OrderDTO {
    String pizza;
    int pop;
    int wing;

    // takes info from order and takes out sensitive info
    public OrderDTO (Order neworder) {
        this.pizza = neworder.pizza;
        this.pop = neworder.pop;
        this.wing = neworder.wing;
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
