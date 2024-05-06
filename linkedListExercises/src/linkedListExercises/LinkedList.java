package linkedListExercises;

public class LinkedList {
	private Node head;

	public int size() {
		int count = 0;
		Node current = head;
		while (current != null) {
			head = head.getNext();
			count += 1;
		}
		return count;
	}

	public void print() {
		String linkedList = "";
		Node current = head;
		while (current != null) {
			linkedList += current.getData();
			linkedList += " -> ";
			current = current.getNext();
		}
		System.out.println(linkedList);
	}

	public void insert_at_beginning(int data) {
		Node node = new Node(data, head.getNext());
		head.setNext(node);
	}

	public void insert_at_end(int data) {
		Node current = head;
		while (head.getNext() != null) {
			head = head.getNext();
		}
		Node node = new Node(data, null);
		current.setNext(node);
	}

	public void insert_at_index(int index, int data) {
		if (index < 0 || index >= this.size()) {
			System.out.println("Error, index out of range");
		} else if (index == 0) {
			insert_at_beginning(data);
		} else {
			Node current = head;
			current = current.getNext();
			int count = 1;
			while (count < index) {
				current = current.getNext();
				count += 1;
			}
			Node node = new Node(data, head.getNext());
			current.setNext(node);
		}
	}

	public void delete_at_index(int index) {
		if (index < 0 || index >= this.size()) {
			System.out.println("Error, index out of range");
		} else {
			Node current = head;
			int count = 0;
			while (count < index + 1) {
				current = current.getNext();
				count += 1;
			}
			Node node = new Node(current.getNext().getNext().getData(), current.getNext().getNext());
			current.setNext(node);
		}
	}

	public void insert_values(int[] values) {
		for (int i : values) {
			insert_at_end(i);
		}
	}

	public void insert_after_value(int data) {
		int index = 0;
		Node current = head;
		while (index < this.size()) {
			if (current.getData() == data) {
				Node node = new Node(data, current.getNext());
				current.setNext(node);
				break;
			} else {
				current = current.getNext();
				index += 1;
			}
		}
		if (index == this.size() - 1) {
			System.out.println("Data does not exist in Linked List!");
		}
	}

	public void delete_by_value(int data) {
		int index = 0;
		Node current = head;
		if (head.getData() == data) {
			head = head.getNext();
		} else {
			while (index < this.size()) {
				if (current.getNext().getData() == data) {
					Node node = new Node(current.getNext().getNext().getData(), current.getNext().getNext());
					current.setNext(node);
					break;
				} else {
					current = current.getNext();
					index += 1;
				}
			}
		}
		if (index == this.size() - 1) {
			System.out.println("Data does not exist in Linked List!");
		}
	}

}
