package linkedList;

public class LinkedList_ShoppingCart_Controller {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList_ShoppingCart cart = new LinkedList_ShoppingCart();
		cart.addItem(2.50f, 5, "Haribo");
		cart.addItem(15.00f, 2, "Wine");
		cart.addItem(0.50f, 10, "Crisps");
		cart.addItem(1.99f, 3, "Diet-Coke");
		
		cart.displayItems();
		System.out.println("Total: �" + cart.getTotal());
		cart.delete("Wine");
		cart.displayItems();
		System.out.println("Total: �" + cart.getTotal());
		if (cart.find("Crisps") != null)
			System.out.println("Item Found!");
	}

}
