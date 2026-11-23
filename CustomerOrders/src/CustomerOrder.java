
public class CustomerOrder {

    private String Name; //Not Used squiggly yellow line is wrong (this is not the error)
    private String Date; //Not Used squiggly yellow line is wrong
    private int Quantity;

    public CustomerOrder() {

        this.Name = "";
        this.Date = "";
        this.Quantity = 0;
    }

    public CustomerOrder(String Name, String Date, int Quantity) {

        this.Name = Name;
        this.Date = Date;
        this.Quantity = Quantity;
    }

    public void Ship () {

        if (this.Quantity > 0) {    
            this.Quantity--;
        }

        //This makes the null customer because if there is no quantity there is no customer?
        else if (this.Quantity <= 0) {
            return;
        }
    }

    public int getQuantity() {

        return this.Quantity;
    }

}
