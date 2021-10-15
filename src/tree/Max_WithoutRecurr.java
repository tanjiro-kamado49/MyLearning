package tree;

import tree.common.*;
import java.util.*;
 public class Max_WithoutRecurr{

    public static void main(String [] args){ 
        Integer[] arr = {1,2,4,null,3,5,6};
        
        Node root=Node.createSampleTree(arr);
        System.out.println("test");
        Queue<Node> q=new LinkedList<>();
        q.add(root);
        int max=Integer.MIN_VALUE;
        while(!q.isEmpty()){
            Node temp=q.remove();
//            System.out.println("test+"+temp.val);
            if(max<temp.val){
                max=temp.val;
            }
            if(temp.left!=null){
                q.add(temp.left);

            }
            if(temp.right!=null){
                q.add(temp.right);

            }
        }
        System.out.println("Maximum Element is : "+max);

    }
 }
