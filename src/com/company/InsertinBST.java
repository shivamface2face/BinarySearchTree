package com.company;

public class InsertinBST {

    public static void main(String[] args) {
        Node root=new Node(50);
        root.left=new Node(30);
        root.right=new Node(60);
        root.left.left=new Node(20);
        root.right.right=new Node(70);
        int x=25;
        InsrtBst(root,x);
        ShowTreeData(root);
    }

    static void ShowTreeData(Node root) {
        if (root==null){
            return;
        }
        System.out.println(root.key);
        ShowTreeData(root.left);
        ShowTreeData(root.right);

    }


    static Node InsrtBst(Node root, int x) {
        if (root==null){
            return new Node(x);
        }else if (root.key>x){
            root.left=InsrtBst(root.left,x);
        }else {
            root.right=InsrtBst(root.right,x);
        }
        return root;
    }
}
