package Java.Inheritance.Single.Inheritance;

public class Employee {

    public String Name ;
    public String Position;

    public Employee(){

    }

    public void work(){
        System.out.println(Name);
    }

    public void post(){
        System.out.println("Works as a "+Position);
    }
}
