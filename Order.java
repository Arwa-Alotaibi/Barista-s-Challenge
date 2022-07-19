import java.util.ArrayList;

public class Order {
    private String name;
    private boolean ready;
    private ArrayList<Item> items ;

    //Add a constructor to your Order class that takes no arguments,
    // but sets the name to "Guest" and initializes the items array to an empty ArrayList<Item> 
    public Order(){
        this.name="Guest";
        this.items=new ArrayList();
    }

    //Add an overloaded constructor for Order that takes String name as an argument,
    // so you can create an instance with a name.
    public Order(String name){
        this.name= name;
        this.items=new ArrayList();

    }
    //Create getters and setters for all the member variables, using good naming convention for boolean accessors.
    // Getters and Setters
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    
    
    public void setReady(boolean ready) {
        this.ready = ready;
    }
    public ArrayList<Item> getItems() {
        return items;
    }
    public void setItems(ArrayList<Item> items) {
        this.items = items;
    }

    


    


//Order Class Methods:

    //Create a method called addItem  that takes an Item object as an argument and adds the item to the order's items array. 
    //No need to return anything
    public void addItem(Item item){
        items.add(item);

    }


    //Create a method called getStatusMessage that returns a String message. 
    //If the order is ready, return "Your order is ready.",
    // if not, return "Thank you for waiting. Your order will be ready soon."

    public String getStatusMessage(){
        if (ready){
            return "Your order is ready. :)";
        }
        else{

            return "Thank you for waiting. Your order will be ready soon.";
        }
    }

    // create a method called getOrderTotal that sums together each of the item's prices, and returns the total amount. 
    public double getOrderTotal(){
        double sum=0.0;
        for (Item num:this.items){
            sum+= num.getPrice();
        }
        return sum;
    }

    //create a method called display that prints out the order information
    public void display(){
        System.out.println("Custormer Name:"+this.getName());

        for(Item information:this.items){
            System.out.println(information.getName()+"-"+"$"+information.getPrice());
        }

        System.out.println("the Total is: "+"$"+ getOrderTotal());

    }

    


}
