package multipleinheritanceusinginterface;

public interface B {

    void m1();

    default void m2(){
        System.out.println("m2");
    }

}
