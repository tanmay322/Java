package TreeTraversal;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class traversals {
	
	public static void main(String[] args) {
		Node data = createData();
		levelorderreverse(data);
//		System.out.println("Preorder: ");
//		preorder(data);
//		System.out.println("\nPostorder: ");
//		postorder(data);
//		System.out.println("\nInorder: ");
//		inorder(data);
	}
	
	public static void levelorderreverse(Node n) {
		if (n==null)
			return;
		
		Queue<Node> q = new LinkedList<Node>();
		
		q.add(n);
		
		Stack<Node> s = new Stack<Node>();
		
		while (q.size() > 0) {
			Node t = q.remove();
			
			if(t.right !=null)
				q.add(t.right);
			if(t.left != null)
				q.add(t.left);
			s.push(t);
		}
		while(s.size() > 0)
			System.out.print(s.pop().value + " ");
	}
		
	public static void preorder(Node n) {
		if (n==null)
			return;
		System.out.print(n.value+" ");
		preorder(n.left);
		preorder(n.right);
	}
	
	public static void postorder(Node n) {
		if (n==null)
			return;
		postorder(n.left);
		postorder(n.right);
		System.out.print(n.value+" ");
	}
	public static void inorder(Node n) {
		if (n==null)
			return;
		inorder(n.left);
		System.out.print(n.value+" ");
		inorder(n.right);
	}
		public static Node createData() {
			Node a = new Node ("a");
			Node b = new Node ("b");
			Node c = new Node ("c");
			Node d = new Node ("d");
			Node e = new Node ("e");
			Node f = new Node ("f");
			Node g = new Node ("g");
			
			a.left = b;
			b.left = c;
			c.left = e;
			e.right = f;
			b.right = d;
			a.right = g;
			
			return a; //returning tree structure
			
		}
	}


