package oop;

// creating a blueprint
class Person {
	
	String name;
	String email;
	String phone;
	
	void walk() {
		System.out.println(name + " is walking");
	}
	void eat() {
		System.out.println(email);
	}
	void sleep() {
		System.out.println(name + " is sleeping");
	}
}

public class Demo {
	

	public static void main(String[] args) {
		// Instantiating an object
		// Create a variable and point it to a class
		// new is Java allocating space for the variable
		
		Person person1 = new Person(); 
		
			// define some properties
			person1.name = "Joe";
			person1.email = "Joe@testemail.com";
			person1.phone = "1234567890";
			
			// Abstraction
			//person1.walk();
			//person1.sleep();
			person1.eat();
			
			Person person2 = new Person(); 
			
			// define some properties
			person2.name = "Sarah";
			person2.email = "Sarah@testemail.com";
			person2.phone = "8234567890";
			
			// Abstraction
			person2.walk();
			//person2.sleep();
			//person2.eat();
		}
		
	}


			/*				
		}
	
		
		// TODO Auto-generated method stub
		String name = "Joe";
		String email = "joe@testemail.com";
		String phone = "7894561237";
		
		// Action, Activity, Behavior
		//System.out.println(name + " is walking");
		System.out.println(name + " is eating");
		
		walking(name);
		
		String name2 = "Sarah";
		String email2 = "Sarah@testemail.com";
		String phone2 = "8894561237";
		
		// Action, Activity, Behavior
		System.out.println(name2 + " is walking");
		System.out.println(name2 + " is eating");
	}
		// Enhance by adding functions to minimize code
		static void walking(String name) {
			System.out.println(name  + " is walking");
			*/

