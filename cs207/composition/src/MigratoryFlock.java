import java.util.ArrayList;
import java.util.List;

public class MigratoryFlock implements MigratorySpecies {
	
	private List<MigratorySpecies> flockBirds;
	
	public MigratoryFlock() {
		this.flockBirds = new ArrayList<>();
	}

	public void add(MigratorySpecies bird) {
		this.flockBirds.add(bird);
	}
	
	@Override
	public void migrate() {
		// TODO Auto-generated method stub
		for (MigratorySpecies b: this.flockBirds)
			b.migrate();
	}

}
