package collection_list;

import java.util.PriorityQueue;

public class PriorityQueue1 {
	
	public static void main(String [] args) {
		
	

	//insertion order is not preserved in PQ
	//duplicates are allowed
	//homog type of data
	
	PriorityQueue PQ = new PriorityQueue();
	 PriorityQueue PQ1 = new PriorityQueue();
	 
	 //insert/adding element
	 //1.add method
	 
	 PQ.add('D');
	 PQ.add('F');
	 PQ.add('M');
	 PQ.add('J');
	 PQ.add('A');
	 System.out.println(PQ);
	 
	// PQ.offer("HH");      classcastexception
	 
	 //offer method
	// PQ.offer(null);
	System.out.println(PQ.offer('r'));
	 System.out.println(PQ.offer('O'));
	 System.out.println(PQ);
	 
	 //3.element
	// System.out.println(PQ.element());
	//System.out.println(PQ1.element());// no such element exception
	
	 //peek
	 System.out.println(PQ.peek());
	 System.out.println(PQ1.peek());
	 
	 //remover and poll
	 System.out.println(PQ.remove());//removes the head in the list
	 
	 System.out.println(PQ);
	 
	 System.out.println(PQ.poll());
	 
	// System.out.println(PQ1.remove()); //no suchElementException if the queue is empty
	 
	 System.out.println(PQ1.poll());  //returns null if queue is empty
	 
	 //reading elements in queue
	 for(Object obj : PQ) {
		 System.out.print(" "+obj);
	 }
	 
	 
	 
}
}