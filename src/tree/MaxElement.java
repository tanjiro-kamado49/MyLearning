package tree;

import tree.common.*;

public class MaxElement{
    static int max_element(Node root){
        int root_val=0,left=0,right=0,max=Integer.MIN_VALUE;
        if(root!=null){
            root_val=root.val;
            left=max_element(root.left);
            right=max_element(root.right);

        }
        if(left<right){
            max=right;
        }
        else{
            max=left;
        }
        if(root_val > max){
            max=root_val;
        }
        return max;
    }
    
    public static void main(String[]args){
        Integer[] arr = {1,2,4,null,3,5,6};
        Node root=Node.createSampleTree(arr);  
        System.out.println("Maximum element in binary tree :"+max_element(root));
    } 
}


