package operators;

public class ArithmeticOperations {

    public static void main(String[] args) {
        double dNum1 = 40.0;
        double dNum2 = 5.0;
        double dNum3 = dNum1/dNum2;
        System.out.println(dNum3);

        int num1;           //We cannot store 2 byte values in a 3 rd byte value instead use int var
        byte num2 = 8;
        byte num3 = 5;
        num1 = num2+num3;
        System.out.println(num1);

    }
}
