package jd2Homework04;

public class Customer {
	private int id;
	private String userName;
	private String userEmail;	

	public String getUserName() {
		return userName;
	}

	public Customer(int id, String userName, String userEmail) {
		this.id = id;
		this.userName = userName;
		this.userEmail = userEmail;
	}

	public void printCustomerInfo() {
		System.out.println("userID: " + id);
    	System.out.println("userName: " + userName);
        System.out.println("userEmail: " + userEmail);
	}
}
