package arraylist;
import java.util.ArrayList;
//import java.util.*;//imports all library
public class arraylist2d {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList();//......................1d
        a.add(10);a.add(20);a.add(30);
        ArrayList<Integer> b = new ArrayList();
        b.add(30);b.add(40);b.add(50);
        ArrayList<Integer> c = new ArrayList();
        c.add(60);c.add(70);c.add(80);
        ArrayList<ArrayList<Integer>> arr1 = new ArrayList<>();//.........2d
        arr1.add(a);arr1.add(b);arr1.add(c);
        for(int i=0;i<arr1.size();i++){
            for(int j=0;j<arr1.get(i).size();j++){
                System.out.print(arr1.get(i).get(j)+" ");

            }
            System.out.println();
            
          
        }
        System.out.print(arr1.get(1).get(2)+" ");

    }
    
}
