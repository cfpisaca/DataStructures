package hw8;

public class AQueueTester
{
   public static void main(String[] args)
   {
      // test Dequeue From Empty
      AQueue<String> queue1 = new AQueue<>();
      System.out.println("Expected: null, your value: " + queue1.dequeue());
      System.out.println("Expected length: 0, your value: " +  queue1.length());
      
      //test Enque Dequeue No Wrap
      
      AQueue<String> queue2 = new AQueue<>(100);
      queue2.enqueue("A");
      queue2.enqueue("B");
      queue2.enqueue("C");
   
      System.out.println("Expected: A, your value: " + queue2.dequeue());
      System.out.println("Expected: B, your value: " + queue2.dequeue());
      System.out.println("Expected: C, your value: " + queue2.dequeue());
   
     //test Enque Dequeue With Wrap()
      AQueue<String> queue3 = new AQueue<>(3);
      queue3.enqueue("A");
      queue3.enqueue("B");
      queue3.enqueue("C");
   
      System.out.println("Expected: A, your value: " + queue3.dequeue());
      System.out.println("Expected: B, your value: " + queue3.dequeue());
      System.out.println("Expected: C, your value: " + queue3.dequeue());
   
      queue3.enqueue("D");
      queue3.enqueue("E");
      queue3.enqueue("F");
   
      System.out.println("Expected: D, your value: " + queue3.dequeue());
      System.out.println("Expected: E, your value: " + queue3.dequeue());
      System.out.println("Expected: F, your value: " + queue3.dequeue());
   
     //test Front Value After Enqueue
    AQueue<String> queue4 = new AQueue<>();
    queue4.enqueue("A");
    System.out.println("Expected: A, your value: " + queue4.frontValue());
    queue4.enqueue("B");
    System.out.println("Expected: A, your value: " + queue4.frontValue());
    queue4.enqueue("C");
    System.out.println("Expected: A, your value: " + queue4.frontValue());
    
    
    //test Front Value After Dequeue
    AQueue<String> queue5 = new AQueue<>();
    queue5.enqueue("A");
    queue5.enqueue("B");
    queue5.enqueue("C");

    System.out.println("Expected: A, your value: " +  queue5.frontValue());
    queue5.dequeue();
    System.out.println("Expected: B, your value: " +  queue5.frontValue());
    queue5.dequeue();
    System.out.println("Expected: C, your value: " +  queue5.frontValue());
    
    //test clear
    AQueue<String> queue6 = new AQueue<>();
    queue6.enqueue("A");
    queue6.enqueue("B");
    queue6.enqueue("C");

    queue6.clear();
    System.out.println("Expected length: 0, your value: " + queue6.length());
    System.out.println("Expected: true, your value: " + queue6.isEmpty());

    //test IsEmpty Newly Initialized Queue
    AQueue<String> queue7 = new AQueue<>(3);
    System.out.println("Expected: true, your value: " + queue7.isEmpty());

   
    //test IsEmpty Enqueue And Dequeue With Wrap Not Empty
    AQueue<String> queue8 = new AQueue<>(3);
    queue8.enqueue("A");
    queue8.enqueue("B");
    queue8.enqueue("C");
    queue8.dequeue();
    queue8.dequeue();
    queue8.enqueue("D");
    queue8.enqueue("E");
    System.out.println("Expected: false, your value: " + queue8.isEmpty());  
    
    //test IsEmpty Enqueue And Dequeue With Wrap Empty
    AQueue<String> queue9 = new AQueue<>(3);
    queue9.enqueue("A");
    queue9.enqueue("B");
    queue9.enqueue("C");
    queue9.dequeue();
    queue9.dequeue();
    queue9.enqueue("D");
    queue9.enqueue("E");
    queue9.dequeue();
    queue9.dequeue();
    queue9.dequeue();
    System.out.println("Expected: true, your value: " + queue9.isEmpty());


    // test Length After Enqueue And Dequeue No Wrap() {
    AQueue<String> queue10 = new AQueue<>(100);
    queue10.enqueue("A");
    queue10.enqueue("B");
    queue10.enqueue("C");
    queue10.dequeue();
    queue10.dequeue();

    System.out.println("Expected: 1, your value: " + queue10.length());
    System.out.println("Expected: 100, your value: " + ((Object[]) queue10.queueArray).length);
 
    
     
   }
}