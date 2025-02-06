package oops;

public class Worker {
    private String name;
    private int id;

    //No arg constructor of Employee class...
    public Worker(){

    }

    //Parameterized constructor of class Employee...
    public Worker(String name, int id){
        this.id = id;   //Assigning the parameter id to the instance field id...
        this.name = name;
    }

    //Using getter setter methods to make the private fields public to get accessed in another class...

    public void setId(int id){
        this.id = id;

    }
    public int getId(){
        return this.id;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }
}
