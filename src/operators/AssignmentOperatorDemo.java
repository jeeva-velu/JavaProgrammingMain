package operators;

public class AssignmentOperatorDemo {

    public static void main(String[] args) {
        int a =10;
        int b = 20;
        a = b;
        System.out.println(a);
        b = 30;         //Updated value of b, it does not affect a
        System.out.println(a);
        System.out.println(b);

        int num = +6;
        System.out.println(num);

        int num1 = -6;
        System.out.println(num1);

        //Compound arithmetic assignment operator
        int num2 = 8;
        num2  += 5;
        System.out.println(num2);

        int num3 = 5;
        num3 -= 2.5;
        System.out.println(num3);

        int num4 = 10;
        num4 /= 2;
        System.out.println(num4);

        int num5 = 10;
        int num6 = 5;
        num6 = num5++ +num6;
        System.out.println(num6);

        int num7 = 10;
        int num8 = 5;
        num8 = ++num7+num8;
        System.out.println(num8);
    }
}
