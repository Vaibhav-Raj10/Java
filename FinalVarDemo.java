/* 
Understanding final keyword with variables
'final' keyword determines if a given variable can be reassigned to a new value
'Immutability' determines if we can change some part of a given variable
String, int, float, double, boolean are all immutable
Objects are mutable
*/

class FinalVarDemo{
	public static void main(String args[]){
	final int[] i = new int[]{3,4};

	// following is NOT an error because objects are mutable
	i[0] = 1;
	// following is an error because i has been declared as final
	// i = new int[]{11, 12}

	System.out.println(i[0]);

	final String s1 = "Saumya";
	// following is an error because String is mutable
	// s1.setCharAt(4, 'x');
	// following is an error because s1 has been declared as final 
	s1 = "Vaibhav";	
}}