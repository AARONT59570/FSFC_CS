package linkedList;

public class LinkedList_intSort_Controller {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList_intSort List = new LinkedList_intSort();
		int[] ints = {1, 4, 18, 7, 9, 10, 8, 4, 44, 66, 13, 123, 567, 986, 324};
		List.createNewList(ints);
		List.displayList();
		List.SortList();
		System.out.println("");
		List.displayList();

	}

}
