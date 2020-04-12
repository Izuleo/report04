package report4;

interface Stack {
	  boolean isEmpty();
	  void push(char item);
	  char pop();
	  void delete();
	  char peek();
}

class StackNode {
char data;
StackNode link;
}

class LinkedStack implements Stack {
private StackNode top;

public boolean isEmpty() {
	return(top==null);
}

public void push(char item) {
	StackNode newNode = new StackNode();
	newNode.data = item;
	newNode.link = top;
	top = newNode;
	System.out.println("Inserted Item: " + item);
}

public char pop() {
	if(isEmpty()) {
		System.out.println("삭제할 수 없다.");
		return 0;
	} else {
		char item = top.data;
		top = top.link;
		return item;
	}
}//pop

public void delete() {
	if(isEmpty()) {
		System.out.println("비어있어서 삭제할 수 없다.");
	} else {
		top = top.link;
	}
}//delete

public char peek() {
	if(isEmpty()) { //비어있으면
		System.out.println("값 탐색 불가");
		return 0;
	} else {
		return top.data;
	}
}//peek

public void printStack() {
	if(isEmpty())
		System.out.printf("비어있다. %n %n");
	else {
		StackNode temp = top;
		System.out.println("");
		
		while(temp != null) {
			System.out.printf("\t %c \n", temp.data);
			temp = temp.link;
		}//while의 끝
		System.out.println();
	}
}//printStack

}//클라스 LinkedStack

class linked_Stack {
public static void main(String args[]) {
	char deletedItem;
	LinkedStack LS = new LinkedStack();
	
	LS.push('A');
	LS.printStack();
	LS.push('B');
	LS.printStack();
	LS.push('C');
	LS.printStack();
	
	deletedItem = LS.pop();
	if(deletedItem != 0)
		System.out.println("deleted Item:" + deletedItem);
	LS.printStack();
}

}