package linkedlist;

import java.util.LinkedList;
import java.util.Scanner;

public class TakeInput {
    public static Node<Integer> takeInput() {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        Node<Integer> head = null,tail = null;
        while (num != -1) {
//            System.out.println(head.data+" "+head.next);
            Node<Integer> currentNode = new Node<>(num);
            if(head==null){
                //make this node as head node
            head = currentNode;
            tail = currentNode;
            }else{
                //Making our time complexity of n square
//                Node<Integer>tail = head;
//                while(tail.next != null){
//                    tail = tail.next;
//                }
                tail.next = currentNode;
                tail = tail.next;
            }
                num = s.nextInt();
        }
        return head;
    }

    public static void main(String[] args) {
        Node<Integer> head = takeInput();
        while(head!=null){
            System.out.print(head.data+" ");
            head = head.next;
        }
    }
}
