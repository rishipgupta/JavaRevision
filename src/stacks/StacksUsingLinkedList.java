package stacks;


public class StacksUsingLinkedList<T>{
    Node<T> head;
    private int size;

    StacksUsingLinkedList(){
        head = null;
        size = 0;
    }

    public int size(){
        System.out.println(size);
        return size;
    }

   public void push(T element){
        Node<T> n = new Node(element);
        size++;
//        head = n;
        n.next = head;
        head = n;
//       System.out.println(head.data);
   }

    public T pop(){

        if(size == 0){
         return null;
        }
        size--;
        T temp  = head.data;
        head = head.next;
        return temp;
    }
   public boolean isEmpty(){
//       System.out.println(size == 0);
        return size == 0;
   }

   public T top(){
        if(head == null){
            System.out.println("Stack is empty");
        }
       System.out.println(head.data);
        return head.data;
   }

   public void printLinkedList(){
        while(head!=null){
            System.out.print(head.data + " ");
            head = head.next;
        }
   }

}
