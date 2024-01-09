package n1Exe2;

public class App {

	public static void main(String[] args) {
		
		// cómo invocar el método estático
		System.out.println(Car.brakeCar());
		Car instanceOfCar = new Car();
		// cómo invocar el método No estático
		System.out.println(instanceOfCar.accelerateCar());
		
	}
	
	/*
	 * Crea una clase "Coche" con los atributos: marca, modelo y potencia.
	 * La marca debe ser estático final, 
	 * el modelo estático 
	 * y la potencia final. 
	 * 
	 * Demuestra la diferencia entre los tres. 
	 * ¿Hay alguno que pueda inicializarse al constructor de la clase?
	 * 
	 * Añade dos métodos a la clase "Coche". 
	 * Un método estático llamado frenar() y otro no estático llamado acelerar(). 
	 * El método acelerar debe mostrar por consola: "El vehículo está acelerando" 
	 * y el método frenar() debe mostrar: "El vehículo está frenando".
	 * Demuestra cómo invocar el método estático y el no estático desde el main() de la clase principal.
	 */

}
