package animal8v1;

public abstract class Pet {
	
	/*Написати клас абстрактний Pet , в якому описати абстрактний метод voice(). 
	Створити класи Cow, Cat, Dog , які наслідуються від Pet. Перевизначити в них метод voice(),
	так, щоб викликаючи його в методі main, на консоль виводилось : “Я кіт- Мяууу-Мяууу”, 
	“Я пес-Гаууу-Гаууу”, “Я корова- Мууу-Мууу”.
    */


    private String name;
	
	public Pet(String name) {
		this.name = name;
	}

	abstract void voice();

	public String getName() {
		return name;
	}
}
