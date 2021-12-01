
public class Grape extends Fruit {

    //public String name = "Grape";
    //public boolean isForSale = true;
    //public static String salesCat = "individual produce";
    public String color;

    public Grape(String name, String color) {
        super(name);
        this.color = color;
    }   // super.__init__("fruit")

    public static String getSalesCat() {
        return salesCat;
    }

    public boolean getIsForSale() {
        return isForSale;
    }

    public void setIsForSale(boolean status) {
        isForSale = status;
    }

    @Override
    public String getName() {
        return "my name is :" + name;
    }

    public Pear fruitSalad(){
        return new Pear();
    }

    public String toString() {
        return "Grapes are fruits.";
    }
}
