package n1Exe1;

public class App {

	public static void main(String[] args) {
		
		
		// la carga puede ser provocada por la creación de la primera instancia de la clase (descomentar y executar):
		/*Instrument trumpet = new Wind_Instrument("Trumpet", 500);
		Instrument guitar = new String_Instrument("Guitar", 700);
		Instrument drum = new Percussion_Instrument("Drum", 600);
		System.out.println(trumpet.play() + ", " + guitar.play() + ", " + drum.play());*/
		
		// o por el acceso a un miembro estático de ésta:
		Instrument.instrumentLuthier = "Itinerary";
	}

}

/*
 * En un grupo de música existen diferentes tipos de instrumentos musicales. OK
 *  Hay instrumentos de viento, cuerda y percusión. OK
 *  Todos los instrumentos tienen como atributos su nombre y precio. OK
 *  Además, tienen un método llamado tocar(). Éste es abstracto en la clase instrumento y, 
 *  por tanto, debe implementarse en las clases hijas. Si se está tocando un instrumento de viento, 
 *  el método debe mostrar por consola: "Está sonando un instrumento de viento", 
 *  si se está tocando un instrumento de cuerda: "Está sonando un instrumento de cuerda" 
 *  y si se está tocando un instrumento de percusión: "Está sonando un instrumento de percusión".OK
 *  El proceso de carga de una clase sólo tiene lugar una vez. Demuestra que la carga puede ser 
 *  provocada por la creación de la primera instancia de esta clase o por el acceso a un miembro estático de ésta.

		Buscar información sobre los blogs de inicialización y blogs estáticos en Java.
 */

