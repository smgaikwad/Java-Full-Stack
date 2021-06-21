package tree;

import java.util.Scanner;

public class BinaryTreeApp {
    public static void main(String[] args) {
        System.out.println("### Binary Tree Implementation ###");
        Node root = createTree();

        System.out.println("inorder Traversal: ");
        inorderTraversal(root);

        System.out.println();
        System.out.println("Preorder Traversal: ");
        preorderTraversal(root);

        System.out.println();
        System.out.println("postorder Traversal: ");
        postorderTraversal(root);
    }

    private static void postorderTraversal(Node root) {
        if(root == null) return;
        postorderTraversal(root.left);
        postorderTraversal(root.right);
        System.out.print(" " + root.data);
    }

    private static void preorderTraversal(Node root) {
        if(root == null) return;

        System.out.print(" " + root.data);
        preorderTraversal(root.left);
        preorderTraversal(root.right);
    }

    private static void inorderTraversal(Node root) {
        if(root == null)
            return;
        inorderTraversal(root.left);
        System.out.print(" " + root.data);
        inorderTraversal(root.right);
    }

    private static Node createTree() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter data: ");
        int data = sc.nextInt();

        if (data == -1)
            return null;
        Node root = new Node(data);

        System.out.println("Enter left child of : "+ data);
        root.left = createTree();

        System.out.println("Enter right child of : "+ data);
        root.right = createTree();

        return root;
    }


}
