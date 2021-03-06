package src.facade.with_facade;

public class FoodItem
{

    private String name;
    private double price;

    public FoodItem (String it, double price)
    {
        this.name = it;
        this.price = price;
    }


    public String getName ()
    {
        return this.name;
    }


    public double getPrice ()
    {
        return this.price;
    }


    public String toString ()
    {
        return name + "," + price;
    }


}
