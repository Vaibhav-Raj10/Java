class Table {
	int length;
	int height;

	Table(int length, int height){
		this.length = length;
		this.height = height;
	}

	void printVolume(float width){
		float vol = width * height * length;
		System.out.println("Here is volume :" + vol);
	}
}

class MethodOverloadTypeConversion{
	public static void main(String args[]){
		Table t1 = new Table(10, 14);
		t1.printVolume(20.0);
	}
}


/*
Try above example with different variation of argument and parameter type.

If the argument is of type 'double' but the only method that ca accept this call has parameter type as int or float
then the error is NOT that method is not found. Java still tries to accomodate double inside a float or int method
and throws an error due to lossy conversion.
*/