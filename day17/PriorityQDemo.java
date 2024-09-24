import java.util.*;

public class PriorityQDemo {
	public static void main(String[] args) {
			
		PriorityQueue pq = new PriorityQueue();

		pq.add(10);
		pq.add(5);
		pq.offer(15); //similar to add()
		pq.offer(25);
		pq.offer(12);
		pq.add(9);
		pq.add(31);

		System.out.println(pq);
		pq.remove();
		pq.poll(); //similar to remove()
		pq.poll();
		System.out.println("\n"+pq);
		System.out.println("\nPeek: "+pq.peek());

	}
}