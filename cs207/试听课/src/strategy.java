public class Thermometer {
    private float currentTemperature = 283.15f; //A default is 283.15 Kelvin
    public float getTemperature() {
        return currentTemperature;
    }
}

public abstract class Display {
    protected Thermometer t;
    protected Converter c;
    Display(){
        c = new Converter();
        t = new Thermometer();
    }
    /**
     * Prints the current temperature -- in any unit.
     */
    public abstract void displayReading();
}

public class DisplayCelsius extends Display {
    /**
     * Prints the current temperature - in Celsius.
     */
    public void displayReading() {
        System.out.println("Displaying: " + c.fromKalvinToCelsius(t.getTemperature()) + "C");
    }
}
public class DisplayFahrenheit extends Display {
    /**
     * Prints the current temperature - in Fahrenheit.
     */
    public void displayReading() {
        System.out.println("Displaying: " + c.fromKalvinToFahrenheit(t.getTemperature()) + "F");
    }
}

public class Refrigerator {
    public static void main(String[] args) {
// The following switching needs to take place using strategy.

        DisplayContext dc = new DisplayContext();
        dc.SetDisplayMethod(new DisplayFahrenheit());
        dc.displayReading();

        dc.SetDisplayMethod(new DisplayCelsius());
        dc.displayReading();
    }
}


public class DisplayContext {
    private Display displayMethod;
    public void SetDisplayMethod(Display display){
        this.displayMethod = display;
    }
    public void displayReading(){
        displayMethod.displayReading();
    }
}


/**
 * Temperature converter for your convenience.
 */
public class Converter {
    /**
     * @param The temperature in Kalvin
     * @return The temperature in Fahrenheit
     */
    public float fromKalvinToFahrenheit(float a){
        return (float) ((a-273.15)*9.0/5.0+32);
    }
    /**
     * @param The temperature in Kalvin
     * @return The temperature in Celsius
     */
    public float fromKalvinToCelsius(float a){
        return (float) (a - 273.15);
    }
}