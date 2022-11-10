package linkedlist;

import java.util.ArrayList;

public class LinkedListUse {

    //Following function takes head of ll as a reference and returns head of ll
    public static Node<Integer> createLinkedList() {
        Node<Integer> n1 = new Node<>(10);
        Node<Integer> n2 = new Node<>(41);
        Node<Integer> n3 = new Node<>(22);
        Node<Integer> n4 = new Node<>(75);
        Node<Integer> n5 = new Node<>(99);
        Node<Integer> n6 = new Node<>(100);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = n6;
        return n1;
    }

    public static Node<Integer> createLinkedList2() {
        Node<Integer> n1 = new Node<>(3);
        Node<Integer> n2 = new Node<>(8);
        Node<Integer> n3 = new Node<>(8);
        Node<Integer> n4 = new Node<>(35);
//        Node<Integer> n5 = new Node<>(100);
//        Node<Integer> n6 = new Node<>(10);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
//        n4.next = n5;
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

    public static void printR(Node<Integer> head) {
        if (head == null) {
            return;
        }
        //To print in same order place print statement above recursion call
        System.out.print(head.data + " ");
//        head = head.next;
        printR(head.next);
        //To print in reverse order place print statement below recursion call
        System.out.print(head.data + " ");
    }

    public static Node<Integer> insertRecursively(Node<Integer> head, int pos, int val) {
        //For pos values greater than length of list
        if (head == null && pos > 0) {
            return head;
        }
        //For inserting at starting position
        if (pos == 0) {
            Node<Integer> newNode = new Node<>(val);
            newNode.next = head;
            head = newNode;
            return head;
        } else {
            pos = pos - 1;
            Node<Integer> h = insertRecursively(head.next, pos, val);
            head.next = h;
            return head;
        }
//            head = h;
    }

    public static Node<Integer> deleteRecursively(Node<Integer> head, int pos) {
        if (head == null) {
            return head;
        }
        if (pos == 0) {
            head = head.next;
            return head;
        }
        Node<Integer> h = deleteRecursively(head.next, pos - 1);
        head.next = h;
        return head;
    }

    public static Node<Integer> reverseLinkedList(Node<Integer> head) {
        if (head == null || head.next == null) {
            return head;
        }

        Node<Integer> n = reverseLinkedList(head.next);
        Node<Integer> tail = n;
        while (tail.next != null) {
            tail = tail.next;
        }
        tail.next = head;
        head.next = null;
        head = n;
        return head;
    }

    public static DoubleNode reverseLinkedListWithObject(Node<Integer> head) {
        DoubleNode ans;
        if (head == null || head.next == null) {
            ans = new DoubleNode();
            ans.head = head;
            ans.tail = head;
            return ans;
        }
        DoubleNode ansSmall = reverseLinkedListWithObject(head.next);
        ansSmall.tail.next = head;
        head.next = null;
        ans = new DoubleNode();
        ans.head = ansSmall.head;
        ans.tail = head;
        return ans;
    }

    public static Node<Integer> getHead(Node<Integer> head) {
        DoubleNode ans = reverseLinkedListWithObject(head);
        return ans.head;
    }

    public static Node<Integer> reverseRecursivelyLinkedListBest(Node<Integer> head) {
        if (head == null || head.next == null) {
            return head;
        }
        Node<Integer> h = reverseRecursivelyLinkedListBest(head.next);
        Node<Integer> t = head.next;
        t.next = head;
        head.next = null;
        return h;
    }

    public static int calculateMidOfLinkedList(Node<Integer> head) {
        Node<Integer> slow = head;
        Node<Integer> fast = head;

        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        int mid = slow.data;
        return mid;
    }

    public static Node<Integer> merge(Node<Integer> head1, Node<Integer> head2) {
        Node<Integer> t1 = head1;
        Node<Integer> t2 = head2;
        Node<Integer> head = null;
        Node<Integer> tail = null;
        if (head1 == null) {
            return head2;
        }

        if (head2 == null) {
            return head1;
        }

        if (t1.data <= t2.data) {
            head = t1;
            tail = t1;
            t1 = t1.next;
        } else {
            head = t2;
            tail = t2;
            t2 = t2.next;
        }

        while (t1 != null && t2 != null) {
            if (t1.data <= t2.data) {
                tail.next = t1;
                tail = t1;
                t1 = t1.next;
            } else {
                tail.next = t2;
                tail = t2;
                t2 = t2.next;
            }
        }
        if (t1 == null) {
            tail.next = t2;
        } else {
            tail.next = t1;
        }

        return head;
    }

    public static int findNodeRec(Node<Integer> head, int n) {

        Node<Integer> temp = head;

        if (temp == null) {
            return -1;
        }
        if (temp.data.equals(n)) {
            return 0;
        }
        int result = findNodeRec(head.next, n);
        if (result == -1) {
            return -1;
        }
        return result + 1;
    }

    public static Node<Integer> evenAfterOdd(Node<Integer> head) {
        Node<Integer> temp = head;
        ArrayList<Integer> oddArr = new ArrayList<>();
        ArrayList<Integer> evenArr = new ArrayList<>();

        if (temp == null) {
            return null;
        }

        while (temp != null) {
            if (temp.data % 2 == 0) {
                evenArr.add(temp.data);
                temp = temp.next;
            } else {
                oddArr.add(temp.data);
                temp = temp.next;
            }
        }

        Node<Integer> h;
        if (oddArr.size() != 0) {
            h = new Node<>(oddArr.get(0));
            head = h;
            for (int i = 1; i < oddArr.size(); i++) {
                h.next = new Node<>(oddArr.get(i));
                h = h.next;
            }

            for (int i = 0; i < evenArr.size(); i++) {
                h.next = new Node<>(evenArr.get(i));
                h = h.next;
            }
        } else {
            h = new Node<>(evenArr.get(0));
            head = h;
            for (int i = 1; i < evenArr.size(); i++) {
                h.next = new Node<>(evenArr.get(i));
                h = h.next;
            }
        }

        h.next = null;
        return head;

    }

    public static Node<Integer> skipMdeleteN(Node<Integer>head , int M, int N){
        if(head == null){
            return null;
        }
        if(M == 0){
            return null;
        }

        if(N == 0){
            return head;
        }
        Node<Integer> temp = head;
        Node<Integer> t;
        while(temp != null){
            for(int j = 1; j<M; j++){
                temp = temp.next;
            }
            if(temp == null){
                return head;
            }

            t = temp.next;

            for(int k = 1; k<=N && t!= null; k++){
//                Node<Integer> n = t;
                    t = t.next;
            }
            temp.next = t;
            temp = t;
        }
        return head;
    }

    public static Node<Integer> kReverse(Node<Integer> head, int k) {
        if(head == null)
            return null;
        Node current = head;
        Node next = null;
        Node prev = null;

        int count = 0;

        /* Reverse first k nodes of linked list */
        while (count < k && current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
            count++;
        }

        /* next is now a pointer to (k+1)th node
           Recursively call for the list starting from
           current. And make rest of the list as next of
           first node */
        if (next != null)
            head.next = kReverse(next, k);

        // prev is now head of input list
        return prev;
    }

    public static Node<Integer> swapTwoNodes(Node<Integer>head, int i, int j){
        Node<Integer> temp = head;
        Node<Integer> a = null;
        Node<Integer> b = null;
        Node<Integer> c = null;
        Node<Integer> d = null;
        Node<Integer> e = null;
        Node<Integer> f = null;

        int k = 0;
        while(k<j){
            if(k == i-1) {
                a = temp;
                b = temp.next;
                c = temp.next.next;
            }

            if(k == j-1) {
                d = temp;
                e = d.next;
                f = e.next;
            }
            temp = temp.next;
        }
        a.next = e;
        e.next = c;
        d.next = b;
        b.next = f;
        return head;
    }


    public static void main(String[] args) {
        //Creating head of linked list
//        Node<Integer> head = createLinkedList();
//        System.out.println(head);
//        incrementLinkedList(head);
//        System.out.println(head);
//        print(head);
//        System.out.println();
//        head = insert(head,2,56);
//        head = deleteNode(head, 4);
//        int index = findNode(head,310);
//        print(head);
//        head = appendLastNToFirst(head,5);
//        head = removeDuplicates(head);
//        print(head);
//        printReverseWithRecurssion(head);
//        System.out.println(isPalindrome(head));
//        printR(head);
//        System.out.println();
//        length(head);
//        printIthNode(head,3);
//        head = insertRecursively(head, 2, 190);
//        head = insertRecursively(head, 6, 111);
//        print(head);
//        head = deleteRecursively(head,6);
//        head = reverseLinkedList(head);
//        DoubleNode ans = reverseLinkedListWithObject(head);
//        head = getHead(head);
//        head = reverseRecursivelyLinkedListBest(head);
//        print(head);
//        int mid = calculateMidOfLinkedList(head);
//        System.out.println(mid);
//        Node<Integer> head2 = createLinkedList();
//        Node<Integer> head1 = createLinkedList2();
//        print(head2);
//        System.out.println();
//        print(head1);
//        Node<Integer> head3 = merge(head1, head2);
//        System.out.println();
//        print(head3);

        Node<Integer> head = createLinkedList();
        print(head);
        System.out.println();
//        System.out.println(findNodeRec(head, 70));
//        head = evenAfterOdd(head);
//        head = skipMdeleteN(head,2,1);
//        head = kReverse(head,4);
        head = swapTwoNodes(head,1,4);
        print(head);
    }
}
