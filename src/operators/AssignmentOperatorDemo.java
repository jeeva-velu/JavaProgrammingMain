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

    }
}
