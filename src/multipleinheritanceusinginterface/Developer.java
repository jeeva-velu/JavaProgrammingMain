package multipleinheritanceusinginterface;

public class Developer extends SuperDeveloper implements Person {

    @Override
    void walk(){
        System.out.println("Walking fast");
    }

    @Override
    public void run(){
        System.out.println("Running");
    }

}
