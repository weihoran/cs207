public class Apple extends Fruit {
	public String name;
	public static int numFruit =2;
	private int numSeeds;
	private String variety;

	public Apple(int numSeeds, String variety) {
		super("apple");
		this.numSeeds = numSeeds;
		this.variety = variety;

	}
	
	public int getNumSeeds() {
		return numSeeds;
	}
	public String getVariety() {
		return variety;
	}



	public static int getNumFruit() {
		return numFruit;
	}



	@Override
	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;	
	}
	
	@Override
	public String toString() {
		return "this is an apple";
	}//类比python中的__str__
	
	public static Apple pickFruit(Fruit f)
	{
		return new Apple(0,"new apple");
	}
}
