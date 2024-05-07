package linkedListExercises;

public class Runner {
	public static void main(String[] args) {
		SinglyLinkedList newList = new SinglyLinkedList();
		String[] list1 = { "banana", "mango", "grapes", "orange" };
		newList.insert_values(list1);
		newList.delete_at_index(0);
		newList.print();
		newList.insert_after_value("mango", "apple");
		newList.print();
		newList.insert_at_index(2, "test");
		newList.print();
		newList.delete_at_index(2);
		newList.print();
		newList.delete_by_value("orange");
		newList.print();
		newList.delete_by_value("figs");
		newList.print();
		newList.delete_by_value("banana");
		newList.delete_by_value("mango");
		newList.print();
		newList.delete_by_value("apple");
		newList.delete_by_value("grapes");
		newList.print();

		DoublyLinkedList newList2 = new DoublyLinkedList();
		newList2.insert_values(list1);
		newList2.delete_at_index(0);
		newList2.print_forward();
		newList2.print_backwards();
		newList2.insert_at_beginning("head");
		newList2.print_forward();
		newList2.print_backwards();
		newList2.insert_at_end("end");
		newList2.print_forward();
		newList2.print_backwards();
		newList2.insert_at_index(2, "test");
		newList2.print_forward();
		newList2.print_backwards();
		newList2.delete_at_index(2);
		newList2.print_forward();
		newList2.print_backwards();
		newList2.insert_after_value("banana", "papaya");
		newList2.print_forward();
		newList2.print_backwards();
		newList2.delete_by_value("orange");
		newList2.print_forward();
		newList2.print_backwards();
		newList2.delete_by_value("figs");
		newList2.print_forward();
		newList2.print_backwards();
	}
}
