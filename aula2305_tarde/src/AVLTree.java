public class AVLTree {
    private class Node {
        int key, height;
        Node left, right;

        Node(int k) { key = k; height = 1; }
    }

    private Node root;

    private int height(Node n) {
        return n == null ? 0 : n.height;
    }

    private int balance(Node n) {
        return n == null ? 0 : height(n.left) - height(n.right);
    }

    private void updateHeight(Node n) {
        n.height = 1 + Math.max(height(n.left), height(n.right));
    }

    private Node rightRotate(Node y) {
        Node x = y.left;
        y.left = x.right;
        x.right = y;
        updateHeight(y);
        updateHeight(x);
        return x;
    }

    private Node leftRotate(Node x) {
        Node y = x.right;
        x.right = y.left;
        y.left = x;
        updateHeight(x);
        updateHeight(y);
        return y;
    }

    public void inserir(int key) {
        root = inserir(root, key);
    }

    private Node inserir(Node node, int key) {
        if (node == null) return new Node(key);

        if (key < node.key) node.left = inserir(node.left, key);
        else if (key > node.key) node.right = inserir(node.right, key);
        else return node;

        updateHeight(node);
        int bal = balance(node);

        if (bal > 1 && key < node.left.key) return rightRotate(node);
        if (bal < -1 && key > node.right.key) return leftRotate(node);
        if (bal > 1 && key > node.left.key) {
            node.left = leftRotate(node.left);
            return rightRotate(node);
        }
        if (bal < -1 && key < node.right.key) {
            node.right = rightRotate(node.right);
            return leftRotate(node);
        }
        return node;
    }

    public void remover(int key) {
        root = remover(root, key);
    }

    private Node remover(Node node, int key) {
        if (node == null) return null;

        if (key < node.key) node.left = remover(node.left, key);
        else if (key > node.key) node.right = remover(node.right, key);
        else {
            if (node.left == null) return node.right;
            else if (node.right == null) return node.left;

            Node min = minValueNode(node.right);
            node.key = min.key;
            node.right = remover(node.right, min.key);
        }

        updateHeight(node);
        int bal = balance(node);

        if (bal > 1 && balance(node.left) >= 0) return rightRotate(node);
        if (bal > 1 && balance(node.left) < 0) {
            node.left = leftRotate(node.left);
            return rightRotate(node);
        }
        if (bal < -1 && balance(node.right) <= 0) return leftRotate(node);
        if (bal < -1 && balance(node.right) > 0) {
            node.right = rightRotate(node.right);
            return leftRotate(node);
        }
        return node;
    }

    private Node minValueNode(Node n) {
        while (n.left != null) n = n.left;
        return n;
    }

    public void imprimirEmOrdem() {
        imprimirEmOrdem(root);
        System.out.println();
    }

    private void imprimirEmOrdem(Node n) {
        if (n != null) {
            imprimirEmOrdem(n.left);
            System.out.print(n.key + " ");
            imprimirEmOrdem(n.right);
        }
    }
}