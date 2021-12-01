public abstract class Apple extends Fruit implements movable{
	private int numSeeds;


	public Apple(int numSeeds) {
		super("aaa");
		this.numSeeds = numSeeds;
	}

	public int getNumSeeds() {
		return numSeeds;
	}



	public static int getNumFruit() {
		return numFruit;
	}



	@Override
	public String getName() {
		System.out.println(super.name);

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

	@Override
	public void move() {

	}

	@Override
	public void stop() {

	}

	@Override
	public void getposition() {

	}
}
