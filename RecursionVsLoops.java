import java.util.*;
class RecursionVsLoops {
	public static void main(){
		System.out.println("Enter a number!");
		Scanner sc =  new Scanner(System.in);
		int num = sc.nextInt();
		printWithLoop(num);
		printWithRecursion(num);
	}
	public static void main(String args[]){
		main();
	}

	static void printWithLoop(int num){
		for(int i=num; i >= 0; i--)
			System.out.println(i);
	}

	static void printWithRecursion(int num){

		if(num < 0)
			return; 
		
		printWithRecursion(num-1);
		System.out.println(num);
	}
	
}