package animal8v1;

public class Dog extends Pet {
	
	public Dog (String name) {
		super (name);
	}

	
	void voice () {
		System.out.println ( " � ����� " + super.getName() + ", ���-���...");
	}
	
}
