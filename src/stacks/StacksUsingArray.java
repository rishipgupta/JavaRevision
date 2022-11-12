package stacks;

public class StacksUsingArray {
    private int data[];
    private int topIndex;

    StacksUsingArray() {
        data = new int[10];
        topIndex = -1;
    }

    public void push(int num) {
        topIndex++;
        data[topIndex] = num;
        System.out.println(num);
    }

    public int size() {
//        int length = data.length;
        System.out.println(topIndex + 1);
        return topIndex + 1;
    }

    public boolean isEmpty() {
        if (topIndex==-1) {
            System.out.println(true);
            return true;
        } else {
            System.out.println(false);
            return false;
        }
    }

    public int top() {
        System.out.println(data[topIndex]);
        return data[topIndex];
    }

    public int pop() {
        int[] newArr = new int[data.length];
        for (int i = 0; i < data.length; i++) {
            if (i == topIndex) {
                System.out.print(data[topIndex]+" ");
                newArr[i] = 0;
            } else {
                newArr[i] = data[i];
            }
        }
        int removedElement = data[topIndex];
//        System.out.println(removedElement);
        topIndex--;
        data = newArr;
        return removedElement;
    }

    public void printData() {
        for (int i = 0; i < topIndex+1; i++) {
            System.out.print(data[i] + " ");
        }
    }

}
