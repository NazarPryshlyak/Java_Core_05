//Створіть клас із двома перевантаженими конструкторами . 
//Використовуючи ключове слово this, викличте один конструктор в іншому.

public class Homework8v4 {
	
		  int a;
		  int b;
		  int c;

		public Homework8v4(int a, int b){
		   this.a = a;
		   this.b = b;
		  }

		public Homework8v4(int a, int b, int c){
		    // Виклик конструктора з двома параметрами
		    this(a, b);
		    this.c = c;
		  }

		public void show(){
		    System.out.println("a = " + a);
		    System.out.println("b = " + b);
		    System.out.println("c = " + c);
		  }
		}


