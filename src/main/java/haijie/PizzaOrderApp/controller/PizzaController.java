package haijie.PizzaOrderApp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import haijie.PizzaOrderApp.models.Delivery;
import haijie.PizzaOrderApp.models.Order;
// import haijie.PizzaOrderApp.models.PurchaseOrder;
import jakarta.validation.Valid;

@Controller
public class PizzaController {
    
    // PurchaseOrder po = new PurchaseOrder();

    @GetMapping(path = "/")
    public String showOrderForm(Model model){
        model.addAttribute("order", new Order());
        return "index";
    }

    @PostMapping(path="/pizza")
    public String saveOrder(@Valid Order order,BindingResult binding, Model model){
        if (binding.hasErrors()) {
            return "index";
        }   
        return "deliveryForm";
    }

    @PostMapping(path="/pizza/order")
    public String saveDelivery(@Valid Delivery delivery,BindingResult binding, Model model){
        if (binding.hasErrors()) {
            return "deliveryForm";
        }
        return "confirmOrder";
    }

    @GetMapping("{ordernumber}")
    public String getOrderById(Model model, @PathVariable String ordernumber) {
        return "showContact";
    }

    @GetMapping(path = "/list")
    public String getAllOrders(Model model) {
        return "contacts";
    }

    


}
