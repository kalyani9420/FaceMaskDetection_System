package BinaryTree;

//faster search and insertion
//node's left subtree always lesser and right subtree is always greater
public class BinarySearchTree {
	private TreeNode root;

	private class TreeNode {
		private int data; // Generic type
		private TreeNode left;
		private TreeNode right;

		public TreeNode(int data) {
			this.data = data;
		}
	}

	public void insert(int value){
		root = insert(root, value);
	}

	public TreeNode insert(TreeNode root, int value) {
		if (root == null) {
			root = new TreeNode(value);
			return root;

		}
		if (value < root.data) {
			root.left = insert(root.left, value);

		} else {
			root.right = insert(root.right, value);

		}
		return root;

	}

	public void inorder(){
		inorder(root);
	}

	public void inorder(TreeNode root){
		if(root == null){
			return;
		}
		inorder(root.left);
		System.out.print(root.data +" ");
		inorder(root.right);


	}

	public TreeNode search(int key){
		return search(root , key);
	}

	public TreeNode search(TreeNode root , int key){
		if(root == null || root.data == key){
			return root;
		}
		if(key < root.data){
			return search(root.left, key);
		}
		else{
			return search(root.right, key);

		}
	}

	public boolean isValid(){
		return isValid(root, Long.MIN_VALUE, Long.MAX_VALUE);
	}

	boolean isValid(TreeNode root , long min , long max){
		if(root == null){
			return true;
		}
		if(root.data <= min || root.data >= max ){
			return false;
		}

		boolean left = isValid(root.left, min, root.data);
		if(left){
			boolean right = isValid(root.right, root.data, max);
			return right;
		}

		return false;
	}

	public static void main(String[] args) {
		BinarySearchTree bst = new BinarySearchTree();
		// bst.insert(5);
		// bst.insert(6);
		// bst.insert(2);
		// bst.insert(1);
		// bst.insert(10);
		// bst.insert(8);
		// bst.insert(4);
		// bst.insert(3);
		// bst.insert(12);
		bst.insert(18);
		bst.insert(10);
		bst.insert(6);
		bst.insert(1);
		bst.insert(7);

		

		bst.inorder();

		System.out.println( bst.isValid());

		// TreeNode flag = bst.search(8);
		// System.out.println(flag.data);

		// if(bst.search(100) != null){
		// 	System.out.println("Key found");
		// }
		// else{
		// 	System.out.println("Key not found");
		// }


		


	}

 

	}





