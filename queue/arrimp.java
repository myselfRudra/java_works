package queue;

public class arrimp {
    public static class que{
        int f=-1;
        int r=-1;
        int size = 0;
        int[] arr= new int[5];
        public void add(int val){
            if(r==arr.length-1){
                System.out.println("full");
                return;
                            }
            if(f==-1&&r==-1){
                f=r=0;
                arr[r]=val;


            }
            else
            {
                arr[++r]=val;
            }
            size++;

        }
        public int remove(){
            if(size==0){
                System.out.println("empty");

            }
            int val=arr[f++];
            size--;
            return val;
        }
        public int peek(){
            if(size==0){
                System.out.println("mptty");
                return -1;

            }
            return arr[f];
        }
        public boolean isEmpty(){
            if(size==0) 
                return true;
            return false;

        }
        public void display(){
            if(size==0){
                System.out.println("mpty");
            }
            else{
                for(int i=f;i<=r;i++)
                {
                    System.out.print(arr[i]+",");

                }
                
            }
            System.out.println();
        }
    }
        public static void main(String[] args) {
            que q = new que();
            q.add(1);
            q.add(2);
            q.add(3);
            q.add(4);
            q.add(5);
           // q.add(6);
            q.display();
            System.out.println(q.size);
            System.out.println(q.remove());
            System.out.println(q.peek());
            q.display();
        }
    
    
}
