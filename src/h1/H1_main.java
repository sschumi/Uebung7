package h1;

public class H1_main {
    public static void main(String[] args){
        Zahl b = new Zahl(9);
        b.setEven();
        b.setPositive();
        b.setSmall();
        System.out.println(b);
    }
}
