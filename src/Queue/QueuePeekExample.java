package Queue;
import java.util.Iterator;
//peek() example;
import java.util.LinkedList;
import java.util.Queue;

public class QueuePeekExample {

	public static void main(String[] args) {
		Queue<String> queue = new  LinkedList<String>();
		queue.add("JAVA");
		queue.add("Python");
		queue.add("C#");
		queue.add("JS");
		System.out.println("Element at the top of the queue : " + queue.peek());
		Iterator<String> it = queue.iterator();
		System.out.println("Contents of the queue : ");
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
