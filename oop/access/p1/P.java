package access.p1;

public class P {
    public int a;
    int b;
    protected int c;
    private int d;
    public static void main(String[] args) {
        P obj = new P();
        obj.d = 002;
        System.out.println(obj.d);

    }
}
