package haijie.PizzaOrderApp.models;

public class PurchaseOrder {
    private String ordernumber;
    private String address;
    private Float pCost=0f;
    private Float rCost=0f;
    private Float sCost=0f;
    private Float totalCost=0f;
    private String pizza;
    private String size;
    private String quantity; //need to change to float
    private Boolean rush;

    
    public Float getsCost() {
        return sCost;
    }
    public void setsCost(Float sCost) {
        this.sCost = sCost;
    }
    
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
    public String getOrdernumber() {
        return ordernumber;
    }
    public void setOrdernumber(String ordernumber) {
        this.ordernumber = ordernumber;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public Float getpCost() {
        return pCost;
    }
    public void setpCost(Float pCost) {
        this.pCost = pCost;
    }
    public Float getrCost() {
        return rCost;
    }
    public void setrCost(Float rCost) {
        this.rCost = rCost;
    }
    public Float getTotalCost() {
        return totalCost;
    }
    public void setTotalCost(Float totalCost) {
        this.totalCost = totalCost;
    }

    public void calculateCost(PurchaseOrder po){
        

            if (this.getPizza() =="mariana"){
                pCost=30f;
            }
            else if (this.getPizza() =="bella"){
                pCost=30f;
            }
            else if (this.getPizza() =="spianatacalabrese"){
                pCost=30f;
            }
            else if (this.getPizza()=="margherita"){
                pCost=22f;
            }
            else if (this.getPizza()=="trioformaggio"){
                pCost=25f;
            }

            if(this.getSize()=="sm"){
                sCost=1f;
            }
            else if(this.getSize()=="md"){
                sCost=1.2f;
            }
            else if(this.getSize()=="lg"){
                sCost=1.5f;
            }
            
            this.totalCost=this.pCost*this.sCost;
            if(this.rush==true)
            this.totalCost=this.totalCost+2;
        }


    
    public String getQuantity() {
        return quantity;
    }
    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }
    public Boolean getRush() {
        return rush;
    }
    public void setRush(Boolean rush) {
        this.rush = rush;
    }
  
}
