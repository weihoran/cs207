public class FallMigration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MonarchButterfly m1 = new MonarchButterfly();
		MonarchButterfly m2 = new MonarchButterfly();
		Goose g1 = new Goose();
		Goose g2 = new Goose();
		MigratoryFlock birds = new MigratoryFlock();
		birds.add(g1);
		birds.add(g2);
		MigratoryFlock butterflies = new MigratoryFlock();
		butterflies.add(m1);
		butterflies.add(m2);
		
		MigratoryFlock fall2021 = new MigratoryFlock();
		fall2021.add(birds);
		fall2021.add(butterflies);
		fall2021.migrate();
	}

}
