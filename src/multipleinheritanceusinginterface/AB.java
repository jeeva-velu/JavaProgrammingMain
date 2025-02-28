package multipleinheritanceusinginterface;

public interface AB extends A,B {

    @Override
    void m1();

    @Override
    default void m2(){
        System.out.println("m2 created");
    }
}
