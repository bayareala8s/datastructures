package com.bayareala8s.BinaryTree;
public class BinaryTree {
	private Node root;

	public BinaryTree() {
		root = null;
	}

	//NLR: Visit Node, Left SubTree, Right SubTree
	public void preorder() {
		preorder(root);
		System.out.println();
	}

	private void preorder(Node root) {
		if(root==null)
			return;

		Node p = root;

		System.out.print(p.info + " ");
		preorder(p.lchild);
		preorder(p.rchild);
	}

	//LNR: Left SubTree, Visit Node, Right SubTree
	public void inorder() {

		inorder(root);
		System.out.println();
	}

	private void inorder(Node root) {

		if(root==null)
			return;

		Node p = root;

		inorder(p.lchild);
		System.out.print(p.info+ " ");
		inorder(p.rchild);
	}

	//LNR: Left SubTree, Right SubTree, Visit Node
	public void postorder() {
		postorder(root);
		System.out.println();
	}

	private void postorder(Node root) {

		if(root==null)
			return;

		Node p = root;

		postorder(p.lchild);
		postorder(p.rchild);
		System.out.print(p.info + " ");
    }


    //Visit node at each level
	public void levelOrder() {

		if(root == null) {
			System.out.println("Tree is empty");
			return;
		}

		QueueA q = new QueueA(20);
		q.enqueue(root);

		Node p;
		while(!q.isEmpty()) {

			p = q.dequeue();
			System.out.print(p.info + " ");

			if(p.lchild != null)
				q.enqueue(p.lchild);
			if(p.rchild != null)
				q.enqueue(p.rchild);
		}
		System.out.println();		
	}

	public int height() {

		return height(root);
	}

	private int height(Node root) {

		if(root == null)
			return 0;

		Node p = root;

		int hl = height(p.lchild);
		int hr = height(p.rchild);

		if(hl > hr)
			return 1 + hl;
		else
			return 1 + hr;
	}

	public void display() {

		display(root, 0);
		System.out.println();

	}

	private void display(Node root, int level) {

		int i;

		if(root == null)
			return;

		Node p = root;

		display(p.rchild, level + 1);
		System.out.println();

		for(i = 0; i<level;i++) {
			System.out.print("     ");
		}

		System.out.print(p.info);

		display(p.lchild, level + 1);
	}

	public void createTree() {

		root = new Node('P');
		root.lchild = new Node('Q');
		root.rchild = new Node('R');
		root.lchild.lchild = new Node('A');
		root.lchild.rchild = new Node('B');
		root.rchild.lchild = new Node('X');
	}

}



