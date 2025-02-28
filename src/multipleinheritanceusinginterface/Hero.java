package multipleinheritanceusinginterface;

public interface Hero {

    void run();

    default void walk(){
        System.out.println("Walking");
    }

}
