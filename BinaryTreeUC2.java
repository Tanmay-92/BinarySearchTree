package BSTProblems;

public class BinaryTreeUC2 {

	NodeUC2 root;
	public BinaryTreeUC2() {
		this.root = null;
	}
	
	public void Add(int data) {
		NodeUC2 Node1 = new NodeUC2(data);

		if (root == null) 
		{
			root = Node1;
			return;
		}
		else {
			NodeUC2 parent = root;
			NodeUC2 child = null;
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

	
	public void Traversing(NodeUC2 node) {
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
