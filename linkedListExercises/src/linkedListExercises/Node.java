package linkedListExercises;

public class Node {
	private String data;
	private Node nextNode;

	public Node(String data, Node nextNode) {
		setData(data);
		setNext(nextNode);
	}

	public Node() {

	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public Node getNext() {
		return nextNode;
	}

	public void setNext(Node nextNode) {
		this.nextNode = nextNode;
	}
}
