package arrays;


class Calculator{
    public int Addition(int a,int b){
        int result = a+b;
        return result;
    }
}

//Accessing an non-static method using an object...

public class ClassObjectsDemo {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        Calculator calc = new Calculator();
        int result = calc.Addition(a,b);
        System.out.println(result);
    }
}
