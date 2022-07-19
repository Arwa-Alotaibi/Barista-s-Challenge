public class Item {
    private String name;
    private double price;



    //Add a constructor to your Item class that takes a String name and  double price as arguments 
    //to set the name and price for that object on instantiation.
    public Item(String name , double price){
        this.name=name;
        this.price=price;
    }
    //Create getters and setters for all the member variables.
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }

    

}
