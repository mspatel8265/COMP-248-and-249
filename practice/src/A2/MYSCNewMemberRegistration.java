package A2;
import java.util.*;
//----------------------------------------------------------------------------------
// Assignment 2
// Written by: Margi Patel (40263423)
// For Comp 248 Section CC – Summer 2024
//---------------------------------------------------------------------------------

/**
 * This program facilitates the registration of a new member in the MYSC club.
 * The new member will be added either to the boys club or to the girls club. A 
 * family member must be part of the club for a child to be able to become a member. 
 */

public class MYSCNewMemberRegistration {
	public static boolean isInputStringValid(String inputValue) {
		return inputValue.length() >= 2;
	}
	
	public static boolean isPostalCodeValid(String postalCode) {
		return postalCode.length() == 6;
	}
	
	public static boolean isPhoneNumberValid(String phoneNum) {
		boolean isValid = false;
		
		isValid = true;
		// must be 10 digit of the format: xxx-xxx-xxxx
		return isValid;
	}
	
	public static boolean isAgeValid(int age) {
		return (age >= 2014 && age <= 2020);
	}
	
	public static void printMessage(String message, boolean printBottomLine, boolean printTopLine) {
		int messageLength = message.length();

		if (printTopLine) {
			System.out.printf("\t%s%n", "_".repeat(messageLength));			
		}
		
		System.out.printf("\t%s%n", message);
		
		if (printBottomLine) {
			System.out.printf("\t%s%n", "_".repeat(messageLength));			
		}
	}
	
	public static boolean isDateEnteredValid(int day, int month, int year) {
		// validate if it forms a correct date
		
		return !!(day > 0 && month > 0 && year > 0);
	}

