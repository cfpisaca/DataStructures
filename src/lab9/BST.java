package lab9;/*
 * OpenDSA Project 
 * 
 * 
 */

// Unfinished Binary Search Tree implementation
class BST<E extends Comparable<E>> {
  protected BSTNode<E> root; // Root of the BST
  protected int nodecount; // Number of nodes in the BST

  // constructor
  BST() {
    root = null;
    nodecount = 0;
  }

  // Reinitialize tree
  public void clear() {
    root = null;
    nodecount = 0;
  }

  // Insert a record into the tree.
  // Records can be anything, but they must be Comparable
  // e: The record to insert.
  public void insert(E e) {
    root = inserthelp(root, e);
    nodecount++;
  }

  private BSTNode<E> inserthelp(BSTNode<E> rt, E e) {
    if (rt == null)
      return new BSTNode<E>(e);
    if (rt.element().compareTo(e) >= 0)
      rt.setLeft(inserthelp(rt.left(), e));
    else
      rt.setRight(inserthelp(rt.right(), e));
    return rt;

  }


  // Return the record with key value k, null if none exists
  // key: The key value to find
  public E find(E key) {
    return findhelp(root, key);
  }

  private E findhelp(BSTNode<E> rt, E key) {
    if (rt == null)
      return null;
    if (rt.element().compareTo(key) > 0)
      return findhelp(rt.left(), key);
    if (rt.element().compareTo(key) == 0)
      return rt.element();
    else
      return findhelp(rt.right(), key);

  }

  // Return the number of records in the dictionary
  public int size() {
    return nodecount;
  }


  // UNFINISHED METHODS BELOW THIS POINT**************************

  /**
   * Recursively calculate the number of nodes in this BST.
   */
  public int recursiveSize() {
   return recursiveSize(root);
  }
  
  private int recursiveSize(BSTNode<E> root) {
   if (root == null) {
      return 0; 
   } else {
      return 1 + recursiveSize(root.left()) + recursiveSize(root.right());
   }
  }

  /**
   * Return the smallest element in the tree.
   */
  public E minElement() {
   return minElement(root);
  }
  
  private E minElement(BSTNode<E> root) {
   if (root.left() == null) {
      return root.element();
   } else {
      return minElement(root.left());
   }
  
  }

  /**
   * Return the largest element in the tree.
   */
  public E maxElement() {
   return maxElement(root);
  }
  
  private E maxElement(BSTNode<E> root) {
   if (root.right() == null) {
      return root.element();
   } else {
      return maxElement(root.right());
   }
  }

  /**
   * Return an ordered linked list containing all of the elements from the tree.
   */
   public LList<E> makeOrderedList() {
      LList<E> ordList = new LList<E>();
      makeOrderedList(root, ordList);
      return ordList;
   }
   
   private void makeOrderedList(BSTNode<E> root, LList<E> ordList) {
      if (root != null) {
         makeOrderedList(root.left(), ordList);
         ordList.append(root.element());
         makeOrderedList(root.right(), ordList); 
      }
   }
   

  /**
   * Return true if this BST actually has the BST property and false if it does
   * not.
   * 
   * (Note that this method would typically not be necessary. It a correctly
   * coded BST there will be no possibility of violating the BST property.)
   * 
   */
  public boolean isValidBST() {
   return isValidBST(root);
  }
  
  private boolean isValidBST(BSTNode<E> root) {
   if (root == null ) {
      return true;
   } else if (root.right() != null && (minElement(root.right()).compareTo(root.element()) < 0)) {
      return false;
   } else if (root.left() != null && (maxElement(root.left()).compareTo(root.element()) >= 0)) {
      return false;
   } else if (isValidBST(root.left()) != true || isValidBST(root.right()) != true) {
      return false;
   } 
   return true;
  }
  
} 
