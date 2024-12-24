package operators;

public class RelationalOperatorDemo {
    public static void main(String[] args) {
        int num1 = 8;
        int num2 = 8;
        boolean isSame = num1==num2;

        boolean a = true;
        boolean b = false;
        boolean isSame2 = a==b;

        int num3 = 9;
        int num4 = 9;
        int num5 = 9;
        boolean isSame3 = (num3==num4)&&(num4==num5);

        double d1 = 0.0;
        double d2 = -0.0;
        boolean isSame4 = d1==d2;
    }
}
