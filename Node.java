
public class Node<T> {
	T data;
	Node nextNode;
	public Node(T data){
		this.data = data;
		this.nextNode = null;
	}
	public T getData() {
		return data;
	}
	public void setData(T data) {
		this.data = data;
	}
	public Node getNextNode() {
		return nextNode;
	}
	public void setNextNode(Node nextNode) {
		this.nextNode = nextNode;
	}
	
}
