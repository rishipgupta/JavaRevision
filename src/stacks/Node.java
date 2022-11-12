package stacks;

public class Node<T> {
    //Each node contains two details
    //data
    //address of node / next that would point to next node
    T data;
    public Node<T> next;
    public Node(T data){
       this.data = data;
        //next is by default null;
    }

}
