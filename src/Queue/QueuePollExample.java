package Queue;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class QueuePollExample {

	public static void main(String[] args) {
		Queue<String> queue = new LinkedList<String>();
		queue.add("JAVA");
		queue.add("Javafx");
		queue.add("python");
		queue.add("C#");
		System.out.println("Contents at the top of the queue : " +queue.poll());
		Iterator<String> it = queue.iterator();
		System.out.println("Contents of the queue : ");
		
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
