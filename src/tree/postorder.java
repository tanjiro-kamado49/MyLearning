package tree;
import java.util.*;

import tree.common.*;
public class postorder {
	 public static void postoder_withoutrecurr(Node root) {
		 Stack<Node>s=new Stack<>();
		 Node prev=null;
		 do {
			 while(root!=null) {
				 s.push(root);
				 root=root.left;
			 }
			 while(root==null && !s.isEmpty()) {
				 root=s.peek();
				 if(root.right==null || root.right==prev) {
					System.out.print(" "+root.val);
					s.pop();
					prev=root;
					root=null;
				 }
				 else {
					 root=root.right;
				 }
			 }
		 }while(!s.isEmpty());
		 
	 }
	 public static void main(String[]args) {
		 Integer[] arr = {1,2,4,null,3,5,6};  
	      Node root=Node.createSampleTree(arr);
	      System.out.println("Non Recursive Postorder Traversal: ");
	      postoder_withoutrecurr(root);
		 
	 }

}
