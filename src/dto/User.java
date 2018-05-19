package dto;

public class User {
	private int id;
	private String username;
	private String password;
	private String firstName;
	private String lastName;
	private int age;
	private String gender;
	

	public User(){
		
	}
	
	public User( String firstName, String lastName, String username, String password, int age, String gender) {
		super();
		this.username = username;
		this.password = password;
		this.firstName = firstName;
		this.lastName = lastName;
		this.age= age;
		this.gender = gender;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String newFirstName) {
		firstName = newFirstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String newLastName) {
		lastName = newLastName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String newPassword) {
		password = newPassword;
	}

	public String getUsername() {
		return username;
	}

	public void setUserName(String newUsername) {
		username = newUsername;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int newAge) {
		age = newAge;
	}
	
	public String getGender() {
		return gender;
	}

	public void setGender(String newGender) {
		username = newGender;
	}

	@Override
	public String toString() {
		return "User [first name=" + firstName + ", last name=" + lastName + ", username=" + username + ", password="
				+ password + ", age=" + age + ", gender=" + gender + "]"; 
	}
}
