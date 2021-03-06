package linkedList;

public class LinkedList_intSort {
	private IntLink first = null;
	private int linkNum = 0;
	public void SortList()
	{
		int tempVal = 0;

		int currentPos=1;
		IntLink currentLink = first;

		for (currentPos=1;currentPos<linkNum;++currentPos){
			currentLink = currentLink.getNextLink();
			while(currentPos> 0 && currentLink.getValue()<currentLink.getPrevLink().getValue()){

				tempVal = currentLink.getValue();

				currentLink.setValue(currentLink.getPrevLink().getValue());

				currentLink.getPrevLink().setValue(tempVal);

				currentLink = currentLink.getPrevLink();
				currentPos--;

			}

		}
	}
	public void createNewList(int[] intArray)
	{
		first = new IntLink(intArray[0]);
		for (int i = 1; i < intArray.length; i++) {
			IntLink link = new IntLink(intArray[i]);
			link.setNextLink(first);
			first = link;
		}
		linkNum = intArray.length;
	}
	public void addInt(int val)
	{
		IntLink link = new IntLink(val);
		 if(first!=null) {
			 link.setNextLink(first);
			 first = link;// new object is placed at the start
	
		 }
	
		 else{
	
			 first=link;
	
		 }
		 linkNum++;
	}
	public void displayList()
	{
		IntLink current = first;
		 while(current!=null){
			 System.out.print(current.getValue() + " ");;
			 current=current.getNextLink();
		 }

	}

}
