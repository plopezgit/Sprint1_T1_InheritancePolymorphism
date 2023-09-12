package N1Exe2;

public class Car {
	
	private static final String brandCar = "Mazda";
	private static String modelCar;
	private final int pontencyCar;
	
	public Car () {
		this.pontencyCar= 200;
	}
	
	public Car (String modelCar) {
		Car.modelCar = modelCar;
		this.pontencyCar= 200;
	}

	public static String getModelCar() {
		return modelCar;
	}

	public static void setModelCar(String modelCar) {
		Car.modelCar = modelCar;
	}

	public static String getBrandcar() {
		return brandCar;
	}

	public int getPontencyCar() {
		return pontencyCar;
	}
	
	//Mothod class
	
	public static String brakeCar () {
		return "The car model " + Car.modelCar + "is braking";
	}
	
	public String accelerateCar () {
		return "The car is accelerating";
	}

	@Override
	public String toString() {
		return "Car [pontencyCar=" + pontencyCar + "]";
	}
	
	

}
