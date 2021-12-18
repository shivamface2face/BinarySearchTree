package com.company;

public class CeilinBST {
    public static void main(String[] args) {
        Node root=new Node(50);
        root.left=new Node(30);
        root.right=new Node(60);
        root.left.left=new Node(20);
        root.right.right=new Node(70);
        int x=45;
        Node ans= CeilBST(root,x);
        System.out.println(ans.key);
    }

    private static Node CeilBST(Node root,int x) {
        Node res=null;
        while (root!=null){
            if (root.key==x){
                return root;
            }else if (root.key<x){
                root=root.right;
            }else {
                res=root;
                root=root.left;
            }
        }

        return res;
    }
}
