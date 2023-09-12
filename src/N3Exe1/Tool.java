package N3Exe1;

import java.util.Scanner;
import java.util.InputMismatchException;


public class Tool {

//Attributes
	
	private static final Scanner input = new Scanner(System.in);

//Methods
	
	public static int inputInt (String pregunta) {
		int response = 0;
		boolean okey = false;
		do {
			System.out.println(pregunta);
			try {
				response = input.nextInt();
				okey = true;
			} catch (InputMismatchException ex) {
				System.out.println("There is a format error on your response.");
			}
			input.nextLine();
		} while (!okey);
		return response;
	}
	
	public static String inputStringLow (String pregunta) {
		String response = "";
		boolean okey = false;
		do {
			System.out.println(pregunta);
			try {
				response = input.nextLine().toLowerCase();	
				okey = true;
			} catch (Exception ex) {
				System.out.println("There is an error on your response.");
			}
		} while (!okey);
		return response;	
	}
	
	public static String inputStringUp (String pregunta) {
		String response = "";
		boolean okey = false;
		do {
			System.out.println(pregunta);
			try {
				response = input.nextLine().toUpperCase();	
				okey = true;
			} catch (Exception ex) {
				System.out.println("There is an error on your response.");
			}
		} while (!okey);
		return response;	
	}
	
	public static String inputString (String pregunta) {
		String response = "";
		boolean okey = false;
		do {
			System.out.println(pregunta);
			try {
				response = input.nextLine();	
				okey = true;
			} catch (Exception ex) {
				System.out.println("There is an error on your response.");
			}
		} while (!okey);
		return response;	
	}
	
	public static double inputDouble (String pregunta) {
		double response = 0.0;
		boolean okey = false;
		do {
			System.out.println(pregunta);
			try {
				response = input.nextDouble();
				okey = true;
			} catch (InputMismatchException ex) {
				System.out.println("There is a format error on your response.");
			}
			input.nextLine();
		} while (!okey);		
		return response;	
	}
	
	public static boolean inputYesNo (String pregunta) {
        boolean booleanResponse = false;
        boolean okey = false;
        String userResponse = "";

        do {
            System.out.print(pregunta);
            try {
                userResponse = input.nextLine().toUpperCase();
                okey = true;
                if (userResponse.charAt(0) == 'S') {
                    booleanResponse = true;
                } else if (userResponse.charAt(0) == 'N') {
                    booleanResponse = false;
                } else {
                    System.out.println("Your response is not valid.");
                    okey = false;
                }
            } catch (Exception ex) {
                System.out.println("There is an error on your response.");
            }
        } while (!okey);
        return booleanResponse;
	 }
	
    public static char inputChar(String mensaje) {
        char response = 0;
        boolean okey = false;

        do {
            System.out.print(mensaje);
            try {
                response = input.next().charAt(0);
                okey = true;
            } catch (InputMismatchException ex) {
                System.out.println("There is a format error on your response.");
            } catch (Exception ex) {
                System.out.println(ex.toString());
            }
            input.nextLine();
        } while (!okey);
        return response;
    }
	
}