package edu.psu.pizzashop.pizzashop;


import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

@RestController
public class Controller {

    private HashMap<Integer, String>  menuH = new HashMap<>();
    private HashMap<Integer,  Order> orderH = new HashMap<>();
    private int orderID;

    public Controller() {
        menuH.put(1, "You picked 1");
        menuH.put(2, "Ew, Why tf would you poick 2??");
        menuH.put(3, "3");
        menuH.put(4, "vier");
    }

    @GetMapping(value = "/menu")
    public String getMenu() {
        return "We serve pizza here sir\npizza: $10\npop: $1\nwings: $0.50/wing";
    }

    @GetMapping("/menubyid") // /menubyid?id=2
    public String getMenuById(@RequestParam(name = "id") int id) {
        if (menuH.containsValue(id)) {
            return menuH.get(id);
        }else {
            return "Nice going you fucked it up. :/";
        }

    }

    // Now return type OrderDTO that only returns the non sensitive info that will be transferred to and from the web
    // This is done for security reasons
    @PostMapping("/order/create")
    public OrderDTO createOrder(@RequestBody Order order) {
        orderH.put(orderID, order);

        OrderDTO od = new OrderDTO(order);

        orderID++;

        return od;
    } // import make sure that's its from the right place.  my library or not
    // The color was yellow and there was an import statement that was causing issues
    


    // Wednesday:
    @GetMapping("/order/get")
    public Order getOrder(@RequestParam(name = "id") int id) {
        return orderH.get(id);
    }

    @GetMapping("/order/update")
    public String updateOrder(@RequestParam(name = "id") int id, @RequestBody Order order) {
        orderH.remove(id);

        orderH.put(id, order);

        return "You updated " + id;
    }

    @GetMapping("/order/delete")
    public String deleteOrder(@RequestParam (name = "id") int id) {
        orderH.remove(id);

        return "You deleted " + id;
    }


    // Tools -> HTTPclient -> test restful web service

}
