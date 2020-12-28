/** This program is designed to ask an employee at a company for their name and department code, and output a randomized password and generate the email.*/
package projectemailgenerator;
import java.util.Scanner;
public class Email {
	private String firstname;  
	private String lastname;
	private String password;
	private String department;
	private String companyemail = "company.com";
	private String email;
	private String MailboxCapacity;
	private int defaultpasswordlength = 10;
	
	/** Constructor to prompt user to enter the employee's first and last name */
	public Email() {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the employee's first name: ");
		this.firstname = in.nextLine();
		
		System.out.print("Enter the employee's last name: ");
		this.lastname = in.nextLine();
		
		/** Calls a method asking for the department and returns it */
		this.department = setDepartment();
		
		/** Calls a method asking for the mailbox capacity */
		this.MailboxCapacity = setMailboxCapacity();
		
		/** Calls a method that returns a random password */
		this.password = randompassword(defaultpasswordlength);
		System.out.println("Your password is: " + this.password);
		
		/** Generates email */
		email = firstname.toLowerCase() + "." + lastname.toLowerCase() + "@" + department + "." + companyemail;
	}
	/** Asks for department */
	public String setDepartment() {
		Scanner in = new Scanner(System.in);
		System.out.print("New employee:" + firstname + "\nDepartment Codes\n1 for Sales\n2 for IT\n3 for Human Resources\n4 for Accounting\nEnter your department code: ");
		int depchoice = in.nextInt();
		if (depchoice == 1) { return "sales"; }
		else if (depchoice == 2) { return "IT"; }
		else if (depchoice == 3) { return "HR"; }
		else if (depchoice == 4) { return "accounting"; }
		else { return "employee"; }
	}
	/** Generates random password */
	public String randompassword(int length) {
		String passwordset = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
		char[] password = new char[length];
		for (int i=0; i<length; i++) {
			int rand = (int) (Math.random() * passwordset.length());
			password[i] = passwordset.charAt(rand);
		}
		return new String(password);
	}
	/** Sets mailbox capacity based off of department choice */
	public String setMailboxCapacity () {
		if (department == "sales") {return "500mb";}
		else if (department == "IT") {return "2gb";}
		else if (department == "HR") {return "250mb";}
		else if (department == "accounting") {return "1gb";}
		else if (department == "employee"){return "300mb";}
		return getMailboxCapacity();
	}
	/** Get methods */
	public String getMailboxCapacity() {return MailboxCapacity;}
	public String getPassword() {return password;}
	
	public String showInfo() {
		return "Display Name: " + firstname + " " + lastname + 
				"\nCompany Email: " + email +
				"\nMailbox Capacity: " + MailboxCapacity + "\nYou have successfully created your email and password with the company.";
	}
}
