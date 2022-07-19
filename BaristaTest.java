public class BaristaTest {

    public static void main(String[] args) {
        Item item1 = new Item("mocha",15.0);
        Item item2 = new Item("latte",16.0);
        Item item3 = new Item("drip coffee",18.0);
        Item item4 = new Item("capuccino",19.0);

//Create 2 orders for unspecified guests (without specifying a name);

    Order order1= new Order();
    Order order2= new Order();
//Create 3 orders using the overloaded constructor to give each a name for the order
Order order3=new Order("Arwa");
Order order4=new Order("Eman");
Order order5=new Order("Anoud");


//Add at least 2 items to each of the orders using the addItem method you wrote, for example,
// to add item1 to order3 you would need to
// call the addItem method from the order3 instance like so: order3.addItem(item1);
order1.addItem(item1);
order1.addItem(item2);
order2.addItem(item3);
order2.addItem(item4);

//
order3.addItem(item1);
order3.addItem(item2);
order4.addItem(item3);
order4.addItem(item4);

order5.addItem(item1);
order5.addItem(item2);

//Test your getStatusMessage functionality by setting some orders to ready and printing the messages for each order. 
order1.setReady(true);
order2.setReady(true);
order3.setReady(true);
order4.setReady(true);
order5.setReady(true);

System.out.println(order3.getStatusMessage());

System.out.println(order4.getStatusMessage());


//Test the total by printing :
System.out.println(order1.getOrderTotal());

//Finally, call the display method on all of your orders;
order1.display();
order2.display();
order3.display();
order4.display();
order5.display();











        
    }

    

    
}

