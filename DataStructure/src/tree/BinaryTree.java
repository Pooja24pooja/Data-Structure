package tree;
class Node{
	int key;
	Node left,right;
	Node(int value){
		key=value;
		left=right=null;
		
	}
}
public class BinaryTree {
	Node root;
	BinaryTree(int key){
		root=new Node(key);
	}
	BinaryTree(){
		root=null;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTree bt=new BinaryTree();
		bt.root=new Node(5);
		bt.root.left=new Node(2);
		bt.root.right=new Node(6);
		bt.root.left.left=new Node(1);
		bt.root.right.right=new Node(7);
	}

}
