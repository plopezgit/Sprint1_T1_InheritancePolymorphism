package N3Exe1;

public class ExecuteAdminSportRadaction {

	public static void main(String[] args) {

		SportRedaction redaction = new SportRedaction ();

		String mainMenu = "Sport News redaction. What do you want to do?\n"
				+ "(1)Create a News.\n"
				+ "(2)Get News.\n"
				+ "(3)Delete a News.\n"
				+ "(4)Create a Redactor.\n"
				+ "(5)Delete a Redactor.\n"
				+ "(6)Assign news to Redactor.\n"
				+ "(7)Unassign news to Redactor.\n"
				+ "(8)Check news list by redactor.\n"
				+ "(9)Exit.\n";
		
		String submenu = "What type of news do you ant to create?\n"
				+ "(1)Football news.\n"
				+ "(2)Basketball news.\n"
				+ "(3)Tennis news.\n"
				+ "(3)F1 news.\n"
				+ "(3)MotorCycle news.\n"
				+ "(4)Volver.\n";
		
		int opcionMain = 0;
		
		do {
			switch (opcionMain = Tool.inputInt("\n" + mainMenu)) {
			case 1:
				System.out.println("News created: " + createNewsOnRedaction(redaction ,submenu));
				break;
			case 2:
				System.out.println("News: \n" + getNewsListofRedaction(redaction));
				break;
			case 3:
				System.out.println(deleteNewsOfRedaction(redaction, redaction.existNews(Tool.inputInt ("News ID: "))));
				break;
			case 4:
				System.out.println("Redactor created: " + createRedactorOfRedaction(redaction, Tool.inputString ("Name: "), Tool.inputString ("Redactor DNI: ")));
				break;
			case 5:
				System.out.println("Redactor deleted: " + deleteRedactorOfRedaction(redaction, redaction.existRedactor(Tool.inputString ("Redactor DNI: "))));
				break;
			case 6:
				System.out.println(assignNewsToRedactorofRedaction(redaction, redaction.existNews(Tool.inputInt ("News ID: ")), redaction.existRedactor(Tool.inputString ("Redator DNI: ")) ));
				break;
			case 7:
				System.out.println(unassignNewsToRedactorofRedaction(redaction, redaction.existNews(Tool.inputInt ("News ID: ")), redaction.existRedactor(Tool.inputString ("Redactor DNI: ")) ));
				break;
			case 8:
				System.out.println(getNewsListofRedactionByRedactor(redaction, redaction.existRedactor(Tool.inputString ("Redactor DNI: "))));
				break;
			case 9:
				System.out.println("Adios, vuelve pronto");
				break;
			default:
				System.out.println("Opcion no disponible.\n");
				
			}
		} while (opcionMain !=9);

	}
		
	public static SportRedaction createNewsOnRedaction (SportRedaction redaction, String submenu) {
		
		switch (Tool.inputInt("\n" + submenu)) {
		
		case 1:
			redaction.createNewsFootball(Tool.inputInt ("Id News: "), Tool.inputString ("Title news: "), Tool.inputString ("Football Competition: "), Tool.inputString ("Football Club: "), Tool.inputString ("Football Player: "));  
			break;
		case 2:
			redaction.createNewsBasketball(Tool.inputInt ("Id News: "), Tool.inputString ("Title news: "), Tool.inputString ("Football Competition: "), Tool.inputString ("Football Club: "));  
			break;
		case 3:
			redaction.createNewsTennis(Tool.inputInt ("Id News: "), Tool.inputString ("Title news: "), Tool.inputString ("Football Competition: "), Tool.inputString ("Football Player: "));  
			break;
		case 4:
			redaction.createNewsF1(Tool.inputInt ("Id News: "), Tool.inputString ("Title news: "), Tool.inputString ("Football Team: "));  
			break;
		case 5:
			redaction.createNewsMotorcycle(Tool.inputInt ("Id News: "), Tool.inputString ("Title news: "), Tool.inputString ("Football Team: "));  
			break;
		default:
			System.out.println("Opcion no disponible.\n");
		}
		
		return redaction;
	}
	
	public static String assignNewsToRedactorofRedaction (SportRedaction redaction, int redactorIndex, int newsIndex) {
		String result;
		if (redactorIndex != -1 && newsIndex != -1 ) {
			redaction.redactorList.get(redactorIndex).assignNewsToRedactor(redaction, newsIndex);
			result = "News assigned";
		} else {
			result = "It si not posssible to assign the news";
		}
		return result;
	}
	
	public static String unassignNewsToRedactorofRedaction (SportRedaction redaction, int redactorIndex, int newsIndex) {
		String result;
		if (redactorIndex != -1 && newsIndex != -1 ) {
			redaction.redactorList.get(redactorIndex).unassignNewsToRedactor(redaction, newsIndex);
			result = "News unassigned";
		} else {
			result = "It si not posssible to unassign the news";
		}
		return result;
	}
	
