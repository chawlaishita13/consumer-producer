public class PriorityQueue<V> implements QueueInterface<V>{

    private NodeBase<V>[] queue;
    private int capacity, currentSize;
	
    //TODO Complete the Priority Queue implementation
    // You may create other member variables/ methods if required.
    public PriorityQueue(int capacity) {  
    	currentSize=0;
    	this.capacity=capacity;
    	queue=new NodeBase[capacity];
    	
    }

    public int size() {
    	return currentSize;
    }

    public boolean isEmpty() {
    	return size()==0;
    }
	
    public boolean isFull() {
    	return size()==capacity;
    }

    public void enqueue(Node<V> node) {
    	if(!isFull()) {
    		queue[currentSize]=node;
    		currentSize++;
    		
    	}
    	
    
    }

    // In case of priority queue, the dequeue() should 
    // always remove the element with minimum priority value
    public NodeBase<V> dequeue() {
    	if(!isEmpty()) {
    	int i=0;
    	int pos=0;
    	NodeBase<V> n=queue[0];
    	while(i<size()) {
    		if(n.getPriority()>queue[i].getPriority()) {
    			n=queue[i];
    			pos=i;
    		}
    		i++;
    		
    	}
    	int j=pos;
    	while(j+1<size()) {
    		queue[j]=queue[j+1];
    		j++;
    	}
    	currentSize--;
    	return n;
    	
    	}
    	else
    		return null;

    	
    }

    public void display () {
	if (this.isEmpty()) {
            System.out.println("Queue is empty");
	}
	for(int i=0; i<currentSize; i++) {
            queue[i+1].show();
	}
    }
}

