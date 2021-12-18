package com.company;

public class SearchinBST {
    public static void main(String []args){
        Node root=new Node(50);
        root.left=new Node(30);
        root.right=new Node(60);
        root.left.left=new Node(20);
        root.right.right=new Node(70);
     int x=20;
       System.out.print(SerchBst(root,x));

    }
    static  boolean SerchBst(Node root,int x){
          if (root==null) {
              return false;
          }else if (root.key==x){
              return true;
          }else if (root.key>x){
              return SerchBst(root.left,x);
          }else
            return   SerchBst(root.right,x);




    }
}
