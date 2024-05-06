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

	public void insert_at_beginning() {

	}

	public void insert_at_end() {

	}

	public void insert_at_position() {

	}

	public void delete_at_position() {

	}

	public void insert_values() {

	}

	public void insert_after_values(int data) {

	}

	public void delete_by_values(int data) {

	}

}
