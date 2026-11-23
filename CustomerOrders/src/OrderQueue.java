import java.util.Queue;
import java.util.LinkedList;

public class OrderQueue {  
 
    private Queue<CustomerOrder> OrderQueue;
    private int Stock; 
    private int Size;

    public OrderQueue() {
        this.OrderQueue = new LinkedList<CustomerOrder>();
        this.Stock = 0;
        this.Size = 0;
    }

    public OrderQueue(int Stock) {
        OrderQueue = new LinkedList<CustomerOrder>();
        this.Stock = Stock;
        Size = 0;
    }

    public void addOrder(String Name, String Date, int Quantity) {
        CustomerOrder NewOrder = new CustomerOrder(Name, Date, Quantity);
        NewOrder.enqueue(NewOrder);
        Size++;
    }
    public void addStock(int amount) {
        Stock += amount;
    }

    public void fillOneOrder () {

        if (Stock > 0 && !OrderQueue.isEmpty()) {

            CustomerOrder CurrentOrder = OrderQueue.peek();
            CurrentOrder.Ship();
            Stock--;
            if (CurrentOrder.getQuantity() ==0){
                OrderQueue.dequeue();
                Size--;
            }
        }
    }

    public void ClearStock() {

        while (Stock > 0 && !OrderQueue.isEmpty()) {
            fillOneOrder();
        }
    }

    public String toString() {

        if (OrderQueue.isEmpty()) {
            return "0";
        }
        else {
            return " " + OrderQueue.peek().getQuantity();
        }
     }
}
