package animal8v1;

public class Cat extends Pet  {
	
	public Cat (String name) {
		super (name);
	}

	void voice () {
		System.out.println ( " я котик " + super.getName() + ", м€ууу...");
	}
	
}
