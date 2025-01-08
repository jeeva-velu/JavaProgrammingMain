package collections;

public class BoxingDemo {

    public static void main(String[] args) {

        //Boxing-Process of converting primitive data type to corresponding wrapper class object

        int num = 10;

        //With the help of valueOf() method

        Integer integer = Integer.valueOf(num);
        System.out.println("The value stored in integer wrapper object is:"+integer);

        double d1 = 3.14;
        Double doubleObj = Double.valueOf(d1);
        System.out.println("d1 primitive datatype is stored in doubleObj wrapper class object:"+doubleObj);

        //Parsing-Process of converting string representation of primitive value to actual primitive value

        int num1 = Integer.parseInt("1234");
        System.out.println(num1);   //1234

        double d2 = Double.parseDouble("3.14");
        System.out.println(d2);     //3.14
    }
}
