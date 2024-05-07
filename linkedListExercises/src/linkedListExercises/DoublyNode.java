package linkedListExercises;

public class DoublyNode {
	private String data;
	private DoublyNode nextNode;
	private DoublyNode previousNode;

	public DoublyNode() {

	}

	public DoublyNode(String data, DoublyNode nextNode, DoublyNode previousNode) {
		setData(data);
		setNextNode(nextNode);
		setPreviousNode(previousNode);
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public DoublyNode getNextNode() {
		return nextNode;
	}

	public void setNextNode(DoublyNode nextNode) {
		this.nextNode = nextNode;
	}

	public DoublyNode getPreviousNode() {
		return previousNode;
	}

	public void setPreviousNode(DoublyNode previousNode) {
		this.previousNode = previousNode;
	}
}
