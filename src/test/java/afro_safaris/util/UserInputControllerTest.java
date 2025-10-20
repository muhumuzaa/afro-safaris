package afro_safaris.util;

import org.junit.jupiter.api.Test;

import afro_safaris.exception.InvalidInputException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.*;


//tests for the userInput utility
public class UserInputControllerTest {

	//test 1. right int input
	@Test
	void testReadIntInputValidNumber() {
		Scanner scanner = new Scanner("5\n");
		int value = UserInputController.readIntInput(scanner, 1, 10, "Enter an number");
		assertEquals(5, value);
	}
	
	
	//test2 - user enters out f range number. eg 15
	@Test
	void testReadIntInputThrowsRangeError() {
		Scanner scanner = new Scanner("15\n");
		InvalidInputException ex = assertThrows(InvalidInputException.class, () -> UserInputController.readIntInput(scanner, 1, 10, "Enter a number"));
		assertEquals(InvalidInputException.ErrorType.RANGE_ERROR, ex.getErrorType());
	}
	
//test3 - user enters mismatch input. e.g "abc"
	@Test
	void testReadIntputThrowsFormatError() {
		Scanner scanner = new Scanner("abc\n");
		InvalidInputException ex = assertThrows(InvalidInputException.class, () -> UserInputController.readIntInput(scanner, 1, 10, "Enter a number:"));
		assertEquals(InvalidInputException.ErrorType.FORMART_ERROR, ex.getErrorType());
	}
}
