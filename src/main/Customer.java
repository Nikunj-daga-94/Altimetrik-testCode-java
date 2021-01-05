package main;

public class Customer {
	private String name;
	private String Email;
	private int age;
	private String gender;
	private String address;
	public Customer() {
		// TODO Auto-generated constructor stub
	}
	Customer(String name,
	 String email,
	 int age,
	 String gender,
	 String address){
		super();
		this.name=name;
		Email=email;
		this.age=age;
		this.address=address;
		this.gender=gender;
	}
//	public Customer(String name, String email, int age, String gender, String address) {
//		super();
//		this.name = name;
//		Email = email;
//		this.age = age;
//		this.gender = gender;
//		this.address = address;
//	}
	/**
	 * @return the gender
	 */
	public String getGender() {
		return gender;
	}
	/**
	 * @param gender the gender to set
	 */
	public void setGender(String gender) {
		this.gender = gender;
	}
	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}
	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}
	
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the email
	 */
	public String getEmail() {
		return Email;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		Email = email;
	}
	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}
	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}

}
