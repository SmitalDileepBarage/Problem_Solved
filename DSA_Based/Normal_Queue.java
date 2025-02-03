package Interview_basic.dsa;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

public class Normal_Queue {

	public static void main(String[] args) {
		Queue<Integer>queue=new ArrayDeque<>();
		
		queue.add(12);
		System.out.println(queue);
		
		queue.add(2);
		System.out.println(queue);
		
		queue.add(54);
		System.out.println(queue);
		
		queue.add(68);
		System.out.println(queue);
		
		queue.add(90);
		System.out.println(queue);
		
		queue.remove(90);
		System.out.println(queue);
		queue.remove();
		System.out.println(queue);

	}

}
