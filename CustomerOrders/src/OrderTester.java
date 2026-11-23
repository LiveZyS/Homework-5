/* 
Contains a main function that will:
Instantiate an OrderQueue with a stock of 18.
Enqueue three customer orders with a positive balance, and quantities of 7, 7, and 8.
Print the OrderQueue
Clear the stock by filling as many orders as possible.
Print the OrderQueue
Add an additional 10 units to stock
Add three additional customer orders, with quantities of 3, 3, 5
Clear the stock by filling as many orders as possible.
Print the OrderQueue
Expected output:
7
4
5
*/
public class OrderTester {

    public static void main(String[]args) {

        OrderQueue Orders = new OrderQueue(18);
        Orders.addOrder ("","", 7);
        Orders.addOrder ("","", 7);
        Orders.addOrder ("","", 8);
        
        System.out.println(Orders);

        Orders.ClearStock();
        System.out.println(Orders);

        Orders.addStock(10);
        Orders.addOrder ("","", 3);
        Orders.addOrder ("","", 3);
        Orders.addOrder ("","", 5);

        Orders.ClearStock();
        System.out.println(Orders);

    }
}
