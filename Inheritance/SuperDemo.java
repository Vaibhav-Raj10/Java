/*
Anytime we create an object of the sub-class, superclass constructor is called automatically.
In case we don't specifically call any superclass constructor with super keyword:
	java will look for a constructor in superclass which looks like the default constructor and use that
	or else, java will call it's own default constructor
*/
class ParentClass{

	int i;
	int j;
	
	void printIJ(){
		System.out.println(i + " " + j);
	}

}

class SuperDemo extends ParentClass{
	int j;
	int k;

	SuperDemo (int val1, int val2){
		j = val1;
		k = val2;
	}

	void printJK(){
		System.out.println(j + " " + k);
	}
	
	public static void main(String args[]){
		// SuperDemo cobj2 = new SuperDemo(10, 20, 30, 40);
		SuperDemo cobj2 = new SuperDemo(10, 20);
		cobj2.i = 10;
		cobj2.j = 20;
		cobj2.k =30;
		cobj2.printIJ();
		cobj2.printJK();
	}

}
