package tree;

import java.util.LinkedList;
import java.util.Queue;

public class InorderSearch {
	static class Node{
		int key;
		Node left,right;
		Node(int key){
			this.key=key;
			this.left=null;
			this.right=null;
		}
	}
	static Node root;
	static Node temp=root;
	static void inorder(Node temp) {
		if(temp==null)
			return;
		inorder(temp.left);
		System.out.println(temp.key+" ");
		inorder(temp.right);			
		
	}
	static void insert(Node temp,int key) {
		if (temp == null) {
            root = new Node(key);
            return;
        }
        Queue<Node> q = new LinkedList<Node>();
        q.add(temp);
        while (!q.isEmpty()) {
            temp = q.peek();
            q.remove();
 
            if (temp.left == null) {
                temp.left = new Node(key);
                break;
            }
            else
                q.add(temp.left);
 
            if (temp.right == null) {
                temp.right = new Node(key);
                break;
            }
            else
                q.add(temp.right);
        }
    }
 


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		root = new Node(100);
        root.left = new Node(121);
        root.left.left = new Node(65);
        root.right = new Node(45);
        root.right.left = new Node(20);
        root.right.right = new Node(5);
 
        System.out.print(
            "Inorder traversal before insertion:");
        inorder(root);
 
        int key = 10;
        insert(root, key);
 
        System.out.print(
            "\nInorder traversal after insertion:");
        inorder(root);

	}

}
