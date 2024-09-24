
import java.util.*;
class PQDemo{
    
    public static void main(String[] args) {
    
    PriorityQueue pq=new PriorityQueue();
    pq.add(10);
    pq.add(5);
    pq.offer(15);
    pq.offer(25);
    pq.offer(12);
    pq.add(9);
    pq.add(31);
    System.out.println(pq);     
    pq.remove();
    pq.poll();
    pq.poll();
    System.out.println(pq);
    System.out.println(pq.peek());     
    }
}