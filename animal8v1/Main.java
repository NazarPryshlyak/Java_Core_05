package animal8v1;

public class Main {

	public static void main(String[] args) {
		Cow cow = new Cow ( "Мілка" ) ;
		Cat cat = new Cat ( "Мурка" ) ;
		Dog dog = new Dog ( "Рекс" ) ;
		
		cow.voice();
		cat.voice();
		dog.voice();

	}

}
