// Use this driver for the testing the correctness of your priority queue implementation
// You can change the add, remove sequence to test for various scenarios.
public class PriorityQueueTestDriver {
    public static void main(String[] args) {
	PriorityQueue<String> pq = new PriorityQueue<String>(5);
	Node a=new Node(4,"A");
	Node b=new Node(10,"B");
	Node c=new Node(3,"C");
	Node d=new Node(5,"D");
	Node e=new Node(2,"E");
	pq.enqueue(a);
	pq.enqueue(b);
	pq.enqueue(c);
	pq.enqueue(d);
	pq.enqueue(e);
	
//	pq.add(4, "A");
//	pq.add(10, "B");
//	pq.add(3, "C");
//	pq.add(5, "E");
//	pq.add(2, "F");
	
	//pq.display();
	int size = pq.size();
	System.out.println(pq.size());
	for (int i=0; i<size; i++) {
            Node<String> n = (Node<String>) pq.dequeue();
            n.show();
}
	
    }
}