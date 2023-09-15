
public class LinkedStack<T> implements StackInterface<T> {
	Node top;
	
	public LinkedStack(){
		top = null;
	}

	public void push(T entry) {
		// TODO Auto-generated method stub
		Node newNode = new Node(entry);
		newNode.setNextNode(top);
		top = newNode;
	}

	public T pop() {
		T temp = peak();
		if(!isEmpty()){
			top = top.getNextNode();
		}
		return temp;
	}

	public T peak() {
		if(isEmpty()){
			return null;
		}else{
			return (T) top.getData();
		}
	}

	public boolean isEmpty() {
		return top == null;
	}

	public void clear() {
		// TODO Auto-generated method stub
		top = null;
	}
	
}
