/**
 * Created by tony.dunsworth on 1/28/2016.
 */
public abstract class Contact {
	private String contactType;
	private String firstName;
	private String lastName;
	private String address;
	private String phone;
	private String email;

	public Contact(String contactType, String firstName, String lastName, String address, String phone, String email) {
		this.contactType = contactType;
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.phone = phone;
		this.email = email;
	}

	public abstract String getContactType();

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void viewContact() {
		System.out.println("Name: " + getFirstName() + " " + getFirstName());
		System.out.println("Address: " + getAddress());
		System.out.println("Phone: " + getPhone());
		System.out.println("Email: " + getEmail());
	}

}
