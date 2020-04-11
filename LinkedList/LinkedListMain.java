/*
-----------------------------------------------------------------------------
			SINGLY LINKED LIST IN JAVA
-----------------------------------------------------------------------------
*/
class LinkedList{
	int data;
	LinkedList next;

	void insertNode(int d, LinkedList head){
		LinkedList temp;
		temp = head;
		while(temp.next != null){
			temp = temp.next;
		}
		LinkedList newNode = new LinkedList();
		newNode.data = d;
		newNode.next = null;
		temp.next = newNode;
	}

	void printLinked(LinkedList head){
		LinkedList temp = head;
		while(temp.next != null){
			System.out.print(temp.data + "->");
			temp = temp.next;
		}
		System.out.print(temp.data);
	}

}

class LinkedListMain{
	public static void main(String[] args){

		LinkedList node1 = new LinkedList();
		node1.data = 10;
		node1.next = null;
	
		LinkedList head;
		head = node1;

		head.insertNode(8, head);
		head.printLinked(head);
	}
}