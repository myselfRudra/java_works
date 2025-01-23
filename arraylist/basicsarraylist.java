package arraylist;

import java.util.ArrayList;

public class basicsarraylist {
    public static void main(String[] args) {
        
        ArrayList<Integer> arr =new ArrayList<>();
        arr.add(0,10);
        arr.add(1,20);
        arr.add(2,30);
        arr.add(3,40);
        arr.add(4,50);
        arr.add(5,60);
        System.out.print(arr);
        System.out.println();
        System.out.print(arr.size());
        //..............................WAY 1; more beautiul in loos with comma and bracets

        // for(int i=0;i<arr.size();i++){...............................WAY 2;as done by the designer
        //     System.out.print(arr.get(i)+" ");
        System.out.println();
       
        arr.set(3, 399); // .......................set is used to modiy
        for(int i=0;i<arr.size();i++){//..................in array we use arr.length,and in arraylist we use arr.size
                 System.out.print(arr.get(i)+" ");
        } 
        arr.add(93);//............pushbac in java;just add the integer at the end o the array by adding array index
        System.out.println();
        System.out.println(arr.size());
        for(int i=0;i<arr.size();i++){
            System.out.print(arr.get(i)+" ");
   } 
   System.out.println();
   arr.remove(3);//...............................removes the index mentioned in the curly braces
   System.out.print(arr);
        }
    }
    

