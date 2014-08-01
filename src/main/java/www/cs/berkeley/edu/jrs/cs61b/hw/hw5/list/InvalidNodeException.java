package www.cs.berkeley.edu.jrs.cs61b.hw.hw5.list;/* InvalidNodeException.java */


/**
 *  Implements an Exception that signals an attempt to use an invalid ListNode.
 */

public class InvalidNodeException extends Exception {
  protected InvalidNodeException() {
    super();
  }

  protected InvalidNodeException(String s) {
    super(s);
  }
}
