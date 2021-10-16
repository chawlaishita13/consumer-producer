# consumer-producer
A multi-threaded implementation of an e-commerce platform that allows multiple buyers to interact parallelly. 

Queue
1) constructor- sets the value of capacity and current size and creates a new queue with the given capacity.
2) size()- returns current size of the queue
3) isEmpty()- returns true/false depending on whether the queue is empty or not
4) isFull()- returns true/false depending on whether the queue is full or not
5) enqueue()- adds node to the end of the queue if the queue is not full.
6) dequeue()- removes and returns a node from front of the queue if the queue is not empty.

PriorityQueue

1) constructor- sets the value of capacity and current size and creates a new queue with the given capacity.
2) size()- returns current size of the queue
3) isEmpty()- returns true/false depending on whether the queue is empty or not
4) isFull()- returns true/false depending on whether the queue is full or not
5) enqueue()- adds node to the end of the queue if the queue is not full.
6) dequeue()- removes and returns the node with the least priority from the queue if the queue is not empty

Buyer
1) Constructor- sets the value of sleepTime,lock,empty,full,catalog and iteration
2)buy()- removes the elements with the least priority from the priority queue(catalog) if it is not empty. Otherwise it waits.

Seller
1)Constructor- sets the value of sleeptime,lock,full,empty,catalog and inventory
2) sell()- it dequeues an element from the inventory and adds it to the catalog if the catalog is not full. Otherwise it waits.

Assignment2Driver
All elements from the arraylist "list" were added to the inventory.
numBuyer and numSeller number of threads of buyers and sellers respectively were created and started.
