package binaryTree;

public class TreeNode<E> {
    protected E element;
    protected TreeNode<E> right;
    protected TreeNode<E> left;
    TreeNode<E> root;


    public TreeNode(E element) {
        this.element = element;
    }

    public boolean searchBinary(E element) {
        TreeNode<E> current = root;
//        while (current != null) {
//            if (element < current.element) {
//                current = current.left;
//            } else if (element > current.element) {
//                current = current.right;
//            } else {
//                return true;
//            }
//        }
        return false;
    }

    public static void main(String[] args) {
        TreeNode<Integer> root = new TreeNode<Integer>(60);
        root.left = new TreeNode<>(55);
        root.left = new TreeNode<>(100);
    }
}
