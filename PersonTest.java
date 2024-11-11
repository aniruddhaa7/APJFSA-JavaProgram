package APJSC9550;

//Define the Person interface
interface Person {
	void speak();
}

//Student class implementing the Person interface
class Student implements Person {
	@Override
	public void speak() {
		System.out.println("Student says: I am here to learn!");
	}
}

//Teacher class implementing the Person interface
class Teacher implements Person {
	@Override
	public void speak() {
		System.out.println("Teacher says: I am here to teach!");
	}
}

public class PersonTest {
	public static void main(String[] args) {
		// Creating instances of Student and Teacher
		Person student = new Student();
		Person teacher = new Teacher();

		// Calling the speak method for each object
		student.speak();
		teacher.speak();
	}
}

/*
 * OUTPUT: Student says: I am here to learn! 
 * Teacher says: I am here to teach!
 */
