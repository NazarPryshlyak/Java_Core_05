package animal8v1;

public class Cow extends Pet {

	public Cow (String name) {
		super (name);
	}

void voice() {
	System.out.println ( " Я корова " + super.getName() + ", муу...");
}


}
