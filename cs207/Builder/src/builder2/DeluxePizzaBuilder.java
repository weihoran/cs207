package builder2;

public class DeluxePizzaBuilder extends PizzaBuilder {
	
	public DeluxePizzaBuilder() {
		super("Deluxe");
		this.addExtraCheese();
		this.addExtraSauce();
		this.addPepperoni();
		this.addPineapple();
		this.addTomato();
	}
}
