import java.util.LinkedList;
import java.util.Queue;

public class BinarytreeAll {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data =data;
            this.left = null;
            this.right = null;
        }
    }
    static class BinaryTree{
        static int idx = -1;
        public static Node buildTree(int node[]){
            idx++;
            if(node[idx] == -1){
                return null;
            }
            Node newNode = new Node(node[idx]);
            newNode.left = buildTree(node);
            newNode.right = buildTree(node);
            return newNode;
        }
        public static void preOrder(Node root){
            if(root == null){
                System.out.print(" -1 ");
                return;
            }
            System.out.print(" "+root.data+" ");
            preOrder(root.left);
            preOrder(root.right);
        }
        public static void inOrder(Node root){
            if(root == null){
                return;
            }
            inOrder(root.left);
            System.out.print(root.data+" ");
            inOrder(root.right);
        }
        public static void postOrder(Node root){
            if(root == null){
                return;
            }
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.data+" ");
        }
        public static void levelOrder(Node root){
            if(root == null){
                return;
            }
            Queue<Node> q = new LinkedList<>();
            q.add(root);
            q.add(null);
            while(!q.isEmpty()){
                Node current = q.remove();
                if(current == null){
                    System.out.println();
                    if(q.isEmpty()){
                        break;
                    }else{
                        q.add(null);
                    }
                }else{
                    System.out.print(current.data+" ");
                    if(current.left != null){
                        q.add(current.left);

                    }
                    if(current.right != null){
                        q.add(current.right);
                    }
                }
            }
        }
    }
    public static int height(Node root){
        if(root == null){
            return 0;
        }
        int lh = height(root.left);
        int rh = height(root.right);
        return Math.max(lh,rh)+1;
    }

    public static int count(Node root){
        if(root == null){
            return 0;
        }
        int leftCount = count(root.left);
        int rightCount = count(root.right);
        return leftCount + rightCount+1;
    }
    public static int sum(Node root){
        if(root == null){
            return 0;
        }
        int leftSum = sum(root.left);
        int rightSum = sum(root.right);
        return leftSum+rightSum+root.data;
    }
    public static int diameter(Node root){
        if(root == null){
            return 0;
        }
        int leftDiam = diameter(root.left);
        int lh = height(root.left);
        int rightDiam = diameter(root.right);
        int rh = height(root.right);

        int selfDiam = lh + rh + 1;
        return Math.max(selfDiam, Math.max(leftDiam, rightDiam));

    }

    static class Info{
        int diam;
        int ht;
        public Info(int diam, int ht){
            this.diam = diam;
            this.ht = ht;
        }
    }
    public static Info diameter2(Node root){
        if(root == null){
            return new Info(0,0);
        }

        Info leftInfo = diameter2(root.left);
        Info rightInfo = diameter2(root.right);
        int diam = Math.max(Math.max(leftInfo.diam, rightInfo.diam),leftInfo.ht+rightInfo.ht+1);
        int finalHt = Math.max(leftInfo.ht, rightInfo.ht)+1;
        return new Info(diam,finalHt);
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        System.out.println(height(root));
        System.out.println(count(root));
        System.out.println(sum(root));
        System.out.println(diameter2(root).ht);
    }
}
