import java.util.Objects;

class Car {
    private String registration;
    private int fuel;

    /**
     * Initialises a car.
     * @param registration the car’s registration. i.e. number plate
     * @param fuel the car’s fuel
     * */
    public Car(String registration, int fuel, int odometer,
               String transmission) {
        this.registration = registration;
        this.fuel = fuel;
    }

    /**
     * Returns true IF AND ONLY IF this car is equal to the other given car.
     * For two cars to be equal, they must:
     * have the same registration string
     * have the same fuel string
     * @param obj other object to compare equality
     * @return true if equal, false otherwise
     */
    @Override
    public boolean equals(Object obj) {
        // add code here
        if(this == obj) return true;
        if(obj == null) return false;
        if(this.getClass() != obj.getClass()) return false;
        Car car = (Car)obj;
        return registration.equals(car.registration) && fuel == car.fuel;
    }

    /**
     * Returns the hash code of this car.
     * Two cars that are equal according to
     * Hash.equals(Object) should have the same hash code.
     * @return hash code of this car
     */
    @Override
    public int hashCode() {

        // add code here
        int hash = 7;
        hash = 31 * hash + (registration == null ? 0 : registration.hashCode());
        hash = 31 * hash + fuel;
        return hash;


    }



}