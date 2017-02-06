package treeuptodownlefttoright;
import java.util.LinkedList;
import java.util.Queue;
//题目：从上往下打印二叉树的每个结点，同一层的结点按照从左到右的顺序打印。例如输入下图的二叉树，则一次打印出8，6，10，5，7，9，11.
//     8
//   6    10
// 5  7  9   11
class Node {
    public Node (int v) {
        value = v;
    }
    public int value;
    public Node left;
    public Node right;
}
public class Main {

    public static void main(String[] args) {
        Node root = new Node(8);
        Node a = new Node(6);
        Node b = new Node(10);
        Node c = new Node(5);
        Node d = new Node(7);
        Node e = new Node(9);
        Node f = new Node(11);
        root.left = a;
        root.right = b;
        a.left = c;
        a.right = d;
        b.left = e;
        b.right = f;
        Queue<Node> oneLayer = new LinkedList<>();
        oneLayer.offer(root);
        while (oneLayer.size() > 0) {
            Node current = oneLayer.poll();
            System.out.print(current.value + " ");
            if (current.left != null) {
                oneLayer.offer(current.left);
            }
            if (current.right != null) {
                oneLayer.offer(current.right);
            }
        }
    }
}
