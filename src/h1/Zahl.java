package h1;
import java.lang.Math;

public class Zahl extends H1_main{
    public boolean even = true, small = true, positive = true;
    public int num = 4;

    public Zahl(int a){
        num = a;
    }
    public void setEven(){
        if (Math.abs(num)%2 == 0){
            even = true;
        } else {
            even = false;
        }
    }

    public void setSmall(){
        if (num < 100){
            small = true;
        } else {
            small = false;
        }
    }

    public void setPositive(){
        if (num > 0){
            positive = true;
        } else {
            positive = false;
        }
    }

}
