class Love  {
	String name;
	static int amount;
	String lover;
	static int i = 10;

	void printLover(Love obj) {
		System.out.println(obj.name + " lover is " + obj.lover);
	}
        
	static void printLover(Love ob){
		i++;
		System.out.println("Number-->> " + i);
	}
		
}

class StaticTest{
	public static void main(String args[]) {
		Love l1; // created a reference variable 
		l1 = new Love();  // put address of object in reference variable
		Love l2 = new Love();
		l1.name = "Saumya";  
		l1.printLover(l1);
	}
}

