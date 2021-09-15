import java.util.ArrayList;

public class Test {
	public static void main(String[] args) {

		Fruit v1 = new Fruit("first fruit");
		Fruit v2 = new Apple(1,"Macintosh");
		Apple v3 = new Apple(2,"Fuji");

		//Apple a = new Fruit("apple");

		//System.out.println((Apple)v1);



		//new ArrayList<>()
		//Apple a = new Fruit("first fruit");
		//System.out.println((Apple)v2);

		//1
		System.out.println("1: "+v2.name);
		//2
		System.out.println("2: "+v3.name);
		//3
		System.out.println("3: "+v2.numFruit);
		//4
		System.out.println("4: "+v3.numFruit);
		//5
		System.out.println("5: "+v1.getNumFruit());
		//6
		System.out.println("6: "+v1.getName());
		//7
		System.out.println("7: "+v2.getNumFruit());
		//8
		System.out.println("8: "+v2.getName());
		//9
		System.out.println("9: "+v3.getNumFruit());
		//10
		System.out.println("10: "+v3.getName());
		//11
		System.out.println("11: "+Apple.pickFruit(v3));
		//12 can not compile
		//System.out.println(Fruit.pick(v1));
		//14
		System.out.println("14: "+v3.getCanGrow());

	}

}
