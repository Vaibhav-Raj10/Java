/* 
following class elaborates upon the nature of comparison between objects
using == operator
*/

class Car{
	String model;
	int price;


	Car(String mod, int pri){	
		model = mod;
		price = pri;
	}

	void compObj(Car o1, Car o2){
		if(o1 == o2)
			System.out.println("Objects are equal");
		else
			System.out.println("Objects are not equal");
	}
}

class ObjectComparison{
	public static void main(String args[]){
		Car c1 = new Car ("Audi", 20000);
		Car c2 = new Car ("Jaguar", 10000);
		Car c3 = new Car("Audi", 20000);

		c3.compObj(c1,c2);  // Not equal
		c1.compObj(c2, c3);  // Not equal
		c2.compObj(c1, c3); // Not Equal
		Car c4;
		c4 = c1;
		c1.model = "BMW";
		c3.compObj(c1,c4);
		System.out.println(c4.model);
	}
}