package n1Exe2;

public class Car {
	
	private static final String brandCar = "Mazda";
	private static String modelCar = "M1";
	private final int pontencyCar;
	
	public Car () {
		this.pontencyCar= 200;
	}
	
	public Car (String modelCar) {
		this.pontencyCar= 200;
	}

	public static String getModelCar() {
		return modelCar;
	}

	public static String getBrandcar() {
		return brandCar;
	}

	public int getPontencyCar() {
		return pontencyCar;
	}
	
	//Mothod class
	
	public static String brakeCar () {
		return "The car model " + Car.modelCar + " is braking";
	}
	
	public String accelerateCar () {
		return "The car is accelerating";
	}

	@Override
	public String toString() {
		return "Car [pontencyCar=" + pontencyCar + "]";
	}
	
	

}
