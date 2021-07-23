package BSTProblems;

public class BinaryTreeUC3 {
	NodeUC3 root;
	public BinaryTreeUC3() {
		this.root = null;
	}
	
	public void Add(int data) {
		NodeUC3 Node1 = new NodeUC3(data);

		if (root == null) 
		{
			root = Node1;
			return;
		}
		else {
			NodeUC3 parent = root;
			NodeUC3 child = null;
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
	
	
	public void Traversing(NodeUC3 node) {
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
	public NodeUC3 search(NodeUC3 root, int value) 
	{
		if (root == null || root.data == value)
			return root;

		if (root.data > value)
			return search(root.left, value);

		return search(root.right, value);
	}
	
	public boolean search(int value) {
		
	
		root = search(root, value);
		if (root != null) {
			System.out.println("\n the value exists :");
			return true;
		}
		else {
			System.out.println("\n the value does not exist :");
			return false;
		}

}
}
