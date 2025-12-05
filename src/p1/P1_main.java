package p1;

public class P1_main {
    public static void main (String[] args){
        Bruch b = new Bruch(1,2);
        multFac(1,2,3,4);
    }
    public static void multFac(int z1, int n1, int z2, int n2){
        int a = 0, b = 0;
        a = z1*z2;
        b = n1*n2;
        System.out.println(a + ":" + b);
    }
    public static void multFac(Bruch a, Bruch b){
        multFac(a.z, a.n, b.z, b.n);

    }
}
