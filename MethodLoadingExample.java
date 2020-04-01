class Person{
	String name;
	int age;
	double height;
	int salary;

	Person(String name, int age, double height){
		this.name = name;
		this.age = age;
		this.height = height;
	}

	void printDetails(Person p){
		System.out.println("Name: " + p.name +"\nAge: " + p.age + "\nHeight: " + p.height);
	}

	float printDetails(Person p, boolean flag){
		float num = 5.00f;
		if(flag){
			System.out.println("Name: " + p.name +"\nAge: " + p.age + "\nHeight: " + p.height);
		}
		else{
			System.out.println("Don't have permission to print details");
		}

                return num;
	}

	// p1.printDetails(p2, 1000)
	boolean printDetails(Person p, int salary){
		p.salary = salary // this.salary
		System.out.println("Name: " + name + "\nAge: " + age + "\nHeight: " + height + "\nSalary :" + p.salary);
		if(p.age > 18){
			return true;
		}
		else return false;		
	}	

}

class MethodLoadingExample {
	public static void main (String args[]){
		Person p1, p2;
		p1 = new Person("Peter", 19, 5.6);
		p2 = new Person("Claire", 17, 5.4);

		p1.printDetails(p1); // Name: Peter Age: 19 Height: 5.60
		int num = p1.printDetails(p2, true); // Name: Claire Age: 17 Height: 5.40

		boolean val = p1.printDetails(p2, 5500); // Name: Claire Age: 17 Height: 5.40 Salary: 0

	}
}

/*
-----Output------
Name: Peter
Age: 19
Height: 5.6
Name: Claire
Age: 17
Height: 5.4
Name: Peter
Age: 19
Height: 5.6
Salary :20000 
--------------
*/

/*
Takeaway Points:- 
1. 'main' is declared static because it has to  be called at compile time before any object is created at run time.
2. declaring return type as int and returning a float or double will cause error due to lossy conversion
3. declaring return type as double and returning float or in will not cause any error
4. If instance variable and parameter have name name then using just the variable name will refer to the parameter.
   We need to use 'this' keywords when name hiding happens inside a method due to parameter name.
5. If we return a value but do not catch it inside a variables, we do NOT get an error. Value is simply lost
*/
