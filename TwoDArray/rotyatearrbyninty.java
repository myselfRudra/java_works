package TwoDArray;

public class rotyatearrbyninty {
   
    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<i;j++){
                int x=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=x;
                

            }
            // for( i=0;i<arr.length;i++){
            //     for(int j=0;j<arr[0].length;j++){
            //      System.out.print(arr[i][j]+" ");
            //     }
            //      System.out.println();
            //  }
         
        }
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
             System.out.print(arr[i][j]+" ");
            }
             System.out.println();
         }
     
        for(int i=0;i<arr.length;i++){
         
                int a=0,b=arr.length-1;
        while(a<b){        
                
        int temp =arr[i][a];
        arr[i][a]=arr[i][b];
        arr[i][b]=temp;
        a++;
        b--;
        }

        }
        for(int i=0;i<arr.length;i++){
           for(int j=0;j<arr[0].length;j++){
            System.out.print(arr[i][j]+" ");
           }
            System.out.println();
        }
    
     





    }
    
}
