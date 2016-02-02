/**
 * Created by Tony Dunsworth on 1/28/2016.
 */
public class BusinessContact extends Contact {
	String position;
	String company;

	public BusinessContact(String contactType, String firstName, String lastName, String address, String phone, String email, String position, String company) {
		super(contactType, firstName, lastName, address, phone, email);

		this.position = position;
		this.company = company;
	}

	@Override
	public String getContactType() {
		return "Business";
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public void ViewContact() {
		System.out.println("Type: " + getContactType());
		System.out.println("Name: " + getFirstName() + " " + getFirstName());
		System.out.println("Address: " + getAddress());
		System.out.println("Phone: " + getPhone());
		System.out.println("Email: " + getEmail());
		System.out.println("Professional: " + getPosition() + " at " + getCompany());
	}
}
