package stacks;

public class StackUseLL {
    public static void main(String[] args) {
        StacksUsingLinkedList<Integer> stack = new StacksUsingLinkedList<>();
        int arr[] = {5,6,7,8,9};
        for(int i = 0; i<arr.length; i++){
            stack.push(arr[i]);
        }

        while(!stack.isEmpty()){
            System.out.println(stack.pop());
        }
    }
}
