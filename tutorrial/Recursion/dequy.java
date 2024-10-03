package tutorrial.Recursion;


public class dequy {
    void hello(int a) {
        a++;
        if (a <= 5) {
            System.out.println("done"+ a);
            hello(a);
        }
    }
    public void tailSum(int currentSum, int n) {
        if (n <= 1) {
            System.out.println(currentSum + n);
            return; 
        }
        tailSum(currentSum + n, n - 1);  
    }
    public static void main(String[] args) {
        
        dequy obj = new dequy();
        obj.hello(0);
        obj.tailSum(0,5);
    }
}
