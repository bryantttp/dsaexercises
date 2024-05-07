package linkedListExercises;

public class DoublyLinkedList {
	private DoublyNode head;

	public DoublyLinkedList(DoublyNode head) {
		this.head = head;
	}

	public DoublyLinkedList() {
		DoublyNode head = new DoublyNode();
		this.head = head;
	}

	public int size() {
		int count = 0;
		DoublyNode current = head;
		while (current != null) {
			current = current.getNextNode();
			count += 1;
		}
		return count;
	}

	public DoublyNode getLastNode() {
		DoublyNode current = head;
		while (current.getNextNode() != null) {
			current = current.getNextNode();
		}
		return current;
	}

	public void print_forward() {
		String linkedList = "";
		DoublyNode current = head;
		while (current != null) {
			linkedList += current.getData();
			linkedList += " -> ";
			current = current.getNextNode();
		}
		System.out.println(linkedList);
	}

	public void print_backwards() {
		String linkedList = "";
		DoublyNode current = this.getLastNode();
		while (current.getPreviousNode() != null) {
			linkedList += current.getData();
			linkedList += " -> ";
			current = current.getPreviousNode();
		}
		System.out.println(linkedList);
	}

	public void insert_at_beginning(String data) {
		DoublyNode node = new DoublyNode(data, head, null);
		head.setPreviousNode(node);
	}

	public void insert_at_end(String data) {
		DoublyNode current = this.getLastNode();
		DoublyNode node = new DoublyNode(data, null, current);
		current.setNextNode(node);
	}

	public void insert_at_index(int index, String data) {
		if (index < 0 || index >= this.size()) {
			System.out.println("Error, index out of range");
		} else if (index == 0) {
			insert_at_beginning(data);
		} else {
			DoublyNode current = head;
			current = current.getNextNode();
			int count = 1;
			while (count < index - 1) {
				current = current.getNextNode();
				count += 1;
			}
			DoublyNode node = new DoublyNode(data, current, current.getNextNode());
			current.setNextNode(node);
		}
	}

	public void delete_at_index(int index) {
		if (index < 0 || index >= this.size()) {
			System.out.println("Error, index out of range");
		} else if (index == 0) {
			head = head.getNextNode();
		} else {
			DoublyNode current = head;
			int count = 1;
			while (count < index - 1) {
				current = current.getNextNode();
				count += 1;
			}
			if (index == this.size() - 1) {
				current.setNextNode(null);
			} else {
				DoublyNode node = current.getNextNode().getNextNode();
				current.setNextNode(node);
			}
		}
	}

	public void insert_values(String[] values) {
		for (String i : values) {
			insert_at_end(i);
		}
	}

	public void insert_after_value(String data, String value) {
		int index = 0;
		DoublyNode current = head;
		while (index < this.size() - 1) {
			if (current.getData() == data) {
				DoublyNode node = new DoublyNode(value, current.getNextNode(), current);
				current.setNextNode(node);
				break;
			} else {
				current = current.getNextNode();
				index += 1;
			}
		}
	}

	public void delete_by_value(String data) {
		int index = 0;
		DoublyNode current = head;
		if (head.getData() == data) {
			head = head.getNextNode();
		} else {
			while (index < this.size() - 1) {
				if (current.getNextNode().getData() == data) {
					if (current.getNextNode().getNextNode() == null) {
						current.setNextNode(null);
						break;
					} else {
						DoublyNode node = current.getNextNode().getNextNode();
						node.setPreviousNode(current);
						current.setNextNode(node);
						break;
					}
				} else {
					current = current.getNextNode();
					index += 1;
				}
			}
		}
	}
}
