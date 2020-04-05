/*
-------------------------------------------------
			STACK
-------------------------------------------------
1. is a data structure
2. Operates on principle commonly termed Last In First Out
3. Use an array to create a stack data structure
4. Support following operation:
	4.a. push()
	4.b. pop()
	4.c. peek()
	4.d. printAll()
	4.e. invertStack()
5. Restrict access using functions and private variable.
6. Algorithms:
	6.a. For push
		i. check value in top
		ii. if top >= arr.length -1, print overflow
		iii. else top++, put 'num' at arr[top]
	6.b For pop
		i. check if top == -1
		ii. if yes then underflow
		iii. else return the number at arr[top]
		iv. top--
	6.c. For peek
		i. if top == -1 print stack is empty
		ii. else return arr[top]
	6.d. For printAll
		i. if top == -1 print stack is empty
		ii. else run a for loop from 0 to top and print all elements
*/

class Stack{
	private int top = -1;
	
	void push(int pushNum, int[] arr){
		if(top >= arr.length-1){
			System.out.println("Overflow detected. Unable to push");
		}
		else{
			arr[++top] = pushNum;
			System.out.println("Successfully pushed Number: " + pushNum);
		}
	}

	void pop(int[] arr){
		if(top <= -1){
			System.out.println("Underflow detected. Unable to pop");
		}
		else{
			int popNum = arr[top--];
			System.out.println("Popped numbers: " + popNum);
		}
	}

	void peek(int[] arr){
		if(top <= -1){
			System.out.println("Stack is empty. Nothing to show");
		}
		else{
			int peekNum = arr[top];
			System.out.println("Number at top: " + peekNum);
		}
	}

	void printAll(int[] arr){
		if(top <= -1){
			System.out.println("Stach is empty. Nothing to show");
		}
		else{
			for(int index=0; index <= top; index++){
				System.out.println(arr[index]);
			}
		}
	}
	
	/*
	write invertStack implementation here
	void invertStack(int arr[]){}
	*/
	
}

class JavaStackImplementation{
	public static void main(String args[]){
		Stack s1 = new Stack();
		int[] arr = new int[10];
		s1.push(10, arr);
		s1.push(14, arr);
		s1.pop(arr);		
	}
}
			