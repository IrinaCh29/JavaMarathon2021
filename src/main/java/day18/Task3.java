package day18;

public class Task3 {
    public static void main(String[] args) {


        Node root = new Node(20);
        int[] numbers = {14, 23, 11, 16, 22, 27, 5, 15, 18, 24, 150, 8};

        for (int number : numbers) {
            addNode(number, root);
        }

        dfs(root);
    }

    public static void addNode(int value, Node root){
        if (root == null){
            throw new IllegalArgumentException("Корень дерева пустым не может быть");
        }
        Node nextNode = root;
        Node current = null;

        // всегда в цикле выполняется одна итерация и выход, и в рамках итерации проверяем в какой узел дерева идем
        while (nextNode != null){
            current = nextNode;

            if (value < current.getValue()){
                nextNode = current.getNodeLeft();
            }
            else {
                nextNode = current.getNodeRight();
            }
        }
        // находимся на листочке -> новый узел взависимости в каом направлении идем
        if (value < current.getValue()){
            current.setNodeLeft(new Node(value));
        }
        else
            current.setNodeRight(new Node(value));
    }

    private static void dfs(Node root){
        if (root == null){
            return;
        }
        dfs(root.getNodeLeft());
        System.out.print(root.getValue() + " ");
        dfs(root.getNodeRight());
    }
}
class Node {
    private int value;
    private Node nodeLeft;
    private Node nodeRight;

    public Node(int value){
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Node getNodeLeft() {
        return nodeLeft;
    }

    public void setNodeLeft(Node nodeLeft) {
        this.nodeLeft = nodeLeft;
    }

    public Node getNodeRight() {
        return nodeRight;
    }

    public void setNodeRight(Node nodeRight) {
        this.nodeRight = nodeRight;
    }
}