package linkedListExercises;

public class SinglyNode {
	private String data;
	private SinglyNode nextNode;

	public SinglyNode(String data, SinglyNode nextNode) {
		setData(data);
		setNext(nextNode);
	}

	public SinglyNode() {

	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public SinglyNode getNext() {
		return nextNode;
	}

	public void setNext(SinglyNode nextNode) {
		this.nextNode = nextNode;
	}
}
