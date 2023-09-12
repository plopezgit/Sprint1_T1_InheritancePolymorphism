package N2Exe1;

public class ExecuteTelephone {

	public static void main(String[] args) {
		
		Smartphone instanceOfSmartphone = new Smartphone("Samsung", "A234");
		
		System.out.println(instanceOfSmartphone.call("657474632"));
		
		System.out.println(instanceOfSmartphone.takeAPhoto());
		
		System.out.println(instanceOfSmartphone.alarm());
		
	}

}

/*
 * Crea una clase llamada "Teléfono" con los atributos marca y modelo, y el método llamar(). OK
 * Este método debe recibir un String con un número de teléfono. OK
 * El método debe mostrar por consola un mensaje diciendo que se está llamando al número recibido por parámetro. OK
 * Crea una interfaz llamada "Cámara" con el método fotografiar(), y otra interfaz llamada Reloj con el método alarma(). OK
 * Crea una clase llamada "Smartphone" que sea subclase de "Teléfono" y que a su vez implemente las interfaces "Camera" y "Reloj". OK
 * El método fotografiar() debe mostrar por consola: "Se está haciendo una foto" y el método alarma() debe mostrar: "Está sonando la alarma". OK

	Desde el main() de la aplicación, crea un objeto Smartphone y llama a los métodos anteriores.
 */
