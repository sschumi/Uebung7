package h2;
import java.util.Arrays;

public class H2_main {

    public static void main (String[] args){
        int[] a = {2,7,1,9};
        int[] b = {5,6,7};
        int[] c = {2,7,1,9};
        System.out.println(Arrays.toString(change(a, b, 2, 4)));
        System.out.println(Arrays.toString(change(a, c, 2, 4)));
        System.out.println(Arrays.toString(change(a, c, 3, 2)));
    }
    public static int[] change(int[] a, int[] b, int start, int end){
        if (end > start && Arrays.compare(a,b) != 0){
            int[] c = Arrays.copyOfRange(a, 0, a.length);
            return c;
        }
        if (end > start && Arrays.compare(a, b) == 0){
            Arrays.sort(a);
            int[] d = Arrays.copyOfRange(a, start, end);
            return d;
        }
        if (end <= start){
            int[] e = {};
            return e;
        }
        return a;
    }
}
