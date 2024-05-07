package linkedListExercises;

public class SinglyLinkedList {
	private SinglyNode head;

	public SinglyLinkedList(SinglyNode node) {
		this.head = node;
	}

	public SinglyLinkedList() {
		SinglyNode node = new SinglyNode();
		this.head = node;
	}

	public int size() {
		int count = 0;
		SinglyNode current = head;
		while (current != null) {
			current = current.getNext();
			count += 1;
		}
		return count;
	}

	public void print() {
		String linkedList = "";
		SinglyNode current = head;
		while (current != null) {
			linkedList += current.getData();
			linkedList += " -> ";
			current = current.getNext();
		}
		System.out.println(linkedList);
	}

	public void insert_at_beginning(String data) {
		SinglyNode node = new SinglyNode(data, head.getNext());
		head.setNext(node);
	}

	public void insert_at_end(String data) {
		SinglyNode current = head;
		while (current.getNext() != null) {
			current = current.getNext();
		}
		SinglyNode node = new SinglyNode(data, null);
		current.setNext(node);
	}

	public void insert_at_index(int index, String data) {
		if (index < 0 || index >= this.size()) {
			System.out.println("Error, index out of range");
		} else if (index == 0) {
			insert_at_beginning(data);
		} else {
			SinglyNode current = head;
			current = current.getNext();
			int count = 1;
			while (count < index - 1) {
				current = current.getNext();
				count += 1;
			}
			SinglyNode node = new SinglyNode(data, current.getNext());
			current.setNext(node);
		}
	}

	public void delete_at_index(int index) {
		if (index < 0 || index >= this.size()) {
			System.out.println("Error, index out of range");
		} else if (index == 0) {
			head = head.getNext();
		} else {
			SinglyNode current = head.getNext();
			int count = 1;
			while (count < index - 1) {
				current = current.getNext();
				count += 1;
			}
			if (index == this.size() - 1) {
				current.setNext(null);
			} else {
				SinglyNode node = current.getNext().getNext();
				current.setNext(node);
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
		SinglyNode current = head;
		while (index < this.size() - 1) {
			if (current.getData() == data) {
				SinglyNode node = new SinglyNode(value, current.getNext());
				current.setNext(node);
				break;
			} else {
				current = current.getNext();
				index += 1;
			}
		}
	}

	public void delete_by_value(String data) {
		int index = 0;
		SinglyNode current = head;
		if (head.getData() == data) {
			head = head.getNext();
		} else {
			while (index < this.size() - 1) {
				if (current.getNext().getData() == data) {
					if (current.getNext().getNext() == null) {
						current.setNext(null);
						break;
					} else {
						SinglyNode node = new SinglyNode(current.getNext().getNext().getData(),
								current.getNext().getNext().getNext());
						current.setNext(node);
						break;
					}
				} else {
					current = current.getNext();
					index += 1;
				}
			}
		}
	}
}
