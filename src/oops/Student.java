package oops;

public class Student {
    private String name;
    private int rollNo;
    private int marks;


    //Constructor of the Student class...

    public Student(String name,int rollNo,int marks){
        this.name = name;
        this.rollNo = rollNo;
        this.marks = marks;
    }


    //Setter and Getter methods to make the private fields public to get accessed from other classes...

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setRollNo(int rollNo){
        this.rollNo = rollNo;
    }

    public int getRollNo(){
        return rollNo;
    }

    public void setMarks(int marks){
        this.marks = marks;
    }

    public int getMarks(){
        return marks;
    }

    //Overriding toString() method from Object superclass to return clear String...

    @Override
    public String toString(){
        return "StudentDetails [Name : "+name+", RollNo : "+rollNo+", Marks : "+marks+"]";
    }
}
