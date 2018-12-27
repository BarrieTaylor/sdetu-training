package Labs;

public class Lab2 {

	public static void main(String[] args) {
		// Create a Student
		Student stu1 = new Student("Janelle", "111223333");  // creates a new object
							// the above calls the constructor
		Student stu2 = new Student("Thomas", "121223333"); 
		Student stu3 = new Student("Elizabeth", "131223333"); 
		stu1.enroll("Math151");
		stu1.enroll("Eng255");
		stu1.enroll("His211");
		
		stu1.showCourses();
		stu1.checkBalance();
		stu1.payTuition(600);
		stu1.checkBalance();
		System.out.println(stu1.toString());


	}

}
class Student {
	// properties
	private static int iD=1;
	private String userId;
	private String name;  // private makes encapsulation 
	private String ssn;
	private String email;
	private String phone;
	private String city;
	private String state;
	

	private String courses = "";
	private static final int costOfCourse = 800;
	private int balance=0;
	
	
	// Constructor function
	public Student(String name, String ssn) {
		iD++;
		this.name = name;
		this.ssn = ssn; // pointing to the variables above in class Student - local
		setUserId();
		setEmail();
		
	}
	
	
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	
	private void setEmail() {

		email = name.toLowerCase() + "." + iD + "@sdetuniversity.com";
		System.out.println("Your email: " + email);
		
	}
	
	public String getEmail() {
		return email;
	}
	private void setUserId() {
		int max = 9000;
		int min = 1000;
		int randNum = (int) (Math.random() * (max - min));
		randNum = randNum + min;
		System.out.println(randNum);
		userId = iD + "" + randNum + ssn.substring(5);
		System.out.println("Your User ID: " + userId);
	}
	
	public void enroll(String course) {
		this.courses = this.courses + "\n" + course;
		System.out.println(courses);
		balance = balance + costOfCourse;
		
	}
	public void payTuition(int amount) {
		balance = balance - amount;
		System.out.println("Payment: $" + amount);
	}
	public void checkBalance() {
		System.out.println("Balance: $" + balance);
		
	}
	public void showCourses() {
		System.out.println(courses);
		
	}
	public String toString() {
		return "[NAME: " + name + " ]\n[Courses: " + courses + " ]\n Balance: " + balance + " ]";
		
	}
}