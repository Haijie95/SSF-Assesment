package haijie.PizzaOrderApp.models;

import java.io.Serializable;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

public class Order implements Serializable {

        @NotNull(message = "Must choose a pizza!")
        @Pattern(regexp = "bella|margherita|marinara|spianatacalabrese|trioformaggio")
        private String pizza;

        @Pattern(regexp = "sm|md|lg")
        private String size;

        @Min(value = 1, message = "Must have at least 1 pizza!")
        @Max(value = 10, message = "No more than 10 pizza can be ordered!")
        private String quantity;
        
        public String getPizza() {
            return pizza;
        }
        public void setPizza(String pizza) {
            this.pizza = pizza;
        }
        public String getSize() {
            return size;
        }
        public void setSize(String size) {
            this.size = size;
        }
        public String getQuantity() {
            return quantity;
        }
        public void setQuantity(String quantity) {
            this.quantity = quantity;
        }
        
}
