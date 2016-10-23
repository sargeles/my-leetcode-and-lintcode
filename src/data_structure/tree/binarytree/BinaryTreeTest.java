package data_structure.tree.binarytree;

public class BinaryTreeTest {

	public static void preOrder(BinaryTreeNode root) {
		if (root != null) {
			System.out.print(root.data + "-");
			preOrder(root.left);
			preOrder(root.right);
		}
	}

	public static void inOrder(BinaryTreeNode root) {

		if (root != null) {
			inOrder(root.left);
			System.out.print(root.data + "--");
			inOrder(root.right);
		}
	}

	public static void postOrder(BinaryTreeNode root) {

		if (root != null) {
			postOrder(root.left);
			postOrder(root.right);
			System.out.print(root.data + "---");
		}
	}

	public static void main(String[] args) {
		int[] array = { 12, 76, 35, 22, 16, 48, 90, 46, 9, 40 };
		
		BinaryTreeNode root = new BinaryTreeNode(array[0]); // ����������
		
		for (int i = 1; i < array.length; i++) {
			root.insert(root, array[i]); // ��������в�������
		}
		
		  System.out.println("�ȸ�������");
		  preOrder(root);
		  System.out.println();
		  System.out.println("�и�������");
		  inOrder(root);
		  System.out.println();
		  System.out.println("���������");
		  postOrder(root);
	}

}
