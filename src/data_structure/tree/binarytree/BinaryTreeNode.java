package data_structure.tree.binarytree;

public class BinaryTreeNode {
	int data;
	BinaryTreeNode left;
	BinaryTreeNode right;
	
	public BinaryTreeNode(int data)
	{
		this.data=data;
		this.left=null;
		this.right=null;
	}
	
	public void insert(BinaryTreeNode root,int data){
		if(data>root.data)
		{
			if(root.right==null)
			{
				root.right=new BinaryTreeNode(data);
			}
			else
			{
				this.insert(root.right, data);
			}
		}
		else
		{
			if(root.left==null)
			{
				root.left=new BinaryTreeNode(data);
			}
			else
			{
				this.insert(root.left,data);
			}
		}
	}
	
	
}
