class SuperClass{
  int num;
  String name;
  Double grade;
  public SuperClass(int num,String name,Double grade){
    this.num=num;
    this.name=name;
    this.grade=grade;
    System.out.println("super class:"+num+""+name+""+grade+"\n");

  }
}
class SubClass extends SuperClass{
//  SuperClass sc;
  public SubClass(int num,String name,Double grade){
    super(num,name,grade);
    System.out.println("subclass constructor called");
    System.out.println(num+" "+name+" "+grade);
  }

}

public class Inherit1{
  public static void main(String args[]){
   SubClass subc = new SubClass(123,"mr.bean",5.5);
}
}
