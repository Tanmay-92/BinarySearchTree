package BSTProblems;

public class BinaryTree{
	Node root;
	public BinaryTree() {
		this.root = null;
	}
	public void Add(int data) {
		Node Node1 = new Node(data);

		if (root == null) 
		{
			root = Node1;
			return;
		}
		else {
			Node parent = root;
			Node child = null;
			while (true) {
				child = parent;
				
				if (data < parent.data) {
					parent = parent.left;
					if (parent == null) {
						child.left = Node1;
						return;
					}
				}
				
				else {
					parent = parent.right;
					if (parent == null) {
						child.right = Node1;
						return;
					}
				}
			}
		}
	}

	
	public void Traversing(Node node) {
		if (root == null)
			System.out.println(" Tree is Vacant ");
		else {
			if (node.left != null)
				Traversing(node.left);
			System.out.print(node.data +  "   ");
			if (node.right != null)
				Traversing(node.right);
		}
	}


}