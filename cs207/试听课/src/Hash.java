import java.util.Objects;

class Hash {
    private String registration;
    private String model;
    private int odometer;
    private String transmission;

    /**
     * Initialises a car.
     * @param registration the car’s registration. i.e. number plate
     * @param model the car’s model
     * @param odometer the car’s current odometer reading
     * @param transmission the car’s transmission type
     * */
    public Hash(String registration, String model, int odometer,
               String transmission) {
        this.registration = registration;
        this.model = model;
        this.odometer = odometer;
        this.transmission = transmission;
    }

    /**
     * Returns true IF AND ONLY IF this car is equal to the other given car.
     * For two cars to be equal, they must:
     * have the same registration string
     * have the same model string
     * have the same odometer reading
     * have the same transmission type
     * @param obj other object to compare equality
     * @return true if equal, false otherwise
     */
    @Override
    public boolean equals(Object obj) {
        // add code here
        if(this == obj) return true;
        if(obj == null) return false;
        if(this.getClass() != obj.getClass()) return false;
        Hash car = (Hash)obj;
        return registration.equals(car.registration) && model.equals(car.model) && odometer == car.odometer && transmission.equals(car.transmission);
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
        hash = 31 * hash + (model == null ? 0 : model.hashCode());
        hash = 31 * hash + odometer;
        hash = 31 * hash + (transmission == null ? 0 : transmission.hashCode());
        return hash;

    }

}