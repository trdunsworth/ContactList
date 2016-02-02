/**
 * Created by tony.dunsworth on 1/28/2016.
 */
public class PersonalContact extends Contact {
	String birthDate;

	public PersonalContact(String contactType, String firstName, String lastName, String address, String phone, String email, String birthDate) {
		super(contactType,firstName, lastName, address, phone, email);
		this.birthDate = birthDate;
	}

	@Override
	public String getContactType() {
		return "Personal";
	}

	public String getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}

	public void viewContact() {
		System.out.println("Type: " + getContactType());
		System.out.println("Name: " + getFirstName() + " " + getFirstName());
		System.out.println("Address: " + getAddress());
		System.out.println("Phone: " + getPhone());
		System.out.println("Email: " + getEmail());
		System.out.println("Birth Date: " + getBirthDate());
	}
}
