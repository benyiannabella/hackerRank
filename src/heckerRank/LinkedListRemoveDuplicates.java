package heckerRank;

import java.util.Scanner;

class LLNode{
    int data;
    LLNode next;

    public LLNode(int data){
        this.data = data;
        next = null;
    }
}
public class LinkedListRemoveDuplicates {

    public static LLNode removeDuplicates(LLNode head) {
        LLNode current = head, nextN = null, temp =null;
        while(current!=null){
            temp=current;
            nextN = current.next;
            while(nextN!=null){
                if(current.data== nextN.data){
                    temp.next = nextN.next;
                } else {
                    temp = nextN;
                }
                nextN = nextN.next;
            }
            current = current.next;
        }
        return head;
    }

    public static  LLNode insert(LLNode head,int data)
    {
        LLNode p=new LLNode(data);
        if(head==null)
            head=p;
        else if(head.next==null)
            head.next=p;
        else
        {
            LLNode start=head;
            while(start.next!=null)
                start=start.next;
            start.next=p;

        }
        return head;
    }

    public static void display(LLNode head)
    {
        LLNode start=head;
        while(start!=null)
        {
            System.out.print(start.data+" ");
            start=start.next;
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        LLNode head=null;
        int T=sc.nextInt();
        while(T-->0){
            int ele=sc.nextInt();
            head=insert(head,ele);
        }
        head=removeDuplicates(head);
        display(head);

    }
}


