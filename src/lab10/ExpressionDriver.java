package lab10;

/**
 * Simple tests for expression trees.
 * 
 * @author Farzana Rahman
 * @version 10/2018
 */
public class ExpressionDriver {

  /**
   * Execute the test methods.
   */
  public static void main(String[] args) {
    testExpressionTree();
  }

  /**
   * Build a simple expression tree and test its operations.
   */
  public static void testExpressionTree() {
    // Build the expression ((7.0 * 2.0) - (8.0 / 2.0))
    ExpressionNode tree = new OperatorNode(Operator.SUBTRACT);

    tree.setLeft(new OperatorNode(Operator.MULTIPLY));
    tree.left().setLeft(new OperandNode(7.0));
    tree.left().setRight(new OperandNode(2.0));

    tree.setRight(new OperatorNode(Operator.DIVIDE));
    tree.right().setLeft(new OperandNode(8.0));
    tree.right().setRight(new OperandNode(2.0));

    System.out.println("Expression Evaluates To: " + tree.evaluate());
    System.out.println("Infix Representation:    " + tree.infixString());
    System.out.println("Prefix Representation:   " + tree.prefixString());
    System.out.println("Postfix Representation:  " + tree.postfixString());
  }

  
}
