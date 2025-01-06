package operators;

public class LogicalOperatorsDemo {
    public static void main(String[] args) {

        //Logical not

        boolean isValid;
        isValid = !true;
        int num1 = 6;
        int num2 = 8;
        isValid = !(num1<num2);

        //Logical short circuit AND  --&&

        int num3 = 9;
        int num4 = 6;
        boolean isTrue = num3>6 && num4<10;
        System.out.println(isTrue);
        isTrue = (num3>10)&&(num4=16)>15;

        //Logical AND

        isTrue = num3>5 & num4<8;

        //Logical short circuit OR --||

        int num5 = 9;
        int num6 = 6;
        boolean isTrue2 = num5>10 || num6>3;
        isTrue2 = num5>10 || num6>10;

        //Logical OR

        isTrue2 = num5>10 | num6<7;

        //Logical XOR or Exclusive OR

        int num7 = 10;
        int num8 = 15;
        boolean isTrue3 = num7>6 ^ num8<16;
        System.out.println(isTrue3);

        isTrue3 = num7>6 ^ num8>16;
        System.out.println(isTrue3);

        //Compound logical assignment operator
        //For AND
        boolean b = true;
        b &= true;      //b=b&true  -- true&true=true
        System.out.println(b);

        //For OR

        b |=false;      //b=b|false -- true|false=true
        System.out.println(b);
    }
}
