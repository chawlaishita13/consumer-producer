// This class implements the Queue
public class Queue<V> implements QueueInterface<V>{

    //TODO Complete the Queue implementation
    private NodeBase<V>[] queue;
    private int capacity, currentSize, front, rear;
	
    public Queue(int capacity) {    
    	this.capacity=capacity;
    	queue=new NodeBase[capacity];
    	currentSize=0;
    	front=-1;
    	rear=-1;
    }

    public int size() {
    	return currentSize;
    }

    public boolean isEmpty() {
    	return size()==0;
    }
	
    public boolean isFull() {
    	return capacity==size();
    }

    public void enqueue(Node<V> node) {
    	if(isEmpty()) {
    		front=rear=0;
    		queue[rear]=node;
    		currentSize++;
    	}
    	else if(isFull()) {
    		System.out.println("queue full");
    		return;
    	}
    	else {
    		rear=(rear+1)%capacity;
    		queue[rear]=node;
    		currentSize++;
    	}
    	
    }
    

    public NodeBase<V> dequeue() {
    	if(!isEmpty()) {
    		NodeBase<V> n=queue[front];
    		front=(front+1)%capacity;
    		currentSize--;
    		return n;
    		
    }
    	else
    		return null;
    }

}

