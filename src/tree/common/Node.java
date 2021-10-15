package tree.common;

import java.util.*;

public class Node {
    public int val;
    public Node left;
    public Node right;

    public Node(int data) {
        this.val = data;
    }

    public static Node insert(Node root, Integer[] arr) {
        int count = 0;
        if (root == null) {
            root = new Node(arr[count++]);
        }
        List<Node> q = new ArrayList<>();
        q.add(root);
        while (count < arr.length) {
            Node n = q.remove(0);
            if (n != null) {
                if (n.left == null) {
                    if (arr[count] != null) {
                        n.left = new Node(arr[count++]);
                    } else {
                        count++;
                    }
                }
                q.add(n.left);
                if (n.right == null && count < arr.length) {
                    if (arr[count] != null) {
                        n.right = new Node(arr[count++]);
                    } else {
                        count++;
                    }
                }
                q.add(n.right);
            }
        }
        q=null;
        return root;
    }

    public static Node createSampleTree(Integer[] arr) {
        if (arr.length < 1)
            return null;
        Node root = null;
        root = insert(root, arr);
        return root;
    }
    public static void preorder(Node root) {
    	if(root!=null) {
    		System.out.print(" "+root.val);
    		preorder(root.left);
    		preorder(root.right);
    	}
    }
    public static void inorder(Node root) {
    	if(root!=null) {
    		inorder(root.left);
    		System.out.print(" "+root.val);
    		inorder(root.right);
    	}
    }
    public static void postorder(Node root) {
    	if(root!=null) {
    		postorder(root.left);
    		postorder(root.right);
    		System.out.print(" "+root.val);
    	}
    }
    public static void levelorder(Node root) {
    	Node temp=null;
    	List<Node> q= new ArrayList<>();
    	q.add(root);
    	while(!q.isEmpty()) {
    		temp=q.remove(0);
    		System.out.print(" "+temp.val);
    		if(temp.left!=null) {
    			q.add(temp.left);
    		}
    		if(temp.right!=null) {
    			q.add(temp.right);
    		}
    		
    	}
    }

    public static void main(String[] args) {
    }

}