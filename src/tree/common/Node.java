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

    public static void main(String[] args) {
    }

}