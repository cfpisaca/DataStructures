package lab10;

/**
 * Operator nodes are the internal nodes of a binary expression tree.
 * 
 * @author ???
 * @version ???
 */
public class OperatorNode extends ExpressionNode {

  private Operator op;

  public OperatorNode(Operator op) {
    super();
    this.op = op;
  }

  public OperatorNode(Operator op, ExpressionNode left, ExpressionNode right) {
    super(left, right);
    this.op = op;
  }

  /**
   * Evaluate the expression rooted at this node and return the result.
   */
  @Override
  public double evaluate() {
   double dR = right().evaluate();
   double dL = left().evaluate();
   switch (op.opString()) {
   case "+":
      return dL + dR;
   case "-":
      return dL - dR;
   case "*":
      return dL * dR;
   case "/":
      return dL / dR;
   default:
      break;
   }
   return 0;
  }
  
    /**
   * Return a string containing the postfix representation of the expression
   * tree rooted at this node.
   * 
   * For example, the following tree:
   * 
   * <pre>
   *            *
   *           / \
   *          +  2.0
   *         / \
   *       4.0  1.0
   * </pre>
   * 
   * would evaluate to "4.0 1.0 + 2.0 *"
   */
  
  

  @Override
  public String postfixString() {
   String postL = left().postfixString();
   String postR = right().postfixString();
   return postL + " " + postR + " " + op.opString();
  }




  /**
   * Return a string containing the postfix representation of the expression
   * tree rooted at this node.
   * 
   * For example, the following tree:
   * 
   * <pre>
   *            *
   *           / \
   *          +  2.0
   *         / \
   *       4.0  1.0
   * </pre>
   * 
   * 
   * would evaluate to "* + 4.0 1.0 2.0"
   */

  @Override
  public String prefixString() {
   String preL = left().prefixString();
   String preR = right().prefixString();
   return op.opString() + " " + preL + " " + preR;
  }




    /**
   * Return a string containing the postfix representation of the expression
   * tree rooted at this node.
   * 
   * For example, the following tree:
   * 
   * <pre>
   *            *
   *           / \
   *          +  2.0
   *         / \
   *       4.0  1.0
   * </pre>
   * 
   * would evaluate to ((4.0 + 1.0) * 2.0)"
   */

  @Override
  public String infixString() {
   String inL = left().infixString();
   String inR = right().infixString();
   return "(" + inL + " " + op.opString() + " " + inR + ")";
  }
  
}
