package linkedlist;

import java.util.ArrayList;

public class LinkedListUse {

    //Following function takes head of ll as a reference and returns head of ll
    public static Node<Integer> createLinkedList() {
        Node<Integer> n1 = new Node<>(10);
        Node<Integer> n2 = new Node<>(20);
        Node<Integer> n3 = new Node<>(30);
        Node<Integer> n4 = new Node<>(20);
        Node<Integer> n5 = new Node<>(10);
//        Node<Integer> n6 = new Node<>(10);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
//        n5.next = n6;
        return n1;
    }

    public static void incrementLinkedList(Node<Integer> head) {
        Node<Integer> temp = head;
        while (temp != null) {
            temp.data++;
            temp = temp.next;
        }
    }

    public static void printIthNode(Node<Integer> head, int i) {
        Node<Integer> temp = head;
        int count = 0;
        while (temp != null) {
            if (i == count) {
                System.out.println(temp.data);
            }
            count++;
            temp = temp.next;
        }
    }

    public static int findNode(Node<Integer> head, int n) {
        Node<Integer> temp = head;
        int count = 0;
        while (temp != null) {
            if (temp.data == n) {
                return count;
            }
            temp = temp.next;
            count++;
        }
        return -1;
    }

    public static void print(Node<Integer> head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }

    public static int length(Node<Integer> head) {
        int count = 0;
        Node<Integer> temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
//        System.out.println(count);
        return count;
    }

    public static Node<Integer> insert(Node<Integer> head, int pos, int data) {
        Node<Integer> temp = head;
        Node<Integer> insertNode = new Node<>(data);
        int curIndex = 0;
        if (pos == 0) {
            insertNode.next = head;
            head = insertNode;
            return head;
        }
        for (int i = 1; i < pos; i++) {
            temp = temp.next;
        }

        if (temp == null) {
            return head;
        }
        insertNode.next = temp.next;
        temp.next = insertNode;
        return head;
    }

    public static Node<Integer> deleteNode(Node<Integer> head, int pos) {
        // Write your code here.
        Node<Integer> temp = head;
        if (pos == 0) {
            head = temp.next;
            return head;
        }
        for (int i = 1; i < pos; i++) {
            temp = temp.next;
        }
        Node<Integer> a = temp;
        Node<Integer> b = a.next;
        Node<Integer> c = b.next;
        temp.next = c;
        return head;
    }

    public static Node<Integer> appendLastNToFirst(Node<Integer> head, int n) {
        int count = 0;
        Node<Integer> temp = head;
        Node<Integer> firstNode = head;
        Node<Integer> lastNode = head;

        while (temp != null) {
            count++;
            if (temp.next == null) {
                lastNode = temp;
            }
            temp = temp.next;

        }
        Node<Integer> temp2 = head;
        if (n == 0 || n == count) {
            return head;
        }
        for (int i = 1; i < count - n; i++) {
            temp2 = temp2.next;
        }

        Node<Integer> currentNode = temp2.next;

        head = currentNode;
        lastNode.next = firstNode;
        temp2.next = null;
        return head;
    }

    public static Node<Integer> removeDuplicates(Node<Integer> head) {
        Node<Integer> t1 = head;
        Node<Integer> t2 = t1.next;
        while (t2 != null) {
            if (t1.data.equals(t2.data)) {
                t2 = t2.next;
                if (t2 == null) {
                    t1.next = null;
                }
            } else {
                t1.next = t2;
                t1 = t2;
                t2 = t2.next;
            }
        }
        return head;
    }

    public static void printReverseWithRecurssion(Node<Integer> head) {
        Node<Integer> root = head;
        if (root == null) {
            return;
        }
        printReverseWithRecurssion(root.next);
        System.out.print(root.data + " ");
    }

    public static boolean isPalindrome(Node<Integer> head) {
        boolean isPal = false;
        ArrayList<Integer> arr = new ArrayList<>();
        int count = length(head);
        if (count == 0) {
            return true;
        }
        Node<Integer> temp = head;
        for (int i = 0; i < count / 2; i++) {
            arr.add(temp.data);
            temp = temp.next;
        }
        if (count % 2 != 0) {
            temp = temp.next;
        }
        for (int j = arr.size() - 1; j >= 0; j--) {
            if (arr.get(j) == temp.data) {
                isPal = true;
                temp = temp.next;
            } else {
                return false;
            }
        }
        return isPal;
    }

    public static void main(String[] args) {
        //Creating head of linked list
        Node<Integer> head = createLinkedList();
//        System.out.println(head);
//        incrementLinkedList(head);
//        System.out.println(head);
        print(head);
        System.out.println();
//        head = insert(head,2,56);
//        head = deleteNode(head, 4);
//        int index = findNode(head,310);
//        print(head);
//        head = appendLastNToFirst(head,5);
//        head = removeDuplicates(head);
//        print(head);
//        printReverseWithRecurssion(head);
        System.out.println(isPalindrome(head));

//        System.out.println();
//        length(head);
//        printIthNode(head,3);
    }
}
