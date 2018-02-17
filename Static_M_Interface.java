
/**
 * @author vara
 * from java 1.8 its possible to define static methods in interface;
 * and also if interface has only one method called as functional interface 
 * then it can be implemented by lambda expressions
 * 
 * 
 */
interface StaticInterface{
    void show();
    static void display(){
        System.out.println("static method \"display\"");
    }
}


public class Static_M_Interface {
    public static void main(String[] as){
     StaticInterface si=()->{
       System.out.println("implementation of show with lambda expressions");
    };
        si.show();
      StaticInterface.display();   
    }
}
