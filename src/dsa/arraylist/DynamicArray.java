package dsa.arraylist;

import java.util.ArrayList;

public class DynamicArray {
    public static void main(String[] args) {
        ArrayList <Integer> arrayList = new ArrayList<>();
        arrayList.add(10);
        arrayList.add(30);
        arrayList.add(10);
        arrayList.add(50);
//        Integer i = 10;
        System.out.println(arrayList.size());
        System.out.println(arrayList.get(2));
//        arrayList.remove(i);
        System.out.println(arrayList.size());
        System.out.println(arrayList.get(1));
        for (int el:arrayList) {
            System.out.print(el+" ");
        }
//        for(int i = 0 ; i<arrayList.size();i++){
//            System.out.print(arrayList.get(i)+" ");
//        }
    }
}
