package edu.psu.pizzashop.pizzashop;

import org.springframework.core.annotation.Order;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

@RestController
public class Controller {

    private HashMap<Integer, String> menuH = new HashMap<>();
    private HashMap<Integer, Order> orderH = new HashMap<>();
    private int orderID;

    public Controller() {
        menuH.put(1, "You picked 1");
        menuH.put(2, "Why tf would you poick 2??");
        menuH.put(3, "3");
        menuH.put(4, "four");
    }

    @GetMapping(value = "/menu")
    public String getMenu() {
        return "we serve pizza here sir\npizza: $10\npop: $1\nwings: $0.50/wing";
    }

    @GetMapping("/menubyiu")
    public String getMenuById(@RequestParam(name = "id") int id) {
        return menuH.get(id);
    }

    @PostMapping("/order/create")
    public int createOrder(@RequestBody Order order) {
        orderH.put(orderID, order);

        return orderID++;
    }

    // Tools -> HTTPclient -> test restful web service

}
