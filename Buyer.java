import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

public class Buyer<V> extends BuyerBase<V> {
	int catalogSize;
    public Buyer (int sleepTime, int catalogSize, Lock lock, Condition full, Condition empty, PriorityQueue<V> catalog, int iteration) {
        //TODO Complete the Buyer Constructor method
        // ...
    	this.full=full;
    	this.empty=empty;
    	this.catalog=catalog;
    	this.setIteration(iteration);
    	this.lock=lock;
    	this.catalogSize=catalogSize;
    	this.setSleepTime(sleepTime);
    }
    public void buy() throws InterruptedException {
    	lock.lock();
	try {
		 while (catalog.isEmpty()) {
			 empty.await(); 
			 } 
		 
			 NodeBase n=catalog.dequeue();
			 //TODO Complete the try block for consume method
            // ...
			 System.out.print("Consumed "); // DO NOT REMOVE (For Automated Testing)
			 n.show(); // DO NOT REMOVE (For Automated Testing)
            full.signalAll();
            // ...
	} catch (Exception e) {
            e.printStackTrace();
	} finally {
		lock.unlock();//TODO Complete this block
	}
    }
}
