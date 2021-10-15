package tree;

import tree.common.*;
import java.util.*;

public class inorder {
	public static void inoder_withoutrecurr(Node root) {
		Stack<Node>s=new Stack<>();
		Node node=root;
		while(true) {
			while(node!=null) {
				s.push(node);
				node=node.left;
			}
			if(s.isEmpty())
				break;
			node=s.pop();
			System.out.print(" "+node.val);
			node=node.right;
		}
	}
	public static void main(String []args) {
		Integer[]arr= {1,4,5,6,7,null,null};
		Node root = Node.createSampleTree(arr);
		System.out.println("Non Recursive Inoder Traversal: ");
		inoder_withoutrecurr(root);
		
		
	}
	

}
