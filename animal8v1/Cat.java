package animal8v1;

public class Cat extends Pet  {
	
	public Cat (String name) {
		super (name);
	}

	void voice () {
		System.out.println ( " � ����� " + super.getName() + ", �����...");
	}
	
}
