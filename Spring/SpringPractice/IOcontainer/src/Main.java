
public class Main {
	public static void main(String[] args) {
		Engine engine = new Bike();
		engine.engineName();
		engine.print();
		
		Engine engineTow = new Car();
		engineTow.engineName();
		engineTow.print();
	}
}
