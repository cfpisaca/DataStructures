package hw8;

class AQueue<E> implements Queue<E> {

  // Keep this non-private for testing purposes!
  E queueArray[]; // Array holding queue elements

  private static final int defaultSize = 10;
  private int front; // Index of front element
  private int size; // Number of elements stored.


  // Constructors
  @SuppressWarnings("unchecked") // Generic array allocation
  AQueue(int capacity) {
    //COMPLETE THIS
    // Initialize front and size variable to 0
    front = 0;
    size = 0;
    // Create queueArray with capacity as the size of the array
    queueArray = (E[]) new Object[capacity]; 
  }


  AQueue() {
    this(defaultSize);
  }

  // Reinitialize the entire queue to be empty
  public void clear() {
   front = 0;
   size = 0;
   int qLength = queueArray.length;
   for (int i = 0; i < qLength; i++) {
      queueArray[i] = null;
   }
  }

  // Put "it" in queue, make sure to update appropriate index and size
  public boolean enqueue(E it) {
    int qLength = queueArray.length;
    if (size < qLength) {
      queueArray[length() % qLength] = it;
      size++;
      return true;
    }
    return false;
  }

  // Remove and return front value, make sure to update appropriate index and size
  public E dequeue() {
   int qLength = queueArray.length;
   if (isEmpty() == false) {
      E cleared = queueArray[front];
      queueArray[front] = null;
      front = (front + 1) % qLength;
      size--;
      return cleared;
   }
   return null;
  }

  // Return front value
  public E frontValue() {
    return queueArray[front];
  }

  // Return queue size
  public int length() {
    return size;
  }
  
  //Check if the queue is empty
  public boolean isEmpty() {
    return length() == 0;
  }
}
