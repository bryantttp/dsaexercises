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
	}
}
