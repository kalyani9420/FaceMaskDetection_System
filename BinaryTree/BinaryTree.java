package BinaryTree;

import java.util.LinkedList;
import java.util.Stack;
import java.util.Queue;


public class BinaryTree {

    private TreeNode root;

    private class TreeNode {
        private int data;
        private TreeNode left;
        private TreeNode right;

        private TreeNode(int data) {
            this.data = data;

        }

    }

    public void createBinaryTree() {
        TreeNode f = new TreeNode(1);
        TreeNode s = new TreeNode(2);
        TreeNode th = new TreeNode(3);
        TreeNode fo = new TreeNode(4);
        TreeNode fi = new TreeNode(5);
        TreeNode si = new TreeNode(6);
        TreeNode se = new TreeNode(7);

        root = f;
        f.left = s;
        f.right = th;
        s.left = fo;
        s.right = fi;
        th.left = si;
        th.right = se;

    }

    // visit root node
    // Traverse left subtree and then right subtree in preorder

    // method call ----- line no ---- root

    public void PreorderRecursive(TreeNode root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        PreorderRecursive(root.left);
        PreorderRecursive(root.right);

    }

    public void PreorderIterative() {
        if (root == null) {
            return;
        }

        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);

        while (!stack.isEmpty()) {
            TreeNode temp = stack.pop();
            System.out.print(temp.data + " ");
            if (temp.right != null) {
                stack.push((temp.right));
            }
            if (temp.left != null) {
                stack.push((temp.left));
            }
        }

    }


    //Visit left subtree 
    // root and then right subtree

        // method call ----- line no ---- root


    public void InorderRecursive(TreeNode root){
        if( root == null){
            return;

        }
        InorderRecursive(root.left);
        System.out.println(root.data+ " ");
        InorderRecursive(root.right);
    }

    public void InorderIterative(){
        if(root == null){
            return;

        }

        Stack <TreeNode> st = new Stack<>();
        TreeNode temp = root;
        while(!st.isEmpty() || temp != null){
            if(temp != null){
                st.push(temp);
                temp = temp.left;
            }
            else{
                temp = st.pop();
                System.out.print(temp.data + " ");
                temp = temp.right;
            }


        }
    }

    public void PostOrderRecursive(TreeNode root){
        if(root == null){
            return;
        }
        PostOrderRecursive(root.left);
        PostOrderRecursive(root.right);
        System.out.print(root.data + " ");

    }

    public void PostorderIterative(){
        TreeNode current = root;
		Stack<TreeNode> stack = new Stack<>();

		while(current != null || !stack.isEmpty()){
			if(current != null){
				stack.push(current);
				current = current.left;
			} else {
				TreeNode temp = stack.peek().right;
				if(temp == null){
					temp = stack.pop();
					System.out.print(temp.data + " ");
					while(!stack.isEmpty() && temp == stack.peek().right){
						temp = stack.pop();
						System.out.print(temp.data + " ");
					}
				} else {
					current = temp;
				}
			}
		}


    }

    public void LevelOrder(TreeNode root){
        if(root == null){
            return;
        }

        Queue <TreeNode> q = new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()){
            TreeNode temp = q.poll();
            System.out.print(temp.data +" ");
            if(temp.left != null){
                q.offer(temp.left);
            }
            if(temp.right != null){
                q.offer(temp.right);
            }
        }
    }

    public int findMaximum(TreeNode root){

        if(root == null){
            return Integer.MIN_VALUE;
        }

        int result = root.data;
        int left = findMaximum(root.left);
        int right = findMaximum(root.right);

        if(left > result){
            result = left;
        }
        
        if(right > result){
            result = right;
        }

        return result;
    }

    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();
        bt.createBinaryTree();
        bt.PreorderRecursive(bt.root);
        System.out.println();
        bt.PreorderIterative();
        System.out.println();
        bt.InorderIterative();
        System.out.println();
        bt.PostOrderRecursive(bt.root);
        System.out.println();
        bt.PostorderIterative();
        System.out.println();
        bt.LevelOrder(bt.root);
        bt.findMaximum(bt.root);
        System.out.println();
        System.out.println(bt.findMaximum(bt.root));



    }
}