	public static void main(String[] args) {
		// messages
		String welcomeMessage = "Welcome to Montreal Youth Soccer Club (MYSC) Registration System";
		String endingMessage = "Thank you for using our Registration System.";
		String newMemberRegsMessage = "New Club Member Registration Details.";
		
		// print welcome message
		printMessage(welcomeMessage, true, false);
		
		Scanner sc = new Scanner(System.in);
		String firstName, lastName;
		boolean isInputStringValid = false;

		// get valid firstName and lastName from the user
		do {
			System.out.print("Please Enter Your family Member's First Name and Last Name: ");
			firstName = sc.next();
			lastName = sc.next();
			
			// validate firstName and lastName
			isInputStringValid = isInputStringValid(firstName) && isInputStringValid(lastName);
			
			if (!isInputStringValid) {
				System.out.printf("%s : %s %s%n", "Invalid first name or last name", firstName, lastName);
				System.out.printf("%s%n%n","First Name and Last Name should have at least two characters.");
			}
			
		} while (!isInputStringValid);

		int relationshipIndex;
		boolean isRelationIndexValid = false;
		String[] relationships = {"Father", "Mother", "GrandFather", "GrandMother", "Tutor", "Partner", "Friend", "Other"};
		int relationshipsArrayLength = relationships.length;

		// get valid relationship from the user
		do {
			System.out.println("\nPlease Enter the Relationship between the family member and the new club member:");

			// loop to print possible relationships
			for (int i = 0; i < relationshipsArrayLength; i++) {
				System.out.printf("%s%d - %s%n", "\t".repeat(2), i + 1, relationships[i]);
			}
			
			System.out.printf("Please Enter your choice (1-%d): ", relationshipsArrayLength);
			relationshipIndex = (sc.nextInt() - 1);
			isRelationIndexValid = relationshipIndex >= 0 && relationshipIndex < relationshipsArrayLength;
			
			if (!isRelationIndexValid) {
				System.out.printf("Invalid Relationship: %d%n", relationshipIndex + 1);
				System.out.printf("Valid Relationship between 1 and %d%n", relationshipsArrayLength);
			}
		} while (!isRelationIndexValid);
		
		// get valid address from the user
		String addressLine, city, postalCode;
		boolean isValidAddressLine = false, isValidCity = false, isValidPostalCode = false;
		
		// valid addressLine
		sc.nextLine();

		do  {
			System.out.print("\nPlease Enter Your Address: ");
			addressLine = sc.nextLine();
			isValidAddressLine = isInputStringValid(addressLine);

			if (!isValidAddressLine) {
				System.out.printf("Invalid Address: %s%n", addressLine);
				System.out.printf("Address should have at least two characters.%n");
			}
		} while (!isValidAddressLine);
		
		// valid city
		do {
			System.out.print("\nPlease Enter Your City: ");
			city = sc.nextLine();
			isValidCity = isInputStringValid(city);
			
			if (!isValidCity) {
				System.out.printf("Invalid City: %s%n", city);
				System.out.printf("City should have at least two characters.%n");
			}
		} while (!isValidCity);
		
		// valid postalCode
		do {
			System.out.print("\nPlease Enter Your Postal Code: ");
			postalCode = sc.next();
			isValidPostalCode = isPostalCodeValid(postalCode);
			
			if (!isValidPostalCode) {
				System.out.printf("Invalid Postal Code: %s%n", postalCode);
				System.out.printf("Postal Code should have six characters.%n");
			}
		} while (!isValidPostalCode);
		
		// get valid phone number from the user
		String phoneNumber;
		boolean isValidPhoneNumber = false;

		do {
			// Please Enter Your Phone Number:
			System.out.print("\nPlease Enter Your Phone Number: ");
			phoneNumber = sc.next();
			isValidPhoneNumber = isPhoneNumberValid(phoneNumber);
			
			if (!isValidPhoneNumber) {
				System.out.printf("Invalid Phone Number: %s%n", phoneNumber);
				System.out.printf("Valid Phone Number contains at least 10 digits.%n");
			}
		} while (!isValidPhoneNumber);
		
		// get new club member's information
		String newMemFirstName, newMemLastName;
		
		do {
			System.out.print("\nPlease Enter the new club Member's First Name and Last Name: ");
			newMemFirstName = sc.next();
			newMemLastName = sc.next();
			isInputStringValid = isInputStringValid(newMemFirstName) && isInputStringValid(newMemLastName);
			
			if (!isInputStringValid) {
				System.out.printf("%s : %s %s%n", "Invalid first name or last name", newMemFirstName, newMemLastName);
				System.out.printf("%s%n%n","First Name and Last Name should have at least two characters.");
			}
		} while (!isInputStringValid);

		// get new club member's birth year:
		int newMemBirthYear;
		boolean shouldContinue = true, isValidAge = false;
		String userWishToContinue;

		do {
			System.out.print("\nPlease Enter the Year Of Birth (2014 and 2020): ");
			newMemBirthYear = sc.nextInt();
			isValidAge = isAgeValid(newMemBirthYear);
			
			if (!isValidAge) {
				System.out.printf("Invalid Year Of Birth: %d%n", newMemBirthYear);
				System.out.printf("Valid Year Of Birth between 2014 and 2020%n");
				System.out.print("Do you wish to continue (yes/no) ? ");
				
				userWishToContinue = sc.next();
				shouldContinue = !(userWishToContinue.equalsIgnoreCase("no"));
			}			
		} while (shouldContinue && !isValidAge);
		
		// if user do not wish to continue, return
		if (!shouldContinue) {
			System.out.println("\nSorry, There is no membership for your child's age.");
			
			printMessage(endingMessage, true, true);
			return;
		}

		// get new club member's birth month:
		int newMemBirthMonth, newMemBirthDay;
		char newMemGender = 'M';
		String newMemAddressLine, newMemCity, newMemPostalCode, newMemPhoneNumber;
		boolean isEnteredValueValid = false;
	
		do {
			System.out.print("\nPlease Enter the Month Of Birth (1 - 12): ");
			newMemBirthMonth = sc.nextInt();
			isEnteredValueValid = (newMemBirthMonth > 0 && newMemBirthMonth < 13);
			
			if (!isEnteredValueValid) {
				System.out.printf("Invalid Month Of Birth: %d%n", newMemBirthMonth);
				System.out.printf("Valid Month Of Birth between 1 and 12%n");
			}
		} while (!isEnteredValueValid);
		
		// get new club member's birth day:
		do {
			System.out.print("\nPlease Enter the Day Of Birth (1 - 31): ");
			newMemBirthDay = sc.nextInt();
			// add a function that validates this information by month and year as well
			isEnteredValueValid = isDateEnteredValid(newMemBirthDay, newMemBirthMonth, newMemBirthYear);
			
			if (!isEnteredValueValid) {
				System.out.printf("Invalid Day Of Birth: %d%n", newMemBirthDay);
				System.out.printf("Valid Day Of Birth between 1 and 12%n");
			}
		} while (!isEnteredValueValid);

		
		// get new club member's gender:
		do {
			System.out.print("\nPlease Enter the Gender Of the new club member (M/F): ");
			
			String genderInput = sc.next();
			
			isEnteredValueValid = (genderInput.equalsIgnoreCase("M") || genderInput.equalsIgnoreCase("F"));
			
			if (!isEnteredValueValid) {
				System.out.printf("Invalid Gender: %s%n", genderInput);
				System.out.printf("Valid Gender 'M' or 'F'%n");
			} else {
				newMemGender = genderInput.toUpperCase().charAt(0);
			}
		} while (!isEnteredValueValid);
		
		sc.nextLine();
		// get new club member's address:
		do {
			System.out.print("\nPlease Enter new club member's Address: ");
			newMemAddressLine = sc.nextLine();
			isEnteredValueValid = isInputStringValid(newMemAddressLine);
			
			if (!isEnteredValueValid) {
				System.out.printf("Invalid Address: %s%n", newMemAddressLine);
				System.out.printf("Address should have at least two characters.%n");
			}
		} while (!isEnteredValueValid);
		
		// get new club member's city:
		do {
			System.out.print("\nPlease Enter new club member's City: ");
			newMemCity = sc.nextLine();
			isEnteredValueValid = isInputStringValid(newMemCity);
			
			if (!isEnteredValueValid) {
				System.out.printf("Invalid City: %s%n", newMemCity);
				System.out.printf("City should have at least two characters.%n");
			}
		} while (!isEnteredValueValid);
		
		// get new club member's postal code:
		do {
			System.out.print("\nPlease Enter new club member's Postal Code: ");
			newMemPostalCode = sc.next();
			isEnteredValueValid = isPostalCodeValid(newMemPostalCode);
			
			if (!isEnteredValueValid) {
				System.out.printf("Invalid Postal Code: %s%n", newMemCity);
				System.out.printf("Postal Code should have six characters.%n");		
			}
		} while (!isEnteredValueValid);
		
		// get new club member's phone number:
		do {
			System.out.print("\nPlease Enter new club member's Phone Number: ");
			newMemPhoneNumber = sc.next();
			isEnteredValueValid = isPhoneNumberValid(newMemPhoneNumber);
			
			if (!isEnteredValueValid) {
				System.out.printf("Invalid Phone Number: %s%n", newMemPhoneNumber);
				System.out.printf("Valid Phone Number contains at least 10 digits.%n");
			}
		} while (!isEnteredValueValid);
		
		// closing scanner instance
		sc.close();

		// print the new club member's registration information
		printMessage(newMemberRegsMessage, true, true);
		
		final int newMemberID = 10;
		
		
		System.out.printf("%s %s %s of the new MYSC club member%n", firstName, lastName, relationships[relationshipIndex]);
		System.out.printf("%s %s with the new MYSC club membership # %d%n", newMemFirstName, newMemLastName, newMemberID);
		System.out.printf("Lives at: %s in the city of %s with postal code %s%n", addressLine, city, postalCode);
		System.out.printf("Has the following Telephone Number: %s%n%n", phoneNumber);
		
		System.out.printf("The new club member %s %s who lives at: %s in the city of %s with the postal code %s%n", newMemFirstName, newMemLastName, newMemAddressLine, newMemCity, newMemPostalCode);
		System.out.printf("Has the following Telephone Number: %s is successfully added to the MYSC %s teams.%n", newMemPhoneNumber, (newMemGender == 'M' ? "Boys" : "Girls"));
		
		// print ending message
		printMessage(endingMessage, true, true);
	} // end main()
} // end class MYSCNewMemberRegistration
