package arraylist;

import java.util.ArrayList;

public class pascalstriangle {
    public static void main(String[] args) {
        int n=4;
        pascal(n);                                    
        }
        public static void pascal(int n){
            ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
            for(int i=0;i<n;i++){
                ArrayList<Integer> l = new ArrayList<>();
                for(int j=0;j<=i;j++){
                   if(j==0 || j==i)  l.add(1);
                   else l.add(arr.get(i-1).get(j)+ arr.get(i-1).get(j-1));
                    System.out.println();
                }
                arr.add(l );


            }
            // for(int i=2;i<n;i++){
            //     for(int j=1;j<=i-1;j++){
            //         arr.get(i).set(j,arr.get(i-1).get(j)+ arr.get(i-1).get(j-1)); 
            //     }
            // }
            System.out.print(arr+" ");
            System.out.println();       

        }
        
    }
    
