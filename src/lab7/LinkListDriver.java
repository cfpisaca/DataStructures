package lab7;

public class LinkListDriver
{
   public static void main(String[] args)
   {
        SimpleLinkedList abcList;
        abcList = new SimpleLinkedList();
        
        // Now contains ["A", "B", "C"]
        abcList.addAtStart("C");
        abcList.addAtStart("B");
        abcList.addAtStart("A");
        
        System.out.println("Inserted A, B and C in the list \n"); 
                
        // -- testing if A is at the start
        System.out.println("Expected output: List contains A at start is true");
        System.out.println("Your program output: List contains A at start is " + abcList.contains("A"));
        System.out.println();
        
        // -- testing if B is at the middle
        System.out.println("Expected output: List contains B in middle is true");
        System.out.println("Your program output: List contains B in middle is " + abcList.contains("B"));
        System.out.println();
      
        // -- testing if C is at the end
        System.out.println("Expected output: List contains C in end is true");
        System.out.println("Your program output: List contains C in end is " + abcList.contains("C"));
        System.out.println();
        
        // -- testing for an element that don't exist
        System.out.println("Expected output: List contains Q is false");
        System.out.println("Your program output: List contains Q is " + abcList.contains("Q"));
        System.out.println();
        
        // -- insert A and B and test for size 
        SimpleLinkedList list = new SimpleLinkedList();
       
        list.addAtEnd("A");
        System.out.println("Expected output: list size 1");
        System.out.println("Your program output: list size " + list.size());
        System.out.println();
        
        list.addAtEnd("B");
        System.out.println("Expected output: list size 2");
        System.out.println("Your program output: list size " + list.size());
        System.out.println();
        
        
        // -- test for adding at the end of Non Empty List
        SimpleLinkedList list2 = new SimpleLinkedList();
        
        list2.addAtStart("Y");
        list2.addAtStart("X");
        list2.addAtEnd("Z");
        
        System.out.println("Current state of the list - X Y Z");
        System.out.print("Your program retrieves, current state of the list ");
        
        System.out.print(list2.get(0) + " ");
        System.out.print(list2.get(1) + " ");
        System.out.print(list2.get(2));

   }
}