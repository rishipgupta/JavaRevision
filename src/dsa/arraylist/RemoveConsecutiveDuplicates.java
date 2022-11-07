package dsa.arraylist;

import java.util.ArrayList;

public class RemoveConsecutiveDuplicates {

    public static void main(String[] args) {
        ArrayList<Integer>arr = new ArrayList<>();
        arr.add(10);
        arr.add(10);
        arr.add(20);
        arr.add(20);
        arr.add(20);
        arr.add(30);
        arr.add(10);
        arr.add(30);
        arr.add(30);

        System.out.println("++++++++++++++++++++++++++++++");
        for(int el:arr){
            System.out.print(el+" ");
        }
        System.out.println();
        System.out.println("++++++++++++++++++++++++++++++");

        ArrayList<Integer>temp= new ArrayList<>();
        temp.add(arr.get(0));
        int i = 1;
        while(i<arr.size()){
            if(arr.get(i-1)==arr.get(i)){
                i=i+1;
            }else{
                temp.add(arr.get(i));
                i+=1;
            }
        }
        arr = temp;
        for(int el:arr){
            System.out.print(el+" ");
        }
    }
}
