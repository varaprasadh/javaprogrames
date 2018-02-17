

/**
 *
 * @author vara
 * in general we cant define methods in interface right ..because those are treated as abstract 
 * methods..and abstract methods should not be implemented where the it is declared..
 * but by using default keyword..we can do implement them..check out below..
 */
interface DefaultDemo{
    default void show(){
        System.out.println("inside default method..");
    }
    void display();//abstract ..

}
public class Default_M_Interface {
    public static void main(String[] arg){
        //have a look on lambda expression
        DefaultDemo dd=()->{
         System.out.println("implementation of display method..by lambda");
         };
        /*
        above 2 lines can also be written as..look below
        */
        DefaultDemo da=new DefaultDemo(){
            public void display(){
                System.out.println("inside display method by anonymous inner class");
            }
        };
        dd.display();
        da.display();
        dd.show();
    }
}
