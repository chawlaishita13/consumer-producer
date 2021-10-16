
public class QueueTestDriver {
	 public static void main(String[] args) {
			Queue<String> pq = new Queue<String>(5);
			Node a=new Node(4,"A");
			Node b=new Node(10,"B");
			Node c=new Node(3,"C");
			Node d=new Node(5,"D");
			Node e=new Node(2,"E");
			
			pq.enqueue(a);
			pq.enqueue(b);
			pq.enqueue(c);
			pq.dequeue().show();
			pq.enqueue(d);
			pq.enqueue(e);
			pq.dequeue().show();
			pq.dequeue().show();
			int size = pq.size();
			System.out.println(pq.size());
//			for (int i=0; i<size; i++) {
//		            Node<String> n = (Node<String>) pq.dequeue();
//		            n.show();
//		}
			
		    }
	
	
	

}
