package afro_safaris.util;

import java.util.Scanner;

import afro_safaris.exception.InvalidInputException;

public class UserInputController {

	/*This function prevents app from crushing due to exceptions like IndexOutOfBoundsException(user putting 10 yet the list has only 6 destinations) or 
	 * InputMismatchException (string instead of int). 
	 */
	public static int readIntInput(Scanner scanner, int min, int max, String prompt) {
		
		int value;
		while(true) {
			System.out.println(prompt); //show user a prompt
			
			if(scanner.hasNextInt()) {
				value = scanner.nextInt(); //check if user input in int. prevents app crash if user enters string or other data types; 
				scanner.nextLine();
				if(value >=min && value <=max) { //check user input is between the limits required. e.g 
					return value;
				}else {
					throw new InvalidInputException("Please enter a number between "+min +" and "+max+".", InvalidInputException.ErrorType.RANGE_ERROR); //throws Range Error
				}
			}else {
				scanner.nextLine();// consumes the invalid input and throws Format error
				throw new InvalidInputException("Invalid input! Please enter a number", InvalidInputException.ErrorType.FORMART_ERROR);
				
			}
		}
	}
}
