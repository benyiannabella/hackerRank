package heckerRank;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Node2{
    Node2 left,right;
    int data;
    Node2(int data){
        this.data=data;
        left=right=null;
    }
}
public class BSTLevelOrder {

    static void levelOrder(Node2 root){
        Queue<Node2> myQ = new LinkedList<>();

        if(root != null){
            myQ.add(root);
            while (!myQ.isEmpty()){
                Node2 temp = myQ.poll();
                System.out.print(temp.data + " ");
                if(temp.left!=null){
                    myQ.add(temp.left);
                }
                if(temp.right!=null){
                    myQ.add(temp.right);
                }
            }
        }

    }
    public static Node2 insert(Node2 root,int data){
        if(root==null){
            return new Node2(data);
        }
        else{
            Node2 cur;
            if(data<=root.data){
                cur=insert(root.left,data);
                root.left=cur;
            }
            else{
                cur=insert(root.right,data);
                root.right=cur;
            }
            return root;
        }
    }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        Node2 root=null;
        while(T-->0){
            int data=sc.nextInt();
            root=insert(root,data);
        }
        levelOrder(root);
    }
}