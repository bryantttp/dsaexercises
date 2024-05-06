package linkedListExercises;

public class Node {
	private int data;
	private Node nextNode;

	public Node(int data, Node nextNode) {
		setData(data);
		setNext(nextNode);
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public Node getNext() {
		return nextNode;
	}

	public void setNext(Node nextNode) {
		this.nextNode = nextNode;
	}
}