	public static SportRedaction createRedactorOfRedaction (SportRedaction redaction, String redactorName, String redactorDNI) {
		redaction.createRedactor(redactorName, redactorDNI);
		return redaction;
	}
	
	public static String deleteRedactorOfRedaction (SportRedaction redaction, int redactorIndex) {
		String result;
		if (redactorIndex >-1) {
			redaction.deleteRedactor(redactorIndex);
			result = "El producto ha sido eliminado.";
		} else {
		result = "El producto no existe en la lista .";
		}
		
		return result;
	}
	
	public static String getNewsListofRedaction (SportRedaction redaction) {
		return redaction.parseNewsList();
	}

	public static String getNewsListofRedactionByRedactor (SportRedaction redaction, int redactorIndex) {	
		return redaction.redactorList.get(redactorIndex).parseRedactorNewsListAssigned();
	}
	
	public static String deleteNewsOfRedaction (SportRedaction redaction, int newsIndex) {
		String result;
		if (newsIndex >-1) {
			redaction.deleteNews(newsIndex);
			result = "El producto ha sido eliminado.";
		} else {
		result = "El producto no existe en la lista .";
		}
		
		return result;
	}

}


/*
 * En una redacción de noticias deportivas tienen las noticias clasificadas por deportes: OK
 * fútbol, baloncesto, tenis, F1 y motociclismo. OK
 * 
 * La redacción puede tener más de un redactor, y de cada uno de ellos queremos saber su nombre, su DNI y su sueldo. OK
 * Una vez asignado un DNI, éste no podrá cambiar nunca. Todos los redactores tienen el mismo sueldo, OK
 * y si en un futuro la empresa puede incrementarlo, lo hará a todos por igual. Por el momento el sueldo actual es de 1500€. OK
 * 
 * Cada redactor puede trabajar en más de una noticia. Las noticias deben tener un titular, un texto, una puntuación y un precio. OK
 * En el momento de crearse, el texto debe estar vacío. OK
 * 		Además, de las noticias de fútbol debe saberse a qué competición hace referencia(String), a qué club(String) ya qué jugador(String). OK
 * 		De las noticias de baloncesto debe indicarse a qué competición hace referencia (String) ya qué club (String). OK
 * 		De las noticias de tenis hay que saber de qué competición(String) hablan y qué tenistas(String). OK
 * 		De las noticias de F1 debemos saber a qué escudería(String) hacen referencia. OK
 * 		De las noticias de motociclismo debe indicarse de qué equipo(String) son. OK

Las noticias se venden en distintos medios. Para saber el precio de cada noticia debemos implementar un método llamado calcularPreuNoticia().
A continuación se explica cómo calcular el precio de cada noticia:

Noticias de fútbol:
Precio inicial: 300€ OK
Liga de Campeones: 100€
Barça o Madrid: 100€
Ferran Torres o Benzema: 50€

Ejemplo: Una noticia que habla de un gol de Ferran Torres del Barça en la Liga de Campeones, tiene un precio de 550€.

Noticias de baloncesto:
Precio inicial: 250€
Euroliga: 75€
Barça o Madrid: 75€

Noticias de tenis:
Precio inicial: 150€
Federer, Navidad o Djokovic: 100€

Noticias de F1:
Precio inicial: 100€
Ferrari o Mercedes: 50€

Noticias de motociclismo:
Precio inicial: 100€
Honda o Yamaha: 50€


Para calcular las puntuaciones de las noticias se siguen los siguientes criterios:

Noticias de fútbol:

5 Puntos.

Liga de Campeones: 3 puntos

Liga: 2 puntos

Barça o Madrid: 1 punto

Ferran Torres o Benzema: 1 punto

Ejemplo: Una noticia que habla de un gol de Ferran Torres del Barça en la Liga de Campeones, tiene una puntuación de 10 puntos.


Noticias de baloncesto:

4 puntos

Euroliga: 3 puntos

ACB: 2 puntos

Barça o Madrid: 1 punto


Noticias de Tenis:

4 puntos

Federer, Navidad o Djokovic: 3 puntos


Noticias F1:

4 puntos

Ferrari o Mercedes: 2 puntos


Noticias de Motociclismo:

3 puntos

Honda o Yamaha: 3 puntos


En la clase principal se debe hacer un menú con las siguientes opciones:

1.- Introducir redactor.

2.- Eliminar redactor.

3.- Introducir noticia a un redactor.

4.- Eliminar noticia (debe pedir redactor y titular de la noticia).

5.- Mostrar todas las noticias por redactor.

6.- Calcular puntuación de la noticia.

7.- Calcular precio-noticia.
 */
