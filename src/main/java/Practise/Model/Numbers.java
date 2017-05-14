package Practise.Model;

/**
 * Created by Alexander on 14/05/2017.
 */
public class Numbers {
    int a;
    int b;

    public Numbers(int num1, int num2) {
        this.a = num1;
        this.b = num2;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    @Override
    public String toString() {
        return "Numbers{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }
}
