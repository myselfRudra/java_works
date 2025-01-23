// package methods;

// public class ad {
//     static class Calculator{
//         int a;
//         int b;
//         int res;
//         int add()
//         {
//             a=10;
//             b=20;
//             res=a+b;
//             System.out.println(res);
//         }
//     }
    
//     class Launch{
//         public static void main(String[] args) {
//             Calculator cal = new Calculator();
//             int sum=cal.add();
//             System.out.println(sum);
//         }
//     }
    
    
// }
package methods;

public class ad{
    static class Calc{
        int a;
        int b;
        int res;

        int add() {
            a = 10;
            b = 20;
            res = a + b;
            System.out.println(res);
            return res; // Return the result
        }
    }

    static class Launch {
        public static void main(String[] args) {
            ad.Calc cal = new ad.Calc(); // Instantiate the Calculator class
            int sum = cal.add();
            System.out.println("Sum: " + sum); // Print the sum
        }
    }
}