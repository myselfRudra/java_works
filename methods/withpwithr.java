package methods;

public class withpwithr {
    public static int maxArea(int[] a) {
        int area =0;
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                area=Math.max(area,Math.min(a[i],a[j]))*(j-i);


            }
        }
        return area;
    }
    
    public static void main(String[] args) {
        int a[] = { 1, 5, 4, 3 };
    int b[] = { 3, 1, 2, 4, 5 };
 
    System.out.println(maxArea(a));
   // System.out.println(maxArea(b));
}
    }

