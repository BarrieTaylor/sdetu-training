package basics;

public class Strings {
	
	public static void main(String[] args ) {
		String bookTitle;
		String wordChoice = "Ring";
		bookTitle = "The Lord of the Rings";
		
		if (bookTitle.contains(wordChoice)) {
			System.out.println("The book contains the word  "  + wordChoice +  "." + " Book Title is: " + bookTitle);
		}	
		String browser = "Chrome";
		if (browser.equalsIgnoreCase("chrome")) {
			System.out.println("The browser is chrome");
		}
		
		String firstName = "Barrie";
		String lastName = "Taylor";
		String SSN = "123456789";
		
		System.out.println("There are " + SSN.length() + " digits in your SSN.");
		
		// print initials and last four of ssn
		System.out.print(firstName.substring(0, 1));
		System.out.print(lastName.substring(0, 3));
		System.out.print(SSN.substring(5));
	}
}
