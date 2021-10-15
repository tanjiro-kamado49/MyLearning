package tree;
import java.util.*;

import tree.common.*;

public class preorder {
  public static void preorder_withoutrecurr(Node root){
	  Stack<Node>s=new Stack<>();
	  while(true) {
		  while(root!=null) {
			  System.out.print(" "+root.val);
			  s.push(root);
			  root=root.left;
			  
		  }
		  if(s.isEmpty()) {
			  break;
		  }
		  root=s.pop();
		  root=root.right;
	  }
  }
  public static void main(String []args) {
	 Integer[] arr = {1,2,4,null,3,5,6};  
      Node root=Node.createSampleTree(arr);
      System.out.println("Non Recursive Preorder Traversal: ");
      preorder_withoutrecurr(root);
      
  }
  
}
