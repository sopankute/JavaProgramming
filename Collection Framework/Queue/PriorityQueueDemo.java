import java.util.*;

public class PriorityQueueDemo{
	public static void main(String[] args) {

		PriorityQueue q = new PriorityQueue();
		System.out.println(q.peek());			// null
		// System.out.println(q.element());		// NoSuchElementException

		for(int i=0; i<=10; i++){
			q.offer(i);
		}
		System.out.println(q);	// [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10]

		System.out.println(q.poll());	// 0
		System.out.println(q.remove());	// 1

		System.out.println(q);		// [2, 3, 5, 7, 4, 9, 6, 10, 8] 
		// Some Operating Systems won't Provide Proper Support for PriorityQueues.
	}
}