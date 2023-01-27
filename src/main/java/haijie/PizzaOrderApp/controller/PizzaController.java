package haijie.PizzaOrderApp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import haijie.PizzaOrderApp.models.Order;
import jakarta.validation.Valid;

@Controller
@RequestMapping(path="")
public class PizzaController {
    
    @GetMapping
    public String showOrderForm(Model model){
        model.addAttribute("pizza", new Order());
        model.addAttribute("size", new Order());
        model.addAttribute("quantity", new Order());
        return "";
    }

    @PostMapping
    public String saveOrder(@Valid Order order,BindingResult binding, Model model){
        if (binding.hasErrors()) {
            return "";
        }
        return "pizza";
    }


}
