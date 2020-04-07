/* 
Access Modifiers
	1. public
	2. private
	3. protected : to be studied later
	4. default : to be studied later

public: known to any code inside same file, same package or even outside the package
private: only known withing the same class block
default: known to any code inside same file and same package; but not outside package
protected: known to any class that inherits a given class

General practice is to make instance variables private and provide methods to manipulate them
in the way that programmer wants them to be manipulated


Homework: Implement below class and display use of various methods and cobstructor.
*/
class Student{
	private int id;
	private int age;
	public String review;
	
	Student(int id, int age, String review){
           	this.id = id;
		this.age = age;
		this.review = review;
	}

	public void changeId(int newID){
		id = newID;
	}

	public int retrieveId(){
		return id;
	}

	public void retrieveAge(){
		return age;
	}
	
	public void updateReview(String rev){
		review = rev;
	}

	public void viewReview(){
		System.out.println("Students review: " + review)
	}

	public void celebrateBirthday(){
		incrementAge();
	}

	private void incrementAge(){
		age = age + 1;
	}

}



