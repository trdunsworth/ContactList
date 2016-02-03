import java.util.*;

/**
 *
 * @author Tony Dunsworth
 * @date 2016-01-28
 * @email tdunswo@my.wgu.edu
 */

public class CL5 {
	public static void main(String[] args) {

		List<Contact> contacts = new ArrayList<>();
		//Contact contact;

		boolean runs = true;
		Scanner reader = new Scanner(System.in);
		String contactType = null;
		String firstName = null;
		String lastName = null;
		String address = null;
		String email = null;
		String phone = null;
		String birthDate = null;
		String position = null;
		String company = null;

		while (runs) {
			System.out.println("1. Add Personal Contact.");
			System.out.println("2. Add Business Contact.");
			System.out.println("3. View Contacts.");
			System.out.println("4. Quit Program.");

			int choice = reader.nextInt();

      switch (choice) {
	      case 1:
		      Scanner pReader = new Scanner(System.in);
		      PersonalContact pContact = new PersonalContact(contactType, firstName, lastName, address, phone, email, birthDate);
				  final String pType = pContact.getContactType();
				  contactType = pType;
				  System.out.println("\nEnter First Name: ");
		      firstName = pReader.next();
		      pContact.setFirstName(firstName);
			    System.out.println("Enter Last Name: ");
		      lastName = pReader.next();
		      pContact.setLastName(lastName);
		      System.out.println("Enter Address: ");
		      address = pReader.next();
		      pContact.setAddress(address);
		      System.out.println("Enter Phone Number: ");
		      phone = pReader.next();
		      pContact.setPhone(phone);
		      System.out.println("Enter Email Address: ");
		      email = pReader.next();
		      pContact.setEmail(email);
		      System.out.println("Enter Birthday: ");
		      birthDate = pReader.next();
		      pContact.setBirthDate(birthDate);

		      contacts.add(pContact);
		      runs = true;
		      break;

	      case 2:
		      Scanner bReader = new Scanner(System.in);
			    BusinessContact bContact = new BusinessContact(contactType,firstName, lastName, address, phone, email, position, company);
			    final String bType = bContact.getContactType();
			    contactType = bType;
		      System.out.println("\nEnter First Name: ");
		      firstName = bReader.next();
		      bContact.setFirstName(firstName);
		      System.out.println("Enter Last Name: ");
		      lastName = bReader.next();
		      bContact.setLastName(lastName);
		      System.out.println("Enter Address: ");
		      address = bReader.next();
		      bContact.setAddress(address);
		      System.out.println("Enter Phone Number: ");
		      phone = bReader.next();
		      bContact.setPhone(phone);
		      System.out.println("Enter Email Address: ");
		      email = bReader.next();
		      bContact.setEmail(email);
		      System.out.println("Enter Job Title: ");
		      position = bReader.next();
		      bContact.setPosition(position);
		      System.out.println("Enter Organization: ");
		      company = bReader.next();
		      bContact.setCompany(company);

		      contacts.add(bContact);
		      runs = true;
		      break;

	      case 3:
		      int index = 1;
					for (Contact contact : contacts) {
						System.out.println(index + ": " + contact.getFirstName() + " " + contact.getLastName());
						index++;
					}

		      Scanner vReader = new Scanner(System.in);

		      int selection = vReader.nextInt();
		      int viewIndex = selection - 1;

		      while (vReader.hasNextInt()) {
			      Contact selContact = contacts.get(viewIndex);
			      if (selContact.getContactType().equals("Personal")) {
					    selContact.viewContact();
					  } else {
						  selContact.viewContact();
					  }
		      }
		      runs = false;
		      break;

	      case 4:
		      System.exit(0);
		      break;

	      default:
		      System.out.println("Please enter a number from 1 to 4");
		      break;
      }
		}
	}
}
