package tutorrial.Recursion;

public class lab {
// gia thua 
    // public long giaithua(int n ) {
    //     if (n > 0) {
    //         return n * giaithua(n - 1 );
    //     }else {
    //         return  1;
    //     }

    // }
    // uoc chung lon nhat 

    public int USCLN(int a , int b) {
        if (b == 0) {
            return a;
        }
        return  USCLN(b, a % b);
    }
    // uoc chung nho nhat
    public int USCNN(int a , int b) {
        return (a * b) /USCLN(a, b);
    }
    public static void main(String[] args) {
        lab obj  = new lab();
        System.out.println( obj.USCLN(48, 18));
       
        // int a = 4 ;
        // System.out.println("Giai thua cua "+ a+" la :"+obj.giaithua(a));
        
    } 
}
