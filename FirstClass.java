/*
	Below class cannot be declared as
		public class Person
	Error watch:  class Person is public, should be declared in a file named Person.java
	why-->>> Thre can be only one public class inside of a java file
	    	 and Name of public class must match the name of .java file in which it is placed
		 and that public class should have the PSVM method
	There can be as many classes as desired with default access modifier as if the case below
*/
class Person{
	// This is our first class
	// Class names should be nouns, in mixed case with the 
	// first letter of each internal word capitalized
	
	// defining instance variables
	int age;
	String name;

	
	// cannot use p2.name or p2.age in here since this method does not know p2
	// Error watch:  cannot find symbol 'p2' in
        //      	 System.out.println(p2.name + " is " + p2.age + " years old.\n");
	// using this keyword to point to current object removes above error
	// but this line does not get printed. Why???
	void printData(){
		System.out.print("Inside printData\n");
		System.out.println(this.name + " is " + this.age + " years old.\n");
	}

	// attempt to create class object inside of class
	// we can do this
	void myownObject(){
		Person p2 = new Person();
		p2.name = "Brad";
		p2.age = 15;

		// calling an instance method from inside same class
		p2.printData();
	}
}


// declaring a second class
class Box {
	int height, legth, weight;
}

// below class can be declared as public
// since this is the class with PSVM method
// other classes in this file cannot be declared public
public class FirstClass {
	public static void main(String args[]){
		Person p1 = new Person();
		p1.name = "Chad";
		// Error watch: p1.age = "25" Error: String type cannot be converted to int
		p1.age = 25;
		System.out.println(p1.name + " is " + p1.age + " years old\n");

		// this will print the same line again 
		p1.printData();
	}
}

/* 	
	Three class files will be generated for above program.
	There can only be one public class per .java file 
	If program has a public class, this should be the class to contain main method
	If program has a public class, .java file should have the same name as this public class
	There can be as many classes with default access specifier as we desire
	If all classes have the default access modifier, name of .java file should be same as the class containing PSVM method
*/
	  